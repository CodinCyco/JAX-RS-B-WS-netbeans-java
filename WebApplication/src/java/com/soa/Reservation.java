/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soa;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author saifeddine
 */
@Entity
@Table(name = "RESERVATION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reservation.findAll", query = "SELECT r FROM Reservation r"),
    @NamedQuery(name = "Reservation.findByIdreservation", query = "SELECT r FROM Reservation r WHERE r.idreservation = :idreservation"),
    @NamedQuery(name = "Reservation.findByDatedebut", query = "SELECT r FROM Reservation r WHERE r.datedebut = :datedebut"),
    @NamedQuery(name = "Reservation.findByDatefin", query = "SELECT r FROM Reservation r WHERE r.datefin = :datefin")})
public class Reservation implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDRESERVATION")
    private Integer idreservation;
    @Column(name = "DATEDEBUT")
    @Temporal(TemporalType.DATE)
    private Date datedebut;
    @Column(name = "DATEFIN")
    @Temporal(TemporalType.DATE)
    private Date datefin;
    @JoinColumn(name = "IDHOTEL", referencedColumnName = "IDHOTEL")
    @ManyToOne(optional = false)
    private Hotel idhotel;

    public Reservation() {
    }

    public Reservation(Integer idreservation) {
        this.idreservation = idreservation;
    }

    public Integer getIdreservation() {
        return idreservation;
    }

    public void setIdreservation(Integer idreservation) {
        this.idreservation = idreservation;
    }

    public Date getDatedebut() {
        return datedebut;
    }

    public void setDatedebut(Date datedebut) {
        this.datedebut = datedebut;
    }

    public Date getDatefin() {
        return datefin;
    }

    public void setDatefin(Date datefin) {
        this.datefin = datefin;
    }

    public Hotel getIdhotel() {
        return idhotel;
    }

    public void setIdhotel(Hotel idhotel) {
        this.idhotel = idhotel;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idreservation != null ? idreservation.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reservation)) {
            return false;
        }
        Reservation other = (Reservation) object;
        if ((this.idreservation == null && other.idreservation != null) || (this.idreservation != null && !this.idreservation.equals(other.idreservation))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.soa.Reservation[ idreservation=" + idreservation + " ]";
    }
    
}
