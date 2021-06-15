package trabalho3;

public class Retangulo extends Quadrilateros {
    private double base;

    public Retangulo() {

    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    private double altura;

    Retangulo (double base, double altura){
        this.base = base;
        this.altura = altura;

    }


    @Override
    public double calculoArea() {
        return base*altura;
    }

    @Override
    public double calculoPerimetro() {
        return 2*base + 2*altura;
    }
}
