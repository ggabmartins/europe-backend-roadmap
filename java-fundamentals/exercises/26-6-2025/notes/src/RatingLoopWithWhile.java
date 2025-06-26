import java.util.Scanner;

public class RatingLoopWithWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double avarageRating = 0;
        double rating = 0;
        int totalRatings = 0;
        while (rating != -1) {
            System.out.println("Enter the rating of your favorite movie or -1 to stop: ");
            rating = scanner.nextDouble();

            if(rating !=1){
                avarageRating += rating;
                totalRatings++;
            }
        }

        System.out.println("Avarege rating: " + avarageRating/totalRatings);
    }
}
