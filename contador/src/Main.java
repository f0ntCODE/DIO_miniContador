import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
       Scanner terminal = new Scanner(System.in);
       int parametroUm = 0;
       int parametroDois = 0;
       boolean valorValido = false;
       int opcao = 0;

       while (!valorValido){
           System.out.println("Como deseja executar esta aplicação? " +
                   "\n 1 = Inserção manual " +
                   "\n 2 = Inserção automática");

             opcao = terminal.nextInt();
             valorValido = isValid(opcao);
             if(!valorValido) System.out.println("\t As opções só podem ser 1 ou 2");

       }

        if(opcao == 1) {
            //inserção manual

            System.out.println("Digite o primeiro parâmetro");
             parametroUm = terminal.nextInt();

            System.out.println("Digite o segundo parâmetro");
             parametroDois = terminal.nextInt();
        }
        else if(opcao == 2){
            //inserção automática

         parametroUm = ThreadLocalRandom.current().nextInt(100);
        System.out.println("Parâmetro 1 é: " + parametroUm);

         parametroDois = ThreadLocalRandom.current().nextInt(100);
        System.out.println("Parâmetro 2 é: " + parametroDois);

        }
            try {
                contar(parametroUm, parametroDois);
            } catch (ParametrosInvalidosException ex) {

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

    static boolean isValid(int opcao){
        if(opcao == 2 || opcao == 1){
            return true;
        }
        else{
            return false;
        }
    }
}
