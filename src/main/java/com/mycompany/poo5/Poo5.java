
package com.mycompany.poo5;

//Entidad.triangulo;
import servicio.servi_triangulo;



public class Poo5 {

    public static void main(String[] args) {
       
       servi_triangulo[] triangulos=new servi_triangulo[4];
       triangulos[0]=new servi_triangulo(5.0, 5.0, 4.0);
       triangulos[1]=new servi_triangulo(6.0, 6.0, 8.0);
       triangulos[2]=new servi_triangulo(3.0, 3.0, 5.0);
       triangulos[3]=new servi_triangulo(7.0, 7.0, 10.0);
       
       double mayorArea= -1.0;
       servi_triangulo trianguloconmayorArea= null;
       
       for(servi_triangulo Triangulo : triangulos){
           double area = Triangulo.calcularArea();
           if(area>mayorArea){
               mayorArea=area;
               trianguloconmayorArea=Triangulo;
           }
       }
       
        System.out.println("Triangulo con mayor area: ");
        if (trianguloconmayorArea != null) {
            trianguloconmayorArea.mostrarDatos();
        }
        
               
    }
    
    
}
