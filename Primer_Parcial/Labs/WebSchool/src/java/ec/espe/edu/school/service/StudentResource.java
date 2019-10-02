/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.school.service;

import ec.espe.edu.school.model.Student;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Guiro
 */
@Path("student")
public class StudentResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of StudentResource
     */
    public StudentResource() {
    }
    /**
     * Retrieves representation of an instance of ec.espe.edu.school.service.StudentResource
     * @return an instance of ec.espe.edu.school.model.Student
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Student getJson() {
        //TODO return proper representation object
        Student student= new Student(1,"Angel","Demonio",8.0f,22);
        return student;
    }
    
    @GET
    @Path("{id}/{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public Student getJsonStudentById(@PathParam("id") int id, @PathParam("name") String name) {
        //TODO return proper representation object
        Student student= new Student(id,name,"Demonio",8.0f,22);
        return student;
    }

    /**
     * PUT method for updating or creating an instance of StudentResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(Student content) {
    }
}
