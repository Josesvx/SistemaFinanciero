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
public class Cuenta {

    private double valor;
    private String nombre;
    private int id;
    private int idPadre;
    private int idcatalogo;
    private int tipo_saldo;

    public Cuenta() {
        this.valor = 0.0;
        this.id = 0;
        this.idPadre = 0;
        this.nombre = "";
        this.idcatalogo = 0;
        this.tipo_saldo = 0;
    }

    public Cuenta(int id, String nombre, double valor, int padre, int idcatalogo, int tipo_saldo) {
        this.id = id;
        this.idPadre = padre;
        this.nombre = nombre;
        this.valor = valor;
        this.idcatalogo = idcatalogo;
        this.tipo_saldo = tipo_saldo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdPadre() {
        return idPadre;
    }

    public void setIdPadre(int idPadre) {
        this.idPadre = idPadre;
    }

    public int getIdcatalogo() {
        return idcatalogo;
    }

    public void setIdcatalogo(int idcatalogo) {
        this.idcatalogo = idcatalogo;
    }

    public int getTipo_saldo() {
        return tipo_saldo;
    }

    public void setTipo_saldo(int tipo_saldo) {
        this.tipo_saldo = tipo_saldo;
    }
}
