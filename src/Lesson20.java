public class Lesson20 {
    public static void main(String[] args) {
    Human human1 = new Human();
    }
}

class Human{

    private String name;
    private int age;

    public Human(){
        this.name = "имя по умолчанию";
        this.age = 0;
    }

    public Human(String name){
        System.out.println("привет из второго конструктора!");
        this.name = name;
    }

    public Human(String name, int age){
        System.out.println("Привет из третьего конструктора!");
        this.name = name;
        this.age = age;
    }

    public void setName (String name) { this.name = name; }

    public void setAge (int age) { this.age = age; }
}
