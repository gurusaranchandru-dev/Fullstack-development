package Pattern;

class Student {
    void study() {
        System.out.println("Student is studying");
    }
}

class CollegeStudent extends Student {
    void attendClass() {
        System.out.println("Attending college class");
    }
}

public class Singleinheritance {

    public static void main(String[] args) {

        CollegeStudent s = new CollegeStudent();

        s.study();
        s.attendClass();
    }
}