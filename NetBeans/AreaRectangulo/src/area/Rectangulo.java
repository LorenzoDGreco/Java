/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package area;

/**
 *
 * @author loren
 */
public class Rectangulo {
    private int base, altura, area;
    public Rectangulo(int base, int altura) {
        this.altura= altura;
        this.base = base;
        
    }
    public void CalculoArea(){
        area = base * altura;
    }
    public void Imprimir(){
        CalculoArea();
        System.out.println("El Area es: " + area);
    }
}
