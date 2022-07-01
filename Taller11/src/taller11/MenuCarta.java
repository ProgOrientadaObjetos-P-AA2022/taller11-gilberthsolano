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
    private double porcentajeAdicionalFijo=10;
    public MenuCarta(){
        
    }
    public MenuCarta(String nombrePl, double valorinicialM,double valorPG, double valorB){
        super(nombrePl, valorinicialM);
        valorporciondeGuarnicion=valorPG;
        valorBebida=valorB;
        
    }

    public double getPorcentajeAdicionalFijo() {
        return porcentajeAdicionalFijo;
    }

    public void setPorcentajeAdicionalFijo(double porcentajeAdicionalFijo) {
        this.porcentajeAdicionalFijo = porcentajeAdicionalFijo;
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
    public void calcularvalorMenuTotal() {
     valorMenu=(valorinicialMenu+valorporciondeGuarnicion+valorBebida)+porcentajeAdicional;
        
    }
    public double obtenervalorcancelartotal(){
        return valorMenu;
    }

    @Override
    public String toString() {
        String cadena=String.format("Menu a la carta\n%s",super.toString());
        cadena=String.format("%s"
                + "\tValor porcion guarnicion:%.2f\n"
                + "\tValor bebida:%.2f\n"
                + "\tPorcentaje Adicional:%.2f\n"
                + "\tValor menu:%.2f\n", cadena,
                obtenerValorporciondeGuarnicion(),
                obtenerValorBebida(),
                getPorcentajeAdicionalFijo(),
                obtenerValorMenu());
        return cadena;
    }
    
    
    
}
