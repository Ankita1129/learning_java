package assignment10;

class Small_car extends Car_Factory {
    String Ans;// declaration of data member
    // method for getprice

    public void getprice(double price) {
        if (price > 2 && price < 5)
            Ans = "No"; // modify Ans
        else
            Ans = "Yes"; // modify Ans
    }

    // method for displaying car detail//
    public void detail(String company_name, String car_name) {
        System.out.println("Company- " + company_name);
        System.out.println("Name of Car- " + car_name);
        System.out.println("Color- Black/White/Orange/Red");
        System.out.println("Fuel- Petrol");
        System.out.println("Gears- Manual");
    }

    // method to display accessories of car//
    public void accessories() {
        System.out.println("Types of Tyres- Alloy Wheels");
        System.out.println("Airbags- " + Ans);
        System.out.println("Back Wiper- " + Ans);
        System.out.println("Side Mirror- Two");
        System.out.println("Touch Screen Music Player- " + Ans);
    }
}