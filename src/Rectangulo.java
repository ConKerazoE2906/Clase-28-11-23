public class Rectangulo {
    double altura;
    double base;

    public Rectangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    //metodos personalizados

    public void perimetro2(){
        System.out.println("La altura es: " + this.getAltura());
        System.out.println("La base es: " +this.getBase());
        System.out.println("El perimetro es: " + ((this.getBase()*2)+(this.getAltura()*2)));
    }
    public void area2() {

        System.out.println("El perimetro es: " + this.getBase() * this.getAltura());
    }
    public void diagonal2() {

        System.out.println("La diagonal es: " + Math.sqrt((Math.pow(this.getBase(),2)+Math.pow(this.getAltura(),2))));
    }

}


