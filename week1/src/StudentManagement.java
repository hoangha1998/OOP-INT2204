
public class StudentManagement {
    private static final int MAX_STUDENT_LENGTH = 100;
    private Student students[] = new Student[MAX_STUDENT_LENGTH];
    private int studentLength = 0;

    public static boolean sameGroup(Student s1, Student s2) {
        return s1.getGroup().equals(s2.getGroup());
    }

    public static void main(String[] args) {
        StudentManagement sm = new StudentManagement();
        sm.addStudent(new Student("Nguyen Van An", "17020001", "K62CC", "17020001@vnu.edu.vn"));
        sm.addStudent(new Student("Nguyen Van B", "17020002", "K62CC", "17020002@vnu.edu.vn"));
        sm.addStudent(new Student("Nguyen Van C", "17020003", "K62CB", "17020003@vnu.edu.vn"));
        sm.addStudent(new Student("Nguyen Van D", "17020004", "K62CB", "17020004@vnu.edu.vn"));
        System.out.println(sm.studentsByGroup());
    }

    public void addStudent(Student newStudent) {
        if (newStudent == null) return;
        students[studentLength++] = newStudent;
    }

    public void removeStudent(String id) {
        //tim sinh vien
        int index = -1;
        for (int i = 0; i < studentLength; i++) {
            if (students[i].getId().equals(id)) {
                index = i;
                break;
            }
        }
        // xoa
        if (index >= 0) {
            for (int i = index + 1; i < studentLength; i++) {
                students[i - 1] = students[i];
            }
        }
    }

    public String studentsByGroup() {
        StringBuilder sb = new StringBuilder();
        boolean addedGroup[] = new boolean[MAX_STUDENT_LENGTH];

        for (int i = 0; i < studentLength; i++) {
            if (addedGroup[i]) continue;
            String group = students[i].getGroup();
            sb.append(group);
            sb.append("\n");

            for (int j = 0; j < studentLength; j++) {
                if (addedGroup[j] || !sameGroup(students[i], students[j])) continue;
                addedGroup[j] = true;
                sb.append(students[j].getInfo());
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
 