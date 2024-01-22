import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> nomesMasculinos = new ArrayList<>();
        List<String> nomesFemininos = new ArrayList<>();

        int quantidadePessoas;

        System.out.print("Digite a quantidade de pessoas: ");
        quantidadePessoas = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < quantidadePessoas; i++) {

            System.out.print("Digite o nome da pessoa " + (i + 1) + ": ");
            String nome = scanner.nextLine();

            System.out.print("Digite o sexo da pessoa " + (i + 1) + " (M/F): ");
            char sexo = scanner.next().charAt(0);
            scanner.nextLine();

            if (sexo == 'M' || sexo == 'm') {
                nomesMasculinos.add(nome);
            } else if (sexo == 'F' || sexo == 'f') {
                    nomesFemininos.add(nome);
            } else {
                System.out.println("Sexo inválido. Utilize 'M' para masculino ou 'F' para feminino.");
                i--;
            }
        }

        System.out.println("\nNomes no grupo masculino:");
        for (String nome : nomesMasculinos) {
            System.out.println(nome);
        }

        System.out.println("\nNomes no grupo feminino:");
        for (String nome : nomesFemininos) {
            System.out.println(nome);
        }

        scanner.close();
        }
    }