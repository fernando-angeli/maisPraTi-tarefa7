package Filas.Exercicio_7;

import Filas.Queue;

public class PrintQueue {

    private Queue queue;

    public PrintQueue() {
        this.queue = new Queue();
    }

    public void joinPrintJob(PrintJob job){
        queue.enqueue(job);
    }

    public void printJob(){
        PrintJob job = (PrintJob) queue.dequeue();
        System.out.println("IMPRIMINDO: " + job.getNameDocument());
    }

    public PrintJob nextPrintJob(){
        return (PrintJob) queue.peek();
    }

    public boolean isPendingPrintJobs(){
        return !queue.isEmpty();
    }

    public void printJobQueue(){
        System.out.println("Fila de impressão: " + queue.size() + " arquivo(s) em espera.");
        queue.print();
    }

}
