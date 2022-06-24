package exemplo03;

public class Pessoa { // } extends Object {
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override // sobrescrita
    public String toString() {
        return nome;
    }
}
