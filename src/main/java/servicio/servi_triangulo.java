
package servicio;

import entidad.triangulo;



public class servi_triangulo extends triangulo{
    
    public servi_triangulo(){
        super();
    }
    
    public servi_triangulo(double lado1, double lado2, double ladobase){
        super(lado1, lado2,ladobase);
    }
    
    public double calcularArea(){
        return (getLadobase()*Math.sqrt(getLado1()*getLado1()-(getLadobase()
                *getLadobase())/4))/2;
    }
    
    public double calcularPerimetro(){
        return getLado1()+getLado2()+getLadobase();
    }
   
    
    public void mostrarDatos(){
        System.out.println("Triangulo: ");
        System.out.println("Lado 1: "+getLado1());
        System.out.println("Lado 2: "+getLado2());
        System.out.println("Lado Base: "+getLadobase());
        System.out.println("Area: "+calcularArea());
        System.out.println("Perimetro: "+calcularPerimetro());
        System.out.println();
              
    }
}

