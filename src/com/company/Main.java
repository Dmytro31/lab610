package com.company;

public class Main {

    public static void main(String[] args) {
	ComputerScience cs = new ComputerScience(17, "Dima Fedoruk" , "Комп'ютерні науки" , 52200 );
    FirstCourse fc = new FirstCourse(17, "Dima Fedoruk" , "Комп'ютерні науки" , 52200);
    Ecology e = new Ecology(20,"Vlad", "Екологія",454345);
    Management m = new Management(18, "Oleg Kozhuzhko","", 342342);
    cs.info();
    System.out.println("Середня оцінка предметів " +cs.sum(m,e));
    System.out.println("___________________________________________________________________________");
    e.three();
    cs.professions();
   System.out.println("___________________________________________________________________________");
   fc.test();
   e.well(1);
    }
}
