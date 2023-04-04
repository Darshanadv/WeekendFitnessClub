/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weekendfitnessclub;

import java.text.SimpleDateFormat;

/**
 *
 * @author Darshan
 */
public class Report2 {

    private FitnessLessonAvailable fitnessLessAva;
    private int totalIncome;
    SimpleDateFormat dateFormat;

    public Report2(FitnessLessonAvailable fitnessLessAva, int totalIncome) {
        this.fitnessLessAva = fitnessLessAva;
        this.totalIncome = totalIncome;
        this.dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    }

    public void addTotalIncome(int income) {
        this.totalIncome += income;
    }

    public int getTotalIncome() {
        return totalIncome;
    }

    public FitnessLessonAvailable getFitnessLessAva() {
        return fitnessLessAva;
    }

    public void printReport(int counter) {
        System.out.println(counter + ". ");
        System.out.println("Fitness Name: " + getFitnessLessAva().getFitLes().getFitnessName());
        System.out.println("Fitness Price: £" + getFitnessLessAva().getFitLes().getPrice() + "/hour");
        System.out.println("Total Income: " + getTotalIncome());
        System.out.println("");
    }

}
