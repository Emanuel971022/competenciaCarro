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
 *
 * @author Emanuel Martinez Pinzon
 */
public class Competencia{
    private HashMap<Carro, ArrayList<Premio>> copas;    
    public Competencia(){
        this.copas = new HashMap<>();
    }
    
    //-------------------------REQUERIMIENTOS FUNCIONALES----------------------//
    /**
     * Añade un carro como llave al HashMap copas
     * @param placa
     * @param marca
     * @param modelo
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
     * @param placa
     * @param anio
     * @param puesto
     * @param evento
     * @return Retorna true si añade el carro
     * @throws Exception 
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
     * @param rango
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
     * @param placa
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
     * @param placa
     * @param anio
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
     * @param placa
     * @param año
     * @param nombre
     * @param cc
     * @param direccion
     * @param ciudad
     * @param telefono
     * @return retorna true si se añade correctamente el propietario
     * @throws Exception 
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
     * @param placa
     * @param año
     * @return Retorna un String con los propietarios
     */
    public String imprimirPropietarios(String placa, int año){
        Carro car = new Carro(placa);
        
        for(Carro x: copas.keySet())
            if(x.equals(car))
                return x.imprimirPropietariosParaUnAño(año);
        
        return "No hay propietarios registrados de este vehiculo en ese año";
    }
    
    //------------------------REQUERIMIENTOS DEL EXAMEN------------------------//
    /**
     * Busca cuales fueron los propietarios de un carro o varios carros para un
     * evento.
     * @param evento
     * @param año
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
            
    //-----------------------REQUERIMIENTOS PARA VACACIONES--------------------//
    /**
     * Este metodo imprime los premios de un propietario con todos los carros 
     * que haya tenido.
     * @param cc
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
     * @param cc
     * @param placa
     * @return retorna un entero con el año en el que fue dueño un propietario 
     * del vehiculo.
     */
    public int obtenerAñoPropietario(String cc, String placa){
        Iterator it = copas.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry e = (Map.Entry) it.next();
            Carro c = (Carro) e.getKey();
            if(c.getPlaca().equalsIgnoreCase(placa))
                return c.obtenerAño(cc);
        }
        
        return 0;
    }
}
