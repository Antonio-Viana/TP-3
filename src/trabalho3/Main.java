package trabalho3;

public class Main {

    public static void main(String[] args) {
        System.out.println("------------------------------");
        System.out.println("Instanciando um circulo ...");
        Circulo c2 = new Circulo(3);
        System.out.println("Raio " + c2.getRaio());
        System.out.println("Area: " + c2.calculoArea());
        System.out.println("Perimetro: " + c2.calculoPerimetro());
        System.out.println("------------------------------");
        System.out.println("Instanciando um quadrado ...");
        Quadrado q1 = new Quadrado(2);
        System.out.println("Lado: " + q1.getLado());
        System.out.println("Area: " + q1.calculoArea());
        System.out.println("Perimetro: " + q1.calculoPerimetro());
        System.out.println("------------------------------");
        System.out.println("Instanciando um retangulo ...");
        Retangulo r1 = new Retangulo(5, 3);
        System.out.println("Base: " + r1.getBase() );
        System.out.println("Altura: " + r1.getAltura());
        System.out.println("Area: " + r1.calculoArea());
        System.out.println("Perimetro: " + r1.calculoPerimetro());
        System.out.println("------------------------------");
    }
}
