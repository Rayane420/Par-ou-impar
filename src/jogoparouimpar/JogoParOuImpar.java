package jogoParOuImpar;

import java.util.Scanner;

/**
 *
 * @author Rayane Maciel
 */
public class JogoParOuImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int p, d1, d2, somaDedos, resto; //Declarando as variáveis que serão usadas e o seu tipo como inteiro
        
        Scanner sc = new Scanner(System.in); //Criando o objeto para o Scanner
        
        System.out.println("Informe quem será par: \n Escolha 0 para Alice e 1 para Bob: "); //Solicitando que Alice Informe se quer par ou Impar
        p = sc.nextInt(); //Lendo o dado informado para a opção par
        if(p < 0 || p > 1){
            System.out.println("opção informada está incorreta, informe novamente uma opção, entre 0 e 1");
            System.out.println("Alice, Informe se quer par ou impar: \n Escolha 0 para par e 1 para impar: "); //Solicitando que Alice Informe se quer par ou Impar
            p = sc.nextInt(); //Lendo o dado informado por Alice
            
        }
        System.out.println("Alice, Informe a quantidade de dedos:"); //Solicitando a quantidade de dedos para Alice
        d1 = sc.nextInt(); //Lendo a quantidade de dedos informados por Alice
        
        System.out.println("Bob, informe a quantidade de dedos"); //Solicitando a quantidade de dedos para Bob
        d2 = sc.nextInt(); //Lendo a quantidade de dedos informados
        
        somaDedos = d1 + d2; //Realizando a soma da quantidade de dedo dos dois
        resto = somaDedos%2; // Verificando se é par ou impar
        if((d1 >=0 && d1 <=5) && (d2 >=0 && d2<=5)){ //Fazendo a verificação se o usuário informou uma quantidade válida de dedos
        
        if(p==0){ //Caso a opção informada anteriormente seja 0 Alice gritou par, ao passo que Bob é impar
            
            if(resto == 0){ //Verificando se o número é par ou impar, se o resto for zero o número é par
                System.out.println("0");
            }else{
                System.out.println("1");
            }
        }
        
        if(p==1){ //Caso a opção informada anteriormente seja 1 Bob gritou par, ao passo que Alice é impar
            
            if(resto == 0){
                System.out.println("1");
            }else{
                System.out.println("0");
            }
        } 
        
        }else{
            System.out.println("Dados informados estão incorretos, favor informar uma quantidade de dedos válida"); //retornando mensagem de erro caso a quantidade de dedos informada seja inválida
        }
    }
    
}
