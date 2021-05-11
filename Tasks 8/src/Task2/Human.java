package Task2;

import java.time.LocalDate;

public class Human {
    private int age;
    private String fName;
    private String lName;
    private LocalDate birthDay;
    private int weight;

    public Human(String fName, String lName, int age) {
        this.age = age;
        this.fName = fName;
        this.lName = lName;
        birthDay = LocalDate.of(1,1,1);
        weight = 0;
    }

    @Override
    public String toString() {
        return  "\nName = " + fName +
                " Last Name = " + lName +
                " Age = " + age +
                " Weight = " + weight +
                " bDay " + birthDay.toString();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
