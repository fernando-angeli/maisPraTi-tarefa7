package ListasSimplesmenteEncadeadas.Exercicio_2;
import ListasSimplesmenteEncadeadas.SinglyLinkedList.SinglyLinkedList;

import java.time.LocalDateTime;

public class HistoryManagment {
    public static void main(String[] args) {


        SinglyLinkedList browserHistory = new SinglyLinkedList();
        // Limite de tamanho da lista
        int maxSize = 5;

        // Insert de 5 posições na lista
        browserHistory.add(new BrowserHistory("https://www.example.com", LocalDateTime.of(2024, 9, 17, 16, 5, 0)), maxSize);
        browserHistory.add(new BrowserHistory("https://www.news.com/article123", LocalDateTime.of(2024, 9, 17, 16, 5, 5)), maxSize);
        browserHistory.add(new BrowserHistory("https://www.sports.com/latest-scores", LocalDateTime.of(2024, 9, 17, 16, 5, 10)), maxSize);
        browserHistory.add(new BrowserHistory("https://www.shop.com/deal-of-the-day", LocalDateTime.of(2024, 9, 17, 16, 5, 15)), maxSize);
        browserHistory.add(new BrowserHistory("https://www.socialmedia.com/user/profile", LocalDateTime.of(2024, 9, 17, 16, 5, 20)), maxSize);
        browserHistory.print();

        //Simulando inclusção após lista cheia (5 urls)
        System.out.println("\nO indice 0, passou a ser o segundo item da primeira lista.");
        browserHistory.add(new BrowserHistory("https://www.maisPraTi.com/", LocalDateTime.of(2024, 9, 17, 16, 5, 25)), maxSize);
        browserHistory.print();
    }
}
