package AlgoritmosAvançados;

public class Algoritmo_Helper {
    public static void main(String[] args) {
        ListaAlunos_Factory_Aux listaAlunos_factory_aux = new ListaAlunos_Factory_Aux();

        Aluno_Factory aluno_Factory = new Aluno_Factory();
        aluno_Factory.nome = "Jhonatan";
        listaAlunos_factory_aux.adicionar(aluno_Factory);

        aluno_Factory = new Aluno_Factory();
        aluno_Factory.nome = "Alves";
        listaAlunos_factory_aux.adicionar(aluno_Factory);

        aluno_Factory = new Aluno_Factory();
        aluno_Factory.nome = "Pires";
        listaAlunos_factory_aux.adicionar(aluno_Factory);
        
        for (int i = 0; i < listaAlunos_factory_aux.tamanhoLis(); i++){
            Aluno_Factory a = listaAlunos_factory_aux.obter(i);
            System.out.println("Nome: " + a.nome);
        }
    }
}
