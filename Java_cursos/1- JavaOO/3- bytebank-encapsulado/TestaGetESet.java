public class TestaGetESet {
    public static void main(String[] args) {

        Conta conta = new Conta();
        //conta.numero = 1337
        conta.setNumero(1337);
        conta.setAgencia(1337);
        
        System.out.println("Numero: " + conta.getNumero() + " Agencia: " + conta.getAgencia());

        //conta.titular = paulo
        Cliente paulo = new Cliente();
        conta.setTitular(paulo);

        //paulo.nome = "Paulo Silveira"
        paulo.setNome("Paulo silveira");

        System.out.println(conta.getTitular().getNome());

        conta.getTitular().setProfissao("Programador");

        System.out.println(conta.getTitular().getProfissao());

        
        

    }
}

