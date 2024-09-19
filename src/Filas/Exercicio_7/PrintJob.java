package Filas.Exercicio_7;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PrintJob {

    private String nameDocument;
    private int numberOfPages;
    private LocalDateTime instant;

    public PrintJob(String nameDocument, int numberOfPages) {
        this.nameDocument = nameDocument;
        this.numberOfPages = numberOfPages;
        this.instant = LocalDateTime.now();
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss 'em' dd/MM/yyyy");
        return "Documento: " + nameDocument + ", páginas: " + numberOfPages + ", inclusão: " + instant.format(formatter)+"\n";
    }

    public String getNameDocument() {
        return nameDocument;
    }
}
