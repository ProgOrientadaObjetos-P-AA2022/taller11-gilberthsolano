/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11;

/**
 *
 * @author gilbertsolanosotomayor
 */
public class MenudelDia extends Menu{
    private double valorPostre;
    private double valorBebida;

    public MenudelDia(){
        
    }
    public MenudelDia(String nombrePl, double valorinicialM,double vpostre, double vbebida){
        super(nombrePl, valorinicialM);
        valorPostre=vpostre;
        valorBebida=vbebida;
    }

    public void establecerValorPostre(double valorPostre) {
        this.valorPostre = valorPostre;
    }

    public void establecerValorBebida(double valorBebida) {
        this.valorBebida = valorBebida;
    }

    public double obtenerValorPostre() {
        return valorPostre;
    }

    public double obtenerValorBebida() {
        return valorBebida;
    }
    
    
    @Override
    public void calcularvalorMenuTotal() {
        valorMenu=valorinicialMenu+valorPostre+valorBebida;
    }
    public double obtenerValorcancelartotal(){
        return valorMenu;
    }

    @Override
    public String toString() {
        String cadena=String.format("Menu del dia\n%s",super.toString());
        cadena=String.format("%s"
                + "\tValor Postre:%.2f\n"
                + "\tValor Bebida:%.2f\n"
                + "\tValor Menu:%.2f\n",cadena,
                obtenerValorPostre(),
                obtenerValorBebida(),
                obtenerValorMenu());
        return cadena;
    }
    
    
}
