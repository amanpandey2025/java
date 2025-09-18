package OPPS.encapsulation;

public class Main {
    public static void main(String[] args) {
        Students students = new Students();
        students.setName("Aman Pandey");
        students.setAge(22);
        System.out.println("Name :"+students.getName());
        System.out.println("Age :"+students.getAge());
    }
}
