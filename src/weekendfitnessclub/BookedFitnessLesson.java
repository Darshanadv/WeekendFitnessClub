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

    private final int bId;
    private FitnessLessonAvailable fla;
    private final Date bookedDate;
    private Review review;
    private boolean completed;

    public BookedFitnessLesson(int bId, FitnessLessonAvailable fla, Date bookedDate, boolean completed) {
        this.bId = bId;
        this.fla = fla;
        this.bookedDate = bookedDate;
        this.completed = completed;
    }
    
    /**
     * Returns an Integer within collection to get the max Id
     *
     * @param bFL BookedFitnessLesson object use for get id
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

    public void setIsCompleted(boolean completed) {
        this.completed = completed;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setReview(Review review) {
        this.review = review;
    }

    public Review getReview() {
        return review;
    }
    
    
}
