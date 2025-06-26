import java.util.Scanner;
public class Scan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your favorite movie: ");
        String movie = scanner.nextLine();
        System.out.println("Enter the release year: ");
        int yearOfRelease = scanner.nextInt();
        System.out.println("Enter the rating of your favorite movie: ");
        double rating = scanner.nextDouble();
        System.out.println(
                "Movie: " + movie +
                "\nYear of release: " + yearOfRelease +
                "\nRating: " + rating);
    }
}
