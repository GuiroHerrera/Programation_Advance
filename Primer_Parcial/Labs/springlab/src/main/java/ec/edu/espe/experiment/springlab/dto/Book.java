package ec.edu.espe.experiment.springlab.dto;
import java.util.Date;
public class Book{

 private Integer id;
 private String name;
 private Date publicationDate;
 private Integer idAuthor;
 public Book(){
 }
 public Book(Integer id){
 this.id = id;
 }
 public Book(Integer id, String name, Date publicationDat
e, Integer idAuthor){
 this.id = id;
 this.name = name;
 this.publicationDate = publicationDate;
 this.idAuthor = idAuthor;
 }

 //Setters & Getters
}
