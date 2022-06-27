package modelos;

import interfaces.Exibir;

public abstract class FiguraGeometrica {
    private int x, y;
    public Exibir exibir;

    public FiguraGeometrica(Exibir exibir) {
        this.exibir = exibir;
    }

    public abstract void posicao();
//    public abstract double calculaArea();

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
