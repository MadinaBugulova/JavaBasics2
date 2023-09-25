package Class12;

public class HM2Method {

    char getGrades (int score) {
         char grade;
        if (score >= 90) {
            return 'A';
        } else if (score >= 80) {
            return 'B';
        } else if (score >= 70) {
            return 'C';
        } else if (score >= 50) {
            return 'D';
        } else {
            return 'F';
        }


    }
}
