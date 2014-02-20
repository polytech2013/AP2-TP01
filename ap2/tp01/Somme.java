package ap2.tp01;

/**
 *
 * @author mario
 */
public class Somme {
    
    int n;

    public Somme()
    {
        this(10);
    }
    
    public Somme(int n)
    {
        this.n = n;
    }
    
    public int calcul()
    {
        return (n * (n + 1))/ 2;
    }
}
