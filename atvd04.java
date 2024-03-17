import java.util.Scanner;

public class atvd04 {
    public static void main(String[] args) {
        int selecioneCodigoOperacao;
        
        double  resultado, raio;
        Scanner scanner = new Scanner(System.in);
            
        System.out.println("Faça sua escolha para operação (1 pra perímetro do círculo, 2 pra área do círculo e 3 pro volume da esfera)");
        selecioneCodigoOperacao = scanner.nextInt();

        System.out.println("Digite o valor do raio:");
        raio = scanner.nextDouble();

        String[] todasOperacoes = {"Perímetro do círculo: ", "Área do círculo: ", "Volume da esfera: "};
        resultado = 0;
        
        if (selecioneCodigoOperacao >= 1 && selecioneCodigoOperacao <= 3) {
            resultado = selecioneCodigoOperacao == 1 ? 2 * Math.PI * raio :
                        selecioneCodigoOperacao == 2 ? Math.PI * raio * raio :
                        (4.0 / 3.0) * Math.PI  * Math.pow(raio, 3);
        System.out.println(todasOperacoes[selecioneCodigoOperacao - 1] + resultado);
        } else {
            System.out.println("Código de operação inválido.");
        }
           
        scanner.close();
    }
    
}
