package Task1;

import java.util.Comparator;

public class main implements Comparator<Student>{
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getMark(), o2.getMark());
    }

    /*
    @FunctionalInterface
    public interface Comparator<S1, S2> {
        int compare(Student S1, Student S2);
    }
    */
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        student1.setMark(2);
        student1.setMark(1);
        GreaterStudentMark comp = new GreaterStudentMark();

        System.out.println(comp.compare(student1, student2));
    }
}
