package API;

import javax.swing.JOptionPane;

/**
 * @author Emanuel Martinez Pinzon
 */
public class Notificacion{
    //Probando objetos
    public void HolaMundo(){
        System.out.println("Hola mundo!!!");
    }
    
    //-----------------------------NOTIFICACIONES------------------------------//
    
    /**
     * Muestra el JOptionPane sin icono, solo dejando el titulo y el mensaje.
     * @param marco
     * @param mensaje
     */
    public void alerta(String marco, String mensaje){
        JOptionPane.showMessageDialog(null, mensaje, marco, JOptionPane.PLAIN_MESSAGE);
    }
    
    /**
     * Muestra el JOptionPane con un icono de error, un titulo y un mensaje.
     * @param marco
     * @param mensaje
     */
    public void alertaError(String marco, String mensaje){
        JOptionPane.showMessageDialog(null, mensaje, marco, JOptionPane.ERROR_MESSAGE);
    }
    
    /**
     * Muestra el JOptionPane con un icono de alerta, un titulo y un mensaje.
     * @param marco
     * @param mensaje
     */
    public void alertaAtencion(String marco, String mensaje){
        JOptionPane.showMessageDialog(null, mensaje, marco, JOptionPane.WARNING_MESSAGE);
    }
    
    /**
     * Muestra el JOptionPane con un icono de interrogacion, un titulo y un mensaje.
     * @param marco
     * @param mensaje
     */
    public void alertaCuestion(String marco, String mensaje){
        JOptionPane.showMessageDialog(null, mensaje, marco, 3);
    }
}
