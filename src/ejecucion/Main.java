package ejecucion;

import API.Notificacion;

/**
 * @author Emanuel Martinez Pinzon
 */
public class Main {
    public static void main(String[] emp){
        //Notificacion api = new Notificacion();
        
        //Notificaciones
//        api.alerta("Borde", "Mensaje");
//        api.alertaInformativo("Borde", "Mensaje");
//        api.alertaCuestion("Borde", "Mensaje");
//        api.alertaError("Borde", "Mensaje");
//        api.alertaAtencion("Borde", "Mensaje");
        
        //Opciones
//        System.out.println(""+api.opcionCompleta("Titulo", "Mensaje"));
//        System.out.println(""+api.opcionSINO("Titulo", "Mensaje"));
//        System.out.println(""+api.opcionSI("Titulo", "Mensaje"));
//        System.out.println(""+api.opcionPreguntaCompleta("Titulo", "Mensaje"));
//        System.out.println(""+api.opcionPreguntaSINO("Titulo", "Mensaje"));
//        System.out.println(""+api.opcionPreguntaSI("Titulo", "Mensaje"));
//        System.out.println(""+api.opcionErrorCompleta("Titulo", "Mensaje"));
//        System.out.println(""+api.opcionErrorSINO("Titulo", "Mensaje"));
//        System.out.println(""+api.opcionErrorSI("Titulo", "Mensaje"));
//        System.out.println(""+api.opcionAlertaCompleta("Titulo", "Mensaje"));
//        System.out.println(""+api.opcionAlertaSINO("Titulo", "Mensaje"));
//        System.out.println(""+api.opcionAlertaSI("Titulo", "Mensaje"));
//        System.out.println(""+api.opcionInformativoCompleta("Titulo", "Mensaje"));
//        System.out.println(""+api.opcionInformativoSINO("Titulo", "Mensaje"));
//        System.out.println(""+api.opcionInformativoSI("Titulo", "Mensaje"));
        
        //Ingreso de datos
//        System.out.println(Notificacion.ingresar("Mensaje"));
//        System.out.println(Notificacion.ingresar("Titulo", "Mensaje"));
//        System.out.println(Notificacion.ingresarInt("Titulo", "Mensaje"));
//        System.out.println(Notificacion.ingresarFloat("Titulo", "Mensaje"));
//        System.out.println(Notificacion.ingresarPregunta("Titulo", "Mensaje"));
//        System.out.println(Notificacion.ingresarError("Titulo", "Mensaje"));
//        System.out.println(Notificacion.ingresarAlerta("Titulo", "Mensaje"));
//        System.out.println(Notificacion.ingresarInformativo("Titulo", "Mensaje"));
    
        //Paneles de confirmacion
        System.out.println(Notificacion.confirmacionCompleta("Titulo", "Mensaje"));
        System.out.println(Notificacion.confirmacionSINO("Titulo", "Mensaje"));
        System.out.println(Notificacion.confirmacionPreguntaCompleta("Titulo", "Mensaje"));
        System.out.println(Notificacion.confirmacionPreguntaSINO("Titulo", "Mensaje"));
        System.out.println(Notificacion.confirmacionErrorCompleta("Titulo", "Mensaje"));
        System.out.println(Notificacion.confirmacionErrorSINO("Titulo", "Mensaje"));
        System.out.println(Notificacion.confirmacionAlertaCompleta("Titulo", "Mensaje"));
        System.out.println(Notificacion.confirmacionAlertaSINO("Titulo", "Mensaje"));
        System.out.println(Notificacion.confirmacionNotificacionCompleta("Titulo", "Mensaje"));
        System.out.println(Notificacion.confirmacionNotificacionSINO("Titulo", "Mensaje"));
    }
}
