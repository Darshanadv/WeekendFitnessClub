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
public class FitnessLesson {

    private final int fId;
    private final String fitnessName;
    private final int price;

    public FitnessLesson(int fId, String fitnessName, int price) {
        this.fId = fId;
        this.fitnessName = fitnessName;
        this.price = price;
    }

    public int getfId() {
        return fId;
    }

    public String getFitnessName() {
        return fitnessName;
    }

    public int getPrice() {
        return price;
    }

}
