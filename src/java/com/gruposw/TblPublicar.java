/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gruposw;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Soporte
 */
@Entity
@Table(name = "Tbl_Publicar")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblPublicar.findAll", query = "SELECT t FROM TblPublicar t")
    , @NamedQuery(name = "TblPublicar.findByIDPublicar", query = "SELECT t FROM TblPublicar t WHERE t.iDPublicar = :iDPublicar")
    , @NamedQuery(name = "TblPublicar.findByTitulopub", query = "SELECT t FROM TblPublicar t WHERE t.titulopub = :titulopub")
    , @NamedQuery(name = "TblPublicar.findByDescripcionpub", query = "SELECT t FROM TblPublicar t WHERE t.descripcionpub = :descripcionpub")
    , @NamedQuery(name = "TblPublicar.findByFechapub", query = "SELECT t FROM TblPublicar t WHERE t.fechapub = :fechapub")})
public class TblPublicar implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_Publicar")
    private Integer iDPublicar;
    @Size(max = 50)
    @Column(name = "Titulo_pub")
    private String titulopub;
    @Size(max = 50)
    @Column(name = "Descripcion_pub")
    private String descripcionpub;
    @Lob
    @Column(name = "Imagen_pub")
    private byte[] imagenpub;
    @Column(name = "Fecha_pub")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechapub;
    @JoinColumn(name = "ID_pet", referencedColumnName = "ID_pet")
    @ManyToOne(optional = false)
    private TblMascota iDpet;
    @JoinColumn(name = "ID_Usuario", referencedColumnName = "ID_Usuario")
    @ManyToOne(optional = false)
    private TblUsuario iDUsuario;

    public TblPublicar() {
    }

    public TblPublicar(Integer iDPublicar) {
        this.iDPublicar = iDPublicar;
    }

    public Integer getIDPublicar() {
        return iDPublicar;
    }

    public void setIDPublicar(Integer iDPublicar) {
        this.iDPublicar = iDPublicar;
    }

    public String getTitulopub() {
        return titulopub;
    }

    public void setTitulopub(String titulopub) {
        this.titulopub = titulopub;
    }

    public String getDescripcionpub() {
        return descripcionpub;
    }

    public void setDescripcionpub(String descripcionpub) {
        this.descripcionpub = descripcionpub;
    }

    public byte[] getImagenpub() {
        return imagenpub;
    }

    public void setImagenpub(byte[] imagenpub) {
        this.imagenpub = imagenpub;
    }

    public Date getFechapub() {
        return fechapub;
    }

    public void setFechapub(Date fechapub) {
        this.fechapub = fechapub;
    }

    public TblMascota getIDpet() {
        return iDpet;
    }

    public void setIDpet(TblMascota iDpet) {
        this.iDpet = iDpet;
    }

    public TblUsuario getIDUsuario() {
        return iDUsuario;
    }

    public void setIDUsuario(TblUsuario iDUsuario) {
        this.iDUsuario = iDUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDPublicar != null ? iDPublicar.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblPublicar)) {
            return false;
        }
        TblPublicar other = (TblPublicar) object;
        if ((this.iDPublicar == null && other.iDPublicar != null) || (this.iDPublicar != null && !this.iDPublicar.equals(other.iDPublicar))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gruposw.TblPublicar[ iDPublicar=" + iDPublicar + " ]";
    }
    
}
