/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

import java.util.LinkedList;

/**
 *
 * @author Iso.chan
 */
public class Persona {

    private String nombre;
    private String apellido;
    private LinkedList<Perfil> perfil;
    private LinkedList<Lugar> lugaresFrecuentes;
    private Foto foto;

    public Persona(String nombre, String apellido,Lugar lugar, Perfil perfil) {
        this.nombre = nombre;
        this.lugaresFrecuentes = new LinkedList<>();
       // this.foto = foto;
        this.perfil = new LinkedList<>();
    }
    

    /**
     * Agrega un lugar frecunte a una persona
     * @param lugar Lugar que se desea agregar
     */
    public void agregarLugarFrecuante(Lugar lugar) {
        lugaresFrecuentes.add(lugar);
    }

   /**
    * Afgrega un nuevo perfl a la persona
    * @param tipo
    * @param descripcion 
    */
    public void agregarPerfil(int tipo, String descripcion) {
        Perfil p = new Perfil();
        p.setTipoPerfil(tipo);
        p.setDescripcion(descripcion);
        perfil.add(p);
    }

    public void getAgregarLugarFrecuante() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LinkedList<Perfil> getPerfil() {
        return perfil;
    }

    public void setPerfil(LinkedList<Perfil> perfil) {
        this.perfil = perfil;
    }

    public LinkedList<Lugar> getLugaresFrecuentes() {
        return lugaresFrecuentes;
    }

    public void setLugaresFrecuentes(LinkedList<Lugar> lugaresFrecuentes) {
        this.lugaresFrecuentes = lugaresFrecuentes;
    }

    public Foto getFoto() {
        return foto;
    }

    public void setFoto(Foto foto) {
        this.foto = foto;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", perfil=" + perfil + ", lugaresFrecuentes=" + lugaresFrecuentes + ", foto=" + foto + '}';
    }
    
    public String imprimirInfoListaPerfil( int numeroPerfil){
        String mensaje = "";
        for (int i = 0; i < this.perfil.size(); i++) {
            if (this.perfil.contains(numeroPerfil)) {
                mensaje+= "Nombre: "+this.getNombre()+"/n"+"Apellido: "+this.getApellido();
            }
        }
        
        return mensaje;
    }  

}
