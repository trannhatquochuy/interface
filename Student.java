package advance.dev;

public class Student extends Person {
	 // Thuộc tính của lớp Student
    private double mathScore;
    private double physicsScore;
    private double chemistryScore;
    private String studentID;
    private String className;

    // Constructor để tạo đối tượng Student với thông tin từ lớp Person và các thông tin mới của lớp Student
    public Student(String name, int age, String phoneNumber, double mathScore, double physicsScore, double chemistryScore, String studentID, String className) {
        super(name, age, phoneNumber);
        this.mathScore = mathScore;
        this.physicsScore = physicsScore;
        this.chemistryScore = chemistryScore;
        this.studentID = studentID;
        this.className = className;
    }

    // Phương thức tính điểm trung bình
    public double diemTrungBinh() {
        return (mathScore + physicsScore + chemistryScore) / 3.0;
    }

    // Phương thức toString() để trả về thông tin đầy đủ của đối tượng Student
    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", phoneNumber='" + getPhoneNumber() + '\'' +
                ", mathScore=" + mathScore +
                ", physicsScore=" + physicsScore +
                ", chemistryScore=" + chemistryScore +
                ", studentID='" + studentID + '\'' +
                ", className='" + className + '\'' +
                '}';
    }
}
