/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weekendfitnessclub;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        CusList.add(new Customer(1, "Darshan", new ArrayList<>(), new ArrayList<>()));
        CusList.add(new Customer(2, "Maya", new ArrayList<>(), new ArrayList<>()));
        CusList.add(new Customer(3, "Evie", new ArrayList<>(), new ArrayList<>()));
        CusList.add(new Customer(4, "Srujal", new ArrayList<>(), new ArrayList<>()));
        CusList.add(new Customer(5, "Kamal", new ArrayList<>(), new ArrayList<>()));
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
//        Calendar cal = Calendar.getInstance();
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
            // 1st
            FitLessAvailableList.add(new FitnessLessonAvailable(1, FitLessList.get(0), formatter.parse("29-April-2023"), false));
            FitLessAvailableList.add(new FitnessLessonAvailable(2, FitLessList.get(2), formatter.parse("29-April-2023"), false));
            FitLessAvailableList.add(new FitnessLessonAvailable(3, FitLessList.get(1), formatter.parse("30-April-2023"), false));
            FitLessAvailableList.add(new FitnessLessonAvailable(4, FitLessList.get(3), formatter.parse("30-April-2023"), false));
            // 2nd
            FitLessAvailableList.add(new FitnessLessonAvailable(5, FitLessList.get(1), formatter.parse("6-May-2023"), false));
            FitLessAvailableList.add(new FitnessLessonAvailable(6, FitLessList.get(4), formatter.parse("6-May-2023"), false));
            FitLessAvailableList.add(new FitnessLessonAvailable(7, FitLessList.get(3), formatter.parse("7-May-2023"), false));
            FitLessAvailableList.add(new FitnessLessonAvailable(8, FitLessList.get(2), formatter.parse("7-May-2023"), false));
            // 3rd
            FitLessAvailableList.add(new FitnessLessonAvailable(9, FitLessList.get(5), formatter.parse("13-May-2023"), false));
            FitLessAvailableList.add(new FitnessLessonAvailable(10, FitLessList.get(0), formatter.parse("13-May-2023"), false));
            FitLessAvailableList.add(new FitnessLessonAvailable(11, FitLessList.get(1), formatter.parse("14-May-2023"), false));
            FitLessAvailableList.add(new FitnessLessonAvailable(12, FitLessList.get(2), formatter.parse("14-May-2023"), false));
            // 4th
            FitLessAvailableList.add(new FitnessLessonAvailable(13, FitLessList.get(4), formatter.parse("20-May-2023"), false));
            FitLessAvailableList.add(new FitnessLessonAvailable(14, FitLessList.get(3), formatter.parse("20-May-2023"), false));
            FitLessAvailableList.add(new FitnessLessonAvailable(15, FitLessList.get(2), formatter.parse("21-May-2023"), false));
            FitLessAvailableList.add(new FitnessLessonAvailable(16, FitLessList.get(0), formatter.parse("21-May-2023"), false));
            // 5th
            FitLessAvailableList.add(new FitnessLessonAvailable(17, FitLessList.get(3), formatter.parse("27-May-2023"), false));
            FitLessAvailableList.add(new FitnessLessonAvailable(18, FitLessList.get(2), formatter.parse("27-May-2023"), false));
            FitLessAvailableList.add(new FitnessLessonAvailable(19, FitLessList.get(4), formatter.parse("28-May-2023"), false));
            FitLessAvailableList.add(new FitnessLessonAvailable(20, FitLessList.get(1), formatter.parse("28-May-2023"), false));
            // 6th
            FitLessAvailableList.add(new FitnessLessonAvailable(21, FitLessList.get(2), formatter.parse("3-June-2023"), false));
            FitLessAvailableList.add(new FitnessLessonAvailable(22, FitLessList.get(5), formatter.parse("3-June-2023"), false));
            FitLessAvailableList.add(new FitnessLessonAvailable(23, FitLessList.get(1), formatter.parse("4-June-2023"), false));
            FitLessAvailableList.add(new FitnessLessonAvailable(24, FitLessList.get(0), formatter.parse("4-June-2023"), false));
            // 7th
            FitLessAvailableList.add(new FitnessLessonAvailable(25, FitLessList.get(0), formatter.parse("10-June-2023"), false));
            FitLessAvailableList.add(new FitnessLessonAvailable(26, FitLessList.get(2), formatter.parse("10-June-2023"), false));
            FitLessAvailableList.add(new FitnessLessonAvailable(27, FitLessList.get(3), formatter.parse("11-June-2023"), false));
            FitLessAvailableList.add(new FitnessLessonAvailable(28, FitLessList.get(2), formatter.parse("11-June-2023"), false));
            // 8th
            FitLessAvailableList.add(new FitnessLessonAvailable(29, FitLessList.get(5), formatter.parse("17-June-2023"), false));
            FitLessAvailableList.add(new FitnessLessonAvailable(30, FitLessList.get(2), formatter.parse("17-June-2023"), false));
            FitLessAvailableList.add(new FitnessLessonAvailable(31, FitLessList.get(3), formatter.parse("18-June-2023"), false));
            FitLessAvailableList.add(new FitnessLessonAvailable(32, FitLessList.get(4), formatter.parse("18-June-2023"), false));
        } catch (ParseException ex) {
            Logger.getLogger(FitnessController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void createReviewList() {
        ReviewList.add(new Review(1, "Very dissatisfied"));
        ReviewList.add(new Review(2, "Dissatisfied"));
        ReviewList.add(new Review(3, "Ok"));
        ReviewList.add(new Review(4, "Satisfied"));
        ReviewList.add(new Review(5, "Very Satisfied"));
    }
    // create predefine data end

    private void displayAllFitnessLessonAvailableBy(String type) {
        if (type == "day") {
            Scanner scannerInput = new Scanner(System.in);
            int selection = 0;
            int maxSelection = 3;
            System.out.println("");

            do {
                invalidInputMessage(selection, maxSelection);

                System.out.println("Select available day: ");
                System.out.println("1. Saturday");
                System.out.println("2. Sunday");
                System.out.println(maxSelection + ". Go back");
                System.out.print("Enter your choice: ");
                selection = scannerInput.nextInt();
                scannerInput.nextLine();
            } while (selection <= 0 || selection > maxSelection);

            if (selection > 0) {
                final List<FitnessLessonAvailable> filterFitLessAvailableList = new ArrayList<>();
                for (final FitnessLessonAvailable fitLesAva : FitLessAvailableList) {
                    Calendar c = Calendar.getInstance();
                    c.setTime(fitLesAva.getDateOfAvailable());
                    int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
                    if (!fitLesAva.isIsBooked() && (selection == 1 && dayOfWeek == 7) || (selection == 2 && dayOfWeek == 1)) {
                        filterFitLessAvailableList.add(fitLesAva);
                    }
                }
                onBookedFitness(filterFitLessAvailableList);
            }
            System.out.println("");

        } else {
            // By fitness name
            Scanner scannerInput = new Scanner(System.in);
            int selection = 0;
            int maxSelection = 0;
            System.out.println("");
            do {
                invalidInputMessage(selection, maxSelection);

                for (final FitnessLesson fitLes : FitLessList) {
                    System.out.println(fitLes.getfId() + ". " + fitLes.getFitnessName());
                    if (fitLes.getfId() > maxSelection) {
                        maxSelection = fitLes.getfId();
                    }
                }

                System.out.print("Enter your choice: ");
                selection = scannerInput.nextInt();
                scannerInput.nextLine();

            } while (selection <= 0 || selection > maxSelection);

            if (selection > 0) {
                FitnessLesson selectedFitLess = null;
                for (final FitnessLesson fitLes : FitLessList) {
                    if (fitLes.getfId() == selection) {
                        selectedFitLess = fitLes;
                    }
                }

                final List<FitnessLessonAvailable> filterFitLessAvailableList = new ArrayList<>();
                for (final FitnessLessonAvailable fitLesAva : FitLessAvailableList) {
                    if (fitLesAva.getFitLes().getFitnessName() == selectedFitLess.getFitnessName()) {
                        filterFitLessAvailableList.add(fitLesAva);
                    }
                }
                onBookedFitness(filterFitLessAvailableList);
            }
            System.out.println("");
        }
    }

    private void onBookedFitness(List<FitnessLessonAvailable> filterFitLessAvailableList) {
        if (!filterFitLessAvailableList.isEmpty()) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            System.out.println("-----------------------------");
            for (final FitnessLessonAvailable fitLesAva : filterFitLessAvailableList) {
                System.out.println("Fitness Id: " + fitLesAva.getFlaId());
                System.out.println("Fitness Name: " + fitLesAva.getFitLes().getFitnessName());
                System.out.println("Fitness Price: £" + fitLesAva.getFitLes().getPrice() + "/hour");
                System.out.println("Fitness Available Date: " + dateFormat.format(fitLesAva.getDateOfAvailable()));
                System.out.println("-----------------------------");
            }

            System.out.println("");
            int selectedInput = 0;
            FitnessLessonAvailable selectedFitenessAvailable = null;
            do {

                Scanner selectInput = new Scanner(System.in);
                System.out.println("");
                System.out.print("Select fitness lesson to book by id: ");
                selectedInput = selectInput.nextInt();
                selectInput.nextLine();

                for (final FitnessLessonAvailable fitLesAva : FitLessAvailableList) {
                    if (selectedInput == fitLesAva.getFlaId()) {
                        fitLesAva.setIsBooked(true);
                        selectedFitenessAvailable = fitLesAva;
                        selectedCustomer.addBookedFitnessLessonsList(new BookedFitnessLesson(getMaxBookingId(), fitLesAva, new Date(), false));
                    }
                }

                if (selectedFitenessAvailable == null) {
                    invalidInputMessage();
                }
            } while (selectedInput <= 0 && selectedFitenessAvailable == null);

            if (selectedFitenessAvailable != null) {
                System.out.println("***********************************");
                System.out.println("Your Booking has been confirmed");
                System.out.println("***********************************");
            }
        } else {
            System.out.println("No Booking Available");
        }
    }

    /**
     * Returns an Integer within collection to get the max Id
     */
    private int getMaxBookingId() {
        if (selectedCustomer != null && !selectedCustomer.getBookedFitnessLessonList().isEmpty()) {
            BookedFitnessLesson bookedFitLessMaxId = Collections.max(selectedCustomer.getBookedFitnessLessonList());
            return bookedFitLessMaxId.getbId() + 1;
        }
        return 1;
    }

    public void onDisplaySelectedCustomer() {
        if (selectedCustomer != null) {
            System.out.println("");
            System.out.println("***************************** Selected Customer Information *************************");

            System.out.println("Customer Id: " + selectedCustomer.getcId());
            System.out.println("Customer Name: " + selectedCustomer.getCusName());

            System.out.println("***************************** Selected Customer Information *************************");
            System.out.println("");
        }
    }

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

        onDisplaySelectedCustomer();
    }

    public void bookedLessonInput() {

        Scanner newLessonBookingInput = new Scanner(System.in);
        int selection = 0;
        int maxSelection = 3;
        System.out.println("");

        do {
            invalidInputMessage(selection, maxSelection);

            System.out.println("Select available timetable by: ");
            System.out.println("1. View By day");
            System.out.println("2. View by the fitness type");
            System.out.println(maxSelection + ". Go back");
            System.out.print("Enter your choice: ");
            selection = newLessonBookingInput.nextInt();

            if (selection == 1) {
                displayAllFitnessLessonAvailableBy("day");
            } else if (selection == 2) {
                displayAllFitnessLessonAvailableBy("fitness");
            }
        } while (selection <= 0 || selection > maxSelection);
        System.out.println("");
    }

    public void changeBookedLessonInput() {
        System.out.println("");
        System.out.println("Hello " + selectedCustomer.getCusName());
        System.out.println("");
        if (selectedCustomer.getBookedFitnessLessonList().isEmpty()) {
            System.out.println("No Booking found");
            System.out.println("");
            return;
        }
        System.out.println("Your Bookings:");
        System.out.println("");
        int counter = 1;
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        for (final BookedFitnessLesson bookedFitLess : selectedCustomer.getBookedFitnessLessonList()) {
            if (!bookedFitLess.isIsCompleted()) {
                System.out.println(counter++);
                System.out.println("Fitness Name: " + bookedFitLess.getFla().getFitLes().getFitnessName());
                System.out.println("Fitness Price: £" + bookedFitLess.getFla().getFitLes().getPrice() + "/hour");
                System.out.println("Fitness Booked Date: " + dateFormat.format(bookedFitLess.getFla().getDateOfAvailable()));
                System.out.println("-----------------------------");
            }
        }

        System.out.println("");
        int selectedInput = 0;
        BookedFitnessLesson selectedTempBookedLesson = null;
        do {

            Scanner selectInput = new Scanner(System.in);
            System.out.println("");
            System.out.print("Select booking lesson to change: ");
            selectedInput = selectInput.nextInt();
            selectInput.nextLine();
            counter = 1;
            for (final BookedFitnessLesson bookedFitLess : selectedCustomer.getBookedFitnessLessonList()) {
                if (!bookedFitLess.isIsCompleted()) {
                    counter++;
                    if (selectedInput == counter) {
                        selectedTempBookedLesson = bookedFitLess;
                    }
                }
            }

            if (selectedTempBookedLesson == null) {
                invalidInputMessage();
            }
        } while (selectedInput <= 0 || selectedTempBookedLesson == null);
        System.out.println("");
        System.out.println("Please book another lesson: ");
        bookedLessonInput();
    }

    public void AttendBookedLessonInput() {
        System.out.println("");
        System.out.println("Hello " + selectedCustomer.getCusName());
        System.out.println("");

        if (selectedCustomer.getBookedFitnessLessonList().isEmpty()) {
            System.out.println("No Booking found");
            System.out.println("");
            return;
        }
        System.out.println("Your Bookings:");
        System.out.println("");
        int counter = 1;
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        for (final BookedFitnessLesson bookedFitLess : selectedCustomer.getBookedFitnessLessonList()) {
            if (!bookedFitLess.isIsCompleted()) {
                System.out.println("Booking id: :" + bookedFitLess.getbId());
                System.out.println("Fitness Name: " + bookedFitLess.getFla().getFitLes().getFitnessName());
                System.out.println("Fitness Price: £" + bookedFitLess.getFla().getFitLes().getPrice() + "/hour");
                System.out.println("Fitness Booked Date: " + dateFormat.format(bookedFitLess.getFla().getDateOfAvailable()));
                System.out.println("-----------------------------");
            }
        }

        System.out.println("");
        int selectedInput = 0;
        do {

            Scanner selectInput = new Scanner(System.in);
            System.out.println("");
            System.out.println("Y for Go Back");
            System.out.println("Select booking id to attend: ");
            selectedInput = selectInput.nextInt();
            selectInput.nextLine();
            if (selectedInput >= 0) {
                System.out.println("Selected input: " + selectedInput);
                for (final BookedFitnessLesson bookedFitLess : selectedCustomer.getBookedFitnessLessonList()) {
                    if (!bookedFitLess.isIsCompleted()) {
                        System.out.println("counter value: " + counter);
                        if (selectedInput == bookedFitLess.getbId()) {
                            selectedCustomer.onConfirmBookingById(selectedInput);
                            System.out.println("You have successfully attend the fitness class");
                        }
                        counter++;
                    }
                }
            }

        } while (selectedInput <= 0);

        System.out.println("");
    }

    public void invalidInputMessage(int selection, int maxSelection) {
        if (selection != 0 && selection > maxSelection) {
            System.out.println("");
            System.out.println("Please enter valid input. Try Again!!!");
            System.out.println("");
        }
    }

    public void invalidInputMessage() {
        System.out.println("");
        System.out.println("Please enter valid input. Try Again!!!");
        System.out.println("");
    }
}
