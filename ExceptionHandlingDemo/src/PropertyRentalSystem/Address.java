package PropertyRentalSystem;

public class Address {
    private String code;
    private String city;

    public Address(String code, String city) {
        this.code = code;
        this.city = city;
    }

    // getters and setters

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
