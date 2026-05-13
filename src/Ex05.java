import java.util.Scanner;

public class Ex05 {
    void main(){
        Scanner sc = new Scanner(System.in);
        int escolha;

        do {
            IO.println("Escolha as opçoes");
            IO.println("1- Olá");
            IO.println("2- Mostrar uma mensagem");
            IO.println("3- Sair ");
            escolha = sc.nextInt();
            if (escolha == 1) {
                IO.println("Olá");
            } else if (escolha == 2) {
                IO.println("FABBRI É O MEU PREFERIDO!!!");

            }

        }while (escolha != 3);
        IO.println("Sair");
    }
}
