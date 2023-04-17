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
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/**
 *
 * @author Darshan
 */
public class FitnessController {

    // create intialize varibale and data
    private List<Customer> CusList;
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
        try {
            int min = 1;
            int max = 20;
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
            // 1st
            FitLessAvailableList.add(new FitnessLessonAvailable(1, FitLessList.get(0), formatter.parse("29-April-2023"), new Random().nextInt(max - min + 1) + min));
            FitLessAvailableList.add(new FitnessLessonAvailable(2, FitLessList.get(2), formatter.parse("29-April-2023"), new Random().nextInt(max - min + 1) + min));
            FitLessAvailableList.add(new FitnessLessonAvailable(3, FitLessList.get(1), formatter.parse("30-April-2023"), new Random().nextInt(max - min + 1) + min));
            FitLessAvailableList.add(new FitnessLessonAvailable(4, FitLessList.get(3), formatter.parse("30-April-2023"), new Random().nextInt(max - min + 1) + min));
            // 2nd
            FitLessAvailableList.add(new FitnessLessonAvailable(5, FitLessList.get(1), formatter.parse("6-May-2023"), new Random().nextInt(max - min + 1) + min));
            FitLessAvailableList.add(new FitnessLessonAvailable(6, FitLessList.get(4), formatter.parse("6-May-2023"), new Random().nextInt(max - min + 1) + min));
            FitLessAvailableList.add(new FitnessLessonAvailable(7, FitLessList.get(3), formatter.parse("7-May-2023"), new Random().nextInt(max - min + 1) + min));
            FitLessAvailableList.add(new FitnessLessonAvailable(8, FitLessList.get(2), formatter.parse("7-May-2023"), new Random().nextInt(max - min + 1) + min));
            // 3rd
            FitLessAvailableList.add(new FitnessLessonAvailable(9, FitLessList.get(5), formatter.parse("13-May-2023"), new Random().nextInt(max - min + 1) + min));
            FitLessAvailableList.add(new FitnessLessonAvailable(10, FitLessList.get(0), formatter.parse("13-May-2023"), new Random().nextInt(max - min + 1) + min));
            FitLessAvailableList.add(new FitnessLessonAvailable(11, FitLessList.get(1), formatter.parse("14-May-2023"), new Random().nextInt(max - min + 1) + min));
            FitLessAvailableList.add(new FitnessLessonAvailable(12, FitLessList.get(2), formatter.parse("14-May-2023"), new Random().nextInt(max - min + 1) + min));
            // 4th
            FitLessAvailableList.add(new FitnessLessonAvailable(13, FitLessList.get(4), formatter.parse("20-May-2023"), new Random().nextInt(max - min + 1) + min));
            FitLessAvailableList.add(new FitnessLessonAvailable(14, FitLessList.get(3), formatter.parse("20-May-2023"), new Random().nextInt(max - min + 1) + min));
            FitLessAvailableList.add(new FitnessLessonAvailable(15, FitLessList.get(2), formatter.parse("21-May-2023"), new Random().nextInt(max - min + 1) + min));
            FitLessAvailableList.add(new FitnessLessonAvailable(16, FitLessList.get(0), formatter.parse("21-May-2023"), new Random().nextInt(max - min + 1) + min));
            // 5th
            FitLessAvailableList.add(new FitnessLessonAvailable(17, FitLessList.get(3), formatter.parse("27-May-2023"), new Random().nextInt(max - min + 1) + min));
            FitLessAvailableList.add(new FitnessLessonAvailable(18, FitLessList.get(2), formatter.parse("27-May-2023"), new Random().nextInt(max - min + 1) + min));
            FitLessAvailableList.add(new FitnessLessonAvailable(19, FitLessList.get(4), formatter.parse("28-May-2023"), new Random().nextInt(max - min + 1) + min));
            FitLessAvailableList.add(new FitnessLessonAvailable(20, FitLessList.get(1), formatter.parse("28-May-2023"), new Random().nextInt(max - min + 1) + min));
            // 6th
            FitLessAvailableList.add(new FitnessLessonAvailable(21, FitLessList.get(2), formatter.parse("3-June-2023"), new Random().nextInt(max - min + 1) + min));
            FitLessAvailableList.add(new FitnessLessonAvailable(22, FitLessList.get(5), formatter.parse("3-June-2023"), new Random().nextInt(max - min + 1) + min));
            FitLessAvailableList.add(new FitnessLessonAvailable(23, FitLessList.get(1), formatter.parse("4-June-2023"), new Random().nextInt(max - min + 1) + min));
            FitLessAvailableList.add(new FitnessLessonAvailable(24, FitLessList.get(0), formatter.parse("4-June-2023"), new Random().nextInt(max - min + 1) + min));
            // 7th
            FitLessAvailableList.add(new FitnessLessonAvailable(25, FitLessList.get(0), formatter.parse("10-June-2023"), new Random().nextInt(max - min + 1) + min));
            FitLessAvailableList.add(new FitnessLessonAvailable(26, FitLessList.get(2), formatter.parse("10-June-2023"), new Random().nextInt(max - min + 1) + min));
            FitLessAvailableList.add(new FitnessLessonAvailable(27, FitLessList.get(3), formatter.parse("11-June-2023"), new Random().nextInt(max - min + 1) + min));
            FitLessAvailableList.add(new FitnessLessonAvailable(28, FitLessList.get(2), formatter.parse("11-June-2023"), new Random().nextInt(max - min + 1) + min));
            // 8th
            FitLessAvailableList.add(new FitnessLessonAvailable(29, FitLessList.get(5), formatter.parse("17-June-2023"), new Random().nextInt(max - min + 1) + min));
            FitLessAvailableList.add(new FitnessLessonAvailable(30, FitLessList.get(2), formatter.parse("17-June-2023"), new Random().nextInt(max - min + 1) + min));
            FitLessAvailableList.add(new FitnessLessonAvailable(31, FitLessList.get(3), formatter.parse("18-June-2023"), new Random().nextInt(max - min + 1) + min));
            FitLessAvailableList.add(new FitnessLessonAvailable(32, FitLessList.get(4), formatter.parse("18-June-2023"), new Random().nextInt(max - min + 1) + min));
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
        if ("day".equals(type)) {
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
                    if (fitLesAva.getSeatAvailable() > 0 && (selection == 1 && dayOfWeek == 7) || (selection == 2 && dayOfWeek == 1)) {
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
                    if (fitLesAva.getSeatAvailable() > 0 && fitLesAva.getFitLes().getFitnessName().equals(selectedFitLess.getFitnessName())) {
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
                System.out.println("Fitness Available Seats: " + fitLesAva.getSeatAvailable());
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
                        fitLesAva.removeOneSeatAvailable();
                        FitLessAvailableList.set(FitLessAvailableList.indexOf(fitLesAva), fitLesAva);
                        selectedFitenessAvailable = fitLesAva;
                        selectedCustomer.addBookedFitnessLessonsList(new BookedFitnessLesson(getMaxBookingId(), fitLesAva, new Date(), false));
                        updateCustomer(selectedCustomer);
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

    private boolean customerRating(BookedFitnessLesson bookedFitLess) {
        System.out.println("");
        System.out.println("Please rate the fitenss experiance.");
        int selectedInput = 0;
        int maxSelection = 6;
        boolean isRated = false;
        do {
            invalidInputMessage(selectedInput, maxSelection);
            for (Review review : ReviewList) {
                System.out.println(review.getrId() + ". " + review.getReviewName());
            }
            System.out.println(maxSelection + ". Go back (Do not want to rate)");

            Scanner selectInput = new Scanner(System.in);
            System.out.println("");
            System.out.print("Rate by number: ");
            selectedInput = selectInput.nextInt();

            for (Review review : ReviewList) {
                if (review.getrId() == selectedInput) {
                    selectedCustomer.setBookedFitnessLessonList(selectedCustomer.getBookedFitnessLessonList().stream().map((t) -> {
                        if (t.getbId() == bookedFitLess.getbId()) {
                            t.setReview(review);
                        }
                        return t;
                    }).collect(Collectors.toList()));
                    updateCustomer(selectedCustomer);
                }
            }

        } while (selectedInput <= 0 || selectedInput > maxSelection);

        return isRated;
    }

    private void updateCustomer(Customer cus) {
        CusList = CusList.stream().map((t) -> {
            if (t.getcId() == cus.getcId()) {
                t = cus;
            }
            return t;
        }).collect(Collectors.toList());
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
        if (!selectedCustomer.isAnyBookingFound()) {
            System.out.println("No Booking found");
            System.out.println("");
            return;
        }
        System.out.println("Your Bookings:");
        System.out.println("");
        int counter = 1;
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        for (final BookedFitnessLesson bookedFitLess : selectedCustomer.getIncompleteBookedFitenssLessonList()) {
            System.out.println(counter++);
            System.out.println("Fitness Name: " + bookedFitLess.getFla().getFitLes().getFitnessName());
            System.out.println("Fitness Price: £" + bookedFitLess.getFla().getFitLes().getPrice() + "/hour");
            System.out.println("Fitness Booked Date: " + dateFormat.format(bookedFitLess.getFla().getDateOfAvailable()));
            System.out.println("-----------------------------");
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
            for (final BookedFitnessLesson bookedFitLess : selectedCustomer.getIncompleteBookedFitenssLessonList()) {
                counter++;
                if (selectedInput == counter) {
                    selectedTempBookedLesson = bookedFitLess;
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

        if (!selectedCustomer.isAnyBookingFound()) {
            System.out.println("No Booking found");
            System.out.println("");
            return;
        }

        System.out.println("Your Bookings:");
        System.out.println("");
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        for (final BookedFitnessLesson bookedFitLess : selectedCustomer.getIncompleteBookedFitenssLessonList()) {
            System.out.println("-----------------------------");
            System.out.println("Booking id: :" + bookedFitLess.getbId());
            System.out.println("Fitness Name: " + bookedFitLess.getFla().getFitLes().getFitnessName());
            System.out.println("Fitness Price: £" + bookedFitLess.getFla().getFitLes().getPrice() + "/hour");
            System.out.println("Fitness Booked Date: " + dateFormat.format(bookedFitLess.getFla().getDateOfAvailable()));
            System.out.println("-----------------------------");
        }

        System.out.println("");
        int selectedInput = 0;
        BookedFitnessLesson selectedBooking = null;
        do {

            Scanner selectInput = new Scanner(System.in);
            System.out.println("");
            System.out.println("Number 0 for Go Back");
            System.out.print("Select booking id to attend: ");
            selectedInput = selectInput.nextInt();
            if (selectedInput > 0) {
                System.out.println("Selected input: " + selectedInput);
                for (final BookedFitnessLesson bookedFitLess : selectedCustomer.getIncompleteBookedFitenssLessonList()) {
                    if (selectedInput == bookedFitLess.getbId()) {
                        selectedCustomer.onConfirmBookingById(selectedInput);
                        updateCustomer(selectedCustomer);
                        for (FitnessLessonAvailable fla : FitLessAvailableList) {
                            if (fla.getFlaId() == bookedFitLess.getFla().getFlaId()) {
                                fla.addOneSeatAvailable();
                                FitLessAvailableList.set(FitLessAvailableList.indexOf(fla), fla);
                            }
                        }
                        selectedBooking = bookedFitLess;
                        System.out.println("You have successfully attend the fitness class");
                    }
                }
                boolean isRated = customerRating(selectedBooking);
                if (isRated) {
                    System.out.println("Thank you for rating...");
                }
            }

        } while (selectedInput < 0);

        System.out.println("");
    }

    public void printReport1() {
        List<Report1> report1List = new ArrayList<>();

        CusList.forEach((cus) -> {
            cus.getBookedFitnessLessonList().stream().filter((bookedFitLess) -> (bookedFitLess.isCompleted())).forEachOrdered((bookedFitLess) -> {
                if (report1List.stream().anyMatch(obj -> obj.getDateOfAvailable() == bookedFitLess.getFla().getDateOfAvailable())) {
                    report1List.stream().filter((report) -> (report.getDateOfAvailable() == bookedFitLess.getFla().getDateOfAvailable())).map((report) -> {
                        report.addCustomer();
                        return report;
                    }).map((report) -> {
                        report.addReviewInList(bookedFitLess.getReview());
                        return report;
                    }).forEachOrdered((report) -> {
                        report1List.set(report1List.indexOf(report), report);
                    });
                } else {
                    List<Review> reviewList = new ArrayList<>();
                    reviewList.add(bookedFitLess.getReview());
                    report1List.add(new Report1(1, bookedFitLess.getFla(), bookedFitLess.getFla().getDateOfAvailable(), reviewList));
                }
            });
        });
        if (report1List.isEmpty()) {
            System.out.println("");
            System.out.println("No report found");
            System.out.println("");
        } else {
            System.out.println("");
            System.out.println("****************** Report 1 Start ********************************************");
            System.out.println("A report containing the number of customers per lesson on each day, along with the average rating of each lesson");
            System.out.println("");
            int counter = 0;
            for (Report1 r1 : report1List) {
                r1.printReport(++counter);
            }
            System.out.println("");
            System.out.println("****************** Report 1 End ********************************************");
            System.out.println("");
        }
    }

    public void printReport2() {
        List<Report2> report2List = new ArrayList<>();

        CusList.forEach((cus) -> {
            cus.getBookedFitnessLessonList().stream().filter((bookedFitLess) -> (bookedFitLess.isCompleted())).forEachOrdered((bookedFitLess) -> {
                if (report2List.stream().anyMatch(obj -> obj.getFitnessLessAva().getFitLes().getfId() == bookedFitLess.getFla().getFitLes().getfId())) {
                    report2List.stream().filter((report) -> (report.getFitnessLessAva().getFitLes().getfId() == bookedFitLess.getFla().getFitLes().getfId())).map((report) -> {
                        report.addTotalIncome(bookedFitLess.getFla().getFitLes().getPrice());
                        return report;
                    }).forEachOrdered((report) -> {
                        report2List.set(report2List.indexOf(report), report);
                    });
                } else {
                    report2List.add(new Report2(bookedFitLess.getFla(), bookedFitLess.getFla().getFitLes().getPrice()));
                }
            });
        });
        if (report2List.isEmpty()) {
            System.out.println("");
            System.out.println("No report found");
            System.out.println("");
        } else {
            System.out.println("");
            System.out.println("****************** Report 2 Start ********************************************");
            System.out.println("A report containing the type of fitness lessons which has generated the highest income, counting all the same type of lessons together");
            System.out.println("");
            int counter = 0;
            for (Report2 r2 : report2List) {
                r2.printReport(++counter);
            }
            System.out.println("");
            System.out.println("****************** Report 2 End ********************************************");
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

    public void invalidInputMessage() {
        System.out.println("");
        System.out.println("Please enter valid input. Try Again!!!");
        System.out.println("");
    }
}
