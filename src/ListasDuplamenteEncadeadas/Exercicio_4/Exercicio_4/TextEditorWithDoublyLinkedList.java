package ListasDuplamenteEncadeadas.Exercicio_4.Exercicio_4;

import ListasDuplamenteEncadeadas.Exercicio_4.DoublyLinkedList;

public class TextEditorWithDoublyLinkedList {

    private String text;
    private DoublyLinkedList actions;

    public TextEditorWithDoublyLinkedList() {
        this.text = "";
        this.actions = new DoublyLinkedList();
    }

    public void add(String text){
        actions.addLast(text);
        this.text = text;
    }
    public void undo(){
        if(!actions.isEmpty())
            this.text = (String) actions.undo();
    }

    public void redo(){
        if(!actions.isEmpty())
            this.text = (String) actions.redo();
    }

    public void print(){
        actions.printStartToFinish();
    }
    @Override
    public String toString() {
        return text;
    }
}
