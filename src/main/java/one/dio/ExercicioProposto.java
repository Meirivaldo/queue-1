package one.dio;

import java.util.LinkedList;
import java.util.Queue;

public class ExercicioProposto {
    public static void main(String[] args) {

        Queue<String> filaCx = new LinkedList<>();

        filaCx.add("Juliana");
        filaCx.add("Pedro");
        filaCx.add("Carlos");
        filaCx.add("Larissa");
        filaCx.add("João");

        System.out.println(filaCx);

        String primeiroCliente = filaCx.peek();
        System.out.println(primeiroCliente); //Primeiro quer que o cliente apareça
        System.out.println(filaCx);  //Depois que apareca a fila toda!

        String primeiroClienteDel = filaCx.poll();
        System.out.println(primeiroCliente);
        System.out.println(filaCx);

        filaCx.add("Daniel");
        System.out.println(filaCx);

        int tamanhoLista = filaCx.size();
        System.out.println(tamanhoLista);

        boolean ListaVazia = filaCx.isEmpty();
        System.out.println(ListaVazia);

        boolean temCarlos = filaCx.contains("Carlos");
        System.out.println(temCarlos);












    }




}
