/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete1.InstitucionEducativa;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
        /*Un objeto de tipo InstitucionEducativa*/
        
        InstitucionEducativa i1 = new InstitucionEducativa();
         String nombre = "Salle";
         String tipoInstitucion = "Privada";
         int numeroAlumnos = 500;
         int numeroDocente = 120;
         int numeroSedes = 20;
         
         i1.establecerNombre(nombre);
         i1.establecerTipoInstitucion(tipoInstitucion);
         i1.establecerNumeroAlumnos(numeroAlumnos);
         i1.establecerNumeroDocentes(numeroDocente);
         i1.establecerNumeroSedes(numeroSedes);
         
         
          // System.out.printf("%s     ", i1.);
         System.out.printf("Instituciones\n\nNombre de la Institucion: %s\n"
                +"Tipo de Institucion: %s\n"
                +"Numero de Alumnos: %d\n"
                +"Numero de Docente: %d\n"
                +"Numero de Sedes: %d\n" ,i1.obtenerNombre(),i1.obtenerTipoInstitucion(), i1.obtenerNumeroAlumnos(), 
                i1.obtenerNumeroDocente(), i1.obtenerNumeroSedes());
         
         
         
         
        
       
    }
}
