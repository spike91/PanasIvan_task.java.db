package app.services;

import app.repositories.*;
import app.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CourseService {
    @Autowired
    CourseRepository courseRepository;
    @Autowired
    UserRepository userRepository;

    public Iterable<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    public Course getCourseByID(long id) {
        return courseRepository.findOne(id);
    }

    @Transactional
    public int updateCourseTitle(long id, String title) {
        return courseRepository.setNewTitle(title, id);
    }

    @Modifying
    @Transactional
    public void saveUserToCourse(Long userId, Long courseId) {
        if (courseId != null && userId != null) {
            if(!isUserRegisterOnCourse(userId,courseId)){
            courseRepository.setCourseUser(courseId, userId);
            }
        }
    }

    public void updateCourse(Course course) {
        updateCourse(course.getId(), course);
    }
    
    public void updateCourse(Long id, Course newData) {
        this.courseRepository.updateCourse(
                id,
                newData.getTitle(), 
                newData.getDescription(), 
                newData.getCourseCode());
    }

    @Transactional
    public boolean isUserRegisterOnCourse(Long userId, Long courseId) {
        Course course = courseRepository.findOne(courseId);
        User user = userRepository.findOne(userId);
        return course.isUserExist(user);
    }

    @Transactional
    public void deleteUserFromCourse(Long userId, Long courseId) {
        courseRepository.deleteUserFromCourse(userId,courseId);
    }
}