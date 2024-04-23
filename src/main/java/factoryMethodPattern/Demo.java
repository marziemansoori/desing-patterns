package factoryMethodPattern;

public class Demo {
    public static void main(String[] args) {

        Course HLDCourse = CourseFactory.getCourse("HLD");
        Course LLDCourse = CourseFactory.getCourse("LLD");
    }
}