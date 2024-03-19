/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operacionesbasicas;

/**
 *
 * @author diegomalmol
 */
public class OperacionesBasicas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a=5, b=4;
        int resultado; resultado = sumar(a,b);
        System.out.println(a+"+"+b"="+resultado);
            
    }
    public static int sumar(int a, int b){
        int resultado;
        resultado = a+b;
        return resultado;
    }
    public static int restar(int a, int b){
        int resultado;
        resultado = a - b;
        return resultado;
    }
    
}
