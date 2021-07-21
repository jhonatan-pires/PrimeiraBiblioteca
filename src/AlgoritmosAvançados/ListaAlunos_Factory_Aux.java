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


}
