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
import java.util.Iterator;

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
    public boolean agregarCarro(String placa, String marca, int modelo){
        Carro c = new Carro(placa, marca, modelo);
        if(!copas.containsKey(c)){
            copas.put(c, new ArrayList<Premio>());
            return true;
        }
        
        return false;
    }
    
    public boolean registrarPremioACarro(String placa, int anio, int puesto, String evento) throws Exception{
        Carro p = new Carro(placa);
        ArrayList<Premio> victorias = copas.get(p);
        if(victorias!=null){
            for(Premio x: victorias)
                if(x.getAnio()==anio && x.getEvento().equalsIgnoreCase(evento))
                    throw new Exception("Doble premio");
            
            victorias.add(new Premio(anio, puesto, evento));
            return true;
        }
        
        return false;
    }
    
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
    
    public boolean agregarPropietario(String placa, int año, String nombre, String cc,
            String direccion, String ciudad, int telefono){
        Carro car = new Carro(placa);
        
        for(Carro x: copas.keySet())
            if(x.equals(car))
                return x.agregarPropietario(año, nombre, cc, direccion, ciudad, telefono);
         
        return false;
    }
    
    public String imprimirPropietarios(String placa, int año){
        Carro car = new Carro(placa);
        
        for(Carro x: copas.keySet())
            if(x.equals(car))
                return x.imprimirPropietariosParaUnAño(año);
        
        return "No hay propietarios registrados de este vehiculo en ese año";
    }
    
    //-----------------------REQUERIMIENTOS OPERACIONALES----------------------//
    public String concatenarplacas(){
        String placas = "";
        
        Iterator<Carro> iterator = copas.keySet().iterator();
        while(iterator.hasNext()){
            Carro c = iterator.next();
            placas += c.getPlaca()+"~";
        }
        
        return placas;
    }
}
