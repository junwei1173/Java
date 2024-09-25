public class Addmain {
	public static void main(String[] args) {
        Address house = new Address(123,"hope st","sikka", "WA", 112322);
        System.out.println(house);
        CommercialAddress company = new CommercialAddress(1223,"hope st","sikka", "WA", 112322,"Good");
        System.out.println(company);
        CommercialAddress[] add= new CommercialAddress[3];
        add[0] = new CommercialAddress(12132,"hop11e st","sik11ka", "W1A", 1121322, "Good1Mans");
        System.out.println(add[0]);
        System.out.println(company.equals(house));
    }
}