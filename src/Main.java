import ListasSimplesmenteEncadeadas.Exercicio_1.TaskManagement;
import ListasSimplesmenteEncadeadas.Exercicio_2.HistoryManagment;

public class Main {
    public static void main(String[] args) {

        /*1. Implemente um gerenciador de tarefas onde cada tarefa é um nó em uma lista
        simplesmente encadeada. Permita que o usuário adicione, remova, e marque tarefas
        como concluídas.*/
        TaskManagement.main(args);

        /*2. Crie uma aplicação que simule o histórico de navegação de um navegador utilizando
        uma lista simplesmente encadeada. Implemente funcionalidades para adicionar novas
        URLs e remover URLs antigas quando a lista atingir um certo tamanho.*/
        HistoryManagment.main(args);
    }
}