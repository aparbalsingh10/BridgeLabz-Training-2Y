abstract class CourseType { }
class ExamCourse extends CourseType { }
class AssignmentCourse extends CourseType { }
class ResearchCourse extends CourseType { }

class Course<T extends CourseType> {
    private T type;
    public Course(T type) { this.type = type; }
}

class CourseUtil {
    public static void showCourses(List<? extends CourseType> list) {
        for (CourseType c : list)
            System.out.println(c.getClass().getSimpleName());
    }
}

public class TestUniversity {
    public static void main(String[] args) {
        List<ExamCourse> exams = Arrays.asList(new ExamCourse(), new ExamCourse());
        CourseUtil.showCourses(exams);
    }
}
