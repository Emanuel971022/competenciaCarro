package ejecucion;

import API.Notificacion;

/**
 * @author Emanuel Martinez Pinzon
 */
public class Main {
    public static void main(String[] emp){
        Notificacion api = new Notificacion();
        
        //Notificaciones
//        api.alerta("Borde", "Mensaje");
//        api.alertaInformativo("Borde", "Mensaje");
//        api.alertaCuestion("Borde", "Mensaje");
//        api.alertaError("Borde", "Mensaje");
//        api.alertaAtencion("Borde", "Mensaje");
        
        //Opciones
        System.out.println(""+api.opcion("Titulo", "Mensaje"));
    }
}
