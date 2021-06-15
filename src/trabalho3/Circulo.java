package trabalho3;

public class Circulo implements Figura {
 private double raio = 1;
 public Circulo(double newRaio) {
        this.raio = newRaio;

    }

    public Circulo() {

    }


    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }



    @Override
    public double calculoPerimetro() {
        return (3.14159*2)*raio;
    }

    @Override
    public double calculoArea() {
        return (3.14159*Math.pow(raio,2));
    }
}

