package app.repositories;

import app.models.Course;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface CourseRepository extends CrudRepository<Course, Long> {

    Course findById(long id);
    Course findByCourseCode(String courseCode);

	@Modifying
	@Transactional(readOnly = false)
	@Query("UPDATE Course SET title = :title WHERE id = :id")
	int setNewTitle(@Param("title") String title, @Param("id") Long id);

	@Modifying
	@Transactional()
	@Query(value="DELETE Courses_Users WHERE users_id = :userId and courses_id = :courseId",nativeQuery = true)
	void deleteUserFromCourse(@Param("userId") Long userId, @Param("courseId") Long courseId);

    @Modifying
    @Query(value="INSERT INTO COURSES_USERS (COURSES_ID,USERS_ID) VALUES (?,?)",nativeQuery = true)
    @Transactional
	public void setCourseUser(Long course_id, Long user_id);

	@Modifying
    @Transactional
    @Query("update Course c set c.title = :title, c.description = :description, "
            + "c.courseCode = :courseCode where c.id = :id")
    int updateCourse(
            @Param("id") Long id, 
            @Param("title") String title,
            @Param("description") String description,
            @Param("courseCode") String courseCode);
}