package com.company;


class ComputerScience {
    private int age;
    private String name;

    private String profession ;
    private   String s;
    private int price;
    ComputerScience(int age, String name, String profession, int price ) {
        this.age = age;
        this.name = name;
        this.profession = profession;
        this.price = price;
    }
    int serd1 = 70;
    int sum(Management a, Ecology t){
        int sum = (a.serd2 + serd1 + t.serd3)/3;
        return sum;
    }
    void one(){
        System.out.println("Вітаю в університеті");
    }

    void info(){
        System.out.println("Професія: " +profession);
        System.out.println("Ім`я і Прізвище: "+name);
        System.out.println("Вік: "+ age);
    }
    void semester(int s){
        if(s==1){
            System.out.println("Інженерна та комп'ютеран графіка");
            System.out.println("Українська мова і культура");
            System.out.println("Правознавство та правові основи цивільного захисту України");
            System.out.println("Лінійна алгебра та аналітична геометрія");
            System.out.println("Математичний аналіз");
            System.out.println("Фізика");
            System.out.println("Основи програмування");
            System.out.println("Дискретна математика");
        }else if(s==2){
            System.out.println("Second semester");
            System.out.println("           Предмети          ");
            System.out.println("Історія української державності");
            System.out.println("Іноземна мова");
            System.out.println("Чисельні методи");
            System.out.println("Основи WEB - розробки");
            System.out.println("Математичний аналіз");
            System.out.println("Фізика");
            System.out.println("Основи програмування");
            System.out.println("Дискретна математика");
        }else{
            System.out.println("Invalid value entered");
        }
    }
    String semester(String s){
        this.s = s;
        System.out.println("Ви ввели букви потрыбно цифру");
        return s;


    }
     void professions(){
         System.out.println("Кібербезпека");
         System.out.println("Комп'ютерні науки");
         System.out.println("Цивільна безпека");
         System.out.println("Екологія");
         System.out.println("Менеджмент");
         System.out.println("Пожежна безпека");
         System.out.println("Психологія");
         System.out.println("Соціальна робота");
         System.out.println("Філологія");
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

    public void setN(String s) {
        this.s = s;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
