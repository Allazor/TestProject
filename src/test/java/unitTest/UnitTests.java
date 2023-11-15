package unitTest;

import helper.AgeCalculator;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.LocalDate;

import static org.testng.Assert.*;


public class UnitTests {
    AgeCalculator ageCalculator = new AgeCalculator();


    @Test(dataProvider = "data", groups = "UnitTest")
    public void testIsAdult(LocalDate dateOfBirth, boolean b) {
        assertEquals(ageCalculator.isAdult(dateOfBirth), b,
                dateOfBirth + " is not adult \n");
    }

    @DataProvider(name = "data")
    public Object[][] dateOfBirth() {
        return new Object[][]{
                {LocalDate.of(2000, 9, 12), true},
                {LocalDate.of(2005, 11, 14), false},
                {LocalDate.of(2005, 11, 15), true},
                {LocalDate.of(2005, 11, 16), false},
                {LocalDate.of(2020, 9, 12), false},
        };
    }


}
