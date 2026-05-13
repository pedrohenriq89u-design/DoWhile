import java.util.Scanner;

public class Ex04 {
    void main() {

        Scanner sc = new Scanner(System.in);
        IO.println("Digite um número para ver a tabuada:");
        int num = sc.nextInt();

        int i = 1;

        do {
            int resultado = num * i;
            IO.println(num + " x " + i + " = " + resultado);
            i++;
        } while (i <= 10);
    }
}

