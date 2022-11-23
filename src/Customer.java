public class Customer {
    private final String name;
    private final ContactDetails contactDetails;

    public Customer(String name, ContactDetails contactDetails) {
        this.name = name;
        this.contactDetails = contactDetails;
    }

    public String getName() {
        return name;
    }

    public Customer setName(String name) {
        return new Customer(name, contactDetails);
    }

    public ContactDetails getContactDetails() {
        return contactDetails;
    }

    public Customer setContactDetails(ContactDetails contactDetails) {
        return new Customer(name, contactDetails) ;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", contactDetails=" + contactDetails +
                '}';
    }
}
