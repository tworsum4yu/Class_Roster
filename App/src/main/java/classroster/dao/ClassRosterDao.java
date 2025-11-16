package classroster.dao;

import classroster.dto.Student;
import java.util.List;

public interface ClassRosterDao {
    void addStudent(String studentId, Student student) throws ClassRosterExecptionDao;
    List<Student> getAllStudents() throws ClassRosterExecptionDao;
    Student getStudent(String studentId) throws ClassRosterExecptionDao;
    Student removeStudent(String studentId) throws ClassRosterExecptionDao;
}
