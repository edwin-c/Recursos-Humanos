/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructura;

import java.util.Date;

/**
 *
 * @author Edwin Chocoy
 */
public class Personal implements Persona{
    
    public String Nombre;
    public String Apellido;
    public String DPI;
    public boolean Genero;
    public Date fechaNacimiento;
    public String Telefono;
    
    public void Persona(){
        
    }
    
    @Override
    public void setNombre(String nombre) {
        this.Nombre=nombre;
    }

    @Override
    public String getNombre() {
        return this.Nombre;
        
    }

    @Override
    public void setApellido(String apellido) {
        this.Apellido=apellido;
    }

    @Override
    public String getApellido() {
        return this.Apellido;
        
    }

    @Override
    public void setDPI(String dpi) {
        this.DPI=dpi;
    }

    @Override
    public String getDPI() {
        return this.DPI;
        
    }

    // genero = 1, masculino
    // genero = 0, femenino
    
    @Override
    public void setGenero(boolean genero) {
        this.Genero=genero;
    }
    
    
    @Override
    public boolean getGenero() {
        return this.Genero;
        
    }

    @Override
    public void setFechaNacimiento(Date fecha) {
        this.fechaNacimiento=fecha;
    }

    @Override
    public Date getFechaNacimiento() {
        return this.fechaNacimiento;
        
    }

    @Override
    public void setNumeroTelefonico(String telefono) {
        this.Telefono=telefono;
    }

    @Override
    public String getNumeroTelefonico() {
        return this.Telefono;
        
    }

    @Override
    public int calcularEdad() {
        
        int edad = 0;
        Date fechaActual= new Date();
        edad = fechaActual.getYear()-fechaNacimiento.getYear();
        return edad;
        
    }
        
    

    
}
