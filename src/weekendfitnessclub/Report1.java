/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weekendfitnessclub;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Darshan
 */
public class Report1 {

    private int noOfCustomer;
    private FitnessLessonAvailable fitnessLessAva;
    private Date dateOfAvailable;
    private List<Review> reviewList;
    SimpleDateFormat dateFormat;

    public Report1(int noOfCustomer, FitnessLessonAvailable fitnessLessAva, Date dateOfAvailable, List<Review> reviewList) {
        this.noOfCustomer = noOfCustomer;
        this.fitnessLessAva = fitnessLessAva;
        this.dateOfAvailable = dateOfAvailable;
        this.reviewList = reviewList;
        this.dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    }

    public void addCustomer() {
        this.noOfCustomer += 1;
    }

    public void setReviewList(List<Review> reviewList) {
        this.reviewList = reviewList;
    }

    public void addReviewInList(Review review) {
        this.reviewList.add(review);
    }

    public void setFitnessLessAva(FitnessLessonAvailable fitnessLessAva) {
        this.fitnessLessAva = fitnessLessAva;
    }

    public void setDateOfAvailable(Date dateOfAvailable) {
        this.dateOfAvailable = dateOfAvailable;
    }

    public List<Review> getReviewList() {
        return reviewList;
    }

    public Date getDateOfAvailable() {
        return dateOfAvailable;
    }

    public FitnessLessonAvailable getFitnessLessAva() {
        return fitnessLessAva;
    }

    public int getNoOfCustomer() {
        return noOfCustomer;
    }

    public void printReport(int counter) {
        System.out.print(counter + ". ");
        System.out.println("Fitness Date: " + dateFormat.format(getDateOfAvailable()));
        System.out.println("Fitness Name: " + getFitnessLessAva().getFitLes().getFitnessName());
        System.out.println("Average Rating: " + String.format("%.2f", calAverageRating()));
        System.out.println("Total Customer: " + getNoOfCustomer());
        System.out.println("");
    }

    private float calAverageRating() {
        int counter = 0;
        int totalReview = 0;
        float finalAns;
        for (Review r : getReviewList()) {
            totalReview = totalReview + r.getrId();
            counter += 1;
        }

        return totalReview / counter;
    }
}
