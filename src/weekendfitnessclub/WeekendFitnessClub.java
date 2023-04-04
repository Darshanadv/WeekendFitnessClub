/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weekendfitnessclub;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Darshan
 */
public class WeekendFitnessClub {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // FitnessController will create all predefine data and start the functionality
        FitnessController fitnessControllerObj = new FitnessController();
        Scanner selectionInput = new Scanner(System.in);
        System.out.println("****** Welcome to the Fitness Club ******");
        int selection = 0;
        int maxSelection = 7;
        try {
            fitnessControllerObj.onDisplaySelectedCustomer();
            do {

                fitnessControllerObj.invalidInputMessage(selection, maxSelection);

                System.out.println("1. Select customer");
                System.out.println("2. Booked a lesson");
                System.out.println("3. Change booking");
                System.out.println("4. Attend booking");
                System.out.println("5. Report 1 - Number of customer per lesson for four weekend having average rating");
                System.out.println("6. Report 2 - Generate Report based on Fitness");
                System.out.println(maxSelection + ". Exit");
                System.out.print("Enter Your Choice: ");
                selection = selectionInput.nextInt();
                selectionInput.nextLine();
                switch (selection) {
                    case 1:
                        fitnessControllerObj.selectCustomerInput();
                        selection = 0;
                        break;
                    case 2:
                        fitnessControllerObj.bookedLessonInput();
                        selection = 0;
                        break;
                    case 3:
                        fitnessControllerObj.changeBookedLessonInput();
                        selection = 0;
                        break;
                    case 4:
                        fitnessControllerObj.AttendBookedLessonInput();
                        selection = 0;
                        break;
                    case 5:
                        fitnessControllerObj.printReport1();
                        selection = 0;
                        break;
                    case 6:
                        fitnessControllerObj.printReport2();
                        selection = 0;
                        break;
                    default:
                        break;
                }
            } while (selection <= 0 || selection > maxSelection);
            // Ending part
            System.out.println("****** Thank you for visiting. ******");
        } catch (InputMismatchException e) {
            System.out.println("Please enter valid input!!!");
        }
    }

}
