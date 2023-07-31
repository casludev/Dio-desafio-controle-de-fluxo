import java.util.Scanner;

public class Contador {
    public static void main(String[] args)  {
        //Cria um scanner para ler as entradas de parâmetros um e dois
        Scanner terminal = new Scanner(System.in);
        System.out.println("Diga o primeira parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {

            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException exception) {
            System.out.println(exception.getMessage());
            //imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
        }
        terminal.close();
        
    }
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O Segundo parâmetro deve ser maior que o primeiro");
        }
        int contagem = parametroDois - parametroUm;
        for (int i  = 1; i<= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
