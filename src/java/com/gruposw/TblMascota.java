/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gruposw;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Soporte
 */
@Entity
@Table(name = "Tbl_Mascota")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblMascota.findAll", query = "SELECT t FROM TblMascota t")
    , @NamedQuery(name = "TblMascota.findByIDpet", query = "SELECT t FROM TblMascota t WHERE t.iDpet = :iDpet")
    , @NamedQuery(name = "TblMascota.findByNombrepet", query = "SELECT t FROM TblMascota t WHERE t.nombrepet = :nombrepet")
    , @NamedQuery(name = "TblMascota.findByRazapet", query = "SELECT t FROM TblMascota t WHERE t.razapet = :razapet")
    , @NamedQuery(name = "TblMascota.findByEdadpet", query = "SELECT t FROM TblMascota t WHERE t.edadpet = :edadpet")
    , @NamedQuery(name = "TblMascota.findByTamanopet", query = "SELECT t FROM TblMascota t WHERE t.tamanopet = :tamanopet")
    , @NamedQuery(name = "TblMascota.findByDescripcionpet", query = "SELECT t FROM TblMascota t WHERE t.descripcionpet = :descripcionpet")
    , @NamedQuery(name = "TblMascota.findByUbicacionpet", query = "SELECT t FROM TblMascota t WHERE t.ubicacionpet = :ubicacionpet")
    , @NamedQuery(name = "TblMascota.findByTiopopet", query = "SELECT t FROM TblMascota t WHERE t.tiopopet = :tiopopet")
    , @NamedQuery(name = "TblMascota.findByFechaRegpet", query = "SELECT t FROM TblMascota t WHERE t.fechaRegpet = :fechaRegpet")})
public class TblMascota implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_pet")
    private Integer iDpet;
    @Size(max = 50)
    @Column(name = "Nombre_pet")
    private String nombrepet;
    @Size(max = 20)
    @Column(name = "Raza_pet")
    private String razapet;
    @Column(name = "Edad_pet")
    private Integer edadpet;
    @Size(max = 50)
    @Column(name = "Tamano_pet")
    private String tamanopet;
    @Size(max = 300)
    @Column(name = "Descripcion_pet")
    private String descripcionpet;
    @Size(max = 300)
    @Column(name = "Ubicacion_pet")
    private String ubicacionpet;
    @Size(max = 50)
    @Column(name = "Tiopo_pet")
    private String tiopopet;
    @Column(name = "FechaReg_pet")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegpet;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDpet")
    private List<TblPublicar> tblPublicarList;

    public TblMascota() {
    }

    public TblMascota(Integer iDpet) {
        this.iDpet = iDpet;
    }

    public Integer getIDpet() {
        return iDpet;
    }

    public void setIDpet(Integer iDpet) {
        this.iDpet = iDpet;
    }

    public String getNombrepet() {
        return nombrepet;
    }

    public void setNombrepet(String nombrepet) {
        this.nombrepet = nombrepet;
    }

    public String getRazapet() {
        return razapet;
    }

    public void setRazapet(String razapet) {
        this.razapet = razapet;
    }

    public Integer getEdadpet() {
        return edadpet;
    }

    public void setEdadpet(Integer edadpet) {
        this.edadpet = edadpet;
    }

    public String getTamanopet() {
        return tamanopet;
    }

    public void setTamanopet(String tamanopet) {
        this.tamanopet = tamanopet;
    }

    public String getDescripcionpet() {
        return descripcionpet;
    }

    public void setDescripcionpet(String descripcionpet) {
        this.descripcionpet = descripcionpet;
    }

    public String getUbicacionpet() {
        return ubicacionpet;
    }

    public void setUbicacionpet(String ubicacionpet) {
        this.ubicacionpet = ubicacionpet;
    }

    public String getTiopopet() {
        return tiopopet;
    }

    public void setTiopopet(String tiopopet) {
        this.tiopopet = tiopopet;
    }

    public Date getFechaRegpet() {
        return fechaRegpet;
    }

    public void setFechaRegpet(Date fechaRegpet) {
        this.fechaRegpet = fechaRegpet;
    }

    @XmlTransient
    public List<TblPublicar> getTblPublicarList() {
        return tblPublicarList;
    }

    public void setTblPublicarList(List<TblPublicar> tblPublicarList) {
        this.tblPublicarList = tblPublicarList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDpet != null ? iDpet.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblMascota)) {
            return false;
        }
        TblMascota other = (TblMascota) object;
        if ((this.iDpet == null && other.iDpet != null) || (this.iDpet != null && !this.iDpet.equals(other.iDpet))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gruposw.TblMascota[ iDpet=" + iDpet + " ]";
    }
    
}
