/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Campus;

import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.CourseCatalog.CourseCatalog;
import info5100.university.example.CourseSchedule.CourseLoad;
import info5100.university.example.CourseSchedule.CourseOffer;
import info5100.university.example.CourseSchedule.CourseSchedule;
import info5100.university.example.CourseSchedule.SeatAssignment;
import info5100.university.example.Department.Department;
import info5100.university.example.Persona.Person;
import info5100.university.example.Persona.PersonDirectory;
import info5100.university.example.Persona.StudentDirectory;
import info5100.university.example.Persona.StudentProfile;
import info5100.university.example.Persona.Faculty.FacultyAssignment;
import info5100.university.example.Persona.Faculty.FacultyProfile;

/**
 *
 * @author kal bugrara
 */
public class CampusMainExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        0. Create Address object  
        1. create campus object
        2. Create and add buildings
        3. Create and floors
        4. Create and add rooms
        5. Assign sprinkers.
        6. Write methods to determine is campus safe => are builinds safe etc.
*/

         // TODO code application logic here
        Department department = new Department("Information Systems");
        CourseCatalog coursecatalog = department.getCourseCatalog();

        Course coreCourse = coursecatalog.newCourse("app eng", "corecourse info 5100", 4);
        Course course2 = coursecatalog.newCourse("algorithms", "info 6205", 4);
        Course course3 = coursecatalog.newCourse("algorithms", "info 6000", 4);
        Course course4= coursecatalog.newCourse("algorithms", "info 6105", 4);
        Course course5 = coursecatalog.newCourse("algorithms", "info 6250", 4);
        Course course6 = coursecatalog.newCourse("algorithms", "info 5120", 4);


        CourseSchedule courseschedule = department.newCourseSchedule("Fall2024");

        CourseOffer courseoffer = courseschedule.newCourseOffer("corecourse info 5100");
        CourseOffer courseoffer2 = courseschedule.newCourseOffer("info 6205");
        CourseOffer courseoffer3 = courseschedule.newCourseOffer("info 6000");
        CourseOffer courseoffer4 = courseschedule.newCourseOffer("info 6105");
        CourseOffer courseoffer5 = courseschedule.newCourseOffer("info 6250");
        CourseOffer courseoffer6 = courseschedule.newCourseOffer("info 5120"); //设置课程
        
        if (courseoffer==null)return;
        courseoffer.generatSeats(10);
        courseoffer2.generatSeats(50);
        courseoffer3.generatSeats(50);
        courseoffer4.generatSeats(50);
        courseoffer5.generatSeats(50);
        courseoffer6.generatSeats(50);

        PersonDirectory pd = department.getPersonDirectory();
        Person facultyPerson = pd.newPerson("Jack");
        Person facultyPerson2 = pd.newPerson("Jack2");
        Person facultyPerson3 = pd.newPerson("Jack3");
        Person facultyPerson4 = pd.newPerson("Jack4");
        Person facultyPerson5 = pd.newPerson("Jack5");
        Person facultyPerson6 = pd.newPerson("Jack6");

        FacultyProfile faculty = new FacultyProfile(facultyPerson);
        FacultyProfile faculty2 = new FacultyProfile(facultyPerson2);
        FacultyProfile faculty3 = new FacultyProfile(facultyPerson3);
        FacultyProfile faculty4 = new FacultyProfile(facultyPerson4);
        FacultyProfile faculty5 = new FacultyProfile(facultyPerson5);
        FacultyProfile faculty6 = new FacultyProfile(facultyPerson6);


        courseoffer.AssignAsTeacher(faculty); // 将教师分配到该课程上
        courseoffer2.AssignAsTeacher(faculty2);
        courseoffer3.AssignAsTeacher(faculty3);
        courseoffer4.AssignAsTeacher(faculty4);
        courseoffer5.AssignAsTeacher(faculty5);
        courseoffer6.AssignAsTeacher(faculty6);


        FacultyProfile assignedTeacher = courseoffer.getFacultyProfile();
        FacultyProfile assignedTeacher2 = courseoffer2.getFacultyProfile();
        FacultyProfile assignedTeacher3 = courseoffer3.getFacultyProfile();
        FacultyProfile assignedTeacher4 = courseoffer4.getFacultyProfile();
        FacultyProfile assignedTeacher5 = courseoffer5.getFacultyProfile();
        FacultyProfile assignedTeacher6 = courseoffer6.getFacultyProfile();

        System.out.println("Assigned Teacher for INFO5100: " + assignedTeacher.person.getPersonId());
        System.out.println("Assigned Teacher for INFO6205: " + assignedTeacher2.person.getPersonId());
        System.out.println("Assigned Teacher for INFO6000: " + assignedTeacher3.person.getPersonId());
        System.out.println("Assigned Teacher for INFO6105: " + assignedTeacher4.person.getPersonId());
        System.out.println("Assigned Teacher for INFO6250: " + assignedTeacher5.person.getPersonId());
        System.out.println("Assigned Teacher for INFO5120: " + assignedTeacher6.person.getPersonId());

        // 使用AssignAsTeacher时传入评分
        // 分配教师并设置评分
        FacultyAssignment assignment1 = courseoffer.AssignAsTeacher(faculty);
        assignment1.seProfRating(4.5); // 设置评分为4.5

        FacultyAssignment assignment2 = courseoffer2.AssignAsTeacher(faculty2);
        assignment2.seProfRating(4.0); // 设置评分为4.0

        FacultyAssignment assignment3 = courseoffer3.AssignAsTeacher(faculty3);
        assignment3.seProfRating(4.0); // 设置评分为4.0
        FacultyAssignment assignment4 = courseoffer4.AssignAsTeacher(faculty4);
        assignment4.seProfRating(4.0); // 设置评分为4.0
        FacultyAssignment assignment5 = courseoffer5.AssignAsTeacher(faculty5);
        assignment5.seProfRating(4.0); // 设置评分为4.0
        FacultyAssignment assignment6 = courseoffer6.AssignAsTeacher(faculty6);
        assignment6.seProfRating(4.0); // 设置评分为4.0

//添加学生到课程：
        PersonDirectory pd1 = department.getPersonDirectory();

        Person person = pd1.newPerson("0112303");
        Person person2 = pd1.newPerson("200");
        Person person3 = pd1.newPerson("2001");
        Person person4 = pd1.newPerson("2002");
        Person person5 = pd1.newPerson("2003");
        Person person6 = pd1.newPerson("2004");
        Person person7 = pd1.newPerson("2005");
        Person person8 = pd1.newPerson("2006");
        Person person9 = pd1.newPerson("2007");
        Person person10 = pd1.newPerson("2008");

        StudentDirectory sd = department.getStudentDirectory();
        StudentProfile student = sd.newStudentProfile(person);
        StudentProfile student2 = sd.newStudentProfile(person2);
        StudentProfile student3 = sd.newStudentProfile(person3);
        StudentProfile student4 = sd.newStudentProfile(person4);
        StudentProfile student5 = sd.newStudentProfile(person5);
        StudentProfile student6 = sd.newStudentProfile(person6);
        StudentProfile student7 = sd.newStudentProfile(person7);
        StudentProfile student8 = sd.newStudentProfile(person8);
        StudentProfile student9 = sd.newStudentProfile(person9);
        StudentProfile student10 = sd.newStudentProfile(person10);

        CourseLoad courseload = student.newCourseLoad("Fall2024"); 
        CourseLoad courseload2 = student2.newCourseLoad("Fall2024");
        CourseLoad courseload3 = student3.newCourseLoad("Fall2024");
        CourseLoad courseload4 = student4.newCourseLoad("Fall2024");
        CourseLoad courseload5 = student5.newCourseLoad("Fall2024");
        CourseLoad courseload6 = student6.newCourseLoad("Fall2024");
        CourseLoad courseload7 = student7.newCourseLoad("Fall2024");
        CourseLoad courseload8 = student8.newCourseLoad("Fall2024");
        CourseLoad courseload9 = student9.newCourseLoad("Fall2024");
        CourseLoad courseload10 = student10.newCourseLoad("Fall2024");

     
        SeatAssignment sa1 = courseload.newSeatAssignment(courseoffer);
        SeatAssignment sa2 = courseload2.newSeatAssignment(courseoffer);
        SeatAssignment sa2a = courseload2.newSeatAssignment(courseoffer2);//student2 同时参加两个课程
        SeatAssignment sa3 = courseload3.newSeatAssignment(courseoffer);
        SeatAssignment sa3a = courseload3.newSeatAssignment(courseoffer3);
        SeatAssignment sa4 = courseload4.newSeatAssignment(courseoffer);
        SeatAssignment sa4a = courseload4.newSeatAssignment(courseoffer4);
        SeatAssignment sa5 = courseload5.newSeatAssignment(courseoffer);
        SeatAssignment sa5a = courseload5.newSeatAssignment(courseoffer5);
        SeatAssignment sa6 = courseload6.newSeatAssignment(courseoffer);
        SeatAssignment sa6a = courseload6.newSeatAssignment(courseoffer6);
        SeatAssignment sa6a1 = courseload6.newSeatAssignment(courseoffer5);
        SeatAssignment sa7 = courseload7.newSeatAssignment(courseoffer);
        SeatAssignment sa7a = courseload7.newSeatAssignment(courseoffer6);
        SeatAssignment sa7a1 = courseload7.newSeatAssignment(courseoffer4);
        SeatAssignment sa8 = courseload8.newSeatAssignment(courseoffer);
        SeatAssignment sa8a = courseload8.newSeatAssignment(courseoffer3);
        SeatAssignment sa9 = courseload9.newSeatAssignment(courseoffer);
        SeatAssignment sa9a = courseload9.newSeatAssignment(courseoffer4);
        SeatAssignment sa10 = courseload10.newSeatAssignment(courseoffer);//参加的课程
        SeatAssignment sa10a = courseload10.newSeatAssignment(courseoffer5);

        // courseload.registerStudent(sa1);
        // courseload2.registerStudent(sa2);

        // 假设教师为学生评分
        courseload.gradeStudent(sa1, 60); // 学生1得分85
        courseload2.gradeStudent(sa2, 90); // 学生2得分90
        courseload2.gradeStudent(sa2a, 20);//学生2同时两个课程
        courseload3.gradeStudent(sa3, 60); 
        courseload3.gradeStudent(sa3a, 8); 
        courseload4.gradeStudent(sa4, 95); 
        courseload4.gradeStudent(sa4a, 80); 
        courseload5.gradeStudent(sa5, 82); 
        courseload5.gradeStudent(sa5a, 88); 
        courseload6.gradeStudent(sa6, 69); 
        courseload6.gradeStudent(sa6a, 95); 
        courseload6.gradeStudent(sa6a1, 79); 
        courseload7.gradeStudent(sa7, 100); 
        courseload7.gradeStudent(sa7a, 89);
        courseload7.gradeStudent(sa7a1, 69);  
        courseload8.gradeStudent(sa8, 89); 
        courseload8.gradeStudent(sa8a, 69); 
        courseload9.gradeStudent(sa9, 78); 
        courseload9.gradeStudent(sa9a, 69); 
        courseload10.gradeStudent(sa10, 86); 
        courseload10.gradeStudent(sa10a, 69); 


        // 输出学生总分和GPA
        String courseNumber = sa1.getCourseOffer().getCourseNumber();
        String courseNumber2 = sa2.getCourseOffer().getCourseNumber();
        String courseNumber2a = sa2a.getCourseOffer().getCourseNumber();
        String courseNumber3 = sa3.getCourseOffer().getCourseNumber();
        String courseNumber3a = sa3a.getCourseOffer().getCourseNumber();
        String courseNumber4 = sa4.getCourseOffer().getCourseNumber();
        String courseNumber4a = sa4a.getCourseOffer().getCourseNumber();
        String courseNumber5 = sa5.getCourseOffer().getCourseNumber();
        String courseNumber5a = sa5a.getCourseOffer().getCourseNumber();
        String courseNumber6 = sa6.getCourseOffer().getCourseNumber();
        String courseNumber6a = sa6a.getCourseOffer().getCourseNumber();
        String courseNumber6a1 = sa6a1.getCourseOffer().getCourseNumber();
        String courseNumber7 = sa7.getCourseOffer().getCourseNumber();
        String courseNumber7a = sa7a.getCourseOffer().getCourseNumber();
        String courseNumber7a1 = sa7a1.getCourseOffer().getCourseNumber();
        String courseNumber8 = sa8.getCourseOffer().getCourseNumber();
        String courseNumber8a = sa8a.getCourseOffer().getCourseNumber();
        String courseNumber9 = sa9.getCourseOffer().getCourseNumber();
        String courseNumber9a = sa9a.getCourseOffer().getCourseNumber();
        String courseNumber10 = sa10.getCourseOffer().getCourseNumber();
        String courseNumber10a = sa10a.getCourseOffer().getCourseNumber();
        //总共参加了21个课程，所以得到总价格21*每门课（4*1500）
       
       // 输出学生总分和GPA
        System.out.println("Course: " + sa1.getCourseOffer().getCourseNumber()+", Student ID: " + person.getPersonId() + " Total Score: " + student.getTranscript().getStudentTotalScore()+",Average GPA:"+(student.getTranscript().calculateGPAByCourse(courseNumber)));
        System.out.println("Student ID: " + person.getPersonId() + " ScoreByCourse: " + student.getTranscript().getScoreByCourse(courseNumber)+" GPA: " + student.getTranscript().calculateGPAByCourse(courseNumber));

        System.out.println("Course: " + sa2.getCourseOffer().getCourseNumber()+", Student ID: " + person2.getPersonId() + " Total Score: " + student2.getTranscript().getStudentTotalScore()+",Average GPA:"+((student2.getTranscript().calculateGPAByCourse(courseNumber2))+(student2.getTranscript().calculateGPAByCourse(courseNumber2a)))/2);
        System.out.println("Student ID: " + person2.getPersonId() + " ScoreByCourse: " + student2.getTranscript().getScoreByCourse(courseNumber2)+" GPA: " + student2.getTranscript().calculateGPAByCourse(courseNumber));

        System.out.println("Course: " + sa2a.getCourseOffer().getCourseNumber() + ", Student ID: " + person2.getPersonId() + " Total Score: " + student2.getTranscript().getStudentTotalScore());
        System.out.println("Student ID: " + person2.getPersonId() + " ScoreByCourse: " + student2.getTranscript().getScoreByCourse(courseNumber2a)+" GPA: " + student2.getTranscript().calculateGPAByCourse(courseNumber2a));
        
        System.out.println("Course: " + sa3.getCourseOffer().getCourseNumber()+", Student ID: " + person3.getPersonId() + " Total Score: " + student3.getTranscript().getStudentTotalScore()+",Average GPA:"+((student3.getTranscript().calculateGPAByCourse(courseNumber3))+(student3.getTranscript().calculateGPAByCourse(courseNumber3a)))/2);
        System.out.println("Student ID: " + person3.getPersonId() + " ScoreByCourse: " + student3.getTranscript().getScoreByCourse(courseNumber3)+" GPA: " + student3.getTranscript().calculateGPAByCourse(courseNumber3));

        System.out.println("Course: " + sa3a.getCourseOffer().getCourseNumber()+", Student ID: " + person3.getPersonId() + " Total Score: " + student3.getTranscript().getStudentTotalScore());
        System.out.println("Student ID: " + person3.getPersonId() + " ScoreByCourse: " + student3.getTranscript().getScoreByCourse(courseNumber3a)+" GPA: " + student3.getTranscript().calculateGPAByCourse(courseNumber3a));
        
        System.out.println("Course: " + sa4.getCourseOffer().getCourseNumber()+", Student ID: " + person4.getPersonId() + " Total Score: " + student4.getTranscript().getStudentTotalScore()+",Average GPA:"+((student4.getTranscript().calculateGPAByCourse(courseNumber4))+(student4.getTranscript().calculateGPAByCourse(courseNumber4a)))/2);
        System.out.println("Student ID: " + person4.getPersonId() + " ScoreByCourse: " + student4.getTranscript().getScoreByCourse(courseNumber4)+" GPA: " + student4.getTranscript().calculateGPAByCourse(courseNumber4));

        System.out.println("Course: " + sa4a.getCourseOffer().getCourseNumber()+", Student ID: " + person4.getPersonId() + " Total Score: " + student4.getTranscript().getStudentTotalScore());
        System.out.println("Student ID: " + person4.getPersonId() + " ScoreByCourse: " + student4.getTranscript().getScoreByCourse(courseNumber4a)+" GPA: " + student4.getTranscript().calculateGPAByCourse(courseNumber4a));

        System.out.println("Course: " + sa5.getCourseOffer().getCourseNumber()+", Student ID: " + person5.getPersonId() + " Total Score: " + student5.getTranscript().getStudentTotalScore()+",Average GPA:"+((student5.getTranscript().calculateGPAByCourse(courseNumber5))+(student5.getTranscript().calculateGPAByCourse(courseNumber5a)))/2);
        System.out.println("Student ID: " + person5.getPersonId() + " ScoreByCourse: " + student5.getTranscript().getScoreByCourse(courseNumber5)+" GPA: " + student5.getTranscript().calculateGPAByCourse(courseNumber5));

        System.out.println("Course: " + sa5a.getCourseOffer().getCourseNumber()+", Student ID: " + person5.getPersonId() + " Total Score: " + student5.getTranscript().getStudentTotalScore());
        System.out.println("Student ID: " + person5.getPersonId() + " ScoreByCourse: " + student5.getTranscript().getScoreByCourse(courseNumber5a)+" GPA: " + student5.getTranscript().calculateGPAByCourse(courseNumber5a));

        System.out.println("Course: " + sa6.getCourseOffer().getCourseNumber()+", Student ID: " + person6.getPersonId() + " Total Score: " + student6.getTranscript().getStudentTotalScore()+",Average GPA:"+((student6.getTranscript().calculateGPAByCourse(courseNumber6))+(student6.getTranscript().calculateGPAByCourse(courseNumber6a))+(student6.getTranscript().calculateGPAByCourse(courseNumber6a1)))/3);
        System.out.println("Student ID: " + person6.getPersonId() + " ScoreByCourse: " + student6.getTranscript().getScoreByCourse(courseNumber6)+" GPA: " + student6.getTranscript().calculateGPAByCourse(courseNumber6));

        System.out.println("Course: " + sa6a.getCourseOffer().getCourseNumber()+", Student ID: " + person6.getPersonId() + " Total Score: " + student6.getTranscript().getStudentTotalScore());
        System.out.println("Student ID: " + person6.getPersonId() + " ScoreByCourse: " + student6.getTranscript().getScoreByCourse(courseNumber6a)+" GPA: " + student6.getTranscript().calculateGPAByCourse(courseNumber6a));

        System.out.println("Course: " + sa6a1.getCourseOffer().getCourseNumber()+", Student ID: " + person6.getPersonId() + " Total Score: " + student6.getTranscript().getStudentTotalScore());
        System.out.println("Student ID: " + person6.getPersonId() + " ScoreByCourse: " + student6.getTranscript().getScoreByCourse(courseNumber6a1)+" GPA: " + student6.getTranscript().calculateGPAByCourse(courseNumber6a1));

        System.out.println("Course: " + sa7.getCourseOffer().getCourseNumber()+", Student ID: " + person7.getPersonId() + " Total Score: " + student7.getTranscript().getStudentTotalScore()+",Average GPA:"+((student7.getTranscript().calculateGPAByCourse(courseNumber7))+(student7.getTranscript().calculateGPAByCourse(courseNumber7a))+(student7.getTranscript().calculateGPAByCourse(courseNumber7a1)))/3);
        System.out.println("Student ID: " + person7.getPersonId() + " ScoreByCourse: " + student7.getTranscript().getScoreByCourse(courseNumber7)+" GPA: " + student7.getTranscript().calculateGPAByCourse(courseNumber7));

        System.out.println("Course: " + sa7a.getCourseOffer().getCourseNumber()+", Student ID: " + person7.getPersonId() + " Total Score: " + student7.getTranscript().getStudentTotalScore());
        System.out.println("Student ID: " + person7.getPersonId() + " ScoreByCourse: " + student7.getTranscript().getScoreByCourse(courseNumber7a)+" GPA: " + student7.getTranscript().calculateGPAByCourse(courseNumber7a));

        System.out.println("Course: " + sa7a1.getCourseOffer().getCourseNumber()+", Student ID: " + person7.getPersonId() + " Total Score: " + student7.getTranscript().getStudentTotalScore());
        System.out.println("Student ID: " + person7.getPersonId() + " ScoreByCourse: " + student7.getTranscript().getScoreByCourse(courseNumber7a1)+" GPA: " + student7.getTranscript().calculateGPAByCourse(courseNumber7a1));

        System.out.println("Course: " + sa8.getCourseOffer().getCourseNumber()+", Student ID: " + person8.getPersonId() + " Total Score: " + student8.getTranscript().getStudentTotalScore()+",Average GPA:"+((student8.getTranscript().calculateGPAByCourse(courseNumber8))+(student8.getTranscript().calculateGPAByCourse(courseNumber8a)))/2);
        System.out.println("Student ID: " + person8.getPersonId() + " ScoreByCourse: " + student8.getTranscript().getScoreByCourse(courseNumber8)+" GPA: " + student8.getTranscript().calculateGPAByCourse(courseNumber8));

        System.out.println("Course: " + sa8a.getCourseOffer().getCourseNumber()+", Student ID: " + person8.getPersonId() + " Total Score: " + student8.getTranscript().getStudentTotalScore());
        System.out.println("Student ID: " + person8.getPersonId() + " ScoreByCourse: " + student8.getTranscript().getScoreByCourse(courseNumber8a)+" GPA: " + student8.getTranscript().calculateGPAByCourse(courseNumber8a));

        System.out.println("Course: " + sa9.getCourseOffer().getCourseNumber()+", Student ID: " + person9.getPersonId() + " Total Score: " + student9.getTranscript().getStudentTotalScore()+",Average GPA:"+((student9.getTranscript().calculateGPAByCourse(courseNumber9))+(student9.getTranscript().calculateGPAByCourse(courseNumber9a)))/2);
        System.out.println("Student ID: " + person9.getPersonId() + " ScoreByCourse: " + student9.getTranscript().getScoreByCourse(courseNumber9)+" GPA: " + student9.getTranscript().calculateGPAByCourse(courseNumber9));

        System.out.println("Course: " + sa9a.getCourseOffer().getCourseNumber()+", Student ID: " + person9.getPersonId() + " Total Score: " + student9.getTranscript().getStudentTotalScore());
        System.out.println("Student ID: " + person9.getPersonId() + " ScoreByCourse: " + student9.getTranscript().getScoreByCourse(courseNumber9a)+" GPA: " + student9.getTranscript().calculateGPAByCourse(courseNumber9a));


        System.out.println("Course: " + sa10.getCourseOffer().getCourseNumber()+", Student ID: " + person10.getPersonId() + " Total Score: " + student10.getTranscript().getStudentTotalScore()+",Average GPA:"+((student10.getTranscript().calculateGPAByCourse(courseNumber10))+(student10.getTranscript().calculateGPAByCourse(courseNumber10a)))/2);
        System.out.println("Student ID: " + person10.getPersonId() + " ScoreByCourse: " + student10.getTranscript().getScoreByCourse(courseNumber10)+" GPA: " + student10.getTranscript().calculateGPAByCourse(courseNumber10));

        System.out.println("Course: " + sa10a.getCourseOffer().getCourseNumber()+", Student ID: " + person10.getPersonId() + " Total Score: " + student10.getTranscript().getStudentTotalScore());
        System.out.println("Student ID: " + person10.getPersonId() + " ScoreByCourse: " + student10.getTranscript().getScoreByCourse(courseNumber10a)+" GPA: " + student10.getTranscript().calculateGPAByCourse(courseNumber10a));



        int total = department.calculateRevenuesBySemester("Fall2024");
        
        System.out.print("Total: " + total);
    }
    
}
