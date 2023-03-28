package PropertyRentalSystem;

import PropertyRentalSystem.Property;
import PropertyRentalSystem.Resident;

import java.time.LocalDate;

public class Lease {
    private Resident resident;
    private int id;
    private LocalDate moveInDate;
    private LocalDate moveOutDate;
    private Property property;

    public Lease(Resident resident, int id, LocalDate moveInDate, LocalDate moveOutDate, Property property)
    throws IllegalTenantException,EmptyMoveInDateException,EmptyMoveOutDateException,InvalidDurationException{
        this.resident = resident;
        this.id = id;
        this.moveInDate = moveInDate;
        this.moveOutDate = moveOutDate;
        this.property = property;

        if(resident.isTenant()){
            throw new IllegalTenantException("Already the tenant");
        }
        this.resident = resident;
        this.id = id;

        if(moveInDate==null){
            throw new EmptyMoveInDateException("move in date cannot be null");
        }
        if(moveOutDate==null){
            throw new EmptyMoveOutDateException("move out date cannot be null");
        }
        if(moveInDate.compareTo(moveOutDate)>0){
            throw new InvalidDurationException("Move in date cannot be greater than move out date");
        }
    }

    public Resident getResident() {
        return resident;
    }

    public void setResident(Resident resident) {
        this.resident = resident;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getMoveInDate() {
        return moveInDate;
    }

    public void setMoveInDate(LocalDate moveInDate) {
        this.moveInDate = moveInDate;
    }

    public LocalDate getMoveOutDate() {
        return moveOutDate;
    }

    public void setMoveOutDate(LocalDate moveOutDate) {
        this.moveOutDate = moveOutDate;
    }

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }
}
