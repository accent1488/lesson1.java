public class ClassesAndObjects14 {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Romeo";
        person1.age = 33;
        System.out.println("Меня зовут " +person1.name + " мне " + person1.age + " года");
        Person person2 = new Person();
        person2.name = "Vlad";
        person2.age = 24;
        System.out.println("Меня зовут " +person2.name + " мне " + person2.age + " года");
    }
}

class Person{
    String name;
    int age;
    // у класса могут быть:
    // 1.данные(поля)
    //  2. действия, которые он может совершать (методы)
}