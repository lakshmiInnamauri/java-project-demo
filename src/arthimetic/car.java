package arthimetic;

public class car {
    String car_brand;
    String car_name;
    String color;

            public static void main(String[] args) {
                car myobj1 = new car();
                myobj1.car_brand = "Honda";
                myobj1.car_name = "Accord";
                myobj1.color = "Blue";

                car myobj2 = new car();
                myobj2.car_brand = "Nissan";
                myobj2.car_name = "Altima";
                myobj2.color = "Red";



                System.out.println(myobj1.car_name);
                System.out.println(myobj2.car_name);


            }
        }

