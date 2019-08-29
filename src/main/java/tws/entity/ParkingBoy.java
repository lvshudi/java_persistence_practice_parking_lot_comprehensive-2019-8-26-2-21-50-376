package tws.entity;

import java.io.Serializable;

public class ParkingBoy implements Serializable {
    private int id;


    public ParkingBoy() {

    }

    public ParkingBoy(int id) {
        this.id = id;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
    	this.id = id;
    }
}
