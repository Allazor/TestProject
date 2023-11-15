package helper;

import java.time.LocalDate;
import java.time.Period;

public class AgeCalculator {

    public boolean isAdult(LocalDate dateOfBirth) {
        LocalDate currentDate = LocalDate.now();
        Period age = Period.between(dateOfBirth, currentDate);
        return age.getYears() >= 18;
    }


}

