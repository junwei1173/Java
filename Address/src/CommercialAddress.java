public class CommercialAddress extends Address {
	String company;
	
    public CommercialAddress(int streetNum, String street, String city, String state, int zip, String companyName) {
        super(streetNum, street, city, state, zip);
        this.company = companyName;
    }
    public String toString() {
    	return "company: "+company+" "+super.toString();
    }
    public void bark() {
    	System.out.println("bbom");
    }
    public boolean equals(CommercialAddress a) {
    	return super.equals(a) && company.equals(a.company);
    }
}