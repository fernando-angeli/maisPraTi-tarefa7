package Filas.Exercicio_6;

public class BankQueueManagement {
    public static void main(String[] args) {

        BankQueue bankQueue = new BankQueue();

        try {
            //Adicionando senhas na fila
            bankQueue.joinQueue("A01");
            bankQueue.joinQueue("A02");
            bankQueue.joinQueue("A03");
            bankQueue.joinQueue("A04");
            bankQueue.printQueue();

            //Primeiro da fila recebe atendimento e sai da fila:
            System.out.println("Em atendimento: " + bankQueue.leaveQueue() + ", próximo da fila: " + bankQueue.nextTheQueue());
            System.out.println("Em atendimento: " + bankQueue.leaveQueue() + ", próximo da fila: " + bankQueue.nextTheQueue());
            System.out.println("Em atendimento: " + bankQueue.leaveQueue() + ", próximo da fila: " + bankQueue.nextTheQueue());
            System.out.println("Em atendimento: " + bankQueue.leaveQueue() + ", próximo da fila: " + bankQueue.nextTheQueue());
            bankQueue.printQueue();
        } catch (Exception e){
            System.out.println("ERROR: " + e.getMessage());
        }

    }
}
