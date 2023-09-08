import java.util.Scanner;

class Result {
    int[][] marks; // 2D array to store marks of 3 students in 3 subjects
    int[] totalMarks; // 1D array to store total marks obtained by each student

    public Result(int numStudents, int numSubjects) {
        marks = new int[numStudents][numSubjects];
        totalMarks = new int[numStudents];
    }

    public void inputMarks() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");
            for (int j = 0; j < marks[i].length; j++) {
                System.out.print("Subject " + (j + 1) + ": ");
                marks[i][j] = scanner.nextInt();
            }
        }
    }

    public void calculateTotalMarks() {
        for (int i = 0; i < marks.length; i++) {
            int total = 0;
            for (int j = 0; j < marks[i].length; j++) {
                total += marks[i][j];
            }
            totalMarks[i] = total;
        }
    }

    public void findHighestMarksInSubjects() {
        int[] highestMarks = new int[marks[0].length];
        int[] rollNumbers = new int[marks[0].length];

        for (int subject = 0; subject < marks[0].length; subject++) {
            int highest = Integer.MIN_VALUE;
            int studentRoll = -1;

            for (int student = 0; student < marks.length; student++) {
                if (marks[student][subject] > highest) {
                    highest = marks[student][subject];
                    studentRoll = student + 1;
                }
            }

            highestMarks[subject] = highest;
            rollNumbers[subject] = studentRoll;
            System.out.println(
                    "Subject " + (subject + 1) + ": Highest Marks = " + highest + ", Roll Number = " + studentRoll);
        }
    }

    public void findStudentWithHighestTotalMarks() {
        int highestTotal = Integer.MIN_VALUE;
        int studentRoll = -1;

        for (int i = 0; i < totalMarks.length; i++) {
            if (totalMarks[i] > highestTotal) {
                highestTotal = totalMarks[i];
                studentRoll = i + 1;
            }
        }

        System.out.println("Student with the Highest Total Marks: Roll Number = " + studentRoll + ", Total Marks = "
                + highestTotal);
    }
}

class FinalResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        Result result = new Result(numStudents, numSubjects);

        result.inputMarks();
        result.calculateTotalMarks();

        System.out.println("\nHighest Marks in Each Subject:");
        result.findHighestMarksInSubjects();

        result.findStudentWithHighestTotalMarks();
    }
}
