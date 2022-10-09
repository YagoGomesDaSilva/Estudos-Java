public class Conta {

    double saldo;
    int agencia;
    int numero;
    //o tipo 'Cliente'(proveniente de uma classe) tem como atributo 'titutlar' ,que por sua vez receberá um numero de referencia a um objeto
    Cliente titular; //Cliente titular = new Cliente();
                     //ao criar o objeto no atributo da classe/tipo 'Cliente', autometicamente,
                     //toda vez que se criar um objeto do tipo 'conta' ja se cria um objeto do tipo 'Cliente' e atribuindo o numero de referencia ao atributo titular

    public void deposita(double valor) {
        this.saldo = this.saldo + valor;
    }

    public boolean saca(double valor) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } 
        return false;
    }

    /*
    public boolean transfere(double valor, Conta destino) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        }
        return false;
    }
    mesma coisa do codigo abaixo
    */

    public boolean transfere(double valor, Conta destino) {
        if(saca(valor)) {
            destino.deposita(valor);
            return true;
        }
        return false;
    }


}