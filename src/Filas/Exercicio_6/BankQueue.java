package Filas.Exercicio_6;

import Filas.Queue;
import org.w3c.dom.Node;

public class BankQueue {
    private Queue queue;

    public BankQueue() {
        this.queue = new Queue();
    }

    public void joinQueue(ServicePassword password){
        queue.enqueue(password);
    }

    public ServicePassword leaveQueue(){
        return (ServicePassword) queue.dequeue();
    }

    public ServicePassword nextTheQueue(){
        return (ServicePassword) queue.peek();
    }

    public int sizeQueue(){
        return queue.size();
    }

    public void printQueue(){
        queue.printInline();
    }

}
