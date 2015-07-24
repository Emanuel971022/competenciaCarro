/*
 * Copyright (C) 2015 Emanuel Martinez Pinzon
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package ufps.is.poo.negocio;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/**
 * Esta es la clase contenedora del proyecto, tiene todos los metodos principales
 * que interactuan con la GUI. Y algunos metodos de apoyo para los requerimientos
 * funcionales.
 * @author Emanuel Martinez Pinzon
 * @version 1.4 24/07/15
 */
public class Competencia{
    private HashMap<Carro, ArrayList<Premio>> copas;    
    public Competencia(){
        this.copas = new HashMap<>();
    }
    
    //-------------------------REQUERIMIENTOS FUNCIONALES----------------------//
    /**
     * Añade un carro como llave al HashMap copas
     * @param placa Placa del carro
     * @param marca Marca del carro
     * @param modelo Modelo del carro
     * @return retorna true dado el caso añada el carro
     */
    public boolean agregarCarro(String placa, String marca, int modelo){
        Carro c = new Carro(placa, marca, modelo);
        if(!copas.containsKey(c)){
            copas.put(c, new ArrayList<Premio>());
            return true;
        }
        
        return false;
    }
    
    /**
     * Añade un objeto al ArrayList de premios de un carro
     * @param placa Placa del carro que gano el premio
     * @param anio Año en que se gano el premio
     * @param puesto Puesto en que quedo en el evento
     * @param evento Evento en que gano algo
     * @return Retorna true si añade el carro
     * @throws Exception Si existe un premio con el mismo año se genera una excepcion.
     */
    public boolean registrarPremioACarro(String placa, int anio, int puesto, 
            String evento) throws Exception{
        Carro c = new Carro(placa);
        ArrayList<Premio> victorias = copas.get(c);
        if(victorias!=null){
            for(Premio x: victorias)
                if(x.getAnio()==anio && x.getEvento().equalsIgnoreCase(evento))
                    throw new Exception("Doble premio");
             
            Collection<ArrayList<Premio>> prem = copas.values();
            Iterator <ArrayList<Premio>> it = prem.iterator();
            while(it.hasNext()){
                ArrayList<Premio> p = it.next();
                for(Premio x: p)
                    if(x.getAnio()==anio && x.getPuesto()==puesto &&
                            x.getEvento().equalsIgnoreCase(evento))
                        throw new Exception("Doble premio");
            }
            
            victorias.add(new Premio(anio, puesto, evento));
            return true;
        }
        
        return false;
    }
    
    /**
     * Concatena y muestra los carros registrados en un rango de fechas
     * @param rango Rango de años para mostrar carros
     * @return retorna los carros encontradas en un rango.
     */
    public String imprimirCarrosParaUnRango(String rango){
        String carros = "";
        String range[] = rango.split("-");
        
        Iterator<Carro> iterator = copas.keySet().iterator();
        while(iterator.hasNext()){
            Carro c = iterator.next();
            try{
                if(c.getModelo()<=Integer.parseInt(range[0]) &&
                        c.getModelo()>=Integer.parseInt(range[1]))
                    carros += "\n"+c.toString();
            }catch(NumberFormatException nfe){
                if(c.getModelo()<=Integer.parseInt(range[0]))
                    carros += "\n"+c.toString();
            }
        }
        
        return carros;
    }
    
    /**
     * Busca y muestra los premios de un carro
     * @param placa Placa para buscar e imprimir carros
     * @return retorna los premios del carro.
     */
    public String imprimirPremiosCarro(String placa){
        String premios = "";
        
        Iterator<Carro> iterator = copas.keySet().iterator();
        while(iterator.hasNext()){
            Carro c = iterator.next();
            if(c.getPlaca().equalsIgnoreCase(placa)){
                ArrayList<Premio> prem = copas.get(c);
                for(Premio x: prem)
                    premios += "\n"+x.toString();
            }
        }
        
        return premios;
    }
    
    
    /**
     * Busca y muestra los premios de un carro a partir de la placa del carro y
     * el año que ganaron. Ambos lo recibe por parametros.
     * @param placa Placa para imprimir los premios
     * @param anio Año que debe buscar.
     * @return Retorna un String igual al de su metodo hermano,.
     */
    public String imprimirPremiosCarro(String placa, int anio){
        String premios = "";
        
        Iterator<Carro> iterator = copas.keySet().iterator();
        while(iterator.hasNext()){
            Carro c = iterator.next();
            if(c.getPlaca().equalsIgnoreCase(placa)){
                ArrayList<Premio> prem = copas.get(c);
                for(Premio x: prem)
                    if(x.getAnio()==anio)
                        premios += "\n"+x.toString();
            }
        }
        
        return premios;
    }
    
    /**
     * Añade un propietario a un carro para un año
     * @param placa Placa del carro que compro el propietario
     * @param año Año en que lo compro
     * @param nombre Nombre del propietario
     * @param cc NIT del propietario
     * @param direccion Direccion del propietario
     * @param ciudad Ciudad del propietario
     * @param telefono Telefono del propietario
     * @return retorna true si se añade correctamente el propietario
     * @throws Exception Si existe un propietario con la misma info se genera la excepcion.
     */
    public boolean agregarPropietario(String placa, int año, String nombre, String cc,
            String direccion, String ciudad, String telefono) throws Exception{
        Carro car = new Carro(placa);
        
        for(Carro x: copas.keySet())
            if(x.equals(car))
                return x.agregarPropietario(año, nombre, cc, direccion, ciudad, telefono);
         
        return false;
    }
    
    /**
     * Muestra los propietarios registrados en una placa y un año
     * @param placa Placa del carro
     * @param año Año para buscar
     * @return Retorna un String con los propietarios
     */
    public String imprimirPropietarios(String placa, int año){
        Carro car = new Carro(placa);
        
        for(Carro x: copas.keySet())
            if(x.equals(car))
                return x.imprimirPropietariosParaUnAño(año);
        
        return "No hay propietarios registrados de este vehiculo en ese año";
    }
    
    /**
     * Elimina un carro de la lista de vehiculos, eliminando tambien toda la 
     * informacion asociada de los premios y propietarios.
     * @param placa La placa del carro
     * @return Retorna true si se ha eliminado bien el carro.
     */
    public boolean borrarCarro(String placa){
        Carro c = new Carro(placa);
        copas.remove(c);
        return true;
    }
    
    /**
     * Borra un premio de algun carro.
     * @param placa Placa del carro
     * @param premio Premio que desea borrar
     * @return Retorna true si ha eliminado bien.
     */
    public boolean borrarPremio(String placa, String premio){
        String[] prem = premio.split("-");
        Carro c = new Carro(placa);
        ArrayList<Premio> premios = copas.get(c);
        for(Premio x: premios)
            if(x.getEvento().equalsIgnoreCase(prem[0])){
                premios.remove(x);
                return true;
            }
        
        return false;
    } 
    
    /**
     * Borra todos los premios de un carro
     * @param placa placa del carro a borrar todos los premios
     * @return retorna true si elimina bien todo
     */
    public boolean borrarTodosPremios(String placa){
        Carro c = new Carro(placa);
        ArrayList<Premio> prem = copas.get(c);
        prem.clear();
        return true;
    }
    
    /**
     * Borra un propietario de un carro
     * @param placa Placa del carro
     * @param año Año de compra
     * @param cc NIT del propietario
     * @return Retorna true si elimina correctamente.
     */
    public boolean borrarPropietario(String placa, int año, String cc){
        Carro c = new Carro(placa);
        for(Carro x: copas.keySet())
            if(x.equals(c))
                return x.borrarPropietario(año, cc);
        
        return false;
    }
    
    /**
     * Borra todos los propietarios de un carro en un año
     * @param placa La placa del carro a eliminar
     * @param año Año en el que borra todos los propietarios.
     * @return Retorna el valor del metodo.
     */
    public boolean borrarTodosPropietario(String placa, int año){
        Carro c = new Carro(placa);
        for(Carro x: copas.keySet())
            if(x.equals(c))
                return x.borrarTodosPropietarios(año);
            
        return false;
    }
    
    /**
     * Borra todos los propietarios de un carro
     * @param placa La placa del carro
     * @return Retorna el valor que recibe de ejecutar el metodo borrarTodosPropietarios()
     * de la clase carro.
     */
    public boolean borrarTodosPropietario(String placa){
        Carro c = new Carro(placa);
        for(Carro x: copas.keySet())
            if(x.equals(c))
                return x.borrarTodosPropietarios();
        
        return false;
    }
    
    /**
     * Elimina todos los carros, premios y propietarios de la aplicacion
     * @return Retorna true, siempre va a limpiar todos los registros.
     */
    public boolean borrarTodo(){
        copas.clear();
        return true;
    }
    
    //------------------------REQUERIMIENTOS DEL EXAMEN------------------------//
    /**
     * Busca cuales fueron los propietarios de un carro o varios carros para un
     * evento.
     * @param evento Evento en que participo y gano
     * @param año Año en que participo y gano
     * @return Retorna la información de los propietarios.
     */
    public String propietarioParaUnaVictoria(String evento, int año){
        Collection<ArrayList<Premio>> premio = copas.values();
        String ganadores = "";
        
        Iterator<ArrayList<Premio>> it = premio.iterator();
            ArrayList<Premio> p = it.next();
            for(Premio x: p)
               if(x.getEvento().equalsIgnoreCase(evento))
                   for(Carro y: copas.keySet())
                       ganadores += y.imprimirInfoBasicPropietariosParaUnAño(año);
            
        return ganadores;
    }
    
    /**
     * Este metodo imprime los premios de un propietario con todos los carros 
     * que haya tenido.
     * @param cc NIT para buscar los premios del propietario
     * @return Retorna un string con formato para mostrar la informacion
     */
    public String premiosdePropietario(String cc){
        String mensaje = "";
        
        Iterator it = copas.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry e = (Map.Entry) it.next();
            Carro c = (Carro) e.getKey();
            try{
                if(c.comprobarPropietario(cc))
                    mensaje += this.imprimirPremiosCarro(c.getPlaca(), 
                            this.obtenerAñoPropietario(cc, c.getPlaca()));
            }catch(java.util.NoSuchElementException ex){
                return mensaje;
            }
        }
        
        return mensaje;
    }
    
    /**
     * Este metodo retornara un String con toda la información del HashMap
     * @return muestra los toString de las llaves y de los objetos del HashMap
     */
    public String recorrerPremios(){
        String mensaje = "";
        
        Iterator it = copas.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry e = (Map.Entry)it.next();
            mensaje += e.getKey()+"\n"+e.getValue()+"\n\n";
        }
        
        return mensaje;
    }
    
    //-----------------------REQUERIMIENTOS OPERACIONALES----------------------//
    /**
     * Concatena las placas de todos los carros registrados.
     * @return Retorna un String placa~placa~placa con los carros registrados
     */
    public String concatenarplacas(){
        String placas = "";
        
        Iterator<Carro> iterator = copas.keySet().iterator();
        while(iterator.hasNext()){
            Carro c = iterator.next();
            placas += c.getPlaca()+"~";
        }
        
        return placas;
    }
    
    /**
     * Busca en los propietarios del vehiculo y retorna el año en el que este fue
     * dueño del vehiculo.
     * @param cc NIT para buscar el año del propietario
     * @param placa Placa para buscar el propietario en el carro
     * @return retorna un entero con el año en el que fue dueño un propietario 
     * del vehiculo.
     */
    private int obtenerAñoPropietario(String cc, String placa){
        Iterator it = copas.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry e = (Map.Entry) it.next();
            Carro c = (Carro) e.getKey();
            if(c.getPlaca().equalsIgnoreCase(placa))
                return c.obtenerAño(cc);
        }
        
        return 0;
    }
    
    /**
     * Concatena todos los premios de un carro
     * @param placa Placa del carro para buscar premios
     * @return Retorna una cadena con formato: evento-anio~evento-anio...
     */
    public String concatenarPremios(String placa){
        String premios = "";
        Carro c = new Carro(placa);
        ArrayList<Premio> prem = copas.get(c);
        for(Premio x: prem)
            premios += x.getEvento()+"-"+x.getAnio()+"~";
                
        return premios;
    }
    
    /**
     * Concatena los propietrios de un carro en un año
     * @param placa Placa del carro
     * @param año Año en el que concatenara los propietarios
     * @return Retorna el String con los NIT de los propietarios
     */
    public String concatenarPropietarios(String placa, int año){
        Carro car = new Carro(placa);
        
        for(Carro x: copas.keySet())
            if(x.equals(car))
                return x.concatenarPropietarios(año);
            
        return "";
    }
}
