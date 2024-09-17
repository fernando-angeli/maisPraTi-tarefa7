package ListasSimplesmenteEncadeadas.Exercicio_3;

import ListasSimplesmenteEncadeadas.SinglyLinkedList;

public class TextEditorWithSinglyLinkedList {

    private String text;
    private SinglyLinkedList actions;

    public TextEditorWithSinglyLinkedList() {
        this.text = "";
        this.actions = new SinglyLinkedList();
    }

    public void updateText(String updatedText){
        actions.add(updatedText);
        this.text = updatedText;
    }

    public void undoLastChange(){
        if(!actions.isEmpty()){
            String lastAction = (String) actions.remove(actions.size()-1);
            this.text = (String) actions.get(actions.size()-1);
        }
    }

    @Override
    public String toString() {
        return text;
    }
}
