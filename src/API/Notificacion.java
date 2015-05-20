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
     * Muestra el JOptionPane con un icono de interrogacion, un titulo y un mensaje.
     * @param titulo
     * @param mensaje
     */
    public void alertaPregunta(String titulo, String mensaje){
        JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.QUESTION_MESSAGE);
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
     * Muestra el JOptionPane con un icono de informacion, un titulo y un mensaje.
     * @param titulo
     * @param mensaje 
     */
    public void alertaInformativo(String titulo, String mensaje){
        JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.INFORMATION_MESSAGE);
    }
    
    //--------------------------------OPCIONES---------------------------------//
    
    /**
     * Muestra el JOptionPane con sin icono, un titulo, un mensaje y tres opciones
     * de seleccion: "Si", "No" y "Cancelar".
     * @param titulo
     * @param mensaje
     * @return Retorna un entero segun la opcion seleccionada.
     * Retorna 0 si selecciona "Si"
     * Retorna 1 si selecciona "No"
     * Retorna 2 si selecciona "Cancelar"
     */
    public int opcionCompleta(String titulo, String mensaje){
        int opcion = JOptionPane.showOptionDialog(null, mensaje, titulo,
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE,
                null, new Object[]{"Si","No", "Cancelar"}, "Si");
        return opcion;
    }
    
    /**
     * Muestra el JOptionPane sin icono, un titulo, un mensaje y dos opciones de
     * seleccion: "Si", "No".
     * @param titulo
     * @param mensaje
     * @return Retorna un entero segun la opcion seleccionada.
     * Retorna 0 si selecciona "Si"
     * Retorna 1 si selecciona "No"
     */
    public int opcionSINO(String titulo, String mensaje){
        int opcion = JOptionPane.showOptionDialog(null, mensaje, titulo,
                JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE,
                null, new Object[]{"Si","No"}, "Si");
        return opcion;
    }
    
    /**
     * Muestra el JOptionPane sin icono, un titulo, un mensaje y una opcion de
     * seleccion: "Si".
     * @param titulo
     * @param mensaje
     * @return Retorna un entero segun la opcion seleccionada.
     * Retorna 0 si selecciona "Si"
     */
    public int opcionSI(String titulo, String mensaje){
        int opcion = JOptionPane.showOptionDialog(null, mensaje, titulo,
                JOptionPane.YES_OPTION, JOptionPane.PLAIN_MESSAGE,
                null, new Object[]{"Si"}, "Si");
        return opcion;
    }
    
    /**
     * Muestra el JOptionPane con un icono de pregunta, un titulo, un mensaje y
     * tres opciones de seleccion: "Si", "No" y "Cancelar".
     * @param titulo
     * @param mensaje
     * @return Retorna un entero segun la opcion seleccionada.
     * Retorna 0 si selecciona "Si"
     * Retorna 1 si selecciona "No"
     * Retorna 2 si selecciona "Cancelar"
     */
    public int opcionPreguntaCompleta(String titulo, String mensaje){
        int opcion = JOptionPane.showOptionDialog(null, mensaje, titulo,
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, new Object[]{"Si","No","Cancelar"}, "Si");
        return opcion;
    }
    
    /**
     * Muestra el JOptionPane con un icono de pregunta, un titulo, un mensaje y
     * dos opciones de seleccion: "Si", "No".
     * @param titulo
     * @param mensaje
     * @return Retorna un entero segun la opcion seleccionada.
     * Retorna 0 si selecciona "Si"
     * Retorna 1 si selecciona "No"
     */
    public int opcionPreguntaSINO(String titulo, String mensaje){
        int opcion = JOptionPane.showOptionDialog(null, mensaje, titulo,
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, new Object[]{"Si","No"}, "Si");
        return opcion;
    }
    
    /**
     * Muestra el JOptionPane con un icono de pregunta, un titulo, un mensaje y
     * una opcion de seleccion: "Si".
     * @param titulo
     * @param mensaje
     * @return Retorna un entero segun la opcion seleccionada.
     * Retorna 0 si selecciona "Si"
     */
    public int opcionPreguntaSI(String titulo, String mensaje){
        int opcion = JOptionPane.showOptionDialog(null, mensaje, titulo,
                JOptionPane.YES_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, new Object[]{"Si"}, "Si");
        return opcion;
    }
    
    /**
     * Muestra el JOptionPane con un icono de error, un titulo, un mensaje y
     * tres opciones de seleccion: "Si", "No" y "Cancelar".
     * @param titulo
     * @param mensaje
     * @return Retorna un entero segun la opcion seleccionada.
     * Retorna 0 si selecciona "Si"
     * Retorna 1 si selecciona "No"
     * Retorna 2 si selecciona "Cancelar"
     */
    public int opcionErrorCompleta(String titulo, String mensaje){
        int opcion = JOptionPane.showOptionDialog(null, mensaje, titulo,
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE,
                null, new Object[]{"Si","No","Cancelar"}, "Si");
        return opcion;
    }
    
    /**
     * Muestra el JOptionPane con un icono de error, un titulo, un mensaje y
     * dos opciones de seleccion: "Si", "No".
     * @param titulo
     * @param mensaje
     * @return Retorna un entero segun la opcion seleccionada.
     * Retorna 0 si selecciona "Si"
     * Retorna 1 si selecciona "No"
     */
    public int opcionErrorSINO(String titulo, String mensaje){
        int opcion = JOptionPane.showOptionDialog(null, mensaje, titulo,
                JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE,
                null, new Object[]{"Si","No"}, "Si");
        return opcion;
    }
    
    /**
     * Muestra el JOptionPane con un icono de pregunta, un titulo, un mensaje y
     * una opcion de seleccion: "Si".
     * @param titulo
     * @param mensaje
     * @return Retorna un entero segun la opcion seleccionada.
     * Retorna 0 si selecciona "Si"
     */
    public int opcionErrorSI(String titulo, String mensaje){
        int opcion = JOptionPane.showOptionDialog(null, mensaje, titulo,
                JOptionPane.YES_OPTION, JOptionPane.ERROR_MESSAGE,
                null, new Object[]{"Si"}, "Si");
        return opcion;
    }
    
    /**
     * Muestra el JOptionPane con un icono de alerta, un titulo, un mensaje y
     * tres opciones de seleccion: "Si", "No" y "Cancelar".
     * @param titulo
     * @param mensaje
     * @return Retorna un entero segun la opcion seleccionada.
     * Retorna 0 si selecciona "Si"
     * Retorna 1 si selecciona "No"
     * Retorna 2 si selecciona "Cancelar"
     */
    public int opcionAlertaCompleta(String titulo, String mensaje){
        int opcion = JOptionPane.showOptionDialog(null, mensaje, titulo,
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE,
                null, new Object[]{"Si","No","Cancelar"}, "Si");
        return opcion;
    }
    
    /**
     * Muestra el JOptionPane con un icono de alerta, un titulo, un mensaje y
     * dos opciones de seleccion: "Si", "No".
     * @param titulo
     * @param mensaje
     * @return Retorna un entero segun la opcion seleccionada.
     * Retorna 0 si selecciona "Si"
     * Retorna 1 si selecciona "No"
     */
    public int opcionAlertaSINO(String titulo, String mensaje){
        int opcion = JOptionPane.showOptionDialog(null, mensaje, titulo,
                JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE,
                null, new Object[]{"Si","No"}, "Si");
        return opcion;
    }
    
    /**
     * Muestra el JOptionPane con un icono de pregunta, un titulo, un mensaje y
     * una opcion de seleccion: "Si".
     * @param titulo
     * @param mensaje
     * @return Retorna un entero segun la opcion seleccionada.
     * Retorna 0 si selecciona "Si"
     */
    public int opcionAlertaSI(String titulo, String mensaje){
        int opcion = JOptionPane.showOptionDialog(null, mensaje, titulo,
                JOptionPane.YES_OPTION, JOptionPane.WARNING_MESSAGE,
                null, new Object[]{"Si"}, "Si");
        return opcion;
    }
    
    /**
     * Muestra el JOptionPane con un icono informativo, un titulo, un mensaje y
     * tres opciones de seleccion: "Si", "No" y "Cancelar".
     * @param titulo
     * @param mensaje
     * @return Retorna un entero segun la opcion seleccionada.
     * Retorna 0 si selecciona "Si"
     * Retorna 1 si selecciona "No"
     * Retorna 2 si selecciona "Cancelar"
     */
    public int opcionInformativoCompleta(String titulo, String mensaje){
        int opcion = JOptionPane.showOptionDialog(null, mensaje, titulo,
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE,
                null, new Object[]{"Si","No","Cancelar"}, "Si");
        return opcion;
    }
    
    /**
     * Muestra el JOptionPane con un icono informativo, un titulo, un mensaje y
     * dos opciones de seleccion: "Si", "No".
     * @param titulo
     * @param mensaje
     * @return Retorna un entero segun la opcion seleccionada.
     * Retorna 0 si selecciona "Si"
     * Retorna 1 si selecciona "No"
     */
    public int opcionInformativoSINO(String titulo, String mensaje){
        int opcion = JOptionPane.showOptionDialog(null, mensaje, titulo,
                JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE,
                null, new Object[]{"Si","No"}, "Si");
        return opcion;
    }
    
    /**
     * Muestra el JOptionPane con un icono informativo, un titulo, un mensaje y
     * una opcion de seleccion: "Si".
     * @param titulo
     * @param mensaje
     * @return Retorna un entero segun la opcion seleccionada.
     * Retorna 0 si selecciona "Si"
     */
    public int opcionInformativoSI(String titulo, String mensaje){
        int opcion = JOptionPane.showOptionDialog(null, mensaje, titulo,
                JOptionPane.YES_OPTION, JOptionPane.INFORMATION_MESSAGE,
                null, new Object[]{"Si"}, "Si");
        return opcion;
    }
}