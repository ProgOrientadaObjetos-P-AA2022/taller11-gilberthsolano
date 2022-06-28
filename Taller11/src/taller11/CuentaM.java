/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11;

import java.util.ArrayList;

/**
 *
 * @author gilbertsolanosotomayor
 */
public class CuentaM {

    private String nombreCliente;
    private ArrayList<Menu> listamenu = new ArrayList<>();
    private double valorCancelar;
    private double subtotal;
    private double iva = 0.12;
    private int id;

    public CuentaM() {

    }

    public int obtenerId() {
        return id;
    }

    public void establecerId(int id) {
        this.id = id;
    }

    public void establecerNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void establecerListamenu(ArrayList<Menu> listamenu) {
        this.listamenu = listamenu;
    }

    public void establecerSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public void establecerIva(double iva) {
        this.iva = iva;
    }

    public void calcularvalortotalcancelar() {
        for (int i = 0; i < listamenu.size(); i++) {
            subtotal = subtotal + listamenu.get(i).obtenerValorMenu();

        }
        iva = subtotal * iva;
        valorCancelar = subtotal + iva;
    }

    public String obtenerNombreCliente() {
        return nombreCliente;
    }

    public ArrayList<Menu> obtenerListamenu() {
        return listamenu;
    }

    public double obtenerValorCancelar() {
        return valorCancelar;
    }

    public double obtenerSubtotal() {
        return subtotal;
    }

    public double obtenerIva() {
        return iva;
    }

    @Override
    public String toString() {
        String cadena = String.format("Datos Cuenta\n"
                + "Nombre cliente:%s\n", obtenerNombreCliente());
        for (int i = 0; i < obtenerListamenu().size(); i++) {
            cadena = String.format("%s"
                    + "%d "
                    + "%s\n", cadena,(i+1),
                    obtenerListamenu().get(i));

        }
        cadena=String.format("\n%s"
                + "Subtotal:%.2f\n"
                + "Iva:%.2f\n"
                + "Total a pagar:%.2f\n", cadena,
                obtenerSubtotal(),
                obtenerIva(),
                obtenerValorCancelar());
        return cadena;
    }

}
