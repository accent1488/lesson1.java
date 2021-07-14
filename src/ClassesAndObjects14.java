public class ClassesAndObjects14 {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Romeo";
        person1.age = 33;
        person1.sayHello();
        Person person2 = new Person();
        person2.name = "Vlad";
        person2.age = 20;
        person2.speak();
    }
}

class Person{
    String name;
    int age;

    void speak(){
        for (int i = 2; i<3; i++)
        System.out.println("меня зовут "+ name +", мне "+age+" лет");
    }
    void sayHello(){
        System.out.println("привет");
    }
}