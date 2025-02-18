package Student;

public class Studentdemo {
    private int regno;
    private String name;
    private String section;
    private String dept;

    // Constructor to initialize the student object
    public Studentdemo(String name, String dept, String section, int regno) {
        this.name = name;
        this.dept = dept;
        this.regno = regno;
        this.section = section;
    }

    // Getter methods
    public int getRegno() {
        return regno;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public String getSection() {
        return section;
    }

    @Override
    public String toString() {
        return String.format("%-20s%-15s%-15s%-15s", name, dept, regno, section);
    }
}
