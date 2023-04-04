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
    private int seatAvailable;

    public FitnessLessonAvailable(int flaId, FitnessLesson fitLes, Date dateOfAvailable, int seatAvailable) {
        this.flaId = flaId;
        this.fitLes = fitLes;
        this.dateOfAvailable = dateOfAvailable;
        this.seatAvailable = seatAvailable;
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

    public int getSeatAvailable() {
        return seatAvailable;
    }

    public void removeOneSeatAvailable() {
        seatAvailable -= 1;
        if (seatAvailable < 0) {
            seatAvailable = 0;
        }
    }

    public void addOneSeatAvailable() {
        seatAvailable += 1;
    }
}
