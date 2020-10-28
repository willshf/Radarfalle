public class Musiksammlung
{
    private Lied[] lieder;
    private int stelle = 0;
    public Musiksammlung()
    {
        lieder = new Lied[50];
    }
    public void liedEintragen(Lied pLied)
    {
        lieder[stelle] = pLied;
        stelle++;
    }
    public void liedLoeschen(int pStelle)
    {
        lieder[pStelle] = null;
    }
    public void alleLiederAusgeben()
    {
        for(int stelle=0; stelle<50; stelle++)
        {
            System.out.println(lieder[stelle]);
        }
    }
    public void liedEintragen(String pTitel, String pInterpret, int pLaufzeit)
    {
        lieder[stelle]= new Lied(pTitel, pInterpret, pLaufzeit);
        stelle++;
    }
    public void playlistLänge()
    {
        int playlistLänge = 0;
        for(int liedZahl=0; liedZahl<lieder.length; liedZahl++)
        {
           if(lieder[liedZahl] != null)
           {
              playlistLänge += lieder[liedZahl].gibLaufzeit(); 
           }
        }
        System.out.println("Die Playlist ist" +playlistLänge+ "lang.");
    }
}
