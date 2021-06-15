package trabalho3;

public class Quadrado extends Quadrilateros {

    private double lado = 0;

    public Quadrado() {

    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    Quadrado(double lado){
        this.lado = lado;
    }

    @Override
    public double calculoPerimetro() {
        return 4*lado;
    }

    @Override
    public double calculoArea() {
        return lado*lado;
    }

}
