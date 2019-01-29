/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codinCyco;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author saifeddine
 */
@Entity
@Table(name = "GROUPE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Groupe.findAll", query = "SELECT g FROM Groupe g"),
    @NamedQuery(name = "Groupe.findByGroupeId", query = "SELECT g FROM Groupe g WHERE g.groupeId = :groupeId"),
    @NamedQuery(name = "Groupe.findByGroupename", query = "SELECT g FROM Groupe g WHERE g.groupename = :groupename")})
public class Groupe implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "GROUPE_ID")
    private Integer groupeId;
    @Size(max = 15)
    @Column(name = "GROUPENAME")
    private String groupename;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "groupeId")
    private Collection<Student> studentCollection;

    public Groupe() {
    }

    public Groupe(Integer groupeId) {
        this.groupeId = groupeId;
    }

    public Integer getGroupeId() {
        return groupeId;
    }

    public void setGroupeId(Integer groupeId) {
        this.groupeId = groupeId;
    }

    public String getGroupename() {
        return groupename;
    }

    public void setGroupename(String groupename) {
        this.groupename = groupename;
    }

    @XmlTransient
    public Collection<Student> getStudentCollection() {
        return studentCollection;
    }

    public void setStudentCollection(Collection<Student> studentCollection) {
        this.studentCollection = studentCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (groupeId != null ? groupeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Groupe)) {
            return false;
        }
        Groupe other = (Groupe) object;
        if ((this.groupeId == null && other.groupeId != null) || (this.groupeId != null && !this.groupeId.equals(other.groupeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.codinCyco.Groupe[ groupeId=" + groupeId + " ]";
    }
    
}
