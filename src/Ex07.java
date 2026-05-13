import java.util.Scanner;


    void main() {
        Scanner sc = new Scanner(System.in);

        int secreto;
        do {
            IO.println("Digite o numero secreto:");
            secreto = sc.nextInt();
            if (secreto != 13) {
                IO.println("Tente Novamente");
            }
        } while (secreto != 13) ;
            {
                IO.println("Acertou");
            }
        }

