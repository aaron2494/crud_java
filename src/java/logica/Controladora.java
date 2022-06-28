/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import persistencia.ControladoraPersistencia;
import java.util.List;


public class Controladora {
 
 ControladoraPersistencia controlPersis=new ControladoraPersistencia();
 
    public void crearPersona(Persona per){
        controlPersis.crearPersona(per);
    }
      public void editarPersona(int id){
        controlPersis.editarPersona(id);
    }
         public void editarPersona(Persona pers) throws Exception{
        controlPersis.editarPersona(pers);
    }
    
    public void eliminarPersona(int id){
        controlPersis.eliminarPersona(id);
    }
    public void eliminarPersona(Persona pers){
        controlPersis.eliminarPersona(pers);
    }
    public List<Persona>traerPersonas(){
        return controlPersis.traerPersonas();
    }       

    public void editarPersona(String id_edit) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
