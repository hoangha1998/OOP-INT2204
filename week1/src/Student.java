
public class Student {

    private String name;
    private String id;
    private String group;
    private String email;

    public Student() {
        this("Student", "000","K62CB", "uet@vnu.edu.vn");
    }

    public Student(String name, String id, String email) {
        this(name, id, "K62CB", email);
    }

    public Student(String name, String id, String group, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.group = group;
    }

    public Student(Student student) {
        this(student.name, student.id, student.group, student.email);
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getGroup() {
        return group;
    }

    public String getEmail() {
        return email;
    }

    public String getInfo() {
        return String.format("%s - %s - %s - %s", name, id, group, email);
    }
}
 