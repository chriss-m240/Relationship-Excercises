/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Point_3;

/**
 *
 * @author Estudiante
 */
public class Main {
    public static void main (String[] args){
        Sala uno= new Sala(1);
        Sala dos =new Sala(2);
        Semana prim= new Semana(1);
        Semana seg= new Semana(2);
        Dia lunes= new Dia("lunes");
        Dia martes= new Dia("martes");
        Segmento a= new Segmento(false,"natacion");
         Segmento b= new Segmento(true,"nada");
         Segmento c= new Segmento(false,"pelicula");
         Segmento d= new Segmento(false,"peliculas");
         lunes.AddSegmento(a);
         lunes.AddSegmento(b);
         lunes.AddSegmento(c);
         martes.AddSegmento(a);
         martes.AddSegmento(a);
         martes.AddSegmento(a);
        prim.Adddia(lunes);
        seg.Adddia(martes);
        uno.AddSemana(prim);
        dos.AddSemana(seg);
        dos.AddSemana(prim);
        Programacion por= new Programacion();
        por.add(dos);
        por.add(uno);
        por.planeacion();
    }
}
