package week09d03;

import java.util.Random;

public class Person {

    private String name;
    private int age;
    private Present present;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setPresent(){

        if(this.getAge() <= 14){
            Random random = new Random();
            int number = random.nextInt(4);
            if(number == 0){
                this.present = Present.Toy;
            }
            if(number == 1){
                this.present = Present.Decoration;
            }
            if(number == 2){
                this.present = Present.Electronic;
            }
            if(number == 3){
                this.present = Present.Housekepping;
            }
        }

    }
}
