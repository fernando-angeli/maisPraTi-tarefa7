package Filas.Exercicio_6;

public class BankQueueManager {
    public static void main(String[] args) {

        BankQueue bankQueue = new BankQueue();
        ServicePassword p1 = new ServicePassword("A-01");
        ServicePassword p2 = new ServicePassword("A-02");
        ServicePassword p3 = new ServicePassword("A-03");
        ServicePassword p4 = new ServicePassword("A-04");

        try {
            //Adicionando senhas na fila
            bankQueue.joinQueue(p1);
            bankQueue.joinQueue(p2);
            bankQueue.joinQueue(p3);
            bankQueue.joinQueue(p4);
            bankQueue.printQueue();

            //Primeiro da fila recebe atendimento e sai da fila:
            System.out.println("Em atendimento: " + bankQueue.leaveQueue() + ", próximo da fila: " + (bankQueue.nextTheQueue() != null ? bankQueue.nextTheQueue() : "Fila vazia."));
            System.out.println("Em atendimento: " + bankQueue.leaveQueue() + ", próximo da fila: " + (bankQueue.nextTheQueue() != null ? bankQueue.nextTheQueue() : "Fila vazia."));
            System.out.println("Em atendimento: " + bankQueue.leaveQueue() + ", próximo da fila: " + (bankQueue.nextTheQueue() != null ? bankQueue.nextTheQueue() : "Fila vazia."));
            System.out.println("Em atendimento: " + bankQueue.leaveQueue() + ", próximo da fila: " + (bankQueue.nextTheQueue() != null ? bankQueue.nextTheQueue() : "Fila vazia."));

            bankQueue.printQueue();
        } catch (Exception e){
            System.out.println("ERROR: " + e.getMessage());
        }

    }
}
