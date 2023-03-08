public class GradeGenerator {

    public String generateStudentGrade(Integer marks) {
        if (marks > 100 || marks < 0) {
            throw new IllegalArgumentException("Marks cannot be a negative number or higher than 100!");
        } else {
            if (marks > 90) {
                return "A+";
            } else if (marks >= 75) {
                return "A";
            } else if (marks >= 65) {
                return "B";
            } else if (marks >= 55) {
                return "C";
            } else if (marks >= 35) {
                return "S";
            } else if (marks >= 20) {
                return "F";
            } else {
                return "W";
            }
        }

    }

}
