package advance.dev;

public class Person {
	// Thuộc tính của lớp Person
    private String name;
    private int age;
    private String phoneNumber;

    // Constructor để tạo đối tượng Person với thông tin tên, tuổi và số điện thoại
    public Person(String name, int age, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    // Các phương thức getter và setter để truy cập và thiết lập thông tin của đối tượng Person
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Phương thức toString() để trả về thông tin đầy đủ của đối tượng Person
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
 }
}
