/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weekendfitnessclub;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Darshan
 */
public class Customer {

    private final int cId;
    private final String cusName;
    private List<BookedFitnessLesson> bookedFitnessLessonList;

    public Customer(int cId, String cusName) {
        this.cId = cId;
        this.cusName = cusName;
        this.bookedFitnessLessonList = new ArrayList<>();
    }

    public int getcId() {
        return cId;
    }

    public String getCusName() {
        return cusName;
    }

    public boolean addBookedFitnessLessonsList(BookedFitnessLesson bfl) {
        bookedFitnessLessonList.add(bfl);
        return true;
    }

    public void setBookedFitnessLessonList(List<BookedFitnessLesson> bookedFitLessList) {
        this.bookedFitnessLessonList = bookedFitLessList;
    }

    public List<BookedFitnessLesson> getBookedFitnessLessonList() {
        return bookedFitnessLessonList;
    }

    public boolean onConfirmBookingById(int id) {
        boolean isFound = false;
        for (BookedFitnessLesson bfl : bookedFitnessLessonList) {
            if (bfl.getbId() == id) {
                bfl.setIsCompleted(true);
                bookedFitnessLessonList.set(bookedFitnessLessonList.indexOf(bfl), bfl);
                isFound = true;
            }
        }

        return isFound;
    }

    public boolean isAnyBookingFound() {
        return getBookedFitnessLessonList().stream().anyMatch(obj -> !obj.isCompleted());
    }

    public List<BookedFitnessLesson> getIncompleteBookedFitenssLessonList() {
        return getBookedFitnessLessonList().stream().filter(bookedFitLess -> !bookedFitLess.isCompleted()).collect(Collectors.toList());
    }
}
