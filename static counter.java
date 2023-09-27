public class Counter {
    static int count = 0;

    Counter(){
        count++;
        System.out.println(count);
    }
}


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Counter c1=new Counter();
        Counter c2=new Counter();
        Counter c3=new Counter();
    }
}
