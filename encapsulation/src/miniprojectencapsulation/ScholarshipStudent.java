package miniprojectencapsulation;
public class ScholarshipStudent {
    private int studentId;
    private String name;
    private int[] marks;
    private double familyIncome;
    private double scholarshipAmount;


    public ScholarshipStudent(int studentId, String name, int[] marks, double familyIncome) {




        this.studentId = studentId;
        this.name = name;
        boolean validMarks = marks != null && marks.length > 0;

        if (validMarks) {
            for (int i = 0; i < marks.length; i++) {
                if (marks[i] < 0 || marks[i] > 100) {
                    validMarks = false;
                    break;
                }
            }
        }

        if (validMarks) {
            this.marks = new int[marks.length];

            for (int i = 0; i < marks.length; i++) {
                this.marks[i] = marks[i];
            }
        } else {
            this.marks = new int[0];
            System.out.println("Invalid marks for " + name);
        }

        if (familyIncome >= 0) {
            this.familyIncome = familyIncome;
        } else {
            this.familyIncome = 0;
            System.out.println("Invalid family income for " + name);
        }

        this.scholarshipAmount = 0;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public int[] getMarks() {
        int[] copy = new int[marks.length];

        for (int i = 0; i < marks.length; i++) {
            copy[i] = marks[i];
        }

        return copy;
    }

    public double getFamilyIncome() {
        return familyIncome;
    }

    public double getScholarshipAmount() {
        return scholarshipAmount;
    }

    public void setFamilyIncome(double familyIncome) {
        if (familyIncome >= 0) {
            this.familyIncome = familyIncome;
        } else {
            System.out.println("Family income cannot be negative!");
        }
    }

    public double calculateAverage() {
        if (marks.length == 0) {
            return 0;
        }

        int total = 0;

        for (int i = 0; i < marks.length; i++) {
            total = total + marks[i];
        }

        return (double) total / marks.length;
    }

    public void calculateScholarship() {
        double average = calculateAverage();

        if (average >= 90 && familyIncome <= 200000) {
            scholarshipAmount = 50000;
        } else if (average >= 80 && familyIncome <= 300000) {
            scholarshipAmount = 30000;
        } else if (average >= 70 && familyIncome <= 200000) {
            scholarshipAmount = 15000;
        } else {
            scholarshipAmount = 0;
        }
    }

    public void displayDetails() {
        System.out.println("Student: " + name);
        System.out.println("Average: " + calculateAverage());
        System.out.println("Family Income: " + familyIncome);
        System.out.println("Scholarship: " + scholarshipAmount);
        System.out.println();
    }
}


