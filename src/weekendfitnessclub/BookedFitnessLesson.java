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
public class BookedFitnessLesson implements Comparable<BookedFitnessLesson>{

    private int bId;
    private FitnessLessonAvailable fla;
    private Date bookedDate;
    private boolean isCompleted;

    public BookedFitnessLesson(int bId, FitnessLessonAvailable fla, Date bookedDate, boolean isCompleted) {
        this.bId = bId;
        this.fla = fla;
        this.bookedDate = bookedDate;
        this.isCompleted = isCompleted;
    }
    
    /**
     * Returns an Integer within collection to get the max Id
     *
     * @param p Patient object use for get id
     */
    @Override
    public int compareTo(BookedFitnessLesson bFL) {
        if (this.getbId()> bFL.getbId()) {
            return 1;
        } else if (this.getbId()< bFL.getbId()) {
            return -1;
        }
        return 0;
    }

    public int getbId() {
        return bId;
    }

    public FitnessLessonAvailable getFla() {
        return fla;
    }

    public Date getBookedDate() {
        return bookedDate;
    }

    public void setIsCompleted(boolean isCompleted) {
        this.isCompleted = isCompleted;
    }

    public boolean isIsCompleted() {
        return isCompleted;
    }
}
