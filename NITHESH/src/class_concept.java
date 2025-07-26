import java.util.*;
public class class_concept {
    String name;
    int age;
    public void display(){
        System.out.println(name);
        System.out.println(age);
    }
    public void setValues(String str,int num){
        name=str;
        age=num;
    }

    }
    class main {
        public static void main(String[] args) {
            class_concept c = new class_concept();
            c.setValues("Nithesh",19);
            c.display();
        }
    }
