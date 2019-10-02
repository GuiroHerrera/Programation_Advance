/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.school.model;

/**
 *
 * @author Guiro
 */
public class Student {
    private int id; private String name; private String lastname;private float grade; private int agc;

    public Student() {
    }

    public Student(int id, String name, String lastname, float grade, int agc) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.grade = grade;
        this.agc = agc;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the lastname
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * @param lastname the lastname to set
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * @return the grade
     */
    public float getGrade() {
        return grade;
    }

    /**
     * @param grade the grade to set
     */
    public void setGrade(float grade) {
        this.grade = grade;
    }

    /**
     * @return the agc
     */
    public int getAgc() {
        return agc;
    }

    /**
     * @param agc the agc to set
     */
    public void setAgc(int agc) {
        this.agc = agc;
    }
}
