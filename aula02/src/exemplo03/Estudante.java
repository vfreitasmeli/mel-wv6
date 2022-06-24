package exemplo03;

public class Estudante extends Pessoa {
    private String curso;

    public Estudante(String nome, String curso) {
        super(nome); // Pessoa(nome);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + curso;
    }
}
