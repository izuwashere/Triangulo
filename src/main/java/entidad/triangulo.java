
package entidad;


public class triangulo  {
    
    private double lado1;
    private double lado2;
    private double ladobase;
// cons vacio
    public triangulo() {
    }
// cons con parametros
    public triangulo(double lado1, double lado2, double ladobase) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.ladobase = ladobase;
    }
// metodo get set.
    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLadobase() {
        return ladobase;
    }

    public void setLadobase(double ladobase) {
        this.ladobase = ladobase;
    }
    
    
    
}
