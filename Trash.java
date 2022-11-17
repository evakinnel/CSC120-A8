
// YOU CAN IGNORE THIS
// I did not use it, and I proabably won't because it doesn't make sense anymore, but I'm keeping it because I want to see if the import error can be resolved

import java.util.ArrayList;

public class Trash {

    private ArrayList<String> items;

    public Trash () {
        this.items = new ArrayList<String>();
    }
    
    public void addToList(String item){
        this.items.add(item);
    }

    public void addToList(String item, String item2, String item3){
        this.items.add(item);
        this.items.add(item2);
        this.items.add(item3);
    }

    public static void main(String[] args) {
        Trash beachTrash = new Trash();
        beachTrash.addToList("ball");
        beachTrash.addToList("wrapper", "recipt", "article of clothing");
        beachTrash.addToList("food", "jewlery", "technology");
        System.out.println(beachTrash.items);
        

    }

}
