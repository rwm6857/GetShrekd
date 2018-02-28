package art;
/**
 * Represents Doge artwork
 *
 * @author rwm6857
 */
public class Doge extends main.Art {
    /**
     * used to construct Doge art
     */
    public Doge() {
    }

    /**
     * used to get the ASCII drawing as a String
     *
     * @return ASCII art
     */
    @Override
    public String getArt() {
        return ("░░░░░░░█▐▓▓░████▄▄▄█▀▄▓▓▓▌█ \n" +
                "░░░░░▄█▌▀▄▓▓▄▄▄▄▀▀▀▄▓▓▓▓▓▌█ \n" +
                "░░░▄█▀▀▄▓█▓▓▓▓▓▓▓▓▓▓▓▓▀░▓▌█ \n" +
                "░░█▀▄▓▓▓███▓▓▓███▓▓▓▄░░▄▓▐█▌ \n" +
                "░█▌▓▓▓▀▀▓▓▓▓███▓▓▓▓▓▓▓▄▀▓▓▐█ \n" +
                "▐█▐██▐░▄▓▓▓▓▓▀▄░▀▓▓▓▓▓▓▓▓▓▌█▌ \n" +
                "█▌███▓▓▓▓▓▓▓▓▐░░▄▓▓███▓▓▓▄▀▐█ \n" +
                "█▐█▓▀░░▀▓▓▓▓▓▓▓▓▓██████▓▓▓▓▐█ \n" +
                "▌▓▄▌▀░▀░▐▀█▄▓▓██████████▓▓▓▌█▌ \n" +
                "▌▓▓▓▄▄▀▀▓▓▓▀▓▓▓▓▓▓▓▓█▓█▓█▓▓▌█▌ \n" +
                "█▐▓▓▓▓▓▓▄▄▄▓▓▓▓▓▓█▓█▓█▓█▓▓▓▐█");
    }
}
