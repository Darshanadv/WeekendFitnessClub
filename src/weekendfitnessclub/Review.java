/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weekendfitnessclub;

/**
 *
 * @author Darshan
 */
public class Review {

    private final int rId;
    private final String reviewName;

    public Review(int rId, String reviewName) {
        this.rId = rId;
        this.reviewName = reviewName;
    }

    public int getrId() {
        return rId;
    }

    public String getReviewName() {
        return reviewName;
    }
}
