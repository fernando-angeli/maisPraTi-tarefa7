import ListasDuplamenteEncadeadas.Exercicio_4.TextEditorManagement_4;
import ListasDuplamenteEncadeadas.Exercicio_5.CardGameManagement;
import ListasSimplesmenteEncadeadas.Exercicio_2.HistoryManagment;
import ListasSimplesmenteEncadeadas.Exercicio_3.TextEditorManagement_3;

public class Main {
    public static void main(String[] args) {

        /*1. Implemente um gerenciador de tarefas onde cada tarefa é um nó em uma lista
        simplesmente encadeada. Permita que o usuário adicione, remova, e marque tarefas
        como concluídas.*/
        //TaskManagement.main(args);

        /*2. Crie uma aplicação que simule o histórico de navegação de um navegador utilizando
        uma lista simplesmente encadeada. Implemente funcionalidades para adicionar novas
        URLs e remover URLs antigas quando a lista atingir um certo tamanho.*/
        //HistoryManagment.main(args);

        /*3. Implemente um sistema de controle de reversão (undo) para uma aplicação de
        edição de texto. Use uma lista simplesmente encadeada*/
        //TextEditorManagement_3.main(args);

        /*4. Implemente um editor de texto simples onde as operações de desfazer (undo) e
        refazer (redo) são gerenciadas por uma lista duplamente encadeada.*/
        //TextEditorManagement_4.main(args);

        /*5. Implemente um jogo simples de cartas onde a mão do jogador é representada por
        uma lista duplamente encadeada. Permita que o jogador adicione, remova, e reorganize
        as cartas na mão.*/
        CardGameManagement.main(args);

    }
}