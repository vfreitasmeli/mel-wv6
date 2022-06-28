import modelo.Conta;
import modelo.ContaCorrente;
import modelo.ContaEspecial;
import util.MongoDB;
import util.MySQL;

import java.util.ArrayList;
import java.util.HashMap;

public class AppConta {

    public static void main(String[] args) {
        ContaCorrente cc1 = new ContaCorrente(111);
        ContaEspecial ce1 = new ContaEspecial(222, 1000);

        MySQL mySQL = new MySQL();
        MongoDB mongoDB = new MongoDB();

        ArrayList<Conta> listaDeContas = new ArrayList();
        HashMap<Integer, Conta> mapadeContas = new HashMap<>();

        listaDeContas.add(cc1);
        listaDeContas.add(ce1);

//        for (int i = 0; i < contas.size() ; i++) {
//            System.out.println("Conta: " + contas.get(i).getNumero());
//        }



//        cc1.gravar(mySQL);
//        ce1.gravar(mongoDB);

        mapadeContas.put(cc1.getNumero(), cc1);
        mapadeContas.put(ce1.getNumero(), ce1);

        for (Conta c : listaDeContas) {  //foreach : para cada Conta da estrutura listaDeContas
            if(c.getNumero() == 111) {
                System.out.println("Conta Encontrada no Array: " + c.getNumero());
            }
        }

        Conta contaEncontrada = mapadeContas.get(111);
        System.out.println("Conta Encontrada no HashMap: " + contaEncontrada.getNumero());
    }
}
