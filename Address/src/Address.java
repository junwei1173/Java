public class Address {
    protected int streetnum;
    protected String street;
    protected String city;
    protected String state;
    protected int zip;
     
    public Address(int streetnum, String street, String city, String state, int zip) {
        this.streetnum = streetnum;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }
    public String toString() {
        return "Address: "+streetnum+" "+street+" "+city+" "+state+" "+zip;
    }
    public boolean equals(Address a) {
        return streetnum == a.streetnum && street.equals(a.street) && city.equals(a.city) &&
        state.equals(a.state) && zip == a.zip;
    }
}