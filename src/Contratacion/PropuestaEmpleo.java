
package Contratacion;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Edwin Chocoy
 */
@Entity
public class PropuestaEmpleo implements Puesto,Serializable{

    @Id
    private Long id;
    
    public String Puesto;

    public String Requisitos;
    public float Salario;
    public String Descripcion;
    
    
    @Override

    public void setNombre(String nombre) {
        this.Puesto=nombre;
    }

    @Override
    public String getNombre() {
        return Puesto;
    }

    @Override
    public void setDescripcion(String descripcion) {
        this.Descripcion=descripcion;
    }

    @Override
    public String getDescripcion() {
        return Descripcion;

        
    }

    @Override

    public void setSalario(float valor) {
        this.Salario=valor;

    }

    @Override
    public float getSalario() {

        return Salario;
        
    }

    @Override
    public void setRequisitos(String requisito) {
        this.Requisitos=requisito;
    }

    @Override
    public String getRequisitos() {
        return Requisitos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
   
}
