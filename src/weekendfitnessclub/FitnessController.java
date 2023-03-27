/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weekendfitnessclub;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Darshan
 */
public class FitnessController {

    // create intialize varibale and data
    private final List<Customer> CusList;
    private final List<FitnessLesson> FitLessList;
    private final List<FitnessLessonAvailable> FitLessAvailableList;
    private final List<Review> ReviewList;
    private Customer selectedCustomer;

    public FitnessController() {

        this.CusList = new ArrayList<>();
        this.FitLessList = new ArrayList<>();
        this.FitLessAvailableList = new ArrayList<>();
        this.ReviewList = new ArrayList<>();

        createCustomer(); // create 5 Customer
        createFitnessLesson(); //create 6 Fitness Lesson
        createFitnessLessonAvailable(); // create 8 weeends of timetable (32 lessons)
        createReviewList(); // create predefine review list

        // by default first customer will be selected
        selectedCustomer = this.CusList.get(0);
    }

    // create predefine data start
    private void createCustomer() {
        CusList.add(new Customer(1, "Darshan"));
        CusList.add(new Customer(2, "Maya"));
        CusList.add(new Customer(3, "Evie"));
        CusList.add(new Customer(4, "Srujal"));
        CusList.add(new Customer(5, "Kamal"));
    }

    private void createFitnessLesson() {
        FitLessList.add(new FitnessLesson(1, "Spin", 15));
        FitLessList.add(new FitnessLesson(2, "Yoga", 10));
        FitLessList.add(new FitnessLesson(3, "Bodysculpt", 12));
        FitLessList.add(new FitnessLesson(4, "Zumba", 16));
        FitLessList.add(new FitnessLesson(5, "Aquacise", 15));
        FitLessList.add(new FitnessLesson(6, "Box Fit", 10));
    }

    private void createFitnessLessonAvailable() {
        // 1st
        FitLessAvailableList.add(new FitnessLessonAvailable(1, FitLessList.get(0), new Date(2023, 5, 29)));
        FitLessAvailableList.add(new FitnessLessonAvailable(2, FitLessList.get(2), new Date(2023, 5, 29)));
        FitLessAvailableList.add(new FitnessLessonAvailable(3, FitLessList.get(1), new Date(2023, 5, 30)));
        FitLessAvailableList.add(new FitnessLessonAvailable(4, FitLessList.get(3), new Date(2023, 5, 30)));
        // 2nd
        FitLessAvailableList.add(new FitnessLessonAvailable(5, FitLessList.get(1), new Date(2023, 6, 6)));
        FitLessAvailableList.add(new FitnessLessonAvailable(6, FitLessList.get(4), new Date(2023, 6, 6)));
        FitLessAvailableList.add(new FitnessLessonAvailable(7, FitLessList.get(3), new Date(2023, 6, 7)));
        FitLessAvailableList.add(new FitnessLessonAvailable(8, FitLessList.get(2), new Date(2023, 6, 7)));
        // 3rd
        FitLessAvailableList.add(new FitnessLessonAvailable(9, FitLessList.get(5), new Date(2023, 6, 13)));
        FitLessAvailableList.add(new FitnessLessonAvailable(10, FitLessList.get(0), new Date(2023, 6, 13)));
        FitLessAvailableList.add(new FitnessLessonAvailable(11, FitLessList.get(1), new Date(2023, 6, 14)));
        FitLessAvailableList.add(new FitnessLessonAvailable(12, FitLessList.get(2), new Date(2023, 6, 14)));
        // 4th
        FitLessAvailableList.add(new FitnessLessonAvailable(13, FitLessList.get(4), new Date(2023, 6, 20)));
        FitLessAvailableList.add(new FitnessLessonAvailable(14, FitLessList.get(3), new Date(2023, 6, 20)));
        FitLessAvailableList.add(new FitnessLessonAvailable(15, FitLessList.get(2), new Date(2023, 6, 21)));
        FitLessAvailableList.add(new FitnessLessonAvailable(16, FitLessList.get(0), new Date(2023, 6, 21)));
        // 5th
        FitLessAvailableList.add(new FitnessLessonAvailable(17, FitLessList.get(3), new Date(2023, 6, 27)));
        FitLessAvailableList.add(new FitnessLessonAvailable(18, FitLessList.get(2), new Date(2023, 6, 27)));
        FitLessAvailableList.add(new FitnessLessonAvailable(19, FitLessList.get(4), new Date(2023, 6, 28)));
        FitLessAvailableList.add(new FitnessLessonAvailable(20, FitLessList.get(1), new Date(2023, 6, 28)));
        // 6th
        FitLessAvailableList.add(new FitnessLessonAvailable(21, FitLessList.get(2), new Date(2023, 7, 3)));
        FitLessAvailableList.add(new FitnessLessonAvailable(22, FitLessList.get(5), new Date(2023, 7, 3)));
        FitLessAvailableList.add(new FitnessLessonAvailable(23, FitLessList.get(1), new Date(2023, 7, 4)));
        FitLessAvailableList.add(new FitnessLessonAvailable(24, FitLessList.get(0), new Date(2023, 7, 4)));
        // 7th
        FitLessAvailableList.add(new FitnessLessonAvailable(25, FitLessList.get(0), new Date(2023, 7, 10)));
        FitLessAvailableList.add(new FitnessLessonAvailable(26, FitLessList.get(2), new Date(2023, 7, 10)));
        FitLessAvailableList.add(new FitnessLessonAvailable(27, FitLessList.get(3), new Date(2023, 7, 11)));
        FitLessAvailableList.add(new FitnessLessonAvailable(28, FitLessList.get(2), new Date(2023, 7, 11)));
        // 8th
        FitLessAvailableList.add(new FitnessLessonAvailable(29, FitLessList.get(5), new Date(2023, 7, 17)));
        FitLessAvailableList.add(new FitnessLessonAvailable(30, FitLessList.get(2), new Date(2023, 7, 17)));
        FitLessAvailableList.add(new FitnessLessonAvailable(31, FitLessList.get(3), new Date(2023, 7, 18)));
        FitLessAvailableList.add(new FitnessLessonAvailable(32, FitLessList.get(4), new Date(2023, 7, 18)));
    }

    private void createReviewList() {
        ReviewList.add(new Review(1, "Very dissatisfied"));
        ReviewList.add(new Review(2, "Dissatisfied"));
        ReviewList.add(new Review(3, "Ok"));
        ReviewList.add(new Review(4, "Satisfied"));
        ReviewList.add(new Review(5, "Very Satisfied"));
    }
    // create predefine data end
    
    public void selectCustomerInput() {
        do {
            int counter = 1;
            System.out.println("");
            System.out.println("Select customer by id");
            for (final Customer cus : CusList) {
                System.out.println(counter++ + "." + cus.getCusName());
            }
            Scanner cusSelectInput = new Scanner(System.in);
            System.out.println("");
            System.out.print("Select Custmer: ");
            int selectedCusId = cusSelectInput.nextInt();
            cusSelectInput.nextLine();
            counter = 1;
            for (final Customer cus : CusList) {
                if (counter == selectedCusId) {
                    selectedCustomer = cus;
                }
                counter++;
            }
        } while (selectedCustomer == null);

        displaySelectedCustomer();
    }

    public void displaySelectedCustomer() {
        if (selectedCustomer != null) {
            System.out.println("");
            System.out.println("***************************** Selected Customer Information *************************");

            System.out.println("Customer Id: " + selectedCustomer.getcId());
            System.out.println("Customer Name: " + selectedCustomer.getCusName());

            System.out.println("***************************** Selected Customer Information *************************");
            System.out.println("");
        }
    }

    public void invalidInputMessage(int selection, int maxSelection) {
        if (selection != 0 && selection > maxSelection) {
            System.out.println("");
            System.out.println("Please enter valid input. Try Again!!!");
            System.out.println("");
        }
    }
}
