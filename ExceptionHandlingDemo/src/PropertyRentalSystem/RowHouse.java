package PropertyRentalSystem;

public class RowHouse extends Property implements RentCalculator{
    protected int storeys;
    protected int backYardSize;
    protected int frontYardSize;

    public RowHouse(Address address, int storeys, int backyards, int frontyards){
        super(address);
        this.backYardSize = backyards;
        this.storeys = storeys;
        this.frontYardSize = frontyards;
    }
    public int calculateRent(int pricePerSqFeet){
        int yardSize = frontYardSize + backYardSize;
        int rent = storeys * yardSize * pricePerSqFeet;
        return rent;
    }
    public int calculatePropertyTax(int taxRate){
        int propertyTax = (int) ((frontYardSize + backYardSize) * storeys * taxRate * 0.01);
        return propertyTax;
    }
}
