package Interfaces;

import Model.Group;
import Model.Student;

import java.util.List;

public interface StudentInterfaces {
    List<Student> getAllStudents(List<Student>students);
    void addNewStudentToGroup(List<Group> students);
    void FindStudentByFirstName(List<Student> students);
    void GetAllStudentsLesson(List<Group> groups);
    void updateStudent(List<Student> students);
    void deleteStudent(List<Group> groups);
}
