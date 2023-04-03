import java.util.Objects;
import java.util.stream.Stream;

public class Emploee {
    boolean isPayedPerHours;
    int age;
    String department;
    String name;
    public Emploee(String name, int age,String department,boolean isPayedPerHours){
        this.age=age;
        this.name=name;
        this.department=department;
        this.isPayedPerHours=isPayedPerHours;
    }
    public boolean isPayedPerHours(){
        return isPayedPerHours;
    }

    public void setPayedPerHours(boolean payedPerHours) {

        isPayedPerHours = payedPerHours;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public String getDepartment() {

        return department;
    }

    public void setDepartment(String department) {

        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Emploee{" + ", name='" + name +'\'' +
                "isPayedPerHours=" + isPayedPerHours +
                ", age=" + age +
                ", department='" + department + '\'' +

                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Emploee emploee = (Emploee) o;
        return isPayedPerHours == emploee.isPayedPerHours && age == emploee.age ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age);
    }
    public boolean conduceTrainig(){
        return department.equals("Softwar") && age >= 18;
    }
    public boolean conduceInterviuri(){
        return department.equals("Softwar") || department.equals("Manager");
    }

}