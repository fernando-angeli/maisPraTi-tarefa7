package ListasSimplesmenteEncadeadas.Exercicio_3;

public class TextEditorManagment {
    public static void main(String[] args) {

        TextEditor textEditor = new TextEditor();

        textEditor.updateText("Teste primeiro texto.");
        textEditor.updateText("Teste segundo texto.");
        textEditor.updateText("Teste terceiro texto.");
        textEditor.updateText("Teste quarto texto.");

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
