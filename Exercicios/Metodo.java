import java.util.Scanner;

public class Metodo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int [] numeros = new int[5];
        
        msg("YaGoD",5);

        for(int i=0; i < numeros.length; i++){
            System.out.print("Digite um numero");
            numeros[i] = sc.nextInt();
        }
        
        System.out.println(soma(numeros));
        System.out.println();
        
    }

    public static void msg( String m, int l) {
        
        for( int j=0 ; j< l ; j++){
            System.out.println(m);
        }
    }

    public static int soma(int... numeros) {
        int res=0;
        
        for( int n: numeros){
            res+=n;
        }
        return res;
    }

    public static double soma(Double... numeros) { // Sobre carga de metodos 
        double res=0.0;
        
        for( double n: numeros){
            res+=n;
        }
        return res;
    }
    
}
