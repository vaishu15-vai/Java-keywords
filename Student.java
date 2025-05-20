// Student class definition
class Student {
    String name;
    int age;

    // I) Initialization using reference variable
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // II) Initialization using method
    void setDetails(String n, int a) {
        name = n;
        age = a;
    }

    // III) Constructor initialization
    Student(String n, int a) {
        name = n;
        age = a;
    }
}
