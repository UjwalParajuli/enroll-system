/**
 * Certification class is also the child class of 'Course'. All the required attributes are declared.
 * Some attributes are initialized in the constructor. Each attributes have their own accessor methods.
 * Construcor and methods are called from the parent class  to access them.
 *
 * @author Ujwal Parajuli
 * @version (a version number or a date)
 */
/**
 * A child class named Certification is created extending information from the parent class Course
 */
public class Certification extends Course // extends keyword is used to access attributes and methods of Course class
{
    /**
     * Declaring attributes
     */
    private int courseFee;
    private String startDate, examDate, examCenter, certificateAwardedBy, validTill;
    private boolean started;

    public Certification(String courseName, String instructorsName, int totalHours, int courseFee, String certificateAwardedBy, String validTill)
    {
        /**
         * Initializing parameters values to its corresponding attributes
         */
        super(courseName, instructorsName, totalHours);// super keyword is used to call the constructor of Course class
        this.courseFee = courseFee;
        this.certificateAwardedBy = certificateAwardedBy;
        this.validTill = validTill;
        this.startDate = " ";
        this.examDate = " ";
        this.examCenter = " ";
        this.started = false;
    }

    /**
     * Declaring accessor methods
     */
    public int getCourseFee()
    {
        return courseFee;
    }

    public String getStartDate()
    {
        return startDate;
    }

    public String getExamDate()
    {
        return examDate;
    }

    public String getExamCenter()
    {
        return examCenter;
    }

    public String getCertificateAwardedBy()
    {
        return certificateAwardedBy;
    }

    public String getValidTill()
    {
        return validTill;
    }

    public boolean getStarted()
    {
        return started;
    }

    /**
     * Declaring methods to set the parameter values to its corresponding attributes
     */
    public void setCourseFee(int newCourseFee)
    {
        if(started == false){
            this.courseFee = newCourseFee;
        }

        else{
            System.out.println("Sorry, the certification course has already been started. So, it is not possible to change the course fee.");
        }
    }

    public void enrollingStudents(String studentsName, String startDate, String examCenter, String examDate)
    {
        if(started == false){
            setStudentsName(studentsName); //calling method from Course class
            this.started = true;
        }

        else{
            System.out.println("The course is already started on "+ getStartDate());

        }
        this.startDate = startDate;
        this.examCenter = examCenter;
        this.examDate = examDate;

    }

    /**
     * Displaying final output to the user
     */
    public void display()
    {
        System.out.println("Course Name: " + getCourseName());
        System.out.println("Instructors Name: " + getInstructorName());
        System.out.println("Total Hours: " + getTotalHours());

        if(started == true){
            System.out.println("Start Date: "+ getStartDate());
            System.out.println("Student's Name: "+ getStudentsName());
            System.out.println("Exam Date: "+ getExamDate());
            System.out.println("Exam Center: "+ getExamCenter());
            System.out.println("Certificate Awarding Body: " + getCertificateAwardedBy());
            System.out.println("Certification validity duration: " + getValidTill());
        }
    }
}