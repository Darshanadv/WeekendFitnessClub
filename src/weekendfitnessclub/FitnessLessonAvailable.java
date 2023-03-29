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
public class FitnessLessonAvailable {

    private int flaId;
    private FitnessLesson fitLes;
    private Date dateOfAvailable;
    private boolean isBooked;

    public FitnessLessonAvailable(int flaId, FitnessLesson fitLes, Date dateOfAvailable, boolean isBooked) {
        this.flaId = flaId;
        this.fitLes = fitLes;
        this.dateOfAvailable = dateOfAvailable;
        this.isBooked = isBooked;
    }

    public int getFlaId() {
        return flaId;
    }

    public FitnessLesson getFitLes() {
        return fitLes;
    }

    public Date getDateOfAvailable() {
        return dateOfAvailable;
    }

    public void setIsBooked(boolean isBooked) {
        this.isBooked = isBooked;
    }

    public boolean isIsBooked() {
        return isBooked;
    }
}
