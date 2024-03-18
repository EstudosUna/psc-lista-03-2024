import java.util.Scanner;
import java.util.Random;

public class atvd06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random  random = new Random();

        int num1, num2, maior, menor, numeroSorteado;

        System.out.println("Digite o primeiro número: ");
        num1 = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        num2 = scanner.nextInt();

        menor = Math.min(num1, num2);
        maior = Math.max(num1, num2);

        numeroSorteado = random.nextInt(maior - menor + 1) + menor;
        System.out.println("Número sorteado: " + numeroSorteado);

        if (numeroSorteado % 2 == 0) {
            System.out.println("O número sorteado é par. ");
        } else {
            System.out.println("O número sorteado é ímpar. ");
        }

        System.out.println("Número sorteado: " + numeroSorteado); 

        scanner.close();
    }
    
}
