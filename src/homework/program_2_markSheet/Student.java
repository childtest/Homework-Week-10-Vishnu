package homework.program_2_markSheet;

public class Student {

    private String name;
    private int rollNo;
    private int mathMarks, scienceMarks, englishMarks;
    private int totalMarks;
    private double percentage;
    private String result;
    private String grade;

    // Constructor for Set student details
    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    // Method for set marks
    public void setMarks(int math, int science, int english) {
        this.mathMarks = math;
        this.scienceMarks = science;
        this.englishMarks = english;
    }

  /*  private int validateMark(int mark, String subject) {
        if (mark < 0 || mark > 100) {
            throw new IllegalArgumentException("Invalid Input for " + subject + " marks. Marks should be between 0 to 100.");
        }
        return mark;
    }*/

    // Method to calculate total marks, percentage, result, and grade
    public void calculateResults() {
        this.totalMarks = mathMarks + scienceMarks + englishMarks;
        this.percentage = totalMarks / 3.0;
        this.result = (percentage >= 35) ? "Pass" : "Fail";
        this.grade = determineGrade();
    }

    //  method to set grade
    private String determineGrade() {
        if (percentage >= 80) return "A+";
        if (percentage >= 60) return "A";
        if (percentage >= 50) return "B";
        if (percentage >= 35) return "C";
        return "F";
    }

    // Method to print the mark sheet
    public void printMarkSheet() {
        System.out.println(" _______________________________ ");
        System.out.println("|                               |");
        System.out.println("|           Mark Sheet          |");
        System.out.println("|_______________________________|");
        System.out.printf("| Name     : %-18s|\n", name);
        System.out.printf("| Roll No  : %-18d|\n", rollNo);
        System.out.println("|_______________________________|");
        System.out.println("| Subjects : Marks              |");
        System.out.println("|_______________________________|");
        System.out.printf("| Math     : %-18d|\n", mathMarks);
        System.out.printf("| Science  : %-18d|\n", scienceMarks);
        System.out.printf("| English  : %-18d|\n", englishMarks);
        System.out.println("|_______________________________|");
        System.out.printf("| Total    : %-18d|\n", totalMarks);
        System.out.println("|_______________________________|");
        System.out.printf("| Percentage : %-15.1f|\n", percentage);
        System.out.printf("| Result     : %-15s|\n", result);
        System.out.printf("| Grade      : %-15s|\n", grade);
        System.out.println("|_______________________________|");
    }
}
