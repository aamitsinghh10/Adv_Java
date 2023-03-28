package PropertyRentalSystem;

public class Apartments extends Property implements RentCalculator{
    protected int superArea;
    protected int coveredArea;

    public Apartments(Address address, int superArea,int coveredArea){
        super(address);
        this.superArea = superArea;
        this.coveredArea = coveredArea;
    }
    public int calculateRent(int pricePerSqFeet){
        int rent = superArea * pricePerSqFeet;
        rent += 500; // additional fixed cost
        return rent;
    }
    public int calculatePropertyTax(int taxRate){
        int propertyTax = (int) (superArea * taxRate * 0.01);
        return propertyTax;
    }
}
