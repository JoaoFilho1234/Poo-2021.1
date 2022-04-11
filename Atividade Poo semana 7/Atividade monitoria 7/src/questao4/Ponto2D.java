package questao4;

public class Ponto2D {

    private double x;
    private double y;
    private double distancia;

    public void Ponto2D(double x, double y) {
        setX(x);
        setY(y);
        System.out.println("Ponto ("+getX()+","+getY()+")");
    }

    public void distanciaEntrePontos (double x1, double y1, double x2, double y2) {
        setDistancia(Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1)));
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }


}
