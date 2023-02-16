import Seminar.units.*;

public class Main {
    public static void main(String[] args) {
        Sniper name1 = new Sniper("Troy1");
        System.out.println(name1.getInfo());
        Crossbowman name2 = new Crossbowman("Troy2");
        System.out.println(name2.getInfo());
        Spearman name3 = new Spearman("Troy3");
        System.out.println(name3.getInfo());
        Raider name4 = new Raider("Troy4");
        System.out.println(name4.getInfo());
        Magician name5 = new Magician("Troy5");
        System.out.println(name5.getInfo());
        Monk name6 = new Monk("Troy6");
        System.out.println(name6.getInfo());
        Villager name7 = new Villager("Troy7");
        System.out.println(name7.getInfo());

    }
}