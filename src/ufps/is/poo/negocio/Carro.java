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
import java.util.Objects;

/**
 *
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
    
    public String imprimirPropietariosParaUnAño(int año){
        String propietario = "";
               
        if(propietarios.containsKey(año)){
            ArrayList<Propietario> prop = propietarios.get(año);
            for(Propietario x: prop)
                propietario += "\n"+x.toString();
        }
            
        return propietario;
    }
    
    public String imprimirInfoBasicPropietariosParaUnAño(int año){
        String propietario = "";
        
        ArrayList<Propietario> prop = propietarios.get(año);
        if(prop!=null)
            for(Propietario x: prop)
                propietario += "\n"+x.infoBasic();
        
        return propietario;
    }
    
    //----------------------REQUERIMIENTOS OPERACIONALES-----------------------//
    private boolean validarExistenciaPropietario(int año, String cc){
        ArrayList<Propietario> propietario = propietarios.get(año);
        
        for(Propietario x: propietario)
            if(x.getCc().equalsIgnoreCase(cc))
                return true;
        
        return false;
    }
    
    public String concatenarPropietarios(){
        Collection<ArrayList<Propietario>> prop = propietarios.values();
        String nombres = "";
        
//        for(ArrayList<Propietario> x: prop)
//            
        
        return nombres;
    }

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
    
    @Override
    public String toString(){
        return "Placa: "+getPlaca()
            +"\nMarca: "+getMarca()
            +"\nModelo: "+getModelo()+"\n";
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.placa);
        return hash;
    }
    
    @Override
    public boolean equals(Object obj) {
        Carro c = (Carro) obj;
        return c.getPlaca().equals(getPlaca());
    }
}
