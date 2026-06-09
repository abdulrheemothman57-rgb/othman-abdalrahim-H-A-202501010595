class Student {
    String name;
    int age;
    double gpa;

    Student(String studentName, int studentAge, double studentGpa) {
        name = studentName;
        age = studentAge;
        gpa = studentGpa;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
    }

    public void study() {
        gpa += 0.1;
        System.out.println(name + " studied. GPA increased.");
    }
}
