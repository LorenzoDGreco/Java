package clases;

import javax.swing.JOptionPane;

public class ClasePrincipal {

    public static void main(String[] args) {
        int opcion = 0, nodoInformacion = 0;
        Cola cola = new Cola();

        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Menú de Opciones:\n\n"
                        + "1. Insertar un nodo.\n"
                        + "2. Extraer un nodo.\n"
                        + "3. Mostrar contenido de la cola.\n"
                        + "4. Salir.\n\n"));

                switch (opcion) {
                    case 1:
                        nodoInformacion = Integer.parseInt(JOptionPane.showInputDialog(null, 
                                "Por Favor ingresa el valor a guardar en el nodo."));
                        cola.InsertarCola(nodoInformacion);
                        break;
                        
                    case 2:
                        if(!cola.ColaVacia()){
                            JOptionPane.showMessageDialog(null, "Se extrajo un nodo con el valor: " + cola.ExtraerCola());
                        }else{
                            JOptionPane.showMessageDialog(null,"La cola está vacia");
                        }
                        break;
                        
                    case 3:
                        cola.MostrarContenido();
                        break;
                        
                    case 4:
                        opcion = 4;
                        JOptionPane.showMessageDialog(null, "Ok, Ni no vimo prro");
                        break;
                        
                    default:
                        JOptionPane.showMessageDialog(null, "No sabe contar bo?");
                        break;
                }
            } catch (NumberFormatException e) {
            }

        } while (opcion != 4);
    }
}
