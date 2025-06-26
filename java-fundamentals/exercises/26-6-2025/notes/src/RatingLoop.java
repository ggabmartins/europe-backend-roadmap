import java.util.Scanner;

public class RatingLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double avarageRating = 0;
        double rating = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter the rating of your favorite movie: ");
            rating = scanner.nextDouble();
            avarageRating += rating;
        }

        System.out.println("Avarege rating: " + avarageRating/3);
    }
}
