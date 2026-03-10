public class BannerAppUC5 {

    public static void main(String[] args) {

        // Array declaration and initialization in one statement
        String[] banner = {
            String.join("", "*", "*", "*", "*", "*", "*", "*"),
            String.join("", "*", " ", " ", " ", " ", " ", "*"),
            String.join("", "*", " ", "WELCOME", " ", "*"),
            String.join("", "*", " ", "OOPS UC5", " ", "*"),
            String.join("", "*", " ", "BANNER APP", " ", "*"),
            String.join("", "*", " ", " ", " ", " ", " ", "*"),
            String.join("", "*", "*", "*", "*", "*", "*", "*")
        };

        // Enhanced for loop to print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
