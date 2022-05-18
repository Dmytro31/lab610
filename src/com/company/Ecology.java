package com.company;

import java.lang.constant.Constable;

class Ecology extends Management {
    private int age;
    private String name;
    private String profession;
    private String s;

    Ecology(int age, String name, String profession, int price) {
        super(age, name, profession, price);
    }

    void info(){
        System.out.println("Професія: " +profession);
        System.out.println("Ім`я і Прізвище: "+name);
        System.out.println("Вік: "+ age);
    }
    void three(){
        two();
        System.out.println("доступні предмети");
    }
    int serd3 = 50;
     void well(int s){
        if(s==1){
            System.out.println(" 1 Курс");
            System.out.println("             Предмети         ");
            System.out.println("Історія української державності");
            System.out.println("Загальна екологія");
            System.out.println("Грунтознавство з основами геології і геоморфології");
            System.out.println("Вища математика 2 семестр");
            System.out.println("Ландшафтна екологія");
            System.out.println("Фізика");
            System.out.println("Навчальна практика");
            System.out.println("Фізичне виховання 2 семестр");
        }else if(s==2){
            System.out.println("2 Курс");
            System.out.println("           Предмети          ");
            System.out.println("Метеорологія та кліматологія");
            System.out.println("Інженерна екологія");
            System.out.println("Техноекологія");
            System.out.println("Нормування екологіного стану довкілля");
            System.out.println("Урбоекологія");
            System.out.println("Фізичне виховання 2 семестр");
            System.out.println("Екологія людини");
            System.out.println("Навчальна практика");
        }else if (s==3) {
            System.out.println("3 Курс");
            System.out.println("           Предмети          ");
            System.out.println("Радіобіологія та радіоекоогія");
            System.out.println("Заповідна справа");
            System.out.println("Техноекологія");
            System.out.println("Моніторинг довкілля");
            System.out.println("Основи мікробіології");
            System.out.println("Поводження з відходами");
            System.out.println("Екологічна безпека");
            System.out.println("Теоретичні осгови очищення стічних вод");
            System.out.println("Навчальна практика");
            System.out.println("Фізичне виховання 2 семестр");
        }
        else if (s==4){
            System.out.println("4 Курс");
            System.out.println("           Предмети          ");
            System.out.println("Біотехнології в охороні довкілля");
            System.out.println("Економіка природористування");
            System.out.println("Основи охорони праці");
            System.out.println("Еколого-ресурчна безпека землі");
            System.out.println("Філософія");
            System.out.println("Фітомеліорація");
            System.out.println("Екологічний аудит та інспектування");
            System.out.println("Моделювання і прогнозування стану довкілля");
            System.out.println("Організація управління в екологічній діяльності");
            System.out.println("Переддипломна практика");
            System.out.println("Підсумкова атестація");
            System.out.println("Дипломна робота бакалаврів");
            System.out.println("Фізичне виховання 2 семестр");
            System.out.println("Філософія ЕК");
        }else {
            System.out.println("Invalid value entered");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getN() {
        return s;
    }

    public void setN(String n) {
        this.s = s;
    }

    Constable well(String n){
        this.s = s;
        System.out.println("Ви ввели букви потрыбно цифру");
        return s;


    }

}
