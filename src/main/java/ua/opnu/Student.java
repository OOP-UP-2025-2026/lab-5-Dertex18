public class Student extends Person {
    private String group;
    private String studentId;

    public Student(String lastName, String firstName, int age, String group, String studentId) {
        super(lastName, firstName, age); // Виклик конструктора батьківського класу
        this.group = group;
        this.studentId = studentId;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Студент групи " + group + ", " + getLastName() + " " + getFirstName() +
                ", вік: " + getAge() + ". Номер студентського квитка: " + studentId;
    }
}