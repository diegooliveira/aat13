package sampleprototype;

public class Address {

    private String street;

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreet() {
        return street;
    }

    public Address clone() {
        Address other = new Address();
        other.setStreet(street);
        return other;
    }
}
