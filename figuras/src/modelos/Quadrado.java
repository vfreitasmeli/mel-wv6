package modelos;

import interfaces.Exibir;
import interfaces.ExibirPlus;
import modelos.FiguraGeometrica;

public class Quadrado extends FiguraGeometrica  {
    public Quadrado(Exibir exibir) {
        super(exibir);
    }

    @Override
    public void posicao() {
        exibir.show("modelos.Quadrado: " +getX() + ", " + getY());
//        System.out.println("modelos.Quadrado: " + getX() + ", " + getY());
    }
}
