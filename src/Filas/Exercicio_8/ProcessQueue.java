package Filas.Exercicio_8;

import Filas.Exercicio_7.PrintJob;
import Filas.Queue;

public class ProcessQueue {

    private Queue queue;

    public ProcessQueue() {
        this.queue = new Queue();
    }

    public void joinProcess(Process process){
        queue.enqueue(process);
    }

    public void executeNextProcess(){
        Process nextProcess = (Process) queue.dequeue();
        System.out.println("EXECUTANDO [id: " + nextProcess.getProcessId() + ", " + nextProcess.getProcessName()+"]");
    }

    public Process nextExecuteProcess(){
        return (Process) queue.peek();
    }

    public boolean isPendingProcess(){
        return !queue.isEmpty();
    }

    public void printProcessQueue(){
        System.out.println("Fila de processos: " + queue.size() + " em espera.");
        if(!queue.isEmpty()) queue.print();
    }

}
