package knight.brian.springcoredemo.common;

// Not using @Component annotation
public class SwimCoach implements Coach {

    public SwimCoach () {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meters to warm up.";
    }
}
