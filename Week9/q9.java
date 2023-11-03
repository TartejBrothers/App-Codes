public class q9 {
    public static void main(String[] args) {
        // Create a student Model
        Student student = new Student();
        student.setName("John");
        student.setRollNo(123);
        StudentView studentView = new StudentView();
        StudentController studentController = new StudentController(student, studentView);
        studentController.updateView();
        studentController.setStudentName("Alice");
        studentController.setStudentRollNo(456);
        studentController.updateView();
    }
}
class Student {
    private String name;
    private int rollNo;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
}

class StudentView {
    public void printStudentDetails(String studentName, int studentRollNo) {
        System.out.println("Student: ");
        System.out.println("Name: " + studentName);
        System.out.println("Roll No: " + studentRollNo);
    }
}

class StudentController {
    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }
    public void setStudentName(String name) {
        model.setName(name);
    }
    public String getStudentName() {
        return model.getName();
    }
    public void setStudentRollNo(int rollNo) {
        model.setRollNo(rollNo);
    }
    public int getStudentRollNo() {
        return model.getRollNo();
    }
    public void updateView() {
        view.printStudentDetails(model.getName(), model.getRollNo());
    }
}
