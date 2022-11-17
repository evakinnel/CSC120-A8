// import Trash; // why does it not like this?
import java.util.ArrayList;
// import random

public class TrashCollector implements Contract{

    private String name;
    private int size;
    private ArrayList<String> items;
    // private ArrayList<String> usefulItems;
    // private ArrayList<String> trash;

    /**
     * Constructor for a Trash Collector
     * @param name
     * @param size
     */
    public TrashCollector(String name, int size){
        this.size = size;
        this.name = name;
        this.items = new ArrayList<String>();
        // this.usefulItems = new ArrayList<String>();
        // this.trash = new ArrayList<String>();
    }

    // String sizeItem();
        // give the item a random size

    /**
     * Print that an item is being exampined and whether that item should be kept or not
     * @param item
     */
    public void examine(String item){
        System.out.println(item + "is being examined");
        if (item.equals("jewelery") || item.equals("technology") || item.equals("article of clothing")){
            System.out.println("keep this " + item);
        } else
            System.out.println("do not keep this " + item);
    }

    // void decide(int i){
    //     for(i = 0; i < beachTrash.items; i++){
    //         if(beachTrash.items[i] == "jewlery" || beachTrash.items[i] == "technology" || beachTrash.items[i] == "article of clothing"){
    //             System.out.println("keep this " + beachTrash.items[i]);
    //         } else
    //         System.out.println("do not keep this " + beachTrash.items[i]);
    //     }
    // }


    /**
     * add an item to the collectors collection/trash bag
     * @param item
     */
    public void grab(String item){   
        this.items.add(item);
    }

    /**
     * prints that an item has been dropped and calls reconsider(item) to decide its final fate
     * @param item
     * @return String item
     */
    public String drop(String item){
        System.out.println("you have dropped the " + item);
        reconsider(item);
        return item;
    }

    /**
     * based on the contents of an item, print whether or not the item has value, and possibly what it is specifically useful for
     * @param item
     */
    public void use(String item){
        if(item.contains("e")){
            System.out.println("This item is useful. Use it for something.");
        } else if(item.contains("a")){
            System.out.println("Take a bite of this item");
        } else{
            System.out.println("Do not use this item for anything. Put it back in the trash bag. Don't touch it again.");
        }
    }

    /**
     * Tells you what direction you're walking or that a certain direction is unavailable. Returns true if sensible, false if not.
     * @param direction
     * @return boolean 
     */
    public boolean walk(String direction){
        if(direction.equals("left") || direction.equals("right")){
            System.out.println("you are walking " + direction);
            return true;
        } else{
            System.out.println("I don't understand this direction: " + direction + ". Try: left or right");
            return false;
        }
    }
    
    /**
     * Takes in x = left/right coordinates and y = up/down coordinates, and "flys" you at that height. Returns whether or not you are, in fact flying.
     * @param x
     * @param y
     * @return boolean
     */
    public boolean fly(int x, int y){
        if(y <= 0){
            System.out.println("You can not fly on the ground. Increase y to fly.");
            return false;
        } else{
            System.out.println("Yay! You're flying! You are " + y + " feet off the ground and " + x + "feet away from where you left your bag of trash");
            return true;
        }
    }

    /**
     * Tells you (and returns) what size you are
     * @return Number
     */
    public Number shrink(){
        // if item is really small, shrink down to become smaller so you can pick it up, or just for fun
        // will print out image of guy becoming bigger maybe
            // emojis or ascii art (or emoji ascii art) =
        // return size that person currently is
        // size - 1 until 1 (will have to call another function that can take in size)
        System.out.println("You are now size 1");
        return 1;
    }

    /**
     * tells you (and returns) the size you are
     * @return Number
     */
    public Number grow(){
        // return size person currently is
        // size + 1 (will have to call another function that can take in size)
        System.out.println("You are now size 3");
        return 3;
    }

    /**
     * prints emoji of person lying down next to their bags of stuff and text
     */
    public void rest(){
        System.out.println("🧺 🛌 🗑 you are lying down with your trash");
    }

    /**
     * tells user that they have picked an item back up again
     */
    public void undo(){
        System.out.println("Okay you have picked it back up again");
    }

    /**
     * if item is precious. tells you that must have been an accident and automatically calls undo. otherwise, removes the item from collection
     * @param item
     */
    void reconsider(String item){
        if(item.equals("jewlery")){
            System.out.println("You shouldn't have dropped that. Here take it back.");
            undo(); // ideally it will be possible to undo/actually reconsider any item 
        } else{
            this.items.remove(item);
        }
    }

    public static void main(String[] args) {
        System.out.println("");

        TrashCollector Steve = new TrashCollector("Steve", 2);
        Steve.grab("ball");
        Steve.grab("wrapper");
        Steve.grab("jewlery");
        System.out.println(Steve.items);
        Steve.drop("jewlery");
        Steve.walk("west");
        Steve.rest();

    }

}
