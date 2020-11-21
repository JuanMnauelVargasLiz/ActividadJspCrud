
package com.co.dto;

import java.util.Date;



public class Usuario {
  private Integer userId ;
private	Integer tipoidentificacion ;
private	Integer identificacion ;
private	String nombre ;
private	String apellido ;
private	String telefono ;
private	String email;
private Date	fechaCreacion ;

    public Usuario(Integer tipoidentificacion, Integer identificacion, String nombre, String apellido, String telefono, String email, Date fechaCreacion) {
      
        this.tipoidentificacion = tipoidentificacion;
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
        this.fechaCreacion = fechaCreacion;
    }

    public Usuario(Integer userId, Integer tipoidentificacion, Integer identificacion, String nombre, String apellido, String telefono, String email, Date fechaCreacion) {
        this.userId = userId;
        this.tipoidentificacion = tipoidentificacion;
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
        this.fechaCreacion = fechaCreacion;
    }
    

    public Usuario() {
    }




    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getTipoidentificacion() {
        return tipoidentificacion;
    }

    public void setTipoidentificacion(Integer tipoidentificacion) {
        this.tipoidentificacion = tipoidentificacion;
    }

    public Integer getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(Integer identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }


}
