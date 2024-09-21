package Filas.Exercicio_8;

public class ProcessManager {
    public static void main(String[] args) {

        ProcessQueue processQueue = new ProcessQueue();
        Process p1 =  new Process(1, "Atualizar drivers");
        Process p2 =  new Process(2, "Iniciar serviço SQLServer");
        Process p3 =  new Process(3, "Imprimir arquivos da fila de impressão");

        try {
            // Adicionando os documentos a lista
            processQueue.joinProcess(p1);
            processQueue.joinProcess(p2);
            processQueue.joinProcess(p3);
            processQueue.printProcessQueue();

            // iniciando a execução de processos
            processQueue.executeNextProcess();
            processQueue.executeNextProcess();
            processQueue.executeNextProcess();
            processQueue.printProcessQueue();

            // deve estourar uma exception pois a fila está vazia
            processQueue.nextExecuteProcess();
        } catch (Exception e){
            System.out.println("ERROR: " + e.getMessage());
        }

    }


}
