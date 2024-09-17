package ListasSimplesmenteEncadeadas.Exercicio_3;

public class TextEditorWithSinglyLinkedListManagement {
    public static void main(String[] args) {

        TextEditorWithSinglyLinkedList textEditor = new TextEditorWithSinglyLinkedList();

        textEditor.updateText("Teste primeiro texto.");
        textEditor.updateText("Teste segundo texto.");
        textEditor.updateText("Teste terceiro texto.");
        textEditor.updateText("Teste ultimo texto.");

        try{
            System.out.println(textEditor);
            textEditor.undoLastChange();
            System.out.println(textEditor);
            textEditor.undoLastChange();
            System.out.println(textEditor);
            textEditor.undoLastChange();
            System.out.println(textEditor);
            // a próxima execução deve gerar exception pois não tem mais indice.
            textEditor.undoLastChange();
            System.out.println(textEditor);
        } catch (Exception e){
            System.out.println("ERROR: " + e.getMessage());
        }

    }
}
