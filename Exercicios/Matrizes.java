// import java.security.SecureRandom; pega numeroas randomicos 
import java.util.Scanner;

public class  Matrizes
{
    public static void main(String[] args)
    {
        int [][] num = new int [3][3];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                System.out.printf("Digite um numero para a linha %d e coluna %d da matriz 3x3: ",i,j);
                num[i][j] = sc.nextInt();
                
            }
        }
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                System.out.print(num [i][j] + " ");

            }
            System.out.println();
        }
    }
}