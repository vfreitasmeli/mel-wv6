package exemplo03;

import exemplo03.Estudante;

import java.util.Scanner;

public class AppPessoa {
    public static void main(String[] args) {
        String nome;
        int idade;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o nome:");
        nome = teclado.nextLine();

        System.out.println("Digite a idade:");
        idade = Integer.parseInt( teclado.nextLine() );

        Pessoa p = new Estudante(nome, "Java");

        System.out.println(p);
    }
}
