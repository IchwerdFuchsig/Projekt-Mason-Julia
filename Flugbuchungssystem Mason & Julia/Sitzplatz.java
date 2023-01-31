
/**
 * Sitzplatz und seine Grundfunktionen
 * 
 * @author (Mason & Julia) 
 * @version ()
 */
public class Sitzplatz
{
    //Attribute
    private boolean status;
    private int nummer;
    private String kategorie;
    private String fluggastName;

    //Konstruktor
    public Sitzplatz(int neueNummer, String neueKategorie) 
    { //Ein neuer Sitz wird erstellt, die Nummer sowie die Kategorie müssen angegeben werden. Der Status ist auf false (frei)
        status = false;
        nummer = neueNummer;
        kategorie = neueKategorie;
    }

    //Methoden 
    
    //Der Status wird zurückgegeben
    public boolean statusGeben() 
    { 
        return status;
    }
    
    //Neuer Status kann festgelegt werden
    public void statusFestlegen(boolean neuerStatus)
    {
        status = neuerStatus;
    }
    
    //Die Nummer wird zurückgegeben
    public int nummerGeben() 
    { 
        return nummer;
    }
    
    //Neue Nummer kann festgelegt werden
    public void nummerFestlegen(int neueNummer)
    {
        nummer = neueNummer;
    }
    
    //Die Kategorie wird zurückgegeben
    public String kategorieGeben() 
    { 
        return kategorie;
    }
    
    //Neuer Name kann festgelegt werden
    public void nameFestlegen(String neuerName)
    {
        fluggastName = neuerName;
    }
    
    //Der Name wird zurückgegeben
    public String nameGeben()
    { 
        return fluggastName;
    }
}