/*
Dois amigos, Alice e Bob, estão jogando um jogo muito simples, em que um deles grita ou "par" ou "ímpar" e o outro imediatamente
responde ao contrário, respectivamente "ímpar" ou "par". Em seguida, ambos exibem ao mesmo tempo uma mão cada um,
em que alguns dedos estão estendidos e outros dobrados. Então eles contam o número total de dedos estendidos. 
Se a soma for par, quem gritou "par" ganha. Se a soma for ímpar, quem gritou "ímpar" ganha. 
Por exemplo, suponhamos que a Alice gritou "par" e o Bob respondeu "ímpar". 
Em seguida, Alice não deixou nenhum dos seus dedos estendidos, ao passo que Bob deixou três dedos estendidos.
A soma então é três, que é ímpar, portanto Bob ganhou. Seu programa deve determinar quem ganhou, 
tendo a informação de quem gritou par e o número de dedos estendidos de cada um.

Entrada
A entrada contém três linhas, cada uma com um número inteiro, P, D_1 e D_2, nesta ordem. Se P = 0 então Alice gritou "par", ao passo que se P=1 então Bob gritou "par". Os números D_1 e D_2 indicam, respectivamente, o número de dedos estendidos da Alice e do Bob.
Saída
Seu programa deverá imprimir uma única linha, contendo um único número inteiro, que deve ser 0 se Alice foi a ganhadora, ou 1 se Bob foi o ganhador.
Restrições
P = 0 ou P = 1
0 ≤ D_1 ≤ 5
0 ≤ D_2 ≤ 5
 */
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
        
        System.out.println("Alice, Informe se quer par ou impar: \n Escolha 0 para par e 1 para impar: "); //Solicitando que Alice Informe se quer par ou Impar
        p = sc.nextInt(); //Lendo o dado informado por Alice
        if(p < 0 && p > 1){
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
                System.out.println("0");
            }else{
                System.out.println("1");
            }
        } 
        
        }else{
            System.out.println("Dados informados estão incorretos, favor informar uma quantidade de dedos válida"); //retornando mensagem de erro caso a quantidade de dedos informada seja inválida
        }
    }
    
}