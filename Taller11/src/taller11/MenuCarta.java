/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11;

/**
 *
 * @author gilbertsolanosotomayor
 */
public class MenuCarta extends Menu{
    private double valorporciondeGuarnicion;
    private double valorBebida;
    private double porcentajeAdicional;//en relacion del valor inicial del menu
    
    public MenuCarta(){
        
    }
    public MenuCarta(String nombrePl, double valorinicialM,double valorPG, double valorB){
        super(nombrePl, valorinicialM);
        valorporciondeGuarnicion=valorPG;
        valorBebida=valorB;
        
    }

    public void establecerValorporciondeGuarnicion(double valorporciondeGuarnicion) {
        this.valorporciondeGuarnicion = valorporciondeGuarnicion;
    }

    public void establecerValorBebida(double valorBebida) {
        this.valorBebida = valorBebida;
    }

    public void establecerPorcentajeAdicional(double porcentajeAdicional) {
        this.porcentajeAdicional = ((porcentajeAdicional*valorinicialMenu))/100;
    }

    public double obtenerValorporciondeGuarnicion() {
        return valorporciondeGuarnicion;
    }

    public double obtenerValorBebida() {
        return valorBebida;
    }

    public double obtenerPorcentajeAdicional() {
        return porcentajeAdicional;
    }
    @Override
    public void calcularvalorcancelartotal() {
     valorMenu=(valorinicialMenu+valorporciondeGuarnicion+valorBebida)+porcentajeAdicional;
        
    }
    public double obtenervalorcancelartotal(){
        return valorMenu;
    }

    @Override
    public String toString() {
        String cadena=String.format("Menu a la carta\n%s",super.toString());
        cadena=String.format("%s"
                + "Valor porcion guarnicion:%.2f\n"
                + "Valor bebida:%.2f\n"
                + "Porcentaje Adicional:%.2f\n"
                + "Valor menu:%.2f\n", cadena,
                obtenerValorporciondeGuarnicion(),
                obtenerValorBebida(),
                obtenerPorcentajeAdicional(),
                obtenerValorMenu());
        return cadena;
    }
    
    
    
}
