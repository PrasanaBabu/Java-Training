package Entity;

public class Address {

    private Integer doorNumber;
    private String streetName;
    private String city;

    public Address(Integer doorNumber, String streetName, String city) {
        this.doorNumber = doorNumber;
        this.streetName = streetName;
        this.city = city;
    }

    public Integer getDoorNumber() {
        return doorNumber;
    }

    public void setDoorNumber(Integer doorNumber) {
        this.doorNumber = doorNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "doorNumber=" + doorNumber +
                ", streetName='" + streetName + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
