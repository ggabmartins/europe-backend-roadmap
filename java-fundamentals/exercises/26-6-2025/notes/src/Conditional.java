public class Conditional {
    public static void main(String[] args) {
        int yearOfRelease = 1990;
        double rating = 8.1;
        boolean availableInYourPlan = false;
        String planType = "basic";

        if (yearOfRelease >= 2022) {
            System.out.println("This new movie is worth watching!");
        } else {
            System.out.println("This retro movie is worth watching!");
        }

        if (availableInYourPlan == true || planType.equals("plus")) {
            System.out.println("This movie is available in your plan!");
        }
        else {
            System.out.println("To watch this movie, you need to upgrade your plan or buy it!");
        }
    }
}
