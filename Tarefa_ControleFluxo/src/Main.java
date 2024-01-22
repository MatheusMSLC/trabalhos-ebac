import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira as quatro notas:");

        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();
        double nota3 = scanner.nextDouble();
        double nota4 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        if (media >= 7) {
            System.out.println("Aluno Aprovado! Média: " + media);
        } else if (media >= 5) {
            System.out.println("Aluno em Recuperação. Média: " + media);
        } else {
            System.out.println("Aluno Reprovado. Média: " + media);
        }

        scanner.close();
    }
}
