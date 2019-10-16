package ec.edu.espe.experiment.springlab.model;
//Importaciones
@Entity
public class DBBook{
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Integer id;
 @Size(max = 50)
 @NotNull
 @Column(name = "name")
 private String name;
 @Column(name = "publicationDate")
 @Temporal(TemporalType.DATE)
 private Date publicationDate;

 @JoinColumn(name = "idAuthor")
 @ManyToOne
 private DBAuthor author;
 public DBBook(){
}
public DBBook(Integer id){
this.id = id;
}
public DBBook(String name, Date publicationDate, DBAuthor
author){
this.name = name;
this.publicationDate = publicationDate;
this.author = author;
}
//Setters & Getters
}
