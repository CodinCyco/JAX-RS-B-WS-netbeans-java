/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

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
@Table(name = "HOTEL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Hotel.findAll", query = "SELECT h FROM Hotel h"),
    @NamedQuery(name = "Hotel.findByIdhotel", query = "SELECT h FROM Hotel h WHERE h.idhotel = :idhotel"),
    @NamedQuery(name = "Hotel.findByNomHotel", query = "SELECT h FROM Hotel h WHERE h.nomHotel = :nomHotel"),
    @NamedQuery(name = "Hotel.findByAdresse", query = "SELECT h FROM Hotel h WHERE h.adresse = :adresse"),
    @NamedQuery(name = "Hotel.findByCodepostal", query = "SELECT h FROM Hotel h WHERE h.codepostal = :codepostal"),
    @NamedQuery(name = "Hotel.findByVille", query = "SELECT h FROM Hotel h WHERE h.ville = :ville"),
    @NamedQuery(name = "Hotel.findByPrix", query = "SELECT h FROM Hotel h WHERE h.prix = :prix"),
    @NamedQuery(name = "Hotel.findByNbreetoiles", query = "SELECT h FROM Hotel h WHERE h.nbreetoiles = :nbreetoiles")})
public class Hotel implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDHOTEL")
    private Integer idhotel;
    @Size(max = 15)
    @Column(name = "NOM_HOTEL")
    private String nomHotel;
    @Size(max = 40)
    @Column(name = "ADRESSE")
    private String adresse;
    @Column(name = "CODEPOSTAL")
    private Integer codepostal;
    @Size(max = 30)
    @Column(name = "VILLE")
    private String ville;
    @Column(name = "PRIX")
    private Integer prix;
    @Column(name = "NBREETOILES")
    private Integer nbreetoiles;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idhotel")
    private Collection<Reservation> reservationCollection;

    public Hotel() {
    }

    public Hotel(Integer idhotel) {
        this.idhotel = idhotel;
    }

    public Integer getIdhotel() {
        return idhotel;
    }

    public void setIdhotel(Integer idhotel) {
        this.idhotel = idhotel;
    }

    public String getNomHotel() {
        return nomHotel;
    }

    public void setNomHotel(String nomHotel) {
        this.nomHotel = nomHotel;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Integer getCodepostal() {
        return codepostal;
    }

    public void setCodepostal(Integer codepostal) {
        this.codepostal = codepostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public Integer getPrix() {
        return prix;
    }

    public void setPrix(Integer prix) {
        this.prix = prix;
    }

    public Integer getNbreetoiles() {
        return nbreetoiles;
    }

    public void setNbreetoiles(Integer nbreetoiles) {
        this.nbreetoiles = nbreetoiles;
    }

    @XmlTransient
    public Collection<Reservation> getReservationCollection() {
        return reservationCollection;
    }

    public void setReservationCollection(Collection<Reservation> reservationCollection) {
        this.reservationCollection = reservationCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idhotel != null ? idhotel.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Hotel)) {
            return false;
        }
        Hotel other = (Hotel) object;
        if ((this.idhotel == null && other.idhotel != null) || (this.idhotel != null && !this.idhotel.equals(other.idhotel))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.Hotel[ idhotel=" + idhotel + " ]";
    }
    
}
