package factoryMethodPattern;

public class LLD extends Course {
    @Override
    public void createCourse() {
        modules.add(new IntroModule());
        modules.add(new ConceptModule());
        modules.add(new ExersizeModule());
        modules.add(new SummaryModule());
    }
}