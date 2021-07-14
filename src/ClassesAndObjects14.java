public class ClassesAndObjects14 {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Romeo";
        person1.age = 33;
        Person person2 = new Person();
        person2.name = "Vlad";
        person2.age = 20;
        int year1 = person1.calculateYearsToRetirement();
        int year2 = person2.calculateYearsToRetirement();
        System.out.println("первому человеку до пенсии " +year1+" лет");
        System.out.println("а второму " +year2+" лет");
    }
}

class Person{
    String name;
    int age;

    int calculateYearsToRetirement(){
        int years = 65-age;
        return years;
    }

    void speak(){
        for (int i = 2; i<3; i++)
        System.out.println("меня зовут "+ name +", мне "+age+" лет");
    }
    void sayHello(){
        System.out.println("привет");
    }
}