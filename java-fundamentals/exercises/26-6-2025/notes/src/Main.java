import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Screen Match!");
        System.out.println("Movie: Top gun: Maverick");

        int yearOfRelease = 2022;
        System.out.println("Year of release: " + yearOfRelease);
        boolean availableInYourPlan = true;
        double rating = 8.1;
        double avaregeRating = (10+3.3+8.1)/3;
        System.out.println("Avarege rating: " + avaregeRating);

        int classification = (int) (avaregeRating/2);
        System.out.println("Classification: " + classification);
    }
}
