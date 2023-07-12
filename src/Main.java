import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Balyk balyk=new Balyk();
        balyk.setName("Akula");
        balyk.setSize(40);
        balyk.setColor("blue");
        System.out.println("Balyk");
        System.out.println("name: "+balyk.getName());
        System.out.println("size: "+balyk.getSize());
        System.out.println("color: "+balyk.getColor());

        Popugai popugai=new Popugai();
        popugai.setName("Kesha");
        popugai.setHome("Africa");
        popugai.setKind("Volnistyi");

        System.out.println();
        System.out.println("Popugai");

        System.out.println("name: "+popugai.getName());
        System.out.println("home: "+popugai.getHome());
        System.out.println("kind: "+popugai.getKind());

        System.out.println();
        System.out.println("Myshyk");

        Myshyk myshyk=new Myshyk();
        myshyk.setName("Miya");
        myshyk.setColor("gray");
        myshyk.setGender("femail");

        System.out.println("name: "+myshyk.getName());
        System.out.println("color: "+myshyk.getColor());
        System.out.println("gender: "+myshyk.getGender());

        System.out.println();
        System.out.println("It");

        It it=new It();
        it.setName("Bobik");
        it.setBreed("ovcharka");
        it.setColor("brown");

        System.out.println("name: "+it.getName());
        System.out.println("breed: "+it.getBreed());
        System.out.println("color: "+it.getColor());
    }
}