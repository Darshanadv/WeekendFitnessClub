/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weekendfitnessclub;

import java.util.Date;

/**
 *
 * @author Darshan
 */
public class BookedFitnessLesson {

    private FitnessLessonAvailable fla;
    private Customer cus;
    private Date bookedDate;
    private boolean isCompleted;

    public BookedFitnessLesson(FitnessLessonAvailable fla, Customer cus, Date bookedDate, boolean isCompleted) {
        this.fla = fla;
        this.cus = cus;
        this.bookedDate = bookedDate;
        this.isCompleted = isCompleted;
    }

    public FitnessLessonAvailable getFla() {
        return fla;
    }

    public Customer getCus() {
        return cus;
    }

    public Date getBookedDate() {
        return bookedDate;
    }

    public boolean isIsCompleted() {
        return isCompleted;
    }
}
