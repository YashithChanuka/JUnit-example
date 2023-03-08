import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GradeGeneratorTest {

    GradeGenerator gradeGenerator = new GradeGenerator();

    // if mark is 0, it should return grade "W"
    @Test
    void ZeroShouldReturnW() {
        assertEquals("W", gradeGenerator.generateStudentGrade(0));
    }

    // if mark is 10, it should return grade "W"
    @Test
    void TenShouldReturnW() {
        assertEquals("W", gradeGenerator.generateStudentGrade(10));
    }

    // if mark is 19, it should return grade "W"
    @Test
    void NineteenShouldReturnW() {
        assertEquals("W", gradeGenerator.generateStudentGrade(19));
    }

    // if mark is 20, it should return grade "F"
    @Test
    void TwentyShouldReturnF() {
        assertEquals("F", gradeGenerator.generateStudentGrade(20));
    }

    // if mark is 30, it should return grade "F"
    @Test
    void ThirtyShouldReturnF() {
        assertEquals("F", gradeGenerator.generateStudentGrade(30));
    }

    // if mark is 34, it should return grade "F"
    @Test
    void ThirtyFourShouldReturnF() {
        assertEquals("F", gradeGenerator.generateStudentGrade(34));
    }

    // if mark is 35, it should return grade "S"
    @Test
    void ThirtyFiveShouldReturnS() {
        assertEquals("S", gradeGenerator.generateStudentGrade(35));
    }

    // if mark is 50, it should return grade "S"
    @Test
    void FiftyShouldReturnS() {
        assertEquals("S", gradeGenerator.generateStudentGrade(50));
    }

    // if mark is 54, it should return grade "S"
    @Test
    void FiftyFourShouldReturnS() {
        assertEquals("S", gradeGenerator.generateStudentGrade(54));
    }

    // if mark is 55, it should return grade "C"
    @Test
    void FiftyFiveShouldReturnC() {
        assertEquals("C", gradeGenerator.generateStudentGrade(55));
    }

    // if mark is 60, it should return grade "C"
    @Test
    void SixtyShouldReturnC() {
        assertEquals("C", gradeGenerator.generateStudentGrade(60));
    }

    // if mark is 64, it should return grade "C"
    @Test
    void SixtyFourShouldReturnC() {
        assertEquals("C", gradeGenerator.generateStudentGrade(64));
    }

    // if mark is 65, it should return grade "B"
    @Test
    void SixtyFiveShouldReturnB() {
        assertEquals("B", gradeGenerator.generateStudentGrade(65));
    }

    // if mark is 74, it should return grade "B"
    @Test
    void SeventyFourShouldReturnB() {
        assertEquals("B", gradeGenerator.generateStudentGrade(74));
    }

    // if mark is 75, it should return grade "A"
    @Test
    void SeventyFiveShouldReturnA() {
        assertEquals("A", gradeGenerator.generateStudentGrade(75));
    }

    // if mark is 85, it should return grade "A"
    @Test
    void EightyFiveShouldReturnA() {
        assertEquals("A", gradeGenerator.generateStudentGrade(85));
    }

    // if mark is 90, it should return grade "A"
    @Test
    void NinetyShouldReturnA() {
        assertEquals("A", gradeGenerator.generateStudentGrade(90));
    }

    // if mark is 95, it should return grade "A+"
    @Test
    void NinetyFiveShouldReturnAPlus() {
        assertEquals("A+", gradeGenerator.generateStudentGrade(95));
    }

    // if mark is 100, it should return grade "A+"
    @Test
    void HundredShouldReturnAPlus() {
        assertEquals("A+", gradeGenerator.generateStudentGrade(100));
    }

    // if mark is -10, it should return grade "IllegalArgumentException"
    @Test
    void NegativeMarkShouldReturnIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> {
            gradeGenerator.generateStudentGrade(-10);
        });
    }

    // if mark is 110, it should return grade "IllegalArgumentException"
    @Test
    void HundredTenShouldReturnIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> {
            gradeGenerator.generateStudentGrade(110);
        });
    }

}