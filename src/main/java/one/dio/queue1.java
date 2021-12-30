package one.dio;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class queue1 {
    public static void main(String[] args) {

        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Pamela");
        filaBanco.add("Patricia");
        filaBanco.add("Roberto");
        filaBanco.add("Flavio");
        filaBanco.add("Anderson");

        System.out.println(filaBanco);

        String clienteASerAtendida = filaBanco.poll(); //Retorna o primeiro elemento da fila e remove!
        System.out.println(clienteASerAtendida);
        System.out.println(filaBanco);

        String primeiroCliente = filaBanco.peek();//Retorna o primeiro elemento da fila e NÃO remove!
        System.out.println(primeiroCliente);
        System.out.println(filaBanco);

//        filaBanco.clear();
        String primeiroClienteOuErro = filaBanco.element();
        System.out.println(primeiroClienteOuErro);
        System.out.println(filaBanco);

        for(String client: filaBanco){
            System.out.println(client);
        }
        Iterator<String> iteratorFilaBanco = filaBanco.iterator();
        while (iteratorFilaBanco.hasNext()){
            System.out.println("--->" + iteratorFilaBanco.next());
        }

        System.out.println(filaBanco.size());
        filaBanco.clear();

        System.out.println(filaBanco.isEmpty());

        filaBanco.add("Wesley");
        System.out.println(filaBanco);



    }
}
