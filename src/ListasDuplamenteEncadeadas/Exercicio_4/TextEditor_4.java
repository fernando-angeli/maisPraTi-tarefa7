package ListasDuplamenteEncadeadas.Exercicio_4;

import ListasDuplamenteEncadeadas.DoublyLinkedList;

public class TextEditor_4 {

    private String text;
    private DoublyLinkedList actions;

    public TextEditor_4() {
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
