public class Lied
{
    private String titel;
    private String interpret;
    private int Laufzeit_sek;
    
    public Lied(String pTitel, String pInterpret, int pLaufzeit)
    {
        titel = pTitel;
        interpret = pInterpret;
        Laufzeit_sek = pLaufzeit;
    }
    public String gibtTitel()
    {
        return titel;
    }
    public String gibInterpret()
    {
        return interpret;
    }
    public int gibLaufzeit()
    {
        return Laufzeit_sek;
    }
}
