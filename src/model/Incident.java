package model;
import java.time.LocalDate;

public class Incident { 

    private LocalDate dateReport; 
    private String description; 
    private boolean solution; 
    private int solutionHours;

    public Incident(String description2) {
        //TODO Auto-generated constructor stub
    }

    public void incident(LocalDate dateReport, String description) {
        this.dateReport = dateReport; 
        this.description = description; 
    }

    public LocalDate getDateReport() {
        return dateReport;
    }

    public String getDescription () {
        return description;
    }

    public boolean getSolution () {
        return solution;
    }

    public int getSolutionHours () {
        return solutionHours;
    }

    public void setDateReport(LocalDate dateReport) {
        this.dateReport = dateReport; 
    }

    public void setDescription(String description) {
        this.description = description; 
    }                                  

    public void setSolution(boolean solution){
        this.solution = solution;
    }                            

    public void setSolutionHours(int solutionHours) {
        this.solutionHours = solutionHours;
    }

    public void resolve(int hours) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'resolve'");
    }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
}

