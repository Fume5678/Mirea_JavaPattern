package Task1;

import java.util.Comparator;

public class GreaterStudentMark implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getMark(), o2.getMark());
    }
}
