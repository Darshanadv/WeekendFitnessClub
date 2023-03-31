/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weekendfitnessclub;

import java.util.List;

/**
 *
 * @author Darshan
 */
public class Customer {

    private int cId;
    private String cusName;
    private List<BookedFitnessLesson> bookedFitnessLessonList;

    public Customer(int cId, String cusName, List<BookedFitnessLesson> bookedFitnessLessonsList) {
        this.cId = cId;
        this.cusName = cusName;
        this.bookedFitnessLessonList = bookedFitnessLessonsList;
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
}
