public class Main {
    public static void main(String[] args) {

        PessoaJuridica pessoaJuridica = new PessoaJuridica("Empresa XYZ", "12345678901234");
        pessoaJuridica.imprimirDados();

        PessoaFisica pessoaFisica = new PessoaFisica("João Silva", "98765432198");
        pessoaFisica.imprimirDados();
    }
}
