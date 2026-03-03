public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] banner = {
            "OOOO   OOOOO  PPPP    SSSS",
            "O   O  O   O  P   P   S",
            "O   O  O   O  PPPP    SSS",
            "O   O  O   O  P          s",
            "OOOO   OOOOO  P       SSSS"
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}