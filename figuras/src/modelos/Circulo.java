package modelos;

import interfaces.Exibir;
import modelos.FiguraGeometrica;

public class Circulo extends FiguraGeometrica {
    public Circulo(Exibir exibir) {
        super(exibir);
    }

    @Override
    public void posicao() {
        exibir.show("modelos.Circulo: " +getX() + ", " + getY());

    }
}
