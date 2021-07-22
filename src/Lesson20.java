public class Lesson20 {
    public static void main(String[] args) {
        Human h1 = new Human("Bob",44);
        Human h2 = new Human("Top",24);
        h1.printNumberOfPeople();
        h2.printNumberOfPeople();
        Human h3 = new Human("Tee",22);
        h1.printNumberOfPeople();
        h2.printNumberOfPeople();
        h3.printNumberOfPeople();
    }
}

class Human{

    private String name;
    private int age;
    private static int countPeople = 0;


    public Human(String name, int age){
        System.out.println("Привет из третьего конструктора!");
        this.name = name;
        this.age = age;
        countPeople++;
    }
    public void printNumberOfPeople(){
        System.out.println("Number of people is "+countPeople);
    }
}

