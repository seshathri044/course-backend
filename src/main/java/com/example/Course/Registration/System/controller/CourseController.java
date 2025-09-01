@RestController
@CrossOrigin(
    origins = {
        "http://localhost:5500",
        "http://127.0.0.1:5500",
        "https://course-register-system.netlify.app"
    },
    methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE}
)
public class CourseController {

    @Autowired
    CourseService courseService;

    @GetMapping("/courses")
    public List<Course> availableCourses() {
        return courseService.availableCourses();
    }

    @GetMapping("/courses/enrolled")
    public List<CourseRegister> enrolledStudent() {
        return courseService.enrolledStudent();
    }

    @PostMapping("/courses/register")
    public String enrolledCourse(@RequestParam("name") String name,
                                 @RequestParam("emailId") String emailId,
                                 @RequestParam("courseName") String courseName) {
        courseService.enrollCourse(name, emailId, courseName);
        return "Congratulation! " + name + " Enrollment Successful for " + courseName;
    }
}
