/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listastipopila;

import javax.swing.JOptionPane;

/**
 *
 * @author loren
 */
public class Pila {
    
    private Nodo UltimoValorIngesado;
    int tamano = 0;
    String Lista = "";
    
    public Pila(){
        UltimoValorIngesado = null;
        tamano = 0;
    }
    
    //Método para saber si la pila está vacia
    public boolean PilaVacia(){
        return UltimoValorIngesado == null;
    }
    
    //Método para insertar un nodo a la pila
    public void InsertNodo(int nodo){
        Nodo nuevoNodo = new Nodo(nodo);
        nuevoNodo.siguiente = UltimoValorIngesado;
        UltimoValorIngesado = nuevoNodo;
        tamano++;
    }
    
    //Método para eliminar un nodo de la pila
    public int EliminNodo(){
        int auxiliar = UltimoValorIngesado.informacion;
        UltimoValorIngesado = UltimoValorIngesado.siguiente;
        tamano--;
        return auxiliar;
    }
    
    //Método para mostrar el ultimo valor ingresado
    public int MostrarUltimoValorIngresado(){
        return UltimoValorIngesado.informacion;
    }
    
    //Método para reconocer el tamaño de la pila
    public int TamanoPila(){
        return tamano;
    }
    
    //Método para vaciar la pila
    public void VaciarPila(){
        while (!PilaVacia()){
            EliminNodo();
        }
    }
    
    //Método para mostrar el contenido de la pila
    public void MostrarValores(){
        Nodo recorrido = UltimoValorIngesado;
        
        while(recorrido != null){
            Lista += recorrido.informacion + "\n";
            recorrido = recorrido.siguiente;
        }
        JOptionPane.showMessageDialog(null, Lista);
        Lista = "";
    }
}
