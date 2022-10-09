public class TestaMetodo {
    public static void main(String[] args) {

        Conta contaDoPaulo = new Conta();
        contaDoPaulo.saldo = 100;
        contaDoPaulo.deposita(50);
        System.out.println(contaDoPaulo.saldo);

        contaDoPaulo.saca(20);
        System.out.println(contaDoPaulo.saldo);

        Conta contaDaMarcela = new Conta();
        contaDaMarcela.saldo = 1000;
        contaDaMarcela.transfere(300, contaDoPaulo);

        System.out.println(contaDoPaulo.saldo);
        System.out.println(contaDaMarcela.saldo);
    }
    
}
