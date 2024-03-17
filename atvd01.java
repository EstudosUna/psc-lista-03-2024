import java.util.Scanner;

public class atvd01 {
    public static void main(String[] args) {

        double  num1, num2, num3, maiorNum, menorNum, media;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        num1 = scanner.nextDouble();

        System.out.println("Digite o segundo numero: ");
        num2 = scanner.nextDouble();

        System.out.println("Digite o terceiro número: ");
        num3 = scanner.nextDouble();

        maiorNum = num1;
        if (num2 > maiorNum) {
            maiorNum = num2;
        }
        if (num3 > maiorNum) {
            maiorNum = num3;
        }

        menorNum = num1;
        if (num2 > menorNum) {
            menorNum = num2;
        }
        if (num3 > menorNum) {
            menorNum = num3;
        }

        media = (num1 + num2 + num3) / 3;

        System.out.println("O maior número é: " + maiorNum);
        System.out.println("O menor número é: " + menorNum);
        System.out.println("A média dos números é: " + media);

        scanner.close();


    }
}