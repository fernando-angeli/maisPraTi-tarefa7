package ListasDuplamenteEncadeadas.Exercicio_5;

import ListasDuplamenteEncadeadas.DoublyLinkedList;

public class CardGame {

    DoublyLinkedList cards;

    public CardGame(){
        this.cards = new DoublyLinkedList();
    }

    public void addStart(Card card){
        cards.addStart(card);
    }

    public void addLast(Card card){
        cards.addLast(card);
    }

    public void addToIndexPosition(Card card, int index){
        cards.addToIndexPosition(card, index);
    }

    public void replaceCardPosition(int initialPosition, int newPosition){
        cards.replaceCardPosition(initialPosition, newPosition);
    }

    public void removeIndex(int index){
        cards.removeIndex(index);
    }
    public void printCards(){
        cards.printStartToFinish();
    }
}
