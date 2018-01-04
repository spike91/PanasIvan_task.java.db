package app.controllers;

import app.models.*;
import app.services.*;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
    @Autowired
    private CourseService courseService;
    
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/")
    public String getCourses(Model model) {
        model.addAttribute("courses", courseService.getAllCourses());
        return "index";
    }

    @RequestMapping(value = "/course/{id}")
    public String getCourseInfo(@PathVariable("id") Long id, Model model) {
        model.addAttribute("course", courseService.getCourseByID(id));
        return "course";
    }

    @RequestMapping(value = "/course/{courseId}/user/delete/{userId}")
    public String getCourseInfo(@PathVariable("courseId") Long courseId, @PathVariable("userId") Long userId, Model model) {
        courseService.deleteUserFromCourse(userId, courseId);
        return "redirect:/course/"+courseId;
    }

    @RequestMapping(value = "/course/{courseId}/user/register/{userId}")
    public String getRegisterUserToCourse(@PathVariable("courseId") Long courseId,
    @PathVariable("userId") Long userId, Model model) {
        courseService.saveUserToCourse(userId, courseId);
        return "redirect:/course/" + courseId;
    }

    @RequestMapping("/course/edit/{id}")
    public String edit(@PathVariable("id") Long id, Course course) {
        User loggedInUser = userService.getLoggedInUser();
        Course c = courseService.getCourseByID(id);
        if(!loggedInUser.isAdmin()) {
            return "user/premission-denied";
        } else {        
            course.setTitle(c.getTitle());
        course.setCourseCode(c.getCourseCode());
        course.setDescription(c.getDescription());
        course.setId(c.getId());
        }
        return "/course/edit";
    }
    
    @RequestMapping(value = "/course/edit", method = RequestMethod.POST)
    public String editPost(@Valid Course course, BindingResult result) {
        
        if(userService.getLoggedInUser().isAdmin()) {
            courseService.updateCourse(course);
        }

        return "redirect:/course/edit/" + course.getId() + "?updated";
    }
}
