package ListasDuplamenteEncadeadas;

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

    // Adicionar um nó ao inicio da lista
    public void addStart(Object data){
        Node newNode = new Node(data);
        if(this.head == null){
            this.head = this.tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Adicionar um nó ao final da lista
    public void addLast(Object data){
        Node newNode = new Node(data);
        if(this.head == null){
            this.head = this.tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    //Adiciona um nó em uma posição definida
    public void addToIndexPosition(Object data, int index){
        Node newNode = new Node(data);
        if(this.head == null) throw new IndexOutOfBoundsException("A lista está vazia.");
        if(index < 0 || index > size()) throw new IndexOutOfBoundsException("Fora do intervalo da lista");
        if(index == 0){
            if(this.head == null) this.head = this.tail = newNode;
            else{
                newNode.next = this.head;
                this.head.prev = newNode;
                this.head = newNode;
            }
            return;
        }
        if(index < size()){
            int currentIndex = 0;
            Node current = this.head;
            while(currentIndex < index - 1){
                current = current.next;
                currentIndex ++;
            }
            newNode.next = current.next;
            newNode.prev = current;
            if(current.next != null) current.next.prev = newNode;
            current.next = newNode;
            if(newNode.next == null) this.tail = newNode;
        } else{
            addLast(data);
        }
    }

    //Trocar posição de uma carta
    public void replaceCardPosition(int initialPosition, int newPosition) {
        if (initialPosition < 0 || initialPosition >= size() || newPosition < 0 || newPosition >= size()) {
            throw new IndexOutOfBoundsException("Índice fora do intervalo válido.");
        }

        // Caso especial: se as posições forem iguais, nada precisa ser feito
        if (initialPosition == newPosition) {
            return;
        }

        // Localiza o nó na posição inicial
        Node current = head;
        for (int i = 0; i < initialPosition; i++) {
            current = current.next;
        }

        // Remove o nó da posição inicial
        if (current.prev != null) {
            current.prev.next = current.next;
        } else { // Se for o primeiro nó, ajusta o head
            head = current.next;
        }

        if (current.next != null) {
            current.next.prev = current.prev;
        } else { // Se for o último nó, ajusta o tail
            tail = current.prev;
        }

        // Inserção na nova posição
        if (newPosition == 0) { // Inserção no início
            current.next = head;
            head.prev = current;
            head = current;
            current.prev = null;
        } else {
            // Localiza o nó na posição newPosition - 1
            Node newNodePos = head;
            for (int i = 0; i < newPosition - 1; i++) {
                newNodePos = newNodePos.next;
            }

            current.next = newNodePos.next;
            current.prev = newNodePos;

            if (newNodePos.next != null) {
                newNodePos.next.prev = current;
            } else { // Se for a última posição, ajusta o tail
                tail = current;
            }

            newNodePos.next = current;
        }
    }

    public void removeLast(){
        if(this.tail == null) throw new IndexOutOfBoundsException("A lista está vazia.");
        if(this.tail == this.head) this.head = this.tail = null;
        else{
             this.tail = tail.prev;
             this.tail.next = null;
        }
    }

    public void removeStart(){
        if(this.head == null) throw new IndexOutOfBoundsException("A lista está vazia.");
        if(this.head == this.tail) this.head = this.tail = null;
        else{
            this.head = head.next;
            this.head.prev = null;
        }
    }

    public void removeIndex(int index){
        if(this.head == null) throw new IndexOutOfBoundsException("A lista está vazia.");
        if(index == 0) removeStart();
        else if (index == size()-1) removeLast();
        else{
            Node current = this.head;
            int currentIndex = 0;
            while(currentIndex != index){
                current = current.next;
                currentIndex++;
            }
            if(current == null) throw new IndexOutOfBoundsException("Índice fora do intervalo válido.");
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
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
        System.out.println();
    }
    public void printFinishToStart(){
        Node current = this.tail;
        while(current != null){
            System.out.print(current.data);
            current = current.prev;
            if(current != null)
                System.out.print(" - ");
        }
        System.out.println();
    }

    public int size(){
        if(this.head == null) throw new IndexOutOfBoundsException("A lista está vazia.");
        Node current = this.head;
        int index = 1;
        do{
            current = current.next;
            index++;
        } while(current.next != null);
        return index;
    }

    public boolean isEmpty(){
        return this.head == null;
    }
}
