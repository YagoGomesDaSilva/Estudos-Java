public class TestaBanco {
    public static void main(String[] args) {
        
        Cliente paulo = new Cliente(); 
        paulo.nome = "Paulo Silveira";
        paulo.cpf = "222.222.222-22";
        paulo.profissao = "programador";
        
        Conta contaDoPaulo = new Conta(); 
        contaDoPaulo.deposita(100);

        //associando o numero de referencia ao atributo titular
        contaDoPaulo.titular = paulo; 
        System.out.println(contaDoPaulo.titular.nome);
        
        //mesmo endereco de memoria
        System.out.println(contaDoPaulo.titular);
        System.out.println(paulo);


        System.out.println();


        Conta contaDaMarcela = new Conta();
        System.out.println(contaDaMarcela.saldo);
        
        //associando o numero de referencia ao atributo titular diretamente sem a variavel temporaria 'paulo', ou 'marcela' nesse caso 
        contaDaMarcela.titular = new Cliente();
        System.out.println(contaDaMarcela.titular);

        contaDaMarcela.titular.nome = "Marcela";
        System.out.println(contaDaMarcela.titular.nome); 

    }
}
