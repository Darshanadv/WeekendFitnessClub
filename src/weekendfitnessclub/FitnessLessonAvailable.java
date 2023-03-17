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

    public FitnessLessonAvailable(int flaId, FitnessLesson fitLes, Date dateOfAvailable) {
        this.flaId = flaId;
        this.fitLes = fitLes;
        this.dateOfAvailable = dateOfAvailable;
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

}
