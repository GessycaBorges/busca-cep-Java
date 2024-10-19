import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        SearchCep searchCep = new SearchCep();

        System.out.println("Digite o CEP: ");
        var cep = reader.nextLine();

        try {
            Adress newAdress = searchCep.searchAdress(cep);
            System.out.println(newAdress);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

    }
}