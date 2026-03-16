public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] O = getO();
        String[] P = getP();
        String[] S = getS();

        String[] banner = new String[5];

        for(int i = 0; i < 5; i++) {
            banner[i] = O[i] + "  " + O[i] + "  " + P[i] + "  " + P[i] + "  " + S[i] + "  " + S[i];
        }

        for(String line : banner) {
            System.out.println(line);
        }
    }

    static String[] getO() {
        return new String[]{
            " OOO ",
            "O   O",
            "O   O",
            "O   O",
            " OOO "
        };
    }

    static String[] getP() {
        return new String[]{
            "PPPP ",
            "P   P",
            "PPPP ",
            "P    ",
            "P    "
        };
    }

    static String[] getS() {
        return new String[]{
            " SSS ",
            "S    ",
            " SSS ",
            "    S",
            " SSS "
        };
    }
}