public class TesteFuncionario {
    public static void main(String[] args) {
        
        //Funcionario nico = new Funcionario(); NÃO FUNCIONA POIS É ABSTRATO ,OU SEJA , NÃO  SE PODE INSTANCIAR OBJETOS DESSA CLASSE 

        //Funcionario nico = new Gerente(); MAS PODE INSTANCIAR DO TIPO

        Gerente nico = new Gerente();

        nico.setNome("Nico Steppat");
        nico.setCpf("223355646-9");
        nico.setSalario(2600.00);

        System.out.println(nico.getNome());
        System.out.println(nico.getBonificacao());

    }
}
