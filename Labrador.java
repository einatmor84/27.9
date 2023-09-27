public class Labrador extends Dog{
    public Labrador(String name, int age, String Color, float tailLength){
        super( name, age, Color, tailLength);
    }
    public String toString(){
        return "Labrador: " + name + ", age: " + age + ", color: " + color + ", TailLength: " +tailLength;
    }
}
