package Filas;

public class Queue {

    private static class Node {
        Node next;
        Object data;

        public Node(Object data) {
            this.data = data; //Dado armazenado
            this.next = null; //Proximo nó
        }

        public Object getData() {
            return data;
        }
    }

    private Node first;
    private Node last;

    public Queue() {
        this.first = null;
        this.last = null;
    }

    // Metodo para empilhar ou adicionar ao final da fila
    public void enqueue(Object data) {
        Node newNode = new Node(data);
        if (first == null) this.first = this.last = newNode;
        this.last.next = newNode;
        this.last = newNode;
    }

    // Metodo para desempilhar, ou seja, retirar o primeiro elemento que deve sair da fila (first)
    public Object dequeue() {
        if (this.first == null) throw new IndexOutOfBoundsException("A fila está vazia.");
        Node removedNode = this.first;
        if (this.first == this.last) this.first = this.last = null;
        else this.first = this.first.next;
        return removedNode.data;
    }

    public Object peek() {
        return this.first != null ? first.data : null;
    }

    public boolean isEmpty() {
        return this.first == null;
    }

    public int size() {
        if (this.first == null) return 0;
        int count = 0;
        Node current = this.first;
        while (current != null) {
            current = current.next;
            count++;
        }
        return count;
    }

    public void print() {
        if (this.first == null) throw new IndexOutOfBoundsException("A fila está vazia.");
        Node current = this.first;
        while (current != null) {
            System.out.print(current.data);
            current = current.next;
        }
    }

    public void printInline(){
        if(this.first == null) throw new IndexOutOfBoundsException("A fila está vazia.");
        Node current = this.first;
        System.out.print("Tamanho da fila: " + size() + " | ");
        while(current != null){
            System.out.print(current.data);
            current = current.next;
            if(current != null)
                System.out.print(" - ");
        }
        System.out.println(" |");
    }
}