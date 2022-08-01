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
@Table(name = "Tbl_Usuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblUsuario.findAll", query = "SELECT t FROM TblUsuario t")
    , @NamedQuery(name = "TblUsuario.findByIDUsuario", query = "SELECT t FROM TblUsuario t WHERE t.iDUsuario = :iDUsuario")
    , @NamedQuery(name = "TblUsuario.findByNombreUsu", query = "SELECT t FROM TblUsuario t WHERE t.nombreUsu = :nombreUsu")
    , @NamedQuery(name = "TblUsuario.findByApellidoUsu", query = "SELECT t FROM TblUsuario t WHERE t.apellidoUsu = :apellidoUsu")
    , @NamedQuery(name = "TblUsuario.findByCIUsu", query = "SELECT t FROM TblUsuario t WHERE t.cIUsu = :cIUsu")
    , @NamedQuery(name = "TblUsuario.findByTelefonoUsu", query = "SELECT t FROM TblUsuario t WHERE t.telefonoUsu = :telefonoUsu")
    , @NamedQuery(name = "TblUsuario.findByDireccionUsu", query = "SELECT t FROM TblUsuario t WHERE t.direccionUsu = :direccionUsu")
    , @NamedQuery(name = "TblUsuario.findByCorreoUsu", query = "SELECT t FROM TblUsuario t WHERE t.correoUsu = :correoUsu")
    , @NamedQuery(name = "TblUsuario.findByFechaRegUsu", query = "SELECT t FROM TblUsuario t WHERE t.fechaRegUsu = :fechaRegUsu")})
public class TblUsuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Usuario")
    private Integer iDUsuario;
    @Size(max = 50)
    @Column(name = "Nombre_Usu")
    private String nombreUsu;
    @Size(max = 50)
    @Column(name = "Apellido_Usu")
    private String apellidoUsu;
    @Size(max = 10)
    @Column(name = "CI_Usu")
    private String cIUsu;
    @Size(max = 15)
    @Column(name = "Telefono_Usu")
    private String telefonoUsu;
    @Size(max = 200)
    @Column(name = "Direccion_Usu")
    private String direccionUsu;
    @Size(max = 80)
    @Column(name = "Correo_Usu")
    private String correoUsu;
    @Column(name = "FechaReg_Usu")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegUsu;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDUsuario")
    private List<TblPublicar> tblPublicarList;

    public TblUsuario() {
    }

    public TblUsuario(Integer iDUsuario) {
        this.iDUsuario = iDUsuario;
    }

    public Integer getIDUsuario() {
        return iDUsuario;
    }

    public void setIDUsuario(Integer iDUsuario) {
        this.iDUsuario = iDUsuario;
    }

    public String getNombreUsu() {
        return nombreUsu;
    }

    public void setNombreUsu(String nombreUsu) {
        this.nombreUsu = nombreUsu;
    }

    public String getApellidoUsu() {
        return apellidoUsu;
    }

    public void setApellidoUsu(String apellidoUsu) {
        this.apellidoUsu = apellidoUsu;
    }

    public String getCIUsu() {
        return cIUsu;
    }

    public void setCIUsu(String cIUsu) {
        this.cIUsu = cIUsu;
    }

    public String getTelefonoUsu() {
        return telefonoUsu;
    }

    public void setTelefonoUsu(String telefonoUsu) {
        this.telefonoUsu = telefonoUsu;
    }

    public String getDireccionUsu() {
        return direccionUsu;
    }

    public void setDireccionUsu(String direccionUsu) {
        this.direccionUsu = direccionUsu;
    }

    public String getCorreoUsu() {
        return correoUsu;
    }

    public void setCorreoUsu(String correoUsu) {
        this.correoUsu = correoUsu;
    }

    public Date getFechaRegUsu() {
        return fechaRegUsu;
    }

    public void setFechaRegUsu(Date fechaRegUsu) {
        this.fechaRegUsu = fechaRegUsu;
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
        hash += (iDUsuario != null ? iDUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblUsuario)) {
            return false;
        }
        TblUsuario other = (TblUsuario) object;
        if ((this.iDUsuario == null && other.iDUsuario != null) || (this.iDUsuario != null && !this.iDUsuario.equals(other.iDUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gruposw.TblUsuario[ iDUsuario=" + iDUsuario + " ]";
    }
    
}
