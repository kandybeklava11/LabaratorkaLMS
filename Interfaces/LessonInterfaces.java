package Interfaces;

import Model.Group;
import Model.Lesson;
import Model.Student;

import java.util.List;

public interface LessonInterfaces {
    List<Lesson> getAllLessons(List<Lesson>lessons);
    void addNewLessonToGroup(List<Group> groups);
    void GetLessonByName(List<Lesson> lessons);
    void GetAllLessonByGroupName(List<Group> groups);
    void deleteLesson(List<Group> groups);
}
