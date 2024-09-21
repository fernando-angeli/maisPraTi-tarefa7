
import Filas.Exercicio_6.BankQueueManager;
import Filas.Exercicio_7.PrintManager;
import Filas.Exercicio_8.ProcessManager;
import ListasDuplamenteEncadeadas.Exercicio_4.TextEditorManager_4;
import ListasDuplamenteEncadeadas.Exercicio_5.CardGameManager;
import ListasSimplesmenteEncadeadas.Exercicio_1.TaskManager;
import ListasSimplesmenteEncadeadas.Exercicio_2.HistoryManager;
import ListasSimplesmenteEncadeadas.Exercicio_3.TextEditorManager_3;

public class Main {
    public static void main(String[] args) {

        /*1. Implemente um gerenciador de tarefas onde cada tarefa é um nó em uma lista
        simplesmente encadeada. Permita que o usuário adicione, remova, e marque tarefas
        como concluídas.*/
        System.out.println(">>> EXERCICIO 1 <<<");
        TaskManager.main(args);

        /*2. Crie uma aplicação que simule o histórico de navegação de um navegador utilizando
        uma lista simplesmente encadeada. Implemente funcionalidades para adicionar novas
        URLs e remover URLs antigas quando a lista atingir um certo tamanho.*/
        System.out.println("\n>>> EXERCICIO 2 <<<");
        HistoryManager.main(args);

        /*3. Implemente um sistema de controle de reversão (undo) para uma aplicação de
        edição de texto. Use uma lista simplesmente encadeada*/
        System.out.println("\n>>> EXERCICIO 3 <<<");
        TextEditorManager_3.main(args);

        /*4. Implemente um editor de texto simples onde as operações de desfazer (undo) e
        refazer (redo) são gerenciadas por uma lista duplamente encadeada.*/
        System.out.println("\n>>> EXERCICIO 4 <<<");
        TextEditorManager_4.main(args);

        /*5. Implemente um jogo simples de cartas onde a mão do jogador é representada por
        uma lista duplamente encadeada. Permita que o jogador adicione, remova, e reorganize
        as cartas na mão.*/
        System.out.println("\n>>> EXERCICIO 5 <<<");
        CardGameManager.main(args);

        /*6. Crie um simulador de fila de atendimento em um banco. Utilize uma fila para gerenciar
        os clientes que aguardam atendimento e implemente a lógica para chamar o próximo
        cliente.*/
        System.out.println("\n>>> EXERCICIO 6 <<<");
        BankQueueManager.main(args);

        /*7. Implemente um sistema de gerenciamento de impressões onde os trabalhos de
        impressão são enfileirados e processados na ordem em que chegam. Use uma fila para
        armazenar os trabalhos de impressão.*/
        System.out.println("\n>>> EXERCICIO 7 <<<");
        PrintManager.main(args);

        /*8. Implemente uma fila que simula a fila de processos prontos para execução em um
        sistema operacional. Permita que novos processos sejam adicionados e que o processo
        mais antigo seja removido para execução.*/
        System.out.println("\n>>> EXERCICIO 8 <<<");
        ProcessManager.main(args);
    }
}