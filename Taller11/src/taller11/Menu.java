/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11;

/**
 *
 * @author gilbertsolanosotomayor
 */
public abstract class Menu {

    protected String nombrePlato;
    protected double valorMenu;
    protected double valorinicialMenu;

    public Menu() {

    }

    public Menu(String nombrePl, double valorinicialM) {
        nombrePlato = nombrePl;

        valorinicialMenu = valorinicialM;
    }

    public void establecerNombrePlato(String nombrePlato) {
        this.nombrePlato = nombrePlato;
    }

    public void establecerValorMenu(double valorMenu) {
        this.valorMenu = valorMenu;
    }

    public void establecerValorinicialMenu(double valorinicialMenu) {
        this.valorinicialMenu = valorinicialMenu;
    }

    public String obtenerNombrePlato() {
        return nombrePlato;
    }

    public double obtenerValorMenu() {
        return valorMenu;
    }

    public double obtenerValorinicialMenu() {
        return valorinicialMenu;
    }

    public abstract void calcularvalorMenuTotal();

    @Override
    public String toString() {
        String cadena = String.format("Nombre Plato:%s\n"
                + "Valor menu inicial:%.2f\n", obtenerNombrePlato(),
                obtenerValorinicialMenu());
        return cadena;
    }

}
