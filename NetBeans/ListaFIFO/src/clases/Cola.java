/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import javax.swing.JOptionPane;

/**
 *
 * @author Lorenzo Greco
 */
public class Cola {
    private Nodo InicioCola, FinalCola; //el inicio y fin de la cola
    String Cola = "";
    
    public Cola(){
        InicioCola = null; //indica que no hay nada ya que es el inicio del programa
        FinalCola = null; // igual que el anterior
    }
    
    //Metetodo para saber si la cola está vacia
    public boolean ColaVacia(){
        if (InicioCola == null) {
            return true;
        } else {
            return false;
        }
    }
    
    //Metodo para insertar a la cola
    public void InsertarCola(int informacion){
        Nodo NuevoNodo = new Nodo();
        NuevoNodo.informacion = informacion;
        NuevoNodo.siguiente = null;
        
        if (ColaVacia()) {
            InicioCola = NuevoNodo;
            FinalCola = NuevoNodo;
        } else {
            FinalCola.siguiente = NuevoNodo;
            FinalCola = NuevoNodo;
        }
    }
    
    //Metodo para extraer de la cola
    public int ExtraerCola(){
        if (!ColaVacia()) {
            int informacion = InicioCola.informacion;
            
            if (InicioCola == FinalCola) {
                InicioCola = null;
                FinalCola = null;
            } else {
                InicioCola = InicioCola.siguiente;
            }
            return informacion;
        } else {
            return Integer.MAX_VALUE;
        }
    }
    
    
    //Metodo para mostrar el contenido de la cola
    public void MostrarContenido(){
        Nodo recorrido = InicioCola;
        String ColaInvertida = "";
        
        while(recorrido != null){
            Cola += recorrido.informacion + " ";
            recorrido = recorrido.siguiente;
        }
        
        String cadena [] = Cola.split(" ");
        
        for (int i = cadena.length - 1; i >= 0; i--) {
            ColaInvertida += " " + cadena[i];
        }
        JOptionPane.showMessageDialog(null, ColaInvertida);
        Cola = "";
    }
    
}
