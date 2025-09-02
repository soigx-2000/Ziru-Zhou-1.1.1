public class Main{
    public static void main(String[] args) {
        Gizmo a = new Gizmo("maker1", false);
        Gizmo b = new Gizmo("maker1", true);
        Gizmo c = new Gizmo("maker2", false);
        Gizmo d = new Gizmo("maker2", true);
        Gizmo e = new Gizmo("maker2", true);
        OnlinePurchaseManager A = new OnlinePurchaseManager();
        A.addGizmo(a);
        A.addGizmo(b);
        A.addGizmo(c);
        A.addGizmo(d);
        A.addGizmo(e);
        System.out.println(A.countElectronicsByMaker("maker1"));/// should print 1
        System.out.println(A.countElectronicsByMaker("maker2"));/// should print 2
        System.out.println(A.hasAdjacentEqualPair());// should print true;
    }
}