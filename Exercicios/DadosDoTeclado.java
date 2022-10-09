import java.util.Scanner;

public class DadosDoTeclado
{
    public static void main(String[] args)
    {   
        float n1, n2, n3, n4, soma;
        final int MEDIA = 6;
        Scanner scan = new Scanner(System.in);
        String nome;
        
        System.out.println("Digite o nome da beladade: ");
        nome = scan.nextLine();
        System.out.print("Digite a nivel de fofura: ");
        n1 = scan.nextFloat();
        System.out.print("Digite nota da beleza: ");
        n2= scan.nextFloat();
        System.out.print("Digite nota de quao apaxonante ela e: ");
        n3 = scan.nextFloat();
        System.out.print("Digite a  nota do carinho que tu tem por ela: ");
        n4 = scan.nextFloat();
        scan.close();
        soma = ( n1 + n2 + n3 + n4 )/4;
        
            if(soma >= MEDIA)
            {   
                System.out.printf(" %s Sua nota foi %f.\nVoce é uma pessoa trancendental e incrivel.. kiss no nariz! gosto pra carai de ti!",nome,soma);
            }
                
            else if((soma < MEDIA) && (soma >= 2))
            {
                System.out.printf("Aluno %s Sua nota foi %f.\nVoce esta de recuperacao!",nome,soma);
            }
            else
            {
                System.out.printf("Aluno %s Sua nota foi %f.\nVoce foi reprovado!",nome,soma);
            }
    }
}