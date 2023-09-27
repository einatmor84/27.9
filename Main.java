
public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("animal1", 40, "black");
        Dog dog = new Dog("dog1", 40, "black", 0.15f);
        Labrador lab = new Labrador("labi", 3, "black", 0.3f);
        System.out.println(lab.toString());
    }
}
