public class Dog extends Animal{
    float tailLength;
    public Dog(String name, int age, String color, float tailLength){
        super(name,age,color);
        this.tailLength = tailLength;
    }
}
