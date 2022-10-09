import java.util.Arrays;
import java.util.Scanner;

public class ArreyVetor
{
    public static void main(String[] args)
    {   
        int i, nota=0;
        char[] gab = {'a', 'b', 'c', 'd', 'e'};
        int[] res = new int[5];
        Scanner scan = new Scanner(System.in);

        for(i=0; i < 5; i++)
        {
            System.out.printf("Informe a resposta %d:",i);
            res[i] = scan.nextLine().charAt(0);
        }
        
        for(i=0; i < 5; i++)
        {
           if(res[i]==gab[i])
           {
               nota++;
           }
        }
        System.out.printf("\nNota do aluno :%d\n",nota);
        
        System.out.println("Outro exemplo de for");
        int[] num = {50, 10, 40, 20, 30}; 

        //Arrays.sort(num);  //metodo de organização crecente
        //Arrays.fill(a, val); //preemche o array com um valor especifico ultilizando 2 argumentos  
        //System.arraycopy('origem','inicio da origem', 'destino','inicio do destino', 'length\tamanho'); //copia um array para o outro
        //Arrays.equals(a, a2) //compara um array com outro retornando valores booleanos 
        //Arrays.binarySearch(array, elemento)//verifica se existe um elemento dentro do Array se ele estiver ordenado 
        for(int j=0; j < num.length; j++) // num.length incrementa enquanto for menor
        {
            System.out.printf("%d - ",num[j]);
        }

        for(int n: num) // usa apenas para printar o vetor 
        {
            System.out.printf("%d - ",n);
        }
    }
}  