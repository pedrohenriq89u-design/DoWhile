import java.util.Scanner;

public class Exemplo1 {
    static void main() {

        Scanner sc = new Scanner(System.in);

        int senha;

        do {
            IO.println("Digite a senha");
            senha = sc.nextInt();
            if (senha != 1234) {
                IO.println("Senha incorreta. Tente novamente");

            }
        } while (senha != 1234);
            IO.println("Senha correta! Celular desbloqueado.");
        }

    }







