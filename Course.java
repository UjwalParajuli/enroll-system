/**
 * In Course class, the atrributes are initialized in the consrtructor and one attribute among them is assigned as empty string.
 * Then, all the attributes are accessed by their own public method.
 * Finally, a display method has shown the final output.
 *
 * @author Ujwal Parajuli
 * @version (a version number or a date)
 */


/**
 * A class named Course is created
 */
public class Course
{
    private String courseName;
    private String instructorsName;
    private String studentsName;
    private int totalHours;

    /**
     * Three attributes are initialized in the constructor
     */
    public Course(String nameCourse, String nameInstructor, int hours)
    {
        this.courseName = nameCourse;
        this.instructorsName = nameInstructor;
        this.totalHours = hours;
        this.studentsName = " "; // The attribute 'studentsName' is assigned as empty string
    }

    /**
     * An accessor methods are defined for the private attributes to access them
     */
    public String getCourseName()
    {

        return courseName;
    }

    public String getInstructorName()
    {

        return instructorsName;
    }

    public String getStudentsName()
    {

        return studentsName;
    }

    public int getTotalHours()
    {

        return totalHours;
    }

    public void setStudentsName(String nameStudent) // A method is defined to set the name in attribute 'studentsName'
    {
        this.studentsName = nameStudent;
    }

    public void display()
    {
        System.out.println("Course Name: " + getCourseName());
        System.out.println("Instructors Name: " + getInstructorName());
        System.out.println("Total Hours: " + getTotalHours());

        // The if statement is applied for the certain condition
        if(studentsName != " "){
            System.out.println("Students Name: " + getStudentsName());
        }

    }



}
