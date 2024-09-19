package Filas.Exercicio_7;

public class PrintManager {
    public static void main(String[] args) {

        PrintQueue printQueue = new PrintQueue();
        PrintJob print1 = new PrintJob("Lista de compra.doc", 10);
        PrintJob print2 = new PrintJob("Boleto1.pdf", 1);
        PrintJob print3 = new PrintJob("Nota fiscal.pdf", 20);

        try {
            // Adicionando os documentos a lista
            printQueue.joinPrintJob(print1);
            printQueue.joinPrintJob(print2);
            printQueue.joinPrintJob(print3);
            printQueue.printJobQueue();

            // iniciando impressão de arquivos
            printQueue.printJob();
            printQueue.printJobQueue();
            printQueue.printJob();
            printQueue.printJobQueue();
            printQueue.printJob();
            printQueue.printJobQueue();
        } catch (Exception e){
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
