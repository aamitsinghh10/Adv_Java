package PropertyRentalSystem;

public abstract class Property {
    private Address address;
    public Property(Address address){
        this.address = address;
    }
    abstract int calculatePropertyTax(int pricePerSqFeet);
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
