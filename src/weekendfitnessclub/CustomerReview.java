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
public class CustomerReview {

    private Customer cus;
    private FitnessLesson fitLes;
    private Review review;
    private Date dateOfReview;

    public CustomerReview(Customer cus, FitnessLesson fitLes, Review review, Date dateOfReview) {
        this.cus = cus;
        this.fitLes = fitLes;
        this.review = review;
        this.dateOfReview = dateOfReview;
    }

    public Customer getCus() {
        return cus;
    }

    public FitnessLesson getFitLes() {
        return fitLes;
    }

    public Review getReview() {
        return review;
    }

    public Date getDateOfReview() {
        return dateOfReview;
    }
}
