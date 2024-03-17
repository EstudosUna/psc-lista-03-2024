import java.util.Scanner;

public class atvd03 {
    public static void main(String[] args) {
        
        double a, b, c, raizReal, raiz1, raiz2 , delta;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o coeficitente 'a': ");
        a = scanner.nextDouble();

        System.out.println("Digite o coeficiente 'b': ");
        b = scanner.nextDouble();

        System.out.println("Digite o coeficiente 'c': ");
        c = scanner.nextDouble();

        if (a == 0 && b == 0 && c != 0) {
            System.out.println("Coeficientes informados incorretamente. ");
        } else if (a == 0 && b != 0); {
            System.out.println("Essa é uma equação de primeiro grau.");
            raizReal = -b / (2 * a);
            System.out.println("O valor da raiz real é: " + raizReal);
        }  {
            
            delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("Essa equação não possui raizes reais.");
            } else if (delta == 0);
            System.out.println("Essa equação possui duas raizes reais iguais.");
            raizReal = -b / (2 * a);
            System.out.println("Valor das raizes da equação: " + raizReal);
        }  {
            System.out.println("Essa equação possui duas raizes diferentes.");
            raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
            raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Valor das raizes: " +raiz1 + " e " + raiz2);
        }

        scanner.close();
    }
    
}
