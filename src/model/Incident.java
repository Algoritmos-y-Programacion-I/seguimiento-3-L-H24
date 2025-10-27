package model;
import java.time.LocalDate;

public class Incident { 
    private LocalDate dateReport; 
    private String description; 
    private boolean solved; 
    private int solutionHours;

    public Incident(LocalDate dateReport, String description) {
        this.dateReport = dateReport;
        this.description = description;
        this.solved = false; // Inicialmente no resuelto
        this.solutionHours = 0; // Inicialmente 0 horas
    }

    public void resolve(int hours) {
        this.solved = true;
        this.solutionHours = hours;
    }

    @Override
    public String toString() {
        String status = solved ? "RESUELTO (" + solutionHours + " horas)" : "PENDIENTE";
        return "Fecha: " + dateReport + " - " + description + " - " + status;
    }

    public LocalDate getDateReport() {
        return dateReport;
    }

    public String getDescription() {
        return description;
    }

    public boolean isSolved() {
        return solved;
    }

    public int getSolutionHours() {
        return solutionHours;
    }

    public void setDateReport(LocalDate dateReport) {
        this.dateReport = dateReport;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setSolved(boolean solved) {
        this.solved = solved;
    }

    public void setSolutionHours(int solutionHours) {
        this.solutionHours = solutionHours;
    }
}