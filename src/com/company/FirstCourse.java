package com.company;

public class FirstCourse extends ComputerScience {


    FirstCourse(int age, String name, String profession, int price) {
        super(age, name, profession, price);
    }

    class FirstCourseDemo {
        void discountDemo (){
            System.out.println("Ціна:" +getPrice());
            System.out.println("Знижка складає:" );
            discount();
        }
    }
    void test(){
         FirstCourseDemo fcd = new FirstCourseDemo();
         fcd.discountDemo();
    }
    void discount() {
        if (getPrice() < 10000) {
            System.out.println("немає");
        } else if (getPrice() > 10000 && getPrice() < 20000) {
            System.out.println("10%");
        } else if ( getPrice() > 20000 && getPrice() < 30000){
            System.out.println("20%");
        }else {System.out.println("Знижки не існує");}
    }
}
