/**
 * Professional class is the child class of 'Course'. All the required attributes are declared.
 * Some attributes are initialized in the constructor. Each attributes have their accessor methods.
 * Constructor and methods are called from the parent class to access them.
 *
 * @author Ujwal Parajuli
 * @version (a version number or a date)
 */
/**
 * A child class named Professional is created extending information from the parent class Course
 */
public class Professional extends Course //extends keyword is used to access methods and attributes of parent class
{
    /**
     * Declaring attributes
     */
    private int courseFee, dailyHour, downPayment;
    private String enrollDate, roomNo;
    private boolean started, completed;
    public Professional(String courseName,String instructorsName, int courseFee, int totalHours, int dailyHour)
    {
        /**
         * Initializing parameters values to its corresponding attributes
         */
        super(courseName, instructorsName, totalHours);//super keyword is used to call the constructor of Course class
        this.courseFee = courseFee;
        this.dailyHour = dailyHour;
        this.enrollDate = " ";
        this.roomNo = " ";
        this.downPayment = 0;
        this.started = false;
        this.completed = false;
    }

    /**
     * Declaring accessor methods for private attributes to access them
     */
    public int getCourseFee()
    {

        return courseFee;
    }

    public int getDailyHour()
    {

        return dailyHour;
    }

    public int getDownPayment()
    {

        return downPayment;
    }

    public String getEnrollDate()
    {

        return enrollDate;
    }

    public String getRoomNo()
    {

        return roomNo;
    }

    public boolean getStarted()
    {

        return started;
    }

    public boolean getCompleted()
    {

        return completed;
    }

    /**
     * Declaring methods to set the new values to its corresponding attributes
     */
    public void setCourseFee(int newCourseFee)
    {

        this.courseFee = newCourseFee;
    }

    public void setDailyHour(int newDailyHour)
    {

        this.dailyHour = newDailyHour;
    }

    /**
     * Declaring method to obtain information of students name, enroll date, down payment and room number at the time of enrollment
     */
    public void enrollStudent(String newStudentName, String enrollDate, int downPayment, String roomNo)
    {
        if(started == true){
            System.out.println("Your class is already started" + "Please see the details below:");
            System.out.println("Instructor's Name: " + getInstructorName());
            System.out.println("Room Number: " + getRoomNo());

        }

        else if(started == false){
            setStudentsName(newStudentName); //calling method from Course class
            this.enrollDate = enrollDate;
            this.roomNo = roomNo;
            this.downPayment = downPayment;
            this.started = true;
            this.completed = false;
        }
    }

    public void courseCompletion()
    {
        if(completed == true){
            System.out.println("The course is completed.");
        }

        else if(completed == false){
            setStudentsName(""); //calling method from Course class
            this.enrollDate = " ";
            this.downPayment = 0;
            this.started = false;
            this.completed = true;

        }
    }

    /**
     * Displaying course name, instructors name and course fee
     */
    public void show()
    {
        System.out.println("Course Name: "+ getCourseName());
        System.out.println("Instructor's Name: "+ getInstructorName());
        System.out.println("Course Fee: "+ getCourseFee());
    }

    /**
     * Displaying the final output
     */
    public void display()
    {
        System.out.println("Course Name: " + getCourseName());
        System.out.println("Instructors Name: " + getInstructorName());
        System.out.println("Total Hours: " + getTotalHours());

        if(started == true){
            System.out.println("Completed Status: "+ getCompleted());
            System.out.println("Enroll Date: "+ getEnrollDate());
            System.out.println("Down Payment: "+ getDownPayment());
            System.out.println("Student's Name: "+ getStudentsName());
        }
    }
}
