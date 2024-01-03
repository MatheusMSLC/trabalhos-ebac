/**
 * @Author Matheus.Martins
 * 
 * @Version 1.0
 */

public class Main {
//Objeto escolhido carro
    public static void main(String[] args){

        Carro carro = new Carro();
        carro.setAno(2018);
        carro.setId(17);
        carro.setMarca("Ford");
        carro.setNome("Maverick");

        System.out.println("ID: " + carro.getId());
        System.out.println("Ano: " + carro.getAno());
        System.out.println("Marca: " + carro.getMarca());
        System.out.println("Nome: " + carro.getNome());

    }
}