//Gerente é um Funcionário, Gerente herda da classe Funcionário e assina o contrato Autenticavel e é um autenticavel
public class Gerente extends Funcionario implements Autenticavel{

    private int senha;

    @Override
    public double getBonificacao() {
        System.out.println("Chamando o método de bonificacao do Gerente");
        return  super.getSalario(); 
        
    }

    @Override
    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public boolean autentica(int senha) {
        if(this.senha == senha) {
            return true;
        } else {
            return false;
        }
    }

}
