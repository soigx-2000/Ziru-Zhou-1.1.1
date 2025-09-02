import java.util.ArrayList;

public class OnlinePurchaseManager {

     /** An ArrayList of purchased Gizmo objects, * instantiated in the constructor. */

    private ArrayList<Gizmo> purchases = new ArrayList<Gizmo>();
    public OnlinePurchaseManager(){
    }
    public void addGizmo(Gizmo a){
        purchases.add(a);
    }
    /** Returns the number of purchased Gizmo objects that are electronic * whose manufacturer is maker, as described in part (a). */

     public int countElectronicsByMaker(String maker)
     {
        int count = 0;
        for (Gizmo g : purchases){
            if (g.getMaker().equals(maker)){
                if (g.isElectronic()){
                    count++;
                }
            }
        }
        return count;
        /* to be implemented in part (a) */
     }

     /** Returns true if any pair of adjacent purchased Gizmo objects are
     * equivalent, and false otherwise, as described in part (b).
     */
     public boolean hasAdjacentEqualPair()
     {
        for (int i = 1; i < purchases.size(); i++){
            if (purchases.get(i).equals(purchases.get(i-1))){
                return true;
            }
        }
        return false;
         /* to be implemented in part (b) */
     }
     // There may be instance variables, constructors, and methods not shown.
}