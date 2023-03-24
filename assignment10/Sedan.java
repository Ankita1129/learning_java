package assignment10;

class Sedan extends Car_Factory {
    String Ans;// declaration of data member
    // method for getprice

    public void getprice(double price) {
        if (price > 6 && price < 10)
            Ans = "No"; // modify Ans
        else
            Ans = "Yes"; // modify Ans
    }

    // method for displaying car detail//
    public void detail(String company_name, String car_name) {
        System.out.println("Company- " + company_name);
        System.out.println("Name of Car- " + car_name);
        System.out.println("Color- Black/White/Orange/Red");
        System.out.println("Fuel- Petrol/Diesel");
        System.out.println("Gears- Auto/Manual");
    }

    // method to display accessories of car//
    public void accessories() {
        System.out.println("Types of Tyres- Alloy Wheels");
        System.out.println("Airbags- YES");
        System.out.println("Back Wiper- YES");
        System.out.println("Side Mirror- Two");
        System.out.println("Touch Screen Music Player- YES");
        System.out.println("Roof Window- " + Ans);
    }
}