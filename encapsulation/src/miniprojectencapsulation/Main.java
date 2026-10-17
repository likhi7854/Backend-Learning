package miniprojectencapsulation;

public class Main {
    public static void main(String[] args) {

        ScholarshipStudent[] students = {
                new ScholarshipStudent(
                        101, "Ananya", new int[]{95, 90, 91}, 180000
                ),
                new ScholarshipStudent(
                        102, "Likhitha", new int[]{85, 80, 90}, 250000
                ),
                new ScholarshipStudent(
                        103, "Kavya", new int[]{60, 65, 70}, 150000
                )
        };

        for (int i = 0; i < students.length; i++) {
            students[i].calculateScholarship();
        }

        System.out.println("--- Scholarship Report ---");
        System.out.println();

        for (int i = 0; i < students.length; i++) {
            students[i].displayDetails();
        }

        int highestIndex = 0;

        for (int i = 1; i < students.length; i++) {
            if (students[i].getScholarshipAmount()
                    > students[highestIndex].getScholarshipAmount()) {
                highestIndex = i;
            }
        }

        System.out.println("Highest Scholarship:");
        System.out.println("Student: " + students[highestIndex].getName());

        System.out.println("Amount: " + students[highestIndex].getScholarshipAmount());

    }
}