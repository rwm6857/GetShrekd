package main;

/**
 * Art is used to enforce a constructor and
 * getArt() method on individual artworks.
 *
 * @author rwm6857
 */
public abstract class Art {
    /**
     * constructor
     * kept protected, not to be directly instantiated
     */
    protected Art(){
    }

    /**
     * used to get the ASCII drawing as a String
     * @return ASCII art
     */
    public abstract String getArt();
}

