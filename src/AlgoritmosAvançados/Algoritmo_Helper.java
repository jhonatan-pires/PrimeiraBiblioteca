package AlgoritmosAvançados;

public class Algoritmo_Helper {
    public static void main(String[] args) {
        ListaAlunos_Factory_Aux listaAlunos_factory_aux = new ListaAlunos_Factory_Aux();

        Aluno_Factory aluno_Factory0 = new Aluno_Factory();
        aluno_Factory0.nome = "Jhonatan";
        listaAlunos_factory_aux.adicionar(aluno_Factory0);

        Aluno_Factory aluno_Factory1 = new Aluno_Factory();
        aluno_Factory1.nome = "Alves";
        listaAlunos_factory_aux.adicionar(aluno_Factory1);

        Aluno_Factory aluno_Factory2 = new Aluno_Factory();
        aluno_Factory2.nome = "Pires";
        listaAlunos_factory_aux.adicionar(null);


        listaAlunos_factory_aux.remover(aluno_Factory2);

        iteracao(listaAlunos_factory_aux);


        listaAlunos_factory_aux.ordernr();
    }

    static void iteracao(ListaAlunos_Factory_Aux listaAlunos_factory_aux){
        for (int i = 0; i < listaAlunos_factory_aux.tamanhoLis(); i++) {
            Aluno_Factory a = listaAlunos_factory_aux.obter(i);
            if (a != null) {
                System.out.println("Nome: " + a.nome);
            }else {
                System.out.println("Aluno sem nome:  ");
            }
        }
    }
}
