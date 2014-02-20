
package ap2.tp01;

/**
 *
 * @author mario
 */
public class AP2TP01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Somme m;
        try {
            int start = Integer.parseInt(args[0]);
            m = new Somme(start);
        }
        catch (Exception e) {
            m = new Somme();
        }
        System.out.println("La somme des entiers est: " + m.calcul());
    }
}
