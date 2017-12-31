package app.models;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Course extends Model {
    private String title;
    private String description;
    @Column(name = "course_code")
    private String courseCode;

    @ManyToMany(cascade=CascadeType.ALL)
    @JoinTable(name = "Courses_Users")
    private Set<User> users;

    public Course() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    public boolean isUserExist(User user) {        
        return user == null ? false : getUsers().contains(user);
    }
}