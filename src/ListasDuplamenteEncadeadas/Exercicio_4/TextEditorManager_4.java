package ListasDuplamenteEncadeadas.Exercicio_4;

public class TextEditorManager_4 {
    public static void main(String[] args) {

        TextEditor_4 textEditor = new TextEditor_4();

        textEditor.add("Primeiro texto");
        textEditor.add("Segundo texto");
        textEditor.add("Terceiro texto");
        textEditor.add("Ultimo texto");
        textEditor.print();

        System.out.println("\n ---- Testando undo e depois redo até final da lista ---- ");
        try {
            System.out.println("Lista completa: " + textEditor);
            textEditor.undo();
            System.out.println("DESFAZER (undo): " + textEditor);
            textEditor.redo();
            System.out.println("REFAZER (redo): " + textEditor);
            System.out.print("REFAZER (redo) - ");
            // a próxima execução deve gerar exception pois não tem mais indice.
            textEditor.redo();
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        System.out.println(" ---- Testando undo até inicio da lista ---- ");
        try {
            System.out.println("Lista completa: " + textEditor);
            textEditor.undo();
            System.out.println("DESFAZER (undo): " + textEditor);
            textEditor.undo();
            System.out.println("DESFAZER (undo): " + textEditor);
            textEditor.undo();
            System.out.println("DESFAZER (undo): " + textEditor);
            // a próxima execução deve gerar exception pois não tem mais indice.
            System.out.print("DESFAZER (undo) - ");
            textEditor.undo();
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}