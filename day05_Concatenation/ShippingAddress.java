package day05_Concatenation;

public class ShippingAddress {
    public static void main(String[] args) {



        String name = "Recep Ozmen", buildingNumber = "1087B", streetName = "Tavuskusu", city = "Ankara", state = "Turkey",
        zipcode = "786DY";


        System.out.println(name + "\n" + buildingNumber + " " + " " + streetName + "\n" + city + ", " + state + " " + zipcode);

        String address = name + "\n" + buildingNumber + " " + " " + streetName + "\n" + city + ", " + state + " " + zipcode;
        System.out.println(address);

    }



}
