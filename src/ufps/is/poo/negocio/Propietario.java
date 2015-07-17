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

/**
 * Esta es la plantilla de cada objeto propietario.
 * @author Emanuel Martinez Pinzon
 */
public class Propietario{
    private String nombre;
    private String cc;
    private String direccion;
    private String ciudad;
    private String telefono;

    public Propietario(String nombre, String cc, String direccion, String ciudad,
            String telefono) {
        this.nombre = nombre;
        this.cc = cc;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public String infoBasic(){
        return "Nombre: "+getNombre()+" CC: "+getCc();
    }
    
    @Override
    public String toString(){
        return "Nombre: "+getNombre()
                +"\nCC: "+getCc()
                +"\nDirección: "+getDireccion()
                +"\nCiudad: "+getCiudad()
                +"\nTelefono: "+getTelefono()+"\n";
    }
}
