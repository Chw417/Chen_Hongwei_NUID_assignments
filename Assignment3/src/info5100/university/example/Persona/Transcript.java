/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Persona;

import info5100.university.example.CourseSchedule.CourseLoad;
import info5100.university.example.CourseSchedule.CourseOffer;
import info5100.university.example.CourseSchedule.SeatAssignment;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author kal bugrara
 */
public class Transcript {

    StudentProfile student;
    HashMap<String, CourseLoad> courseloadlist;

    CourseLoad currentcourseload;

    public Transcript(StudentProfile sp) {
        student = sp;
        courseloadlist = new HashMap();

    }

    public int getStudentSatisfactionIndex() {
        //for each courseload 
        //get seatassigmnets; 
        //for each seatassignment add 1 if like =true;
        return 0;
    }

    public CourseLoad newCourseLoad(String sem) {

        currentcourseload = new CourseLoad(sem);
        courseloadlist.put(sem, currentcourseload);
        return currentcourseload;
    }

    public CourseLoad getCurrentCourseLoad() {

        return currentcourseload;

    }

    public CourseLoad getCourseLoadBySemester(String semester) {

        return courseloadlist.get(semester);

    }

    public float getStudentTotalScore() {
        float totalScore = 0;

        for (CourseLoad cl : courseloadlist.values()) {
            totalScore += cl.getSemesterScore(); // 获取每个课程负载的总分
        }

        return totalScore;
    }

    //sat index means student rated their courses with likes;
    public int getStudentSatifactionIndex() {
        ArrayList<SeatAssignment> courseregistrations = getCourseList();
        int sum = 0;
        for (SeatAssignment sa : courseregistrations) {

            if (sa.getLike()) {
                sum = sum + 1;
            }
        }
        return sum;
    }
    //generate a list of all courses taken so far (seetassignments) 
    //from multiple semesters (course loads)
    //from seat assignments we will be able to access the course offers

    public ArrayList<SeatAssignment> getCourseList() {
        ArrayList temp2;
        temp2 = new ArrayList();

        for (CourseLoad cl : courseloadlist.values()) { //extract cl list as objects --ignore label
            temp2.addAll(cl.getSeatAssignments()); //merge one array list to another
        }

        return temp2;

    }

    public float getScoreByCourse(String courseNumber) {
        for (CourseLoad cl : courseloadlist.values()) {
            for (SeatAssignment sa : cl.getSeatAssignments()) {
                if (sa.getCourseOffer().getCourseNumber().equals(courseNumber)) {
                    return sa.getGrade(); // 返回指定课程的分数
                }
            }
        }
        return 0;
    }
 

    public double calculateGPAByCourse(String courseNumber) {
        float grade = 0;
        float credits = 0;

        for (CourseLoad cl : courseloadlist.values()) {
            for (SeatAssignment sa : cl.getSeatAssignments()) {
                CourseOffer co = sa.getSeat().getCourseOffer();
                if (co.getCourseNumber().equals(courseNumber)) {
                    grade = sa.getGrade();
                    credits = co.getCredits();
                    break;
                }
            }
        }

        if (credits == 0) return 0;

        double gpa = grade / 25;  // 假设 100 分对应 GPA 4.0，按比例计算
        return Math.min(Math.max(gpa, 0), 4);
    }

}
    
