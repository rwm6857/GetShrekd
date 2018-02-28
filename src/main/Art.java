package main;

import java.util.ArrayList;

public abstract class Art {
    private ArrayList<String> art;

    public Art(ArrayList<String> art){
        this.art = art;
    }

    public void printer() {
        for (String piece : this.art) {
            System.out.println(piece);
        }
    }



}

