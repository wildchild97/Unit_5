import java.util.ArrayList;

public class Unit5 {
    static ArrayList al= new ArrayList();

    public static void main(String[] args) {
        
       al.add("A");
       al.add(0,"B");
       al.add("Banana");
       al.add("Pear");
       al.add(1,"Orange");
      
       //change Banana to kiwi
       System.out.println("\nBanana is at: " + al.indexOf("Banana"));
       al.set(3,"Kiwi");
       
       //remove letters from list
       al.remove(0);
       al.remove("A");
       al.sort(null);
       show();
    }
    
    public static void show()
    {
        for (int x=0; x<al.size();x++)
        {
            String letter=String.valueOf(al.get(x));
            System.out.println("Location " + x+ "-> " + letter);
        }
    }
    
}