package ListasSimplesmenteEncadeadas.Exercicio_3;

import ListasSimplesmenteEncadeadas.SinglyLinkedList.SinglyLinkedList;

public class TextEditor {

    private String text;
    private SinglyLinkedList actions;

    public TextEditor() {
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
