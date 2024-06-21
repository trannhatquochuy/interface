package advance.dev;

public class Teacher extends Person {
	 // Thuộc tính của lớp Teacher
    private String teacherID;
    private double salaryCoefficient;

    // Constructor để tạo đối tượng Teacher với thông tin từ lớp Person và các thông tin mới của lớp Teacher
    public Teacher(String name, int age, String phoneNumber, String teacherID, double salaryCoefficient) {
        super(name, age, phoneNumber);
        this.teacherID = teacherID;
        this.salaryCoefficient = salaryCoefficient;
    }

    // Phương thức tính lương
    public double tinhLuong() {
        // Giả sử mức lương cơ bản là 10 triệu đồng
        double basicSalary = 10000000;
        return basicSalary * salaryCoefficient;
    }

    // Phương thức toString() để trả về thông tin đầy đủ của đối tượng Teacher
    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", phoneNumber='" + getPhoneNumber() + '\'' +
                ", teacherID='" + teacherID + '\'' +
                ", salaryCoefficient=" + salaryCoefficient +
                '}';
    }
}
