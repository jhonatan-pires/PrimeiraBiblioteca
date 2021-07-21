package AlgoritmosAvançados;

public class ListaAlunos_Factory_Aux {
    static final int QUANTIDADE_LISTAS = 4;

    Aluno_Factory[] lista = new Aluno_Factory [QUANTIDADE_LISTAS];
    int tamanho = 0;

    Aluno_Factory obter(int indice){
        return lista[indice];
    }
    int tamanhoLis(){
        return tamanho;
    }
    void adicionar(Aluno_Factory aluno_Factory){
        if(tamanho == lista.length){
            Aluno_Factory[] novaList = new Aluno_Factory[QUANTIDADE_LISTAS + lista.length];
            for (int i = 0; i < lista.length; i++){
                novaList[i] = lista [i];
            }
            lista = novaList;
        }
        lista[tamanho] = aluno_Factory;
        tamanho++;
    }
    void remover(Aluno_Factory aluno_Factory) {
        int i;
        for (i = 0; i < tamanho; i++) ;
        Aluno_Factory a = lista[i];

        if (a != null && a.equals(aluno_Factory)) {
            remover(i);

        } else if (a == null && aluno_Factory == null) {
            remover(i);
        }
    }

    void remover(int indice){
        int indiceInicial = indice + 1;
        
        for(int i = indiceInicial; i < tamanho; i++){
            lista[i - 1] = lista[i];
        }
        tamanho--;
        lista[tamanho] = null;
    }

}
