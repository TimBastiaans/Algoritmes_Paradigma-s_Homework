package Les4_generics;

import java.util.ArrayList;
import java.util.Collections;

public class Address implements Comparable<Address> {
    private String street;
    private Integer houseNumber;

    public static void main(String args[]) {
        ArrayList<Address> addresses = new ArrayList();
        Address address1 = new Address();
        Address address2 = new Address();
        Address address3 = new Address();
        address1.street = "Heijndaalseweg";
        address1.houseNumber = 5;
        address2.street = "Baaaaastraat";
        address2.houseNumber = 13;
        address3.street = "Bbbbtraat";
        address3.houseNumber = 9;
        addresses.add(address1);
        addresses.add(address2);
        addresses.add(address3);

        Collections.sort(addresses);

        for (Address address : addresses) {
            System.out.println(address);
        }

    }

    public String toString() {
        return this.street + " " + this.houseNumber;
    }


    public int compareTo(Address o) {
        return this.street.compareTo(o.street);

//        if(this.houseNumber < o.houseNumber) {
//            return -1;
//        }
//       if(this.houseNumber > o.houseNumber) {
//            return 1;
//        }
//        else return 0;
    }
}