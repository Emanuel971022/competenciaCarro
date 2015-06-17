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

/**
 *
 * @author Emanuel Martinez Pinzon
 */
public class Competencia{
    private HashMap<Carro, ArrayList<Premio>> carros;
    public Competencia(){
        this.carros = new HashMap<>();
    }
    
    public boolean agregarCarro(String marca, String placa, int modelo){
        Carro c = new Carro(marca, placa, modelo);
        boolean exist = carros.containsKey(c);
        
        if(!exist){
            carros.put(c, new ArrayList<>());
            return true;
        }
        
        return false;
    }

    public boolean agregarPremioCarro(String placa, int parseInt, int parseInt0, String evento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String imprimirCarrosParaUnRango(String rango) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
