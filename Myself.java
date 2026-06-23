public class Myself {
    public static void main(String[] args) {
        //String(References type, but essential for text)
        String fullName = "Attakpah David Kofi";
        String studentId = "o4-2024-2396d";
        String program = "Computer Science & Networking Management";

        //Integer types
        byte currentSemesterCourses = 7;
        int age = 21;
        long registrationNumber = 9876543210l;
        short currentSemesterCredits = 18;

        //floating-point types
        float gpa = 3.82f;
        double libraryFees = 150.50;

        //Character & Boolean types
        char middleInitial = 'D';
        boolean isIsocOrganizer = true;

        //Displaying information using printf
        System.out.printf("==================================%n");
        System.out.printf("        STUDENT INFORMATION       %n");
        System.out.printf("==================================%n");
        System.out.printf("Full Name:         %s%n", fullName);
        System.out.printf("Middle Initial: %c%n", middleInitial);
        System.out.printf("Student ID: %s%n", studentId);
        System.out.printf("Reg Number (long): %d%n", registrationNumber);
        System.out.printf("Program: %s%n", program);
        System.out.printf("Age: %d years%n", age);
        System.out.printf("Courses (byte): %d%n", currentSemesterCourses);
        System.out.printf("Semester Credits: %d%n", currentSemesterCredits);
        System.out.printf("Current GPA: %.2f%n", gpa);
        System.out.printf("Library Fees: GHS %.2f%n", libraryFees);
        System.out.printf("Is Organizer? %b%n", isIsocOrganizer);
        System.out.printf("====================================");



    }
}
