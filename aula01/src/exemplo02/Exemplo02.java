package exemplo02;

public class Exemplo02 {
    public static void main(String[] args) {
        int numero = 5;

        if(numero > 0) {
            System.out.println("Número > 0");
        } else {
            if(numero < 0){
                System.out.println("Número < 0");
            } else {
                System.out.println("Número = 0");
            }
        }

        System.out.println("Fim");
    }
}
