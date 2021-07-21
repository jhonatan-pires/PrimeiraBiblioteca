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

    void ordernr(){
        for (int i = 0; i < tamanho; i++){
            Aluno_Factory alunoBaseFac = lista[i];
            int indicePosicaoBase = i;

                while(indicePosicaoBase > 0){
                    int indiceAnterior = indicePosicaoBase - 1;
                    Aluno_Factory alunoPosicaoAnterior = lista[indicePosicaoBase];

                    Boolean alunoDePosiçãoVemNessaHeHe = alunoPosicaoAnterior == null || alunoPosicaoAnterior.alunoVemDepois(alunoBaseFac);

                    if(alunoDePosiçãoVemNessaHeHe){
                        lista[indicePosicaoBase] = lista[indiceAnterior];
                        indicePosicaoBase--;
                    }else {
                        break;
                    }
                }
                lista[indicePosicaoBase] = alunoBaseFac;

            }

        }
    public static void main(String[] args){
        String nome1 = "Jhonatan";
        String nome2 = "Alves";
        System.out.println(nome1.compareTo(nome2));
    }
}
