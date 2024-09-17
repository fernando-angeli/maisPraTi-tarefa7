package ListasSimplesmenteEncadeadas.Exercicio_2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BrowserHistory {

    private String url;
    private LocalDateTime dateTime;

    public BrowserHistory(String url, LocalDateTime dateTime) {
        this.url = url;
        this.dateTime = dateTime;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm:ss");
        return dateTime.format(formatter) + " - " + url;
    }
}
