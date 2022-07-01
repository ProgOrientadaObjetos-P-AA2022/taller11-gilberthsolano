/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller11;

import java.util.ArrayList;

/**
 *
 * @author gilbertsolanosotomayor
 */
public class Ejecutor2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MenudelDia menud1 = null;
        String[][] datos001 = {{"Niños 01", "2.00", "1", "1.5"},
        {"Niños 02", "3.00", "1", "1.5"},
        {"Niños 03", "2.00", "2", "0.5"},
        };

        String[][] datos002 = {{"Econo 001", "4", "25"},
        {"Econo 002", "4", "15"},
        {"Econo 003", "4", "35"}
        };

        String[][] datos003 = {{"Dia 001", "5", "1", "1"},
        {"Dia 002", "6", "2", "2"},
        {"Dia 003", "5.5", "3", "1"},};

        String[][] datos004 = {{"Carta 001", "6", "1.5", "2", "10"},
        {"Carta 002", "7", "1.7", "2.1", "5"},
        {"Carta 003", "8", "1.9", "2.2", "5"},
        {"Carta 004", "9", "2.5", "2.9", "5"},};

        ArrayList<Menu> lista = new ArrayList<>();

        for (int i = 0; i < datos001.length; i++) {
            String nPlato = datos001[i][0];
            double vInicio = Double.parseDouble(datos001[i][1]);
            double vHelado = Double.parseDouble(datos001[i][2]);
            double vPastel = Double.parseDouble(datos001[i][3]);

            MenuNinos menu1 = new MenuNinos(nPlato, vInicio, vHelado, vPastel);
            menu1.calcularvalorMenuTotal();
            lista.add(menu1);

        }
        
           
        for (int i = 0; i < datos002.length; i++) {
            String nPlato= datos002[i][0];
            double vInicio= Double.parseDouble(datos002[i][1]);
            double vPorcentajeDescuento = Double.parseDouble(datos002[i][2]);
            
            MenuEconomico menuEc1= new MenuEconomico(nPlato, vInicio);
            menuEc1.establecerPorcentajeDescuento(vPorcentajeDescuento);
            menuEc1.calcularvalorMenuTotal();
            lista.add(menuEc1);
        }
        for (int i = 0; i < datos003.length; i++) {
            String nPlato=datos003[i][0];
            double vInicio=Double.parseDouble(datos003[i][1]);
            double vPostre=Double.parseDouble(datos003[i][2]);
            double vBebida=Double.parseDouble(datos003[i][3]);
            
            MenudelDia menudia1= new MenudelDia(nPlato, vInicio, vPostre, vBebida);
            menudia1.calcularvalorMenuTotal();
            lista.add(menudia1);
            
        }
        for (int i = 0; i < datos004.length; i++) {
            String nPlato= datos004[i][0];
            double vInicio= Double.parseDouble(datos004[i][1]);
            double vPorcionGuarnicion= Double.parseDouble(datos004[i][2]);
            double vBebida=Double.parseDouble(datos004[i][3]);
            
            MenuCarta menuCart1= new MenuCarta(nPlato, vInicio, vPorcionGuarnicion, vBebida);
            menuCart1.establecerPorcentajeAdicional(10);
            menuCart1.calcularvalorMenuTotal();
            lista.add(menuCart1);
            
        }
        
       
        CuentaM cuenta1= new CuentaM();
        cuenta1.establecerListamenu(lista);
        cuenta1.establecerNombreCliente("Rene Elizalde");
        cuenta1.calcularvalortotalcancelar();
        System.out.println(cuenta1);
        

    }

}
