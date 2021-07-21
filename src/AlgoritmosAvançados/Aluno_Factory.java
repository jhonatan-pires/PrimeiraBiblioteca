package AlgoritmosAvançados;

public class Aluno_Factory {
    String nome;

    Boolean alunoVemDepois(Aluno_Factory aluno_Factory){
        if(aluno_Factory == null){
            return false;
        }
        return nome.compareTo(aluno_Factory.nome) > 0;
    }
}
