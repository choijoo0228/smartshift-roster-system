package com.smartshift.rosterenigne;

import java.time.Duration;
import java.time.LocalTime;
import java.util.List;

public class WeeklyHoursCalculator {

    public double calculateTotalHours(List<LocalTime[]> shifts) {
        double totalHours = 0;

        for (LocalTime[] shift : shifts) {
            totalHours += Duration.between(shift[0], shift[1]).toHours();
        }

        return totalHours;
    }

    public boolean exceedsWeeklyLimit(List<LocalTime[]> shifts, double maxHours) {
        return calculateTotalHours(shifts) > maxHours;
    }
}