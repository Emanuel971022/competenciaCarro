package API;

import javax.swing.JOptionPane;

/**
 * @author Emanuel Martinez Pinzon
 */
public class Notificacion{    
    //---------------------------------ALERTAS---------------------------------//
    
    /**
     * Muestra el JOptionPane sin icono, solo dejando el titulo y el mensaje.
     * @param titulo
     * @param mensaje
     */
    public void alerta(String titulo, String mensaje){
        JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.PLAIN_MESSAGE);
    }
    
    /**
     * Muestra el JOptionPane con un icono de error, un titulo y un mensaje.
     * @param titulo
     * @param mensaje
     */
    public void alertaError(String titulo, String mensaje){
        JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.ERROR_MESSAGE);
    }
    
    /**
     * Muestra el JOptionPane con un icono de alerta, un titulo y un mensaje.
     * @param titulo
     * @param mensaje
     */
    public void alertaAtencion(String titulo, String mensaje){
        JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.WARNING_MESSAGE);
    }
    
    /**
     * Muestra el JOptionPane con un icono de interrogacion, un titulo y un mensaje.
     * @param titulo
     * @param mensaje
     */
    public void alertaCuestion(String titulo, String mensaje){
        JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.QUESTION_MESSAGE);
    }
    
    /**
     * Muestra el JOptionPane con un incono de informacion, un titulo y un mensaje.
     * @param titulo
     * @param mensaje 
     */
    public void alertaInformativo(String titulo, String mensaje){
        JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.INFORMATION_MESSAGE);
    }
}