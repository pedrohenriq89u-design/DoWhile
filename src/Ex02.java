import java.util.Scanner;

public class Ex02 {
    static void main() {

        Scanner sc = new Scanner(System.in);

        int senha;

        do {
            IO.println("Digite a senha:");
            senha = sc.nextInt();
            if (senha != 1234) {
                IO.println("Acesso Negado");
            }
        } while (senha != 1234);
        IO.println("Acesso Permitido.");
    }
}

