import java.util.Scanner;
public class atvd05 {
    public static void main(String[] args) {
        double num1, num2, resultado;
        char operador;
    
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        num1 = scanner.nextDouble();

        System.out.println("Digite o segundo número: ");
        num2 = scanner.nextDouble();

        System.out.println("Selecione um operador (+, -, *, /, ^)");
        operador = scanner.next().charAt(0);

        resultado = 0;

        switch (operador) {
            case '+':
            resultado = num1 + num2;
            System.out.println("Resultado: " + resultado);  
                break;
            case '-':
            resultado = num1 - num2;
            System.out.println("Resultado: " + resultado);
                break;
            
            case '*':
            resultado = num1 * num2;
            System.out.println("Resultado: " + resultado);
                break;

            case '/':
            resultado = num1 / num2;
            System.out.println("Resultado: " + resultado);
                break;

            case '^':
            resultado = Math.pow(num1, num2);
            System.out.println("Resultado: " + resultado);
                break;
            default:

            System.out.println("O símbolo da operação é inválido. ");

        }



        scanner.close();
    }
    
}
