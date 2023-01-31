
/**
 * Flugzeug und seine Grundfunktionen
 * 
 * @author (Mason & Julia) 
 * @version ()
 */
public class Flugzeug
{
    // Attribute
    private String pilot;
    private int flugnummer;
    private String typ;
    private String position;
    public Sitzplatz[] sitzplatzFlugzeug;
    
    // Konstruktor
    public Flugzeug(String neuerTyp)
    { //Ein neues Flugzeug wird erstellt, der Typ muss angegeben werden, wenn dieser "klein"/"gross" ist wird ein kleines/großes" Flugzeug erstellt mit 6/12 Sitzen
        pilot = "";
        flugnummer = 0;
        typ = neuerTyp;
        position = "Bayreuth";
        
        if (typ == "klein") 
        {
            sitzplatzFlugzeug = new Sitzplatz[6];
            sitzplatzFlugzeug[0] = new Sitzplatz(1, "first");
            sitzplatzFlugzeug[1] = new Sitzplatz(2, "business");
            sitzplatzFlugzeug[2] = new Sitzplatz(3, "business");
            sitzplatzFlugzeug[3] = new Sitzplatz(4, "economy");
            sitzplatzFlugzeug[4] = new Sitzplatz(5, "economy");
            sitzplatzFlugzeug[5] = new Sitzplatz(6, "economy");
        }
        else 
        {
            sitzplatzFlugzeug = new Sitzplatz[12];
            sitzplatzFlugzeug[0] = new Sitzplatz(1, "first");
            sitzplatzFlugzeug[1] = new Sitzplatz(2, "first");
            sitzplatzFlugzeug[2] = new Sitzplatz(3, "business");
            sitzplatzFlugzeug[3] = new Sitzplatz(4, "business");
            sitzplatzFlugzeug[4] = new Sitzplatz(5, "business");
            sitzplatzFlugzeug[5] = new Sitzplatz(6, "business");
            sitzplatzFlugzeug[6] = new Sitzplatz(7, "economy");
            sitzplatzFlugzeug[7] = new Sitzplatz(8, "economy");
            sitzplatzFlugzeug[8] = new Sitzplatz(9, "economy");
            sitzplatzFlugzeug[9] = new Sitzplatz(10, "economy");
            sitzplatzFlugzeug[10] = new Sitzplatz(11, "economy");
            sitzplatzFlugzeug[11] = new Sitzplatz(12, "economy");
        }
    }

    // Methoden
    
    //Der Pilot wird neu festgelegt
    public void pilotFestlegen(String neuerPilot) 
    { 
        pilot = neuerPilot;
    }
    
    //Die Flugnummer wird neu festgelegt
    public void flugnummerFestlegen(int neueFlugnummer) 
    { 
        flugnummer = neueFlugnummer;
    }
    
    //Die Position wird neu festgelegt
    public void positionFestlegen(String neuePosition) 
    { 
        position = neuePosition;
    }
    
    //Der Pilot wird zurückgegeben
    public String pilotGeben() 
    { 
        return pilot;
    }
    
    //Die Flugnummer wird zurückgegeben
    public int flugnummerGeben() 
    { 
        return flugnummer;
    }
    
    //Der Typ wird zurückgegeben
    public String typGeben() 
    { 
        return typ;
    }
    
    //Die Position wird zurückgegeben
    public String positionGeben() 
    { 
        return position;
    }
    
    //Reserviert einen bestimmten Sitzplatz
    public void sitzplatzReservieren(int sitzplatzNr) 
    { 
        sitzplatzFlugzeug[sitzplatzNr].statusFestlegen(true);
    }

    //Entfernt alle Reservierungen
    public void flugzeugLeer() 
    { 
        if (typ == "klein") 
        {
            int r=0;
            while(r<6)
            {
               sitzplatzFlugzeug[r].statusFestlegen(false); 
               r++;
            }
        }
        else 
        {
            int r=0;
            while(r<12){
               sitzplatzFlugzeug[r].statusFestlegen(false); 
               r++;
            }
        }
    }
    
    //Eine Liste wird augegeben, bei welcher bei jedem Sitzplatz die Kategorie, sowie der Status da stehen
    public void flugzeugInfolisteGeben() 
    { 
        System.out.println("Flugnummer: "+flugnummerGeben());
        System.out.println("Flugzeugtyp: "+typGeben());
        System.out.println("----------");
        System.out.println("----------");
        if (typ == "klein") {
            int s=0;
            while (s<6)
            {
                System.out.println("Sitzplatz "+(s+1)+": "+sitzplatzFlugzeug[s].kategorieGeben()+"   "+sitzplatzFlugzeug[s].statusGeben());
                System.out.println("Sitzplatz "+(s+1)+": "+sitzplatzFlugzeug[s].nameGeben());
                System.out.println("-----");
                s++;
            }
        }
        else {
            int s=0;
            while (s<12)
            {
                System.out.println("Sitzplatz "+(s+1)+": "+sitzplatzFlugzeug[s].kategorieGeben()+"   "+sitzplatzFlugzeug[s].statusGeben());
                System.out.println("Sitzplatz "+(s+1)+": "+sitzplatzFlugzeug[s].nameGeben());
                System.out.println("-----");
                s++;
            }
        }
    }
}
