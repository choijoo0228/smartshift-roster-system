package com.smartshift.smartshift_backend.service;

import com.smartshift.smartshift_backend.entity.Shift;

import java.time.LocalDate;
import java.util.List;

public interface ShiftService {

    List<Shift> getAllShifts();

    Shift getShiftById(Long id);

    Shift createShift(Shift shift);

    Shift updateShift(Long id, Shift shift);

    void deleteShift(Long id);

    List<Shift> getShiftsByDate(LocalDate shiftDate);

    List<Shift> getShiftsForWeek(LocalDate start, LocalDate end);
}