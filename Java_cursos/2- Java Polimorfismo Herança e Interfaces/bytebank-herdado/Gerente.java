//Gerente é um Funcionário, Gerente herda da classe Funcionário
public class Gerente extends Funcionario {

    private int senha;

    public void setSenha(int senha) {
        this.senha = senha;
    }
        
    public boolean autentica(int senha) {
        if(this.senha == senha) {
            return true;
        } else {
            return false;
        }
    }

    public double getBonificacao() {
        System.out.println("Chamando o método de bonificacao do Gerente");
        return super.getBonificacao() + super.getSalario(); 
        // super se comporta de forma semelhante ao this , porem se refere a classe que esta sendo herdada
        //pondendo tbm por sua vez usar os metodos inmplementados 
        
    }


    
}
