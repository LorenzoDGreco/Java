/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;
import paquete1.Atributos_Metodos; //se importa el otro paquete
/**
 *
 * @author loren
 */
public class ClaseJava2 {
    public static void main(String[] args) {
        Atributos_Metodos main = new Atributos_Metodos(); //se importa el .java
        
        main.Metodos();        //ya que los 2 son public pueden pasar de un paquete a otro
        main.valorUno = 0;
        
        main.setValorTres(0); //lo que hago acá es poder cambiar un valor desde otro archivo (sea o no el mismo paquete o no)que este en "private", porque lo que hago aca es una que le mando una variable a una funcion y esa funcion me la guarda en el private
        
    }
}
