package ListasSimplesmenteEncadeadas.Exercicio_1;
import ListasSimplesmenteEncadeadas.SinglyLinkedList;
import java.util.Scanner;

public class TaskManager {
   
    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedListTasks = new SinglyLinkedList();
        Scanner sc = new Scanner(System.in);
        int option;

        do{
            System.out.println("\nGerenciador de Tarefas");
            System.out.println("1. Adicionar tarefa");
            System.out.println("2. Remover tarefa (por índice)");
            System.out.println("3. Marcar tarefa como concluída");
            System.out.println("4. Listar tarefas");
            System.out.println("5. Modificar tarefa (por índice)");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Digite a descrição da tarefa: ");
                    String description = sc.nextLine();
                    Task newTask = new Task(description);
                    singlyLinkedListTasks.add(newTask);
                    System.out.println(">> Tarefa adicionada.");
                    break;
                case 2:
                    System.out.print("Digite o índice da tarefa a remover: ");
                    int removeIndex = sc.nextInt();
                    try{
                        System.out.println(">>Tarefa removida: " + singlyLinkedListTasks.remove(removeIndex));
                    } catch (Exception e){
                        System.out.println("ERROR: " + e.getMessage());
                    }
                    break;
                case 3:
                    System.out.print("Digite o índice da tarefa a marcar como concluída: ");
                    int completedIndex = sc.nextInt();
                    try{
                        System.out.println(">> Tarefa concluída: " + singlyLinkedListTasks.completedTask(completedIndex, true));
                    } catch (Exception e){
                        System.out.println("ERROR: " + e.getMessage());
                    }
                    break;
                case 4:
                    System.out.println(">> Tarefas na pilha:");
                    singlyLinkedListTasks.print();
                    break;
                case 5:
                    System.out.print("Digite o índice da tarefa a modificar: ");
                    int updatedIndex = sc.nextInt();
                    sc.nextLine();  // Consumir a quebra de linha
                    System.out.print("Digite a nova descrição da tarefa: ");
                    String newDescription = sc.nextLine();
                    singlyLinkedListTasks.updateDescriptionTask(updatedIndex, newDescription);
                    break;
                case 0:
                    System.out.println(">> Encerrando o programa...");
                    break;
                default:
                    System.out.println(">> Opção inválida. Tente novamente.");
            }
        } while(option != 0);
    }
}
