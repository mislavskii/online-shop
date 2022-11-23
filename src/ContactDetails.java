public class ContactDetails {
    private final String country;
    private final String city;
    private final String street;
    private final int houseNumber;
    private final int aptNumber;
    private final String phoneNumber;

    public ContactDetails(String country, String city, String street, int houseNumber, int aptNumber, String phoneNumber) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.aptNumber = aptNumber;
        this.phoneNumber = phoneNumber;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public int getAptNumber() {
        return aptNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "ContactDetails{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", houseNumber=" + houseNumber +
                ", aptNumber=" + aptNumber +
                ", phoneNumber=" + phoneNumber +
                '}';
    }

}
