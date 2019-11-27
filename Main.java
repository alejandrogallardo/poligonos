/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poligonos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class Main {
    // Arreglo dinamico
    static ArrayList<Poligono> poligono = new ArrayList<Poligono>();
    static Scanner entrada = new Scanner(System.in);
    
    public static void main(String[] args) {
        // llenar un poligono
        llenarPoligono();
        
        mostrarResultados();
    }
    
    public static void llenarPoligono(){
        int opcion;
        char respuesta;
        do{
            do{
                System.out.println("Digite que poligono desea");
                System.out.println("1. triangulo");
                System.out.println("2. Rectangulo");
                System.out.println("Opcion");
                opcion = entrada.nextInt();    
            }while( opcion < 1 || opcion > 2 );
            
            switch(opcion){
                case 1: llenarTriangulo(); // llenar triangulo
                    break;
                case 2: llenarRectangulo(); // llenar rectangulo
                    break;
            }
            System.out.println("\nDesea introducir otro ponigono (s/n): ");
            respuesta = entrada.next().charAt(0);
            System.out.println("");
        } while( respuesta=='s' || respuesta=='S' );
    }
    
    public static void llenarTriangulo(){
        double lado1, lado2, lado3;
        
        System.out.println("\nDigite el lado  1 del triangulo: ");
        lado1 = entrada.nextDouble();
        System.out.println("\nDigite el lado  2 del triangulo: ");
        lado2 = entrada.nextDouble();
        System.out.println("Digite el lado  3 del triangulo: ");
        lado3 = entrada.nextDouble();
        
        Triangulo triangulo = new Triangulo( lado1, lado2, lado3 );
        
        poligono.add(triangulo);
    }
    
    public static void llenarRectangulo(){
        double lado1, lado2;
        
        System.out.println("\nDigite el lado 1 del rectangulo: ");
        lado1 = entrada.nextDouble();
        System.out.println("\nDigite el lado 2 del rectangulo: ");
        lado2 = entrada.nextDouble();
        
        Rectangulo rectangulo = new Rectangulo( lado1, lado2 );
        
        poligono.add(rectangulo);
    }
    
    public static void mostrarResultados(){
        
        for( Poligono poli: poligono ){
            System.out.println(poli.toString());
            System.out.println( "Area: " + poli.area() );
            System.out.println("");
        }
    }
}
