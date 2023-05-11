package Cat;

public class App {
    public static void main(String[] args) throws Exception {
        Abyssinian myPet = new Abyssinian();

        myPet.meow();
        System.out.println(myPet.meow);
        System.out.println(myPet.height);
    }
}