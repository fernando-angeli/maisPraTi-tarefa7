package Filas.Exercicio_8;

import java.time.format.DateTimeFormatter;

public class Process {

    private int processId;
    private String processName;

    public Process(int processId, String processName) {
        this.processId = processId;
        this.processName = processName;
    }

    public int getProcessId() {
        return processId;
    }

    public String getProcessName() {
        return processName;
    }

    @Override
    public String toString() {
        return "Id: " + this.getProcessId() + ", descrição: " + this.processName +"\n";
    }

}
