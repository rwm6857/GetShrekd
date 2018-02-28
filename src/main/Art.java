package main;


public abstract class Art {
    private String art;

    public Art(String art){
        this.art = art;
    }

    public void printer() {
        System.out.println(art);
    }

    public abstract String getArt();
}

