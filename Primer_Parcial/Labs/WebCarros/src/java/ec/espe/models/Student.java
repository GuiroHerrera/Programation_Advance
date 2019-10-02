/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.models;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Guiro
 */
@Entity
@Table(name = "Student")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Student.findAll", query = "SELECT s FROM Student s")
    , @NamedQuery(name = "Student.findByNameStu", query = "SELECT s FROM Student s WHERE s.nameStu = :nameStu")
    , @NamedQuery(name = "Student.findByLastnameStu", query = "SELECT s FROM Student s WHERE s.lastnameStu = :lastnameStu")
    , @NamedQuery(name = "Student.findByCedulaStu", query = "SELECT s FROM Student s WHERE s.cedulaStu = :cedulaStu")})
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "name_stu")
    private String nameStu;
    @Basic(optional = false)
    @Column(name = "lastname_stu")
    private String lastnameStu;
    @Id
    @Basic(optional = false)
    @Column(name = "cedula_stu")
    private String cedulaStu;

    public Student() {
    }

    public Student(String cedulaStu) {
        this.cedulaStu = cedulaStu;
    }

    public Student(String cedulaStu, String nameStu, String lastnameStu) {
        this.cedulaStu = cedulaStu;
        this.nameStu = nameStu;
        this.lastnameStu = lastnameStu;
    }

    public String getNameStu() {
        return nameStu;
    }

    public void setNameStu(String nameStu) {
        this.nameStu = nameStu;
    }

    public String getLastnameStu() {
        return lastnameStu;
    }

    public void setLastnameStu(String lastnameStu) {
        this.lastnameStu = lastnameStu;
    }

    public String getCedulaStu() {
        return cedulaStu;
    }

    public void setCedulaStu(String cedulaStu) {
        this.cedulaStu = cedulaStu;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cedulaStu != null ? cedulaStu.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Student)) {
            return false;
        }
        Student other = (Student) object;
        if ((this.cedulaStu == null && other.cedulaStu != null) || (this.cedulaStu != null && !this.cedulaStu.equals(other.cedulaStu))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.espe.carros.Student[ cedulaStu=" + cedulaStu + " ]";
    }
    
}
