package sampleprototype;

class User {

    private String name, phoneNumber;
    private Address address;

    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public User clone() {
        User copy = new User();
        copy.setName(name);
        copy.setPhoneNumber(phoneNumber);
        copy.setAddress(address == null ? null : address.clone() );
        
        return copy;
    }
}
