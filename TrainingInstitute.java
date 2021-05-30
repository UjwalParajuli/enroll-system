import jdk.internal.dynalink.linker.LinkerServices;
import jdk.nashorn.internal.scripts.JO;

//Importing different class from java class library
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class TrainingInstitute extends JFrame implements ActionListener  {
    //Declaring private variables
    private JPanel p1 = new JPanel(); //declaring and initializing main panel
    private JButton b1,b2,b3,b4,b5,b6,b7; //declaring buttons
    private JTextField tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8,tf9,tf10,tf11,tf12,tf13,tf14,tf15; //declaring textfields
    private ArrayList<Course>myList = new ArrayList<Course>(); //Declaring and initializing ArrayList of type Course
    private Professional pObj;  //Declaring object of Professional class
    private Certification cObj; //Declaring object of Certification class
    private Course obj;         //Declaring object of Course class

    //Main method
    public static void main(String [] args){

        new TrainingInstitute();   //Calling the constructor
    }

    public TrainingInstitute() {     //Constructor
        p1.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(10, 5, 5, 5);

        //Arranging Labels in the frame
        JLabel l1 = new JLabel("Course Name");
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.ipadx = 3;  //width of the component
        gbc.ipady = 3;  //height of the component
        p1.add(l1, gbc);

        JLabel l2 = new JLabel("Instructor Name");
        gbc.gridx = 0;
        gbc.gridy = 1;
        p1.add(l2, gbc);

        JLabel l3 = new JLabel("Course Fee");
        gbc.gridx = 0;
        gbc.gridy = 2;
        p1.add(l3, gbc);

        JLabel l4 = new JLabel("Course Duration");
        gbc.gridx = 2;
        gbc.gridy = 2;
        p1.add(l4, gbc);

        JLabel l5 = new JLabel("Daily Course Hour");
        gbc.gridx = 0;
        gbc.gridy = 3;
        p1.add(l5, gbc);

        JLabel l6 = new JLabel("Certificate Validity Duration");
        gbc.gridx = 2;
        gbc.gridy = 3;
        p1.add(l6, gbc);

        JLabel l7 = new JLabel("Awarding Body");
        gbc.gridx = 0;
        gbc.gridy = 4;
        p1.add(l7, gbc);

        JLabel l8 = new JLabel("Student Name");
        gbc.gridx = 0;
        gbc.gridy = 6;
        p1.add(l8, gbc);

        JLabel l9 = new JLabel("Enroll Date");
        gbc.gridx = 0;
        gbc.gridy = 7;
        p1.add(l9, gbc);

        JLabel l10 = new JLabel("Down Payment");
        gbc.gridx = 2;
        gbc.gridy = 7;
        p1.add(l10, gbc);

        JLabel l11 = new JLabel("Course No");
        gbc.gridx = 0;
        gbc.gridy = 8;
        p1.add(l11, gbc);

        JLabel l12 = new JLabel("Room No");
        gbc.gridx = 2;
        gbc.gridy = 8;
        p1.add(l12, gbc);

        JLabel l13 = new JLabel("Course Start Date");
        gbc.gridx = 0;
        gbc.gridy = 9;
        p1.add(l13, gbc);

        JLabel l14 = new JLabel("Exam Date");
        gbc.gridx = 2;
        gbc.gridy = 9;
        p1.add(l14, gbc);

        JLabel l15 = new JLabel("Exam Centre");
        gbc.gridx = 0;
        gbc.gridy = 10;
        p1.add(l15, gbc);


        //Arranging buttons in the frame
        b1 = new JButton("Add Course to Professional");
        gbc.gridx = 2;
        gbc.gridy = 5;
        p1.add(b1, gbc);

        b2 = new JButton("Add Course to Certification");
        gbc.gridx = 3;
        gbc.gridy = 5;
        p1.add(b2, gbc);

        b3 = new JButton("Enrol Student to Professional");
        gbc.gridx = 1;
        gbc.gridy = 11;
        p1.add(b3, gbc);

        b4 = new JButton("Enrol Student to Certification");
        gbc.gridx = 2;
        gbc.gridy = 11;
        p1.add(b4, gbc);

        b5 = new JButton("Course Completion Status");
        gbc.gridx = 3;
        gbc.gridy = 11;
        p1.add(b5, gbc);

        b6 = new JButton("Display All");
        gbc.gridx = 1;
        gbc.gridy = 12;
        p1.add(b6, gbc);

        b7 = new JButton("Clear");
        gbc.gridx = 2;
        gbc.gridy = 12;
        p1.add(b7, gbc);



        //Arranging TextFields in the frame
        tf3 = new JTextField();
        gbc.gridx = 1;
        gbc.gridy = 2;
        p1.add(tf3, gbc);

        tf4 = new JTextField();
        gbc.gridx = 3;
        gbc.gridy = 2;
        p1.add(tf4, gbc);

        tf5 = new JTextField();
        gbc.gridx = 1;
        gbc.gridy = 3;
        p1.add(tf5, gbc);

        tf6 = new JTextField();
        gbc.gridx = 3;
        gbc.gridx = 3;
        p1.add(tf6, gbc);

        tf9 = new JTextField();
        gbc.gridx = 1;
        gbc.gridy = 7;
        p1.add(tf9, gbc);

        tf10 = new JTextField();
        gbc.gridx = 3;
        gbc.gridy = 7;
        p1.add(tf10, gbc);

        tf11 = new JTextField();
        gbc.gridx = 1;
        gbc.gridy = 8;
        p1.add(tf11, gbc);

        tf12 = new JTextField();
        gbc.gridx = 3;
        gbc.gridy = 8;
        p1.add(tf12, gbc);

        tf13 = new JTextField();
        gbc.gridx = 1;
        gbc.gridy = 9;
        p1.add(tf13, gbc);

        tf14 = new JTextField();
        gbc.gridx = 3;
        gbc.gridy = 9;
        p1.add(tf14, gbc);

        tf1 = new JTextField();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridwidth = 3; //3 column wide
        p1.add(tf1, gbc);

        tf2 = new JTextField();
        gbc.gridx = 1;
        gbc.gridy = 1;
        p1.add(tf2, gbc);

        tf7 = new JTextField();
        gbc.gridx = 1;
        gbc.gridy = 4;
        p1.add(tf7, gbc);

        tf8 = new JTextField();
        gbc.gridx = 1;
        gbc.gridy = 6;
        p1.add(tf8, gbc);

        tf15 = new JTextField();
        gbc.gridx = 1;
        gbc.gridy = 10;
        p1.add(tf15, gbc);


        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);

        setTitle("Training Institute"); //setting title of the frame
        add(p1, BorderLayout.NORTH); //adding main panel and assigining layout
        setVisible(true);   //making the frame visible
        setSize(750,600); //setting the size of frame
        setResizable(false); //making the frame size fixed
        setDefaultCloseOperation(EXIT_ON_CLOSE); //closing the application when close button of the frame is clicked

    }

    //Getter methods for the textfields

    public String getCourseName () {
        String courseName = tf1.getText();
        return courseName;
    }

    public String getInstructorName() {
        String instructorName = tf2.getText();
        return instructorName;
    }

    public int getCourseFee() {
        int courseFee = Integer.parseInt(tf3.getText());  //Converting string to integer
        return courseFee;
    }

    public int getCourseDuration() {
        int courseDuration = Integer.parseInt(tf4.getText());
        return courseDuration;
    }

    public int getDailyHour() {
        int dailyHour = Integer.parseInt(tf5.getText());
        return dailyHour;
    }

    public String getValidityDuration() {
        String validityDuration = tf6.getText();
        return validityDuration;
    }

    public String getAwardingBody() {
        String awardingBody = tf7.getText();
        return awardingBody;
    }

    public String getStudentName() {
        String studentName = tf8.getText();
        return studentName;
    }

    public String getEnrollDate() {
        String enrollDate = tf9.getText();
        return enrollDate;
    }

    public int getDownPayment() {
        int downPayment = Integer.parseInt(tf10.getText());
        return downPayment;
    }

    public int getCourseNo() {
        int courseNo = Integer.parseInt(tf11.getText());
        return courseNo;
    }

    public String getRoomNo() {
        String roomNo = tf12.getText();
        return roomNo;
    }

    public String getCourseStartDate() {
        String courseStartDate = tf13.getText();
        return courseStartDate;
    }

    public String getExamDate() {
        String examDate = tf14.getText();
        return examDate;
    }

    public String getExamCentre() {
        String examCentre = tf15.getText();
        return examCentre;
    }

    //Methods for each buttons and writing code for functionality of buttons
    public void addToProfessional(){
        //checking if the textfield is empty or not
        if (getCourseName().isEmpty() || getInstructorName().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill the empty textfield to add to Professional");
            tf11.setText("-1");
        }
        else {
            //adding try catch blocks to avoid errors
            try {
                //creating object of type Professional and passing parameters into it
                pObj = new Professional(getCourseName(), getInstructorName(), getCourseFee(), getCourseDuration(), getDailyHour());
                myList.add(pObj); //adding object of Professional into array list
                System.out.println("Array List = "+myList); //printing array list after adding object
                JOptionPane.showMessageDialog(null, "Successfully added to Professional");
            } catch (NumberFormatException f) {
                //making dialog box appears when error occurs
                JOptionPane.showMessageDialog(null, "Please check whether you have entered integer" +
                        " value or not in Course Fee, Course Duration and Daily Hour. If not, then please enter the integer value only");
                tf11.setText("-1");
            } catch (Exception g) {
                JOptionPane.showMessageDialog(null, g.getMessage());
                tf11.setText("-1");
            }
        }

    }

    public void addToCertification(){
        //checking if the textfield is empty or not
        if(getCourseName().isEmpty() || getInstructorName().isEmpty()){
            JOptionPane.showMessageDialog(null,"Please fill the empty textfields to add to Certification");
            tf11.setText("-1");
        }
        else {
            //adding try catch blocks to avoid errors
            try {
                //creating object of type Certification and passing parameters into it
                cObj = new Certification(getCourseName(),getInstructorName(),getCourseDuration(),getCourseFee(),getAwardingBody(),getValidityDuration());
                myList.add(cObj);   //adding object of Certification into array list
                System.out.println("Array List = " + myList);   //printing arraylist after adding the object
                JOptionPane.showMessageDialog(null, "Successfully added to Certification");
            } catch (NumberFormatException f) {
                //making dialog box appears when error occurs
                JOptionPane.showMessageDialog(null, "Please check whether you have entered integer" +
                        " value or not in Course Fee and Course Duartion. If not, then please enter the integer value only");
                tf11.setText("-1");
            } catch (Exception g) {
                JOptionPane.showMessageDialog(null, g.getMessage());
                tf11.setText("-1");
            }
        }

    }

    public void enrolToProfessional(){
        //checking if the textfield is empty or not
        if(getStudentName().isEmpty() || getEnrollDate().isEmpty() || getRoomNo().isEmpty()){
            JOptionPane.showMessageDialog(null,"Please fill the empty textfields to enrol student to Professional");
            tf11.setText("-1");
        }
        else {
            //adding try catch blocks to avoid errors
            try {
                //checking the course number as it is in range or not
                if (myList.indexOf(pObj) == getCourseNo() && getCourseNo() > -1) {
                    //casting pObj into Professional object type and getting appropriate course number
                    pObj = (Professional) myList.get(getCourseNo());
                    //calling method of Professional class and passing parameters into it
                    pObj.enrollStudent(getStudentName(), getEnrollDate(), getDownPayment(), getRoomNo());
                    JOptionPane.showMessageDialog(null, "Successfully enrolled to Professional");
                } else {
                    tf11.setText("-1");
                    JOptionPane.showMessageDialog(null, "Please enter the correct course number");
                }
            } catch (NumberFormatException f) {
                JOptionPane.showMessageDialog(null, "Please check whether you have entered integer" +
                        " value or not in Down Payment and course number. If not, then please enter the integer value only");
                tf11.setText("-1");
            } catch (Exception g) {
                JOptionPane.showMessageDialog(null, g.getMessage());
                tf11.setText("-1");
            }
        }

    }

    public void enrolToCertification(){
        //checking if the textfield is empty or not
        if(getStudentName().isEmpty() || getCourseStartDate().isEmpty() || getExamCentre().isEmpty() || getExamDate().isEmpty()){
            JOptionPane.showMessageDialog(null,"Please fill the empty textfields to enrol student to Certification");
            tf11.setText("-1");
        }
        try {
            if (myList.indexOf(cObj) == getCourseNo() && getCourseNo() > -1) { //Checking course number
                //casting cObj into Certification object type and getting appropriate course number
                cObj = (Certification)myList.get(getCourseNo());
                //calling method of Certification class and passing parameters into it
                cObj.enrollingStudents(getStudentName(), getCourseStartDate(), getExamCentre(), getExamDate());
                JOptionPane.showMessageDialog(null, "Successfully enrolled to Certification");
            } else {
                tf11.setText("-1");
                JOptionPane.showMessageDialog(null, "Please enter the correct course number");
            }
        }catch(NumberFormatException f) {
            JOptionPane.showMessageDialog(null, "Please enter integer number in the course number field");
            tf11.setText("-1");
        }catch(Exception g) {
            JOptionPane.showMessageDialog(null, g.getMessage());
            tf11.setText("-1");
        }

    }

    public void courseStatus(){
        try {
            if (myList.indexOf(pObj) == getCourseNo() && getCourseNo() > -1) { //Checking course number
                //casting pObj into Professional object type and getting appropriate course number
                pObj = (Professional) myList.get(getCourseNo());
                pObj.courseCompletion(); //calling method from Professional class
                JOptionPane.showMessageDialog(null, "Course is completed");
            } else {
                JOptionPane.showMessageDialog(null, "Course is not completed");
            }
        }catch(NumberFormatException f) {
            JOptionPane.showMessageDialog(null, "Please enter integer number in the course number field.");
            tf11.setText("-1");
        }catch(Exception g) {
            JOptionPane.showMessageDialog(null, g.getMessage());
            tf11.setText("-1");
        }

    }

    public void display(){
        //declaring and initializing text area
        JTextArea ta = new JTextArea();
        //setting font of the text inside the text area
        ta.setFont(new Font("Arial", Font.BOLD, 15));
        //making textarea not editable
        ta.setEditable(false);
        //declaring and initializing scroll pane
        JScrollPane pane = new JScrollPane(ta);
        pane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        //adding try catch blocks to avoid errors
        try{
            //using for loop to display all the details of the professional and certification courses
            for(int i = 0; i<myList.size(); i++) {
                //checking the index of the object of professional class in the array list
                if (myList.get(i) instanceof Professional) {
                    Professional pObj = (Professional) myList.get(i);
                    //appending the values in the text area
                    ta.append("\n"+"-----------------------Professional Course Details-----------------------" + "\n" + "\n");
                    ta.append("Course Number:  "+ i + "\n"+"\n" );
                    ta.append("Course Name:  " + pObj.getCourseName() + "\t");
                    ta.append("Instructor Name:  " + pObj.getInstructorName() + "\n");
                    ta.append("Course Fee:  " + pObj.getCourseFee() + "\t");
                    ta.append("Total Hours:  " + pObj.getTotalHours() + "\n");
                    ta.append("Completed Status:  " + pObj.getCompleted() + "\t");
                    ta.append("Enroll Date:  " + pObj.getEnrollDate() + "\n");
                    ta.append("Down Payment:  " + pObj.getDownPayment() + "\t");
                    ta.append("Student's Name:  " + pObj.getStudentsName() + "\n");
                }
                //checking the index of the object of certification class in the array list
                else if (myList.get(i) instanceof Certification) {
                    Certification cObj = (Certification) myList.get(i);
                    //appending the values in the text area
                    ta.append("\n"+ "**************************************************");
                    ta.append("\n" + "------------------Certification Course Details-----------------------" + "\n" + "\n");
                    ta.append("Course Number:  "+ i + "\n" + "\n");
                    ta.append("Course Name:  " + cObj.getCourseName() + "\t"+"\t");
                    ta.append("Instructor Name:  " + cObj.getInstructorName() + "\n");
                    ta.append("Total Hours:  " + cObj.getTotalHours() + "\t"+"\t");
                    ta.append("Start Date:  " + cObj.getStartDate() + "\n");
                    ta.append("Student's Name:  " + cObj.getStudentsName() + "\t"+"\t");
                    ta.append("Exam Date:  " + cObj.getExamDate() + "\n");
                    ta.append("Exam Center:  " + cObj.getExamCenter() + "\t"+"\t");
                    ta.append("Certificate Awarding Body:  " + cObj.getCertificateAwardedBy() + "\n");
                    ta.append("Certification validity duration:  " + cObj.getValidTill() + "\n");

                } else {
                    ta.append("There is nothing to display");
                }
            }
        }catch (Exception e){
            //displaying error message
            JOptionPane.showMessageDialog(null,"Error Occurred");
        }
        //declaring and initializing another frame
        JFrame f = new JFrame("Display All");
        //making frame visible
        f.setVisible(true);
        //adding object of JScrollPane
        f.add(pane);
        //setting size of the frame
        f.setSize(2000,2000);

    }

    public void clear(){
        //making text of the textfield null
        tf1.setText(null);
        tf2.setText(null);
        tf3.setText(null);
        tf4.setText(null);
        tf5.setText(null);
        tf6.setText(null);
        tf7.setText(null);
        tf8.setText(null);
        tf9.setText(null);
        tf10.setText(null);
        tf11.setText(null);
        tf12.setText(null);
        tf13.setText(null);
        tf14.setText(null);
        tf15.setText(null);

    }

    //Method for giving action to buttons
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b1) {
            addToProfessional();    //Calling addToProfessional method
        }

        if(e.getSource() == b2){
            addToCertification();   //Calling addToCertification method
        }

        if(e.getSource() == b3){
            enrolToProfessional();  //Calling enrolToProfessional method
        }

        if(e.getSource() == b4){
            enrolToCertification(); //Calling enrolToCertification method
        }

        if(e.getSource() == b5){
            courseStatus();         //Calling courseStatus method
        }

        if(e.getSource() == b6){
            display();              //Calling display method
        }

        if (e.getSource() == b7){
            clear();                //Calling clear method
        }
    }
}


