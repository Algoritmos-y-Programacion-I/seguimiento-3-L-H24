package model;
import java.util.ArrayList;

public class Computer {
    private String serialNumber;
    private int floor;
    private int column; 
    private ArrayList<Incident> incidents; 


    public Computer(String serialNumber, int floor, int column) {
        this.serialNumber = serialNumber;
        this.floor = floor;
        this.column = column;
        this.incidents = new ArrayList<>();
    }


    public String getSerialNumber(){
        return serialNumber;
    }

    public int getFloor(){
        return floor;
    }

    public int getColumn(){
        return column;
    }

    public ArrayList<Incident> getIncidents(){
        return incidents;
    }

    public void addIncident(Incident incident) {
        incidents.add(incident); 
    }
}