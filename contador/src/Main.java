import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
       Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

            //Implementar a possibilidade de escolher aleatório ou manual

       /* int parametroUm = ThreadLocalRandom.current().nextInt(100);
        System.out.println("Parâmetro 1 é: " + parametroUm);
        int parametroDois = ThreadLocalRandom.current().nextInt(100);
        System.out.println("Parâmetro 2 é: " + parametroDois);

        */

        try {
            contar(parametroUm, parametroDois);
        }catch (ParametrosInvalidosException ex) {

            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if(parametroUm > parametroDois){
            throw new ParametrosInvalidosException("O parâmetro um é maior que o parâmetro dois");
        }

        int contagem = parametroDois - parametroUm;

        System.out.println("Contando até " + contagem +" :");
        for(int cont = 0; cont < contagem; cont ++) {
            System.out.println(cont + 1);
        }
    }
}
