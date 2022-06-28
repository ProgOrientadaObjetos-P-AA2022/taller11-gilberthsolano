/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller11;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MenuCarta menuCar1= new MenuCarta("Arroz camaron", 2, 1, 2);
        menuCar1.establecerPorcentajeAdicional(10);
        menuCar1.calcularvalorcancelartotal();
        System.out.println(menuCar1);
        MenudelDia menudia1= new MenudelDia("Fritada", 3, 1, 1);
        menudia1.calcularvalorcancelartotal();
        System.out.println(menudia1);
        MenuNinos menuninos1= new MenuNinos("Big mac", 2, 1, 1);
        menuninos1.calcularvalorcancelartotal();
        System.out.println(menuninos1);
        MenuEconomico menuEco1= new MenuEconomico("Carna asada", 4);
        menuEco1.establecerPorcentajeDescuento(10);
        menuEco1.calcularvalorcancelartotal();
        System.out.println(menuEco1);
        
        
    }
    
}
