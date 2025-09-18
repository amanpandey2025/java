package OPPS.compileTimePolymorphism;

public class main {
    public static void main(String[] args) {
        student student = new student();
        student.name = "aman";
        student.lastname = "pandey";
        System.out.println(student.name);
        System.out.println(student.lastname);


    }


    static class student {
        String name;
        String lastname;

        public void printInfo(String name){
            System.out.println(name);
        }

        public  void printInfoLastName(String lastname){
            System.out.println(lastname);
        }
    }

}
