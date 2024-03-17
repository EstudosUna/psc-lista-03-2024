import java.util.Scanner;

public class atvd02 {
    public static void main(String[] args) {
        
        double  troco, valorCompra, valorPago;
        Scanner scanner = new Scanner(System.in); 

        System.out.println("Qual foi o valor da compra ? ");
        valorCompra = scanner.nextDouble();

        System.out.println("Qual foi o valor pago ? ");
        valorPago = scanner.nextDouble();

        if(valorPago < valorCompra) {
            System.out.println("A quantia paga é insuficiente para realizar a compra.");
        } else {
            troco = valorPago - valorCompra;
            System.out.println("Troco: R$" + troco);

           int[] notas = {50, 20, 10, 5, 2, 1};
           int[] qntdNotas = new int[6];

            for (int i = 0; i < notas.length; i++) {
                qntdNotas[i] = (int) (troco / notas[i]);
                troco %= notas[i];

            }

            for (int i = 0; i < notas.length; i++) {
                if (qntdNotas[i] > 0) {
                    System.out.println("Notas de R$" + notas[i] + ",00:" +qntdNotas[i]);
                }
            }

        }

        

       scanner.close();
        
    }
}
