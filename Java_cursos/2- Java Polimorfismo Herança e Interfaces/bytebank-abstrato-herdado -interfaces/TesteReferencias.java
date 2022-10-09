public class TesteReferencias {
    public static void main(String[] args) {

        //Funcionario f =new Funcionario(); ABSTRATO
        //f.setSalario(2000);

        Gerente g1 =new Gerente();
        g1.setNome("Marcos");
        g1.setSalario(5000);

        EditorVideo ev = new EditorVideo();
        ev.setSalario(2500);

        Designer d = new Designer();
        ev.setSalario(2000);

        ControleBonificacao controle = new ControleBonificacao();

        //controle.registra(f);
        controle.registra(g1);
        controle.registra(ev);
        controle.registra(d);

        System.out.println(controle.getSoma());
    }
}