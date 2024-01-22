import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Main {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Insira nomes de pessoas separados por vírgula:");

            String entrada = scanner.nextLine();

            String[] nomesArray = entrada.split(",");

            List<String> nomesLista = new ArrayList<>(Arrays.asList(nomesArray));

            Collections.sort(nomesLista);

            System.out.println("Nomes ordenados em ordem alfabética:");
            for (String nome : nomesLista) {
                System.out.println(nome.trim());
            }

            scanner.close();
        }
}