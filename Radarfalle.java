 public class Radarfalle
 {
    private int[] messungen;
    private int stelle=0;
    
    public Radarfalle()
    {
        messungen = new int[50];
    }
    public void messwertEintragen(int stelle, int messwert)
    {
        messungen[stelle] = messwert;
    }
    public void ausgabe()
    {
        for(int stelle=0; stelle<50; stelle++)
        {
            System.out.println(messungen[stelle]);
        }
    }
    public void ausgabeBonus()
    {
        for(int stelle=0; stelle<50; stelle++)
        {
            if (messungen[stelle] >=100)
            {
                System.out.println(messungen[stelle] + "!");
            }
            else
            {
                System.out.println(messungen[stelle]); 
            }
        }
    }
    public void messwertEintragen2(int messwert)
    {
        if (stelle == 50)
        {
            stelle = 0;
            messungen[stelle] = messwert;
            stelle++;
        }
        else
        {
            {
                messungen[stelle] = messwert;
                stelle++;
            }
        }
    }
    public void messungenAusgeben()
    {
        for(int stelle=0; stelle<50; stelle++)
        {
            if(messungen[stelle] >=300)
            {
                System.out.println("Messfehler");
            }
            else
            {
                System.out.println(messungen[stelle]);
            }
        }
    }
    public void messwertEintragen(int messwert)
    {
        if (stelle + 1 == 50)
        {
            stelle = 0;
            messungen[stelle] = messwert;
            stelle++;
        }
        else
        if (messungen[stelle+1] >0)
        {
            System.out.println("Messfehler");
        }
        else
        {
            messungen[stelle+1] = messwert;
            stelle++;
        }
    }
    public void stelle(int neueStelle)
    {
        stelle = neueStelle;
    }
    public void selectionsort()
    {
       int einfuegeIndex = 0;
       int hoechsterindex = 50;
       while(einfuegeIndex<hoechsterindex)
       {
           int minimumstelle = einfuegeIndex;
           for(int index=einfuegeIndex+1;index<hoechsterindex;index++)
           {
               if(messungen[index] < messungen[einfuegeIndex])
               {
                   minimumstelle = index;
               }
           }
           int tempIndexWert = messungen[einfuegeIndex];
           messungen[einfuegeIndex] = messungen[minimumstelle];
           messungen[minimumstelle] = tempIndexWert;
           einfuegeIndex++;
       }
    }
 }

