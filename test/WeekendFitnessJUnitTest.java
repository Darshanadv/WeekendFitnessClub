/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import weekendfitnessclub.BookedFitnessLesson;
import weekendfitnessclub.Customer;
import weekendfitnessclub.FitnessLesson;
import weekendfitnessclub.FitnessLessonAvailable;
import weekendfitnessclub.Report1;
import weekendfitnessclub.Report2;
import weekendfitnessclub.Review;

/**
 *
 * @author Darshan
 */
public class WeekendFitnessJUnitTest {

    Customer cus;
    FitnessLesson fitness;
    FitnessLessonAvailable fitnessLessAva;
    BookedFitnessLesson bookedFitnessLes;
    Report1 r1;
    Report2 r2;
    Review review;
    List<Review> reviewList;
    List<Review> bookedReviewList;

    private final String CUS_NAME = "Darshan";
    private final String FITNESS_LESSON_NAME = "Spin";
    private final int REVIEW_ID = 3;
    private final String REVIEW_NAME = "Ok";

    public WeekendFitnessJUnitTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        try {
            setAllReviewList();
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
            fitness = new FitnessLesson(1, FITNESS_LESSON_NAME, 15);
            fitnessLessAva = new FitnessLessonAvailable(1, fitness, formatter.parse("29-April-2023"), 10);
            bookedFitnessLes = new BookedFitnessLesson(1, fitnessLessAva, formatter.parse("21-April-2023"), false);
            cus = new Customer(1, CUS_NAME);
            cus.addBookedFitnessLessonsList(bookedFitnessLes);
        } catch (ParseException ex) {
            Logger.getLogger(WeekendFitnessJUnitTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @After
    public void tearDown() {
    }

    private void setAllReviewList() {
        reviewList = new ArrayList<>();
        reviewList.add(new Review(1, "Very dissatisfied"));
        reviewList.add(new Review(2, "Dissatisfied"));
        reviewList.add(new Review(3, REVIEW_NAME));
        reviewList.add(new Review(4, "Satisfied"));
        reviewList.add(new Review(5, "Very Satisfied"));
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void checkCustomerName() {
        System.out.println("In testing customer name");
        assertEquals(CUS_NAME, cus.getCusName());
        System.out.println("Success");
        System.out.println("");
    }

    @Test
    public void checkFitnessLessonName() {
        System.out.println("In testing fitness lesson name");
        assertEquals(FITNESS_LESSON_NAME, fitness.getFitnessName());
        System.out.println("Success");
        System.out.println("");
    }

    @Test
    public void setReviewInBookedFitnessLesson() {
        System.out.println("In testing set review for booked fitness lesson");
        bookedFitnessLes.setReview(reviewList.get(REVIEW_ID));
        bookedReviewList = new ArrayList<>();
        bookedReviewList.add(bookedFitnessLes.getReview());
        r1 = new Report1(1, fitnessLessAva, bookedFitnessLes.getBookedDate(), bookedReviewList);
        assertEquals(reviewList.get(REVIEW_ID), bookedFitnessLes.getReview());
        System.out.println("Success");
        System.out.println("");

    }

    @Test
    public void checkReport1CustomerCounter() {
        System.out.println("In testing report 1 checking customer couting");
        r1 = new Report1(1, bookedFitnessLes.getFla(), bookedFitnessLes.getFla().getDateOfAvailable(), reviewList);
        r1.addCustomer();
        assertEquals(2, r1.getNoOfCustomer());
        System.out.println("Success");
        System.out.println("");
    }

    @Test
    public void checkReport2ForBooking() {
        System.out.println("In testing report 2 check total income");
        r2 = new Report2(bookedFitnessLes.getFla(), bookedFitnessLes.getFla().getFitLes().getPrice());
        r2.addTotalIncome(bookedFitnessLes.getFla().getFitLes().getPrice());
        assertEquals(bookedFitnessLes.getFla().getFitLes().getPrice() + bookedFitnessLes.getFla().getFitLes().getPrice(), r2.getTotalIncome());
        System.out.println("Success");
        System.out.println("");
    }

    @Test
    public void checkBookingFitnessCompletedFunctionality() {
        System.out.println("In testing booking fitness is completed functionality");
        bookedFitnessLes.setIsCompleted(true);
        assertEquals(true, bookedFitnessLes.isCompleted());
        System.out.println("Success");
        System.out.println("");
    }

    @Test
    public void checkBookingFitnessLessonUniqueId() {
        System.out.println("In testing booked fitness lesson unique id");
        assertEquals(1, bookedFitnessLes.getbId());
        System.out.println("Success");
        System.out.println("");
    }

    @Test
    public void checkFitnessLessonAvailableSeat() {
        System.out.println("In testing Fitness Lesson available seat ");
        int availableSeat = fitnessLessAva.getSeatAvailable();
        fitnessLessAva.removeOneSeatAvailable();
        assertEquals(--availableSeat, fitnessLessAva.getSeatAvailable());
        System.out.println("Success");
        System.out.println("");
    }

    @Test
    public void checkBookingConfirmById() {
        System.out.println("In testing booking confirm by id");
        assertEquals(true, cus.onConfirmBookingById(bookedFitnessLes.getbId()));
        System.out.println("Success");
        System.out.println("");
    }

    @Test
    public void checkAnyBookingFound() {
        System.out.println("In testing booking found");
        assertEquals(true, cus.isAnyBookingFound());
        System.out.println("Success");
        System.out.println("");
    }

    @Test
    public void checkReviewName() {
        System.out.println("In testing review name");
        Review r = new Review(REVIEW_ID, REVIEW_NAME);
        assertEquals(REVIEW_NAME, r.getReviewName());
        System.out.println("Success");
        System.out.println("");
    }
}
