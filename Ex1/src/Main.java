import java.util.List;
import java.util.Scanner;
import java.util.concurrent.CompletableFuture;


public class Main {
    static StudentManager<Student> studentList = new StudentManager<>();
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n===== QUẢN LÝ SINH VIÊN =====");
            System.out.println("1. Thêm sinh viên mới");
            System.out.println("2. Hiển thị danh sách sinh viên");
            System.out.println("0. Thoát chương trình");
            System.out.print("Nhập lựa chọn của bạn: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    displayStudents();
                    break;
                case 0:
                    System.out.println("Đã thoát chương trình. Hẹn gặp lại!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng nhập lại!");
            }
        } while (choice != 0);

    }

    static void addStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập MSSV: ");
        String mssv = sc.nextLine();
        System.out.print("Nhập Tên: ");
        String name = sc.nextLine();
        System.out.print("Nhập điểm GPA: ");
        double gpa = sc.nextDouble();
        sc.nextLine();

        Student newStudent = new Student(mssv, name, gpa);
        studentList.add(newStudent);
        System.out.println("-> Thêm sinh viên thành công!");
    }

    static void displayStudents(){
        System.out.println("--- Danh sách sinh viên ---");
        studentList.getAll();
    }

    
}