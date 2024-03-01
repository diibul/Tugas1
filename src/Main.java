import java.util.Scanner;

class LibrarySystem {
    public static Scanner scanner = new Scanner(System.in);
    public static String currentUser = "";

    public static void main(String[] args) {
        int choice;
        while (true) {
            System.out.println("===== Library System");
            System.out.println("1. Login as Student");
            System.out.println("2. Login as Admin");
            System.out.println("3. Exit");
            System.out.print("Choose option (1-3): ");
            choice = scanner.nextInt();

            if (choice == 1) {
                loginAsStudent();
            } else if (choice == 2) {
                loginAsAdmin();
            } else if (choice == 3) {
                System.out.println("Terima Kasih");
                break;
            } else {
                System.out.println("Invalid option, please choose again.");
            }
        }
    }

    private static void loginAsStudent() {
        System.out.print("Enter your NIM : ");
        String nim = scanner.next();

        if ("202310370311268".equals(nim)) {
            System.out.println("Successful Login as Student");
            currentUser = "Student (NIM: 202310370311268)";
        } else {
            System.out.println("User Not Found");
        }
    }

    private static void loginAsAdmin() {
        System.out.print("Enter your username (admin): ");
        String username = scanner.next();

        if ("admin".equals(username)) {
            System.out.print("Enter your password (admin): ");
            String password = scanner.next();

            if ("adm1n".equals(password)) {
                System.out.println("Successful Login as Admin");
                currentUser = "Admin (Username: admin)";
            } else {
                System.out.println("Admin User Not Found!!");
            }
        } else {
            System.out.println("Admin User Not Found!!");
        }
    }
}