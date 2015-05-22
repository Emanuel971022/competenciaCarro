package ejecucion;

import API.Notificacion;

/**
 * @author Emanuel Martinez Pinzon
 * 
 * Esta clase contiene un metodo principal que ejecuta todos los metodos de la 
 * clase Notificacion.
 */
public class Main {
    public static void main(String[] emp){        
        //Notificaciones
        Notificacion.alerta("Borde", "Mensaje");
        Notificacion.alertaInformativo("Borde", "Mensaje");
        Notificacion.alertaPregunta("Borde", "Mensaje");
        Notificacion.alertaError("Borde", "Mensaje");
        Notificacion.alertaAtencion("Borde", "Mensaje");
        
        //Opciones
        System.out.println(Notificacion.opcionCompleta("Titulo", "Mensaje"));
        System.out.println(Notificacion.opcionSINO("Titulo", "Mensaje"));
        System.out.println(Notificacion.opcionSI("Titulo", "Mensaje"));
        System.out.println(Notificacion.opcionPreguntaCompleta("Titulo", "Mensaje"));
        System.out.println(Notificacion.opcionPreguntaSINO("Titulo", "Mensaje"));
        System.out.println(Notificacion.opcionPreguntaSI("Titulo", "Mensaje"));
        System.out.println(Notificacion.opcionErrorCompleta("Titulo", "Mensaje"));
        System.out.println(Notificacion.opcionErrorSINO("Titulo", "Mensaje"));
        System.out.println(Notificacion.opcionErrorSI("Titulo", "Mensaje"));
        System.out.println(Notificacion.opcionAlertaCompleta("Titulo", "Mensaje"));
        System.out.println(Notificacion.opcionAlertaSINO("Titulo", "Mensaje"));
        System.out.println(Notificacion.opcionAlertaSI("Titulo", "Mensaje"));
        System.out.println(Notificacion.opcionInformativoCompleta("Titulo", "Mensaje"));
        System.out.println(Notificacion.opcionInformativoSINO("Titulo", "Mensaje"));
        System.out.println(Notificacion.opcionInformativoSI("Titulo", "Mensaje"));
        
        //Ingreso de datos
        System.out.println(Notificacion.ingresar("Mensaje"));
        System.out.println(Notificacion.ingresar("Titulo", "Mensaje"));
        System.out.println(Notificacion.ingresarInt("Titulo", "Mensaje"));
        System.out.println(Notificacion.ingresarFloat("Titulo", "Mensaje"));
        System.out.println(Notificacion.ingresarPregunta("Titulo", "Mensaje"));
        System.out.println(Notificacion.ingresarError("Titulo", "Mensaje"));
        System.out.println(Notificacion.ingresarAlerta("Titulo", "Mensaje"));
        System.out.println(Notificacion.ingresarInformativo("Titulo", "Mensaje"));
    
        //Ingreso de datos por combo
        System.out.println(Notificacion.ingresoCombo("Titulo", "Mensaje", "Seleccione"));
        System.out.println(Notificacion.ingresoCombo("Titulo", "Mensaje", "Seleccione", "Seleccione"));
        System.out.println(Notificacion.ingresoCombo("Titulo", "Mensaje", "Seleccione", "Seleccione", "Seleccione"));
        System.out.println(Notificacion.ingresoCombo("Titulo", "Mensaje", "Seleccione", "Seleccione", "Seleccione", "Seleccione"));
        System.out.println(Notificacion.ingresoCombo("Titulo", "Mensaje", "Seleccione", "Seleccione", "Seleccione", "Seleccione", "Seleccione"));
        System.out.println(Notificacion.ingresoErrorCombo("Titulo", "Mensaje", "Seleccione"));
        System.out.println(Notificacion.ingresoErrorCombo("Titulo", "Mensaje", "Seleccione", "Seleccione"));
        System.out.println(Notificacion.ingresoErrorCombo("Titulo", "Mensaje", "Seleccione", "Seleccione", "Seleccione"));
        System.out.println(Notificacion.ingresoErrorCombo("Titulo", "Mensaje", "Seleccione", "Seleccione", "Seleccione", "Seleccione"));
        System.out.println(Notificacion.ingresoErrorCombo("Titulo", "Mensaje", "Seleccione", "Seleccione", "Seleccione", "Seleccione", "Seleccione"));
        System.out.println(Notificacion.ingresoAlertaCombo("Titulo", "Mensaje", "Seleccione"));
        System.out.println(Notificacion.ingresoAlertaCombo("Titulo", "Mensaje", "Seleccione", "Seleccione"));
        System.out.println(Notificacion.ingresoAlertaCombo("Titulo", "Mensaje", "Seleccione", "Seleccione", "Seleccione"));
        System.out.println(Notificacion.ingresoAlertaCombo("Titulo", "Mensaje", "Seleccione", "Seleccione", "Seleccione", "Seleccione"));
        System.out.println(Notificacion.ingresoAlertaCombo("Titulo", "Mensaje", "Seleccione", "Seleccione", "Seleccione", "Seleccione", "Seleccione"));
        System.out.println(Notificacion.ingresoPreguntaCombo("Titulo", "Mensaje", "Seleccione"));
        System.out.println(Notificacion.ingresoPreguntaCombo("Titulo", "Mensaje", "Seleccione", "Seleccione"));
        System.out.println(Notificacion.ingresoPreguntaCombo("Titulo", "Mensaje", "Seleccione", "Seleccione", "Seleccione"));
        System.out.println(Notificacion.ingresoPreguntaCombo("Titulo", "Mensaje", "Seleccione", "Seleccione", "Seleccione", "Seleccione"));
        System.out.println(Notificacion.ingresoPreguntaCombo("Titulo", "Mensaje", "Seleccione", "Seleccione", "Seleccione", "Seleccione", "Seleccione"));
        System.out.println(Notificacion.ingresoNotificacionCombo("Titulo", "Mensaje", "Seleccione"));
        System.out.println(Notificacion.ingresoNotificacionCombo("Titulo", "Mensaje", "Seleccione", "Seleccione"));
        System.out.println(Notificacion.ingresoNotificacionCombo("Titulo", "Mensaje", "Seleccione", "Seleccione", "Seleccione"));
        System.out.println(Notificacion.ingresoNotificacionCombo("Titulo", "Mensaje", "Seleccione", "Seleccione", "Seleccione", "Seleccione"));
        System.out.println(Notificacion.ingresoNotificacionCombo("Titulo", "Mensaje", "Seleccione", "Seleccione", "Seleccione", "Seleccione", "Seleccione"));
        
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
