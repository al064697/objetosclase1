/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Sebas
 */
public class moneda {
    private int id;
    private String nombremoneda;
    private String simbolo;
    private double valorenpesos;

    public moneda() {
    }

    public moneda(int id, String nombremoneda, String simbolo, double valorenpesos) {
        this.id = id;
        this.nombremoneda = nombremoneda;
        this.simbolo = simbolo;
        this.valorenpesos = valorenpesos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombremoneda() {
        return nombremoneda;
    }

    public void setNombremoneda(String nombremoneda) {
        this.nombremoneda = nombremoneda;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    public double getValorenpesos() {
        return valorenpesos;
    }

    public void setValorenpesos(double valorenpesos) {
        this.valorenpesos = valorenpesos;
    }

    @Override
    public String toString() {
        return "monedas{" + "id=" + id + ", nombremoneda=" + nombremoneda + ", simbolo=" + simbolo + ", valorenpesos=" + valorenpesos + '}';
    }
    
}
