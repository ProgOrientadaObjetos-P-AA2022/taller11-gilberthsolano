/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11;

/**
 *
 * @author gilbertsolanosotomayor
 */
public class MenuEconomico extends Menu {

    private double porcentajeDescuento;

    public MenuEconomico() {

    }

    public MenuEconomico(String nombrePl, double valorinicialM) {
        super(nombrePl, valorinicialM);
        

    }

    public double obtenerPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void establecerPorcentajeDescuento(double porcentajeDesc) {
        porcentajeDescuento = ((porcentajeDesc * valorinicialMenu)) / 100;
    }

    @Override
    public void calcularvalorMenuTotal() {
        valorMenu = valorinicialMenu - porcentajeDescuento;
    }

    public double obtenervalorcancelartotal() {
        return valorMenu;
    }

    @Override
    public String toString() {
        String cadena = String.format("Menu Economico\n%s", super.toString());
        cadena = String.format("%s"
                + "Porcentaje descuento%.2f\n"
                + "Valor Menu:%.2f\n", cadena,
                obtenerPorcentajeDescuento(),
                obtenerValorMenu());
        return cadena;
    }

}
