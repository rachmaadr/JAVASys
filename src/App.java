public class App {
    public static void main(String[] args) {
        var person = new Person("Jhon doe", 30);
        person.name = "Andi";
        person.sayHello("allice");

        Person person2 = new Person("Robert");
        System.out.println(person2);

        Person person3;
        person3 = new Person();
        System.out.println(person3);
    }
}
