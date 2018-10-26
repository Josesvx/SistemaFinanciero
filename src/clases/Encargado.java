/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author aviles
 */
public class Encargado {

    private String nombres;
    private String apellidos;
    private String fechanac;

    public Encargado() {
        nombres = null;
        apellidos = null;
        fechanac = null;
    }

    public Encargado(String nombres, String apellidos, String fechanac) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechanac = fechanac;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFechanac() {
        return fechanac;
    }

    public void setFechanac(String fechanac) {
        this.fechanac = fechanac;
    }
}
