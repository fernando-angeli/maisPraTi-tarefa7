package ListasSimplesmenteEncadeadas.SinglyLinkedList;

import ListasSimplesmenteEncadeadas.Exercicio_1.Task;

public class SinglyLinkedList {

    private static class Node {
        Node next;
        Object data;

        public Node(Object data){
            this.data = data;
            this.next = null;
        }
    }
    private Node head;

    public SinglyLinkedList() {
        this.head = null;
    }

    public void add(Object data){
        Node newNode = new Node(data);
        if(this.head == null){
            this.head = newNode;
        } else{
            Node current = this.head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void add(Object data, int maxSize){
        Node newNode = new Node(data);
        if(this.head == null){
            this.head = newNode;
        }
        else{
            Node current = this.head;
            int count = 0;
            while(current.next != null){
                current = current.next;
                count++;
            }
            if(count == maxSize-1) this.head = head.next;
            current.next = newNode;
        }
    }

    public Object get(int index){
        Node current = this.head;
        int count = 0;
        while(current != null){
            if(count == index){
                return current.data;
            }
            count++;
            current = current.next;
        }
        throw new IndexOutOfBoundsException("Index não localizado.");
    }

    public Object remove(int index){
        Node current = this.head;
        if(this.head == null) throw new IndexOutOfBoundsException("A lista está vazia.");
        if(index == 0){
            this.head = this.head.next;
            return current.data;
        }
        int count = 0;
        Node previous = null;
        while(current != null && count < index){
            previous = current;
            current = current.next;
            count++;
        }
        if(current == null) throw new IndexOutOfBoundsException("Index não localizado.");
        previous.next = current.next;
        return current.data;
    }

    public Task completedTask(int index, boolean completed){
        Node current = this.head;
        if(this.head == null) throw new IndexOutOfBoundsException("A lista está vazia.");
        if(index == 0){
            Task updatedTask = (Task) current.data;
            updatedTask.setCompleted(completed);
            current.data = updatedTask;
            return updatedTask;
        }
        int count = 0;
        while(current != null && count < index){
            current = current.next;
            count++;
        }
        if(current == null) throw new IndexOutOfBoundsException("Index não localizado.");
        Task updatedTask = (Task) current.data;
        updatedTask.setCompleted(completed);
        current.data = updatedTask;
        return updatedTask;
    }

    public Task updateDescriptionTask(int index, String update){
        Node current = this.head;
        if(this.head == null) throw new IndexOutOfBoundsException("A lista está vazia.");
        if(index == 0){
            Task updatedTask = (Task) current.data;
            updatedTask.setDescription(update);
            current.data = updatedTask;
            return updatedTask;
        }
        int count = 0;
        while(current != null && count < index){
            current = current.next;
            count++;
        }
        if(current == null) throw new IndexOutOfBoundsException("Index não localizado.");
        Task updatedTask = (Task) current.data;
        updatedTask.setDescription(update);
        current.data = updatedTask;
        return updatedTask;
    }

    public int size(){
        int count = 0;
        Node current = this.head;
        while(current != null){
            count++;
            current = current.next;
        }
        return count;
    }

    public boolean isEmpty(){
        return this.head == null;
    }

    public void print() {
        Node current = this.head;
        int index = 0;
        while(current != null){
            System.out.println("[" + index + "] " + current.data);
            current = current.next;
            index++;
        }
    }

}
