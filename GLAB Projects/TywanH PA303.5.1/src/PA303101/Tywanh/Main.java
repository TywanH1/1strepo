package PA303101.Tywanh;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        Monster m1 = new FireMonster();
        Monster m2 = new WaterMonster();
        Monster m3 = new StoneMonster();

        m1.attack();
        m2.attack();
        m3.attack();

        m1 = new StoneMonster();
        m1.attack();

        //Monster m4 = new Monster();//
        //m4.attack();//
    }

}