public class TesteReferencia {
    public static void main(String[] args) {

        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 300;
        System.out.println("saldo da primeira: " + primeiraConta.saldo);

        Conta segundaConta = primeiraConta;

        System.out.println("saldo da segunda: " + segundaConta.saldo);

        //Quando declaramos que primeiraConta = segundaConta, na verdade estamos copiando o numero do endereço de memoria que é a referência, e não o objeto em si.
        //Ou seja, o que temos são duas referências para o mesmo objeto.

        segundaConta.saldo += 100;
        System.out.println("saldo da segunda conta " + segundaConta.saldo); 

        System.out.println("saldo da primeira: " + primeiraConta.saldo);

        //Os números de referência são iguais, portanto, são a mesma conta, fazem referência ao mesmo objeto neste código.

        if(primeiraConta == segundaConta) {
            System.out.println("é a mesma conta");                    
        } 

        System.out.println(primeiraConta);
        System.out.println(segundaConta);   

    }
}
