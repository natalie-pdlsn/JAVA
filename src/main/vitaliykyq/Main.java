package main.vitaliykyq;

public class Main {

    public static void main(String[] args) {

        byte Age = 18;
        short video = 285;
        int photo = 35657;
        double growth = 1.68;
        float weight = 55.5f;
        String name = "Наталія";
        char coma =  ',';
        boolean work = true;

        System.out.println("Я Наталія" + coma + " мені " + Age + ".");
        System.out.println("Я звісно не з модельними параметрами" + coma + " але люблю фотографію.");
        System.out.println("Мій ріст " + growth + " та вага " + weight + " і я люблю позувати. А ще більше фотографувати когось. " +
                "В моїй галереї " +
                "є " + photo + " фотографій та " + video + " відео. Але враховуючи те" + coma + " що я лінива і не видаляю\nнепотрібні " +
                "фото і відео" + coma + " " +
                "то 50% мені точно там не потрібні. В день я можу зробити від 200 до 2000 фотографій.");
        System.out.println("Я займаюсь цим у вільний час: " + work + ".");
    }
}
