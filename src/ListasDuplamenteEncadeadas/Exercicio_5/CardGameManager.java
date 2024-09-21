package ListasDuplamenteEncadeadas.Exercicio_5;

public class CardGameManager {
    public static void main(String[] args) {

        CardGame cards = new CardGame();
        Card c1 = new Card('A', Suits.PAUS);
        Card c2 = new Card('a', Suits.COPAS);
        Card c3 = new Card('A', Suits.ESPADAS);
        Card c4 = new Card('A', Suits.OURO);
        Card c5 = new Card('K', Suits.PAUS);
        int indexParaInserir = 0;
        try{
            cards.addStart(c1);
            cards.addStart(c2);
            cards.addStart(c3);
            cards.addStart(c4);
            System.out.println("Cartas na lista:");
            cards.printCards();
            System.out.print("Incluir [K-PAUS] na posição " + indexParaInserir + ": \n");
            cards.addToIndexPosition(c5,indexParaInserir);
            cards.printCards();
            System.out.print("Mudando posição do [A-PAUS] de index 1 para index 2: \n");
            cards.replaceCardPosition(1, 2);
            cards.printCards();
            System.out.print("Mudando posição do [K-PAUS] de index 0 para index 4: \n");
            cards.replaceCardPosition(0, 4);
            cards.printCards();
            System.out.print("Mudando posição do [K-PAUS] de index 4 para index 0: \n");
            cards.replaceCardPosition(4, 0);
            cards.printCards();
            System.out.print("Removendo [K-PAUS]: \n");
            cards.removeIndex(0);
            cards.printCards();
            System.out.print("Removendo [A-OURO]: \n");
            cards.removeIndex(3);
            cards.printCards();
            System.out.print("Removendo [A-PAUS]: \n");
            cards.removeIndex(1);
            cards.printCards();
            //Passando index inexistente para gerar exception ao remover index 2
            cards.removeIndex(2);
        } catch (Exception e){
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
