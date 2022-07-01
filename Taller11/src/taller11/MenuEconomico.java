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

//    public double getPorcentajeDescuento() {
//        return porcentajeDescuento;
//    }
//
//    public void setPorcentajeDescuento(double porcentajeDescuento) {
//        this.porcentajeDescuento = porcentajeDescuento;
//    }

//    public double getPorcentajeDescuentoFijo() {
//        return porcentajeDescuentoFijo;
//    }
//
//    public void setPorcentajeDescuentoFijo(double porcentajeDescuentoFijo) {
//        this.porcentajeDescuentoFijo = porcentajeDescuentoFijo;
//    }
//    

    public double obtenerPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void establecerPorcentajeDescuento(double porcentajeDesc) {
        porcentajeDescuento = porcentajeDesc;
    }

    @Override
    public void calcularvalorMenuTotal() {
        valorMenu = valorinicialMenu - (((porcentajeDescuento * valorinicialMenu)) / 100);
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
