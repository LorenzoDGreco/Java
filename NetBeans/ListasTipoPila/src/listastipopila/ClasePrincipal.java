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
public class ClasePrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion = 0, nodo = 0;
        Pila pila = new Pila();

        do {
            try {

                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Menú de Opciones:\n\n"
                        + "1. Insertar Nodo.\n"
                        + "2. Eliminar Nodo.\n"
                        + "3. ¿La Pila está vacia?.\n"
                        + "4. ¿Cual es el ultimo valor guardado?.\n"
                        + "5. ¿Cuantos nodos tiene la Pila?.\n"
                        + "6. Vaciar Pila.\n"
                        + "7. Mostrar Contenido de la Pila.\n"
                        + "8. Salir.\n\n"));
                switch (opcion) {

                    case 1:
                        nodo = Integer.parseInt(JOptionPane.showInputDialog(null,
                                 "Porfavor ingesa el valor a guardar en el nodo"));
                        pila.InsertNodo(nodo);
                        break;
                    case 2:
                        if (!pila.PilaVacia()) {
                            JOptionPane.showMessageDialog(null, "Se ah eleminado un nodo con el valor: " + pila.EliminNodo());
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila está vacia");
                        }
                        break;
                    case 3:
                        if(pila.PilaVacia()){
                            JOptionPane.showMessageDialog(null, "La pila está vacia");
                        }else{
                            JOptionPane.showMessageDialog(null, "La pila NO está vacia");
                        }
                        break;
                    case 4:
                        if(!pila.PilaVacia()){
                            JOptionPane.showMessageDialog(null, "El ultimo valor ingresado en la pila es: " + pila.MostrarUltimoValorIngresado());
                        }else{
                            JOptionPane.showMessageDialog(null, "La pila esta vacia");
                        }
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "El tamaño de la pila es: " + pila.TamanoPila() + " nodos.");
                        break;
                    case 6:
                        if(!pila.PilaVacia()){
                            pila.VaciarPila();
                            JOptionPane.showMessageDialog(null, "Se ha borrado toda la pila correctamente");
                        }else{
                            JOptionPane.showMessageDialog(null, "No tienes nada en la pila actualmente, para eliminar algo");
                        }
                        break;
                    case 7:
                        pila.MostrarValores();
                        break;
                    case 8:
                        opcion = 8;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Le erraste kpo elege tu respuesta sabiamente.");
                        break;
                }
            } catch (NumberFormatException e) {

            }
        } while (opcion != 8);
    }

}
