package Filas.Exercicio_6;

import Filas.Queue;

public class BankQueue {
    private Queue queue;

    public BankQueue() {
        this.queue = new Queue();
    }

    public void joinQueue(String password){
        queue.enqueue(password);
    }

    public String leaveQueue(){
        return (String) queue.dequeue();
    }

    public String nextTheQueue(){
        return (String) queue.peek();
    }

    public int sizeQueue(){
        return queue.size();
    }

    public void printQueue(){
        queue.print();
    }

}
