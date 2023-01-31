
/**
 * Buchung und seine Grundfunktionen
 * 
 * @author (Mason & Julia) 
 * @version ()
 */
public class Buchung
{
    //Attribute
    private boolean status;
    private int nummer;
    private String kategorie;
    private String buchungName;
    
    //Konstruktor
    public Buchung(int neueNummer, String neueKategorie) 
    { //Eine neue Buchnung wird erstellt, die Nummer sowie die Kategorie müssen angegeben werden. Der Status ist auf false (frei)
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
    
    //Neue Buchung
    public void neueBuchung(String neuerGast)
    {
        status = true;
        buchungName = neuerGast;
    }
    
    //Buchung leer
    public void buchungleer()
    {
        statusFestlegen(false);
        nameFestlegen("null");
    }
    
    //Die Buchungsnummer wird zurückgegeben
    public int nummerGeben() 
    { 
        return nummer;
    }
    
    //Die Kategorie wird zurückgegeben
    public String kategorieGeben() 
    { 
        return kategorie;
    }

    //Neuer Name kann festgelegt werden
    public void nameFestlegen(String neuerName)
    {
        buchungName = neuerName;
    }
    
    //Der Name wird zurückgegeben
    public String nameGeben() 
    { 
        return buchungName;
    }
}
