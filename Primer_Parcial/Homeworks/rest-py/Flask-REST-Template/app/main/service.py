from flask import Blueprint, request, jsonify
from app.constants import GET, POST, PUT
from .plugins import db
from .models import Author, Book
from .serializers import AuthorSerializer, BookSerializer
import json

urls = Blueprint('urls', __name__)

#define your routes here

@urls.route('/author', methods=POST)
def create_author():
    author_serializer = AuthorSerializer()
    new_author = author_serializer.load(request.json, partial=True)
    db.session.add(new_author)
    db.session.commit()
    return author_serializer.jsonify(new_author), 201

@urls.route('/author', methods=GET)
def get_authors():
    author_serializer = AuthorSerializer(many=True)
    authors = Author.query.all()
    serialized_authors = author_serializer.dump(authors)
    return jsonify(serialized_authors)

@urls.route('/author/id/<id>', methods=GET)
def get_author(_id):
    author = Author.query.get(id)
    return AuthorSerializer().jsonify(author)