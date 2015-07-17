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

import java.util.Objects;

/**
 * Esta es la clase plantilla para todos los objetos premio.
 * @author Emanuel Martinez Pinzon
 */
public class Premio{
    private int anio;
    private int puesto;
    private String evento;

    public Premio(String evento){
        this.evento = evento;
    }
    
    public Premio(int anio, int puesto, String evento) {
        this.anio = anio;
        this.puesto = puesto;
        this.evento = evento;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getPuesto() {
        return puesto;
    }

    public void setPuesto(int puesto) {
        this.puesto = puesto;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }
    
    @Override
    public String toString(){
        return "Año de victoria: "+getAnio()
            +"\nPuesto: "+getPuesto()
            +"\nEvento: "+getEvento()+"\n";
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.evento);
        return hash;
    }
    
    @Override
    public boolean equals(Object obj) {
        Carro c = (Carro) obj;
        return c.getPlaca().equals(getEvento());
    }
}
