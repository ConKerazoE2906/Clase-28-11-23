public class Cuadrado {
    double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    private double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    //metodos personalizados

    public void perimetro(){
        System.out.println("El lado es: " + this.getLado());
        System.out.println("El perimetro es: " +this.getLado()*4);


    }
    public void area(){
        System.out.println("El area es: "+ this.getLado()*this.getLado());

    }

    public void diagonal(){
        System.out.println("La diagonal es: "+ this.getLado()*Math.sqrt(2));
    }
}
