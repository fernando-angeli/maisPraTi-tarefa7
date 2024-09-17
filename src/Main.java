import ListasDuplamenteEncadeadas.Exercicio_4.Exercicio_4.TextEditorWithDoublyLinkedListManagement;
import ListasSimplesmenteEncadeadas.Exercicio_3.TextEditorWithSinglyLinkedListManagement;

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
        //TextEditorWithSinglyLinkedListManagement.main(args);

        /*4. Implemente um editor de texto simples onde as operações de desfazer (undo) e
        refazer (redo) são gerenciadas por uma lista duplamente encadeada.*/
        TextEditorWithDoublyLinkedListManagement.main(args);

    }
}