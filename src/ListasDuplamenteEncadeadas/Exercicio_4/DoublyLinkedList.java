package ListasDuplamenteEncadeadas.Exercicio_4;

public class DoublyLinkedList {

    private static class Node {

        Node prev;
        Node next;
        Object data;

        public Node(Object data){
            this.data = data; //Dado armazenado
            this.prev = null; //Nó anterior
            this.next = null; //Proximo nó
        }
    }

    Node head; //Primeiro nó
    Node tail; //Ultimo nó

    public DoublyLinkedList(){
        this.head = null;
        this.tail = null;
    }

    // Adicionar um nó ao final da lista
    public Object addLast(Object data){
        Node newNode = new Node(data);
        if(this.head == null){
            this.head = this.tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        return newNode;
    }

    public Object removeLast(){
        if(this.tail == null) throw new IndexOutOfBoundsException("A lista está vazia.");
        Node deletedNode = this.tail;
        if(this.tail == this.head) this.head = this.tail = null;
        else{
             this.tail = tail.prev;
             this.tail.next = null;
        }
        return deletedNode;
    }

    //DESFAZER
    public Object undo(){
        if(this.tail == null) throw new IndexOutOfBoundsException("A lista está vazia.");
        if(this.tail.prev == null) throw new IndexOutOfBoundsException("A lista não contém mais elementos.");
        this.tail = this.tail.prev;
        return tail.data;
    }

    //REFAZER
    public Object redo(){
        if(this.tail == null) throw new IndexOutOfBoundsException("A lista está vazia.");
        if(this.tail.next == null) throw new IndexOutOfBoundsException("A lista não contém mais elementos.");
        this.tail = this.tail.next;
        return tail.data;
    }

    public void printStartToFinish(){
        Node current = this.head;
        while(current != null){
            System.out.print(current.data);
            current = current.next;
            if(current != null)
                System.out.print(" - ");
        }
    }
    public void printFinishToStart(){
        Node current = this.tail;
        while(current != null){
            System.out.print(current.data);
            current = current.prev;
            if(current != null)
                System.out.print(" - ");
        }
    }

    public int size(){
        Node current = this.head;
        int index = 0;
        while(current.next != null){
            current = current.next;
            index++;
        }
        return index;
    }

    public boolean isEmpty(){
        return this.head == null;
    }
}
