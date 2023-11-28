
public class Main {
    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
       // IntelliJ IDEA suggests fixing it.
        //System.out.printf("Hello and welcome!");

        Cuadrado micuadrado = new Cuadrado(4);
        Rectangulo mirectangulo= new Rectangulo(4,5);


        micuadrado.perimetro();
        micuadrado.area();
        micuadrado.diagonal();
        mirectangulo.perimetro2();
        mirectangulo.area2();
        mirectangulo.diagonal2();

    }
}