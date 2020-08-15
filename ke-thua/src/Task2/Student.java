package Task2;

public class Student extends Person{

    private String program;
    private  int year;
    private double fee;

    public Student(String name, String address,String program, int year, double fee) {
        super(name, address);
        this.setProgram(program);
        this.setYear(year);
        this.setFee(fee);
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public String toString(){
        return  "Student[" +super.toString() + ",program=" + this.getProgram()+ ",year="+ this.getYear()+ ",fee="+ this.getFee()+ "]";
    }


    public static void main(String[] args){
        Person ps = new Person("Hoang Thai Ha","so 2 Pham Van Dong, Cau Giay, Ha Noi");
        Staff st = new Staff("Hoang Thuy Linh","So 16 Nguyen Hoang, Nam Tu Liem, Ha Noi", "DHQG HN",15.9);
        Student stu = new Student("Le Quang Dats","177 Trung Kinh", "OOP",2020,18.60);
        System.out.println(ps.toString());
        System.out.println(st.toString());
        System.out.println(stu.toString());

    }

}
