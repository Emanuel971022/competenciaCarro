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

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/**
 * Esta clase contiene la plantilla que guarda la información de cada objeto carro.
 * 
 * Tambien realiza los metodos que interactuan con los propietarios, tales como
 * registro de nuevos propietarios y consultas relacionadas con esto.
 * @author Emanuel Martinez Pinzon
 */
public class Carro{
    private String placa;
    private String marca;
    private int modelo;
    private HashMap<Integer, ArrayList<Propietario>> propietarios;

    public Carro(String placa, String marca, int modelo) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.propietarios = new HashMap<>();
    }
    
    public Carro(String placa) {
        this.placa = placa;
    }
    
    //--------------------REQUERIMIENTOS FUNCIONALES---------------------------//
    /**
     * AÑade un propietario al HashMap organizandolos por año, cómo llave y cada
     * propietario como un objeto de un arraylist en value..
     * @param año
     * @param nombre
     * @param cc
     * @param direccion
     * @param ciudad
     * @param telefono
     * @return Retorna true dado el caso añada correctamente al propietario.
     * @throws Exception 
     */
    public boolean agregarPropietario(int año, String nombre, String cc,
            String direccion, String ciudad, String telefono) throws Exception{
        if(!propietarios.containsKey(año))
            propietarios.put(año, new ArrayList<Propietario>());
        
        if(validarExistenciaPropietario(año, cc))
            throw new Exception("Doble propietario");
        
        ArrayList<Propietario> dueños = propietarios.get(año);
        if(dueños!=null){
            dueños.add(new Propietario(nombre, cc, direccion, ciudad, telefono));
            return true;
        }
        
        return false;
    }
    
    
    //----------------------REQUERIMIENTOS OPERACIONALES-----------------------//
    /**
     * Busca en los propietarios ya creados si existe alguno con la informacion 
     * que recibe por parametro.
     * @param año
     * @param cc
     * @return Retorna true si existe el propietario.
     */
    private boolean validarExistenciaPropietario(int año, String cc){
        ArrayList<Propietario> propietario = propietarios.get(año);
        
        for(Propietario x: propietario)
            if(x.getCc().equalsIgnoreCase(cc))
                return true;
        
        return false;
    }
    /**
     * Concatena y envia todos los propietarios de un año.
     * @param año
     * @return Retorna un String con la informacion de los propietarios.
     */
    public String imprimirPropietariosParaUnAño(int año){
        String propietario = "";
               
        if(propietarios.containsKey(año)){
            ArrayList<Propietario> prop = propietarios.get(año);
            for(Propietario x: prop)
                propietario += "\n"+x.toString();
        }
            
        return propietario;
    }
    
    /**
     * Concatena y envia todos los propietarios de un año, pero esto de más corto
     * que el metodo imprimitPropietariosParaUnAño(int año) con la información
     * que envia.
     * @param año
     * @return Retorna la informacion que reune.
     */
    public String imprimirInfoBasicPropietariosParaUnAño(int año){
        String propietario = "";
        
        ArrayList<Propietario> prop = propietarios.get(año);
        if(prop!=null)
            for(Propietario x: prop)
                propietario += "\n"+x.infoBasic();
        
        return propietario;
    }
    
    /**
     * Busca en los propietarios a ver si existe un propietario con la cedula
     * @param cc
     * @return Retorna true si existe el propietario
     */
    public boolean comprobarPropietario(String cc){
        Collection<ArrayList<Propietario>> prop = propietarios.values();
        Iterator<ArrayList<Propietario>> it = prop.iterator();
        
        ArrayList<Propietario> p = it.next();
        for(Propietario x: p)
            if(x.getCc().equalsIgnoreCase(cc))
                return true;
        
        return false;
    }
    
    /**
     * Obtiene un año en que el propietario fue dueño del vehiculo.
     * @param cc
     * @return Retorna el año.
     */
    public int obtenerAño(String cc){
        Iterator it = propietarios.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry e = (Map.Entry) it.next();
            ArrayList<Propietario> p = (ArrayList<Propietario>) e.getValue();
            for(Propietario x: p)
                if(x.getCc().equalsIgnoreCase(cc))
                    return (Integer) e.getKey();
        }
        
        return 0;
    }

    //-------------------------GETTER'S Y SETTER'S----------------------------//
    public int cantidadPropietarios(){
        return propietarios.size();
    }
    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }
    
    //------------------------------METODOS MODIFICADOS------------------------//
    /**
     * Se reescribe el metodo toString para que los objetos Carro tengan un formato
     * establecido.
     * @return Retorna la informacion del objeto.
     */
    @Override
    public String toString(){
        return "Placa: "+getPlaca()
            +"\nMarca: "+getMarca()
            +"\nModelo: "+getModelo()+"\n";
    }
    
    /**
     * Se reescribe este metodo hashCode para que el tipo map se conserve.
     * @return Retorna el hash que calcula en el metodo
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.placa);
        return hash;
    }
    
    /**
     * Este metodo ha sido reescrito para que un objeto Carro con todos los parametros
     * pueda ser comparado con un objeto Carro que solo tenga una placa y aun asi
     * ambas placas siendo iguales se pueda dar verdadero.
     * @param obj
     * @return Retorna true si ambas placas son iguales
     */
    @Override
    public boolean equals(Object obj) {
        Carro c = (Carro) obj;
        return c.getPlaca().equals(getPlaca());
    }
}
