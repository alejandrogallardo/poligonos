/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poligonos;

/**
 *
 * @author Alejandro
 */
public abstract class Poligono {
    protected int numeroLados;

    public Poligono(int numeroLados) {
        this.numeroLados = numeroLados;
    }

    public int getNumeroLados() {
        return numeroLados;
    }

    // se sobre escribe toString
    @Override
    public String toString() {
        return "Numero Lados = " + numeroLados;
    }
    
    // Se declara el metodo area como abstracto
    public abstract double area();
    
}
