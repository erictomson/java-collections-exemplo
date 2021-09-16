import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Criando ArrayList
        List<String> listaExemplo = new ArrayList<>();

        // Adicionando valorew
        listaExemplo.add("A1");
        listaExemplo.add("B2");
        listaExemplo.add("B3");
        listaExemplo.add("B4");

        // Removendo por índice
        listaExemplo.remove(2);

        // Consultando por índice
        String valorDeObtencao = listaExemplo.get(1);
        String valorDeColeta = listaExemplo.get(2);

        // Apresentando todos os calores cadastrados
        for(String valorBuscado:listaExemplo) {
            System.out.println(valorBuscado);
        }
    }
}
