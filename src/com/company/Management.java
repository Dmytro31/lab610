package com.company;
class Management extends ComputerScience {
    private int age;
    private String name;
    private String profession;
    private  String s;

     int serd2 = 60;

    Management(int age, String name, String profession, int price) {
        super(age, name, profession, price);
    }

    void info(){
        System.out.println("Професія: " +profession);
        System.out.println("Ім`я і Прізвище: "+name);
        System.out.println("Вік: "+ age);
    }
    void two(){
        one();
        System.out.println("Fist Semester");
    }
    public void semester(int s){
        if(s==1){
            System.out.println("first course");
            System.out.println("             Предмети         ");
            System.out.println("Економічна теорія (мікроекономіка та макроекономіка)");
            System.out.println("Лідерство та стилі керівництва");
            System.out.println("Правознавство");
            System.out.println("Вступ до фаху (Менеджмент)");
            System.out.println("Теорія організацій");
            System.out.println("Господарське та трудове право");
            System.out.println("Українська мова та культура");
            System.out.println("Іноземна мова");
            System.out.println("Вища математика");
            System.out.println("Інформатика та комп'ютерна техніка");
            System.out.println("Основи психології");
            System.out.println("Основи підприємництва");
            System.out.println("Основи економічної науки");
            System.out.println("Фізичне виховання");
            System.out.println("Історія української державності");
            System.out.println("Політологія");
            System.out.println("Мікроекономіка");
            System.out.println("Психологія управління");
        }else if(s==2){
            System.out.println("second course");
            System.out.println("           Предмети          ");
            System.out.println("Маркетинг");
            System.out.println("Трудове право");
            System.out.println("Інформаційні системи і технології в менеджменті");
            System.out.println("Організація кадрової роботи");
            System.out.println("Автомобіль та безпека дорожнього руху");
            System.out.println("Бізнес аналіз");
            System.out.println("Основи підприємництва");
            System.out.println("Теорія та практика бізнес-планування");
            System.out.println("Контролінг");
            System.out.println("Основи діловодства");
            System.out.println("Фізика");
            System.out.println("Основи програмування");
            System.out.println("Теорія та практика бізнес-планування");
            System.out.println("Економіка цивільної безпеки");
            System.out.println("Основи теорії систем та системного аналізу");
            System.out.println("Єдина державна система цивільного захисту");
            System.out.println("Планування діяльності та управління розвитком організації");
            System.out.println("Фінанси, гроші та кредит");
            System.out.println("Філософія");
            System.out.println("Теорія організацій");
            System.out.println("Основи трудового права та організація кадрової роботи");
            System.out.println("Організація економічної роботи на підприємстві");
        }else{
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
}
