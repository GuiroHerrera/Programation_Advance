package ec.edu.espe.experiment.springlab.dto;
import java.util.Date;
import java.util.List;
public class Author{

 private Integer id;
 private String name;
 private String dni;
 private Date birthDate;
 private List<Book> books;
 public Author(){
 }
 public Author(Integer id){
 this.id = id;
 }
 public Author(Integer id, String name, String dni, Date
birthDate, List<Book> books){
 this.id = id;
 this.name = name;
 this.dni = dni;
 this.birthDate = birthDate;
 this.books = books;
 }

 //Setters & Getters
}