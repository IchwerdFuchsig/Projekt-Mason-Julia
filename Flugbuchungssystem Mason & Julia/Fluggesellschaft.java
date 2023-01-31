
/**
 * Fluggesellschaft und seine Grundfunktionen
 * 
 * @author (Mason & Julia) 
 * @version ()
 */
public class Fluggesellschaft
{
    // Attribute
        private String name;
        private int anzahlFlugzeugK;
        private int anzahlFlugzeugG;
        
        private Flugzeug[] flugzeugK;
        private Flugzeug[] flugzeugG;
        private Buchung[] neueBuchung;
        private boolean flugzeugKFrei;
        private boolean flugzeugGFrei;
        private int letzteFlugnummer;
        private int flugzeugNummerK;
        private int flugzeugNummerG;
        private int buchungAnzahl;
        private int maximaleAnzahlFlugzeugeG;
        private int maximaleAnzahlFlugzeugeK;
        
        
    // Konstruktor
    public Fluggesellschaft(String nameFG,int anzahlFlugzeugGNeu,int anzahlFlugzeugKNeu)
    {
        maximaleAnzahlFlugzeugeG = 7;      //Maximale Anzahl an großen Flugzeugen kann hier beliebig geändert werden!
        maximaleAnzahlFlugzeugeK = 10;      //Maximale Anzahl an kleinen Flugzeugen kann hier beliebig geändert werden!
        
        
        name = nameFG;
        if(anzahlFlugzeugKNeu<maximaleAnzahlFlugzeugeK+1)
        {
            anzahlFlugzeugK = anzahlFlugzeugKNeu;
        }
        else
        {
            anzahlFlugzeugK = maximaleAnzahlFlugzeugeK;
            System.out.println("Maximal Anzahl an kleinen Flugzeugen überschritten!");
            System.out.println("Neue Anzahl: "+maximaleAnzahlFlugzeugeK+"!");
        }
        
        if(anzahlFlugzeugGNeu<maximaleAnzahlFlugzeugeG+1)
        {
            anzahlFlugzeugG = anzahlFlugzeugGNeu;
        }
        else
        {
            anzahlFlugzeugG = maximaleAnzahlFlugzeugeG;
            System.out.println("Maximal Anzahl an großen Flugzeugen überschritten!");
            System.out.println("Neue Anzahl: "+maximaleAnzahlFlugzeugeG+"!");
        }
        
        flugzeugK = new Flugzeug[anzahlFlugzeugK];
        int l=0;
        while (l<anzahlFlugzeugK)
        {
           flugzeugK[l]=new Flugzeug("klein"); 
           l++;
        }
        
        
        flugzeugG = new Flugzeug[anzahlFlugzeugG];
        int o=0;
        while(o<anzahlFlugzeugG)
        {
            flugzeugG[o]=new Flugzeug("gross");
            o++;
        }

        neueBuchung = new Buchung[12];
        neueBuchung[0] = new Buchung(1, "first");
        neueBuchung[1] = new Buchung(2, "first");
        neueBuchung[2] = new Buchung(3, "business");
        neueBuchung[3] = new Buchung(4, "business");
        neueBuchung[4] = new Buchung(5, "business");
        neueBuchung[5] = new Buchung(6, "business");
        neueBuchung[6] = new Buchung(7, "economy");
        neueBuchung[7] = new Buchung(8, "economy");
        neueBuchung[8] = new Buchung(9, "economy");
        neueBuchung[9] = new Buchung(10, "economy");
        neueBuchung[10] = new Buchung(11, "economy");
        neueBuchung[11] = new Buchung(12, "economy");
        
    }

    
    // Methoden
    
    //Stornieren
    public void stornieren(int buchungsnummer)
    {
        if(neueBuchung[buchungsnummer-1].statusGeben() == true)
        {
            neueBuchung[buchungsnummer-1].nameFestlegen("null");
            neueBuchung[buchungsnummer-1].statusFestlegen(false);
            System.out.println("Stornierung erfolgreich für Nummer: "+buchungsnummer);
            buchungAnzahl = buchungAnzahl-1;
        }
        else
        {
            System.out.println("Error! Buchungsnummer ist falsch: "+buchungsnummer);
        }
    }
    
    //Buchung
    public void buchung(String neuerGast,String flugKlasse){
        if(flugKlasse == "first")
        {
            if(neueBuchung[0].statusGeben() == false)
            {
                neueBuchung[0].neueBuchung(neuerGast);
                buchungAnzahl = buchungAnzahl +1;
                System.out.println("Sitzplatz FIRST ist reserviert! Buchungsnummer: 1");
            }
            else{
                if(neueBuchung[1].statusGeben() == false)
                {
                    neueBuchung[1].neueBuchung(neuerGast);
                    buchungAnzahl = buchungAnzahl +1;
                    System.out.println("Sitzplatz FIRST ist reserviert! Buchungsnummer: 2");
                }
                else
                {
                    System.out.println("Error! Kein Platz in der Klasse FIRST mehr frei!");
                }
            }
        } 
        else{
            if(flugKlasse == "business")
            {
                if(neueBuchung[2].statusGeben() == false)
                {
                    neueBuchung[2].neueBuchung(neuerGast);
                    buchungAnzahl = buchungAnzahl +1;
                    System.out.println("Sitzplatz BUSINESS ist reserviert! Buchungsnummer: 3");
                }
                else{
                    if(neueBuchung[3].statusGeben() == false)
                    {
                        neueBuchung[3].neueBuchung(neuerGast);
                        buchungAnzahl = buchungAnzahl +1;
                        System.out.println("Sitzplatz BUSINESS ist reserviert! Buchungsnummer: 4");
                    }
                    else{
                        if(neueBuchung[4].statusGeben() == false)
                        {
                            neueBuchung[4].neueBuchung(neuerGast);
                            buchungAnzahl = buchungAnzahl +1;
                            System.out.println("Sitzplatz BUSINESS ist reserviert! Buchungsnummer: 5");
                        }
                        else{
                            if(neueBuchung[5].statusGeben() == false)
                            {
                                neueBuchung[5].neueBuchung(neuerGast);
                                buchungAnzahl = buchungAnzahl +1;
                                System.out.println("Sitzplatz BUSINESS ist reserviert! Buchungsnummer: 6");
                            }
                            else
                            {
                                System.out.println("Error! Kein Platz in der Klasse BUSINESS mehr frei!");
                            }
                        }
                    }
                }
            }
            else{
                if(flugKlasse == "economy")
                {
                    if(neueBuchung[6].statusGeben() == false)
                    {
                        neueBuchung[6].neueBuchung(neuerGast);
                        buchungAnzahl = buchungAnzahl +1;
                        System.out.println("Sitzplatz ECONOMY ist reserviert! Buchungsnummer: 7");
                    }
                    else{
                        if(neueBuchung[7].statusGeben() == false)
                        {
                            neueBuchung[7].neueBuchung(neuerGast);
                            buchungAnzahl = buchungAnzahl +1;
                            System.out.println("Sitzplatz ECONOMY ist reserviert! Buchungsnummer: 8");
                        }
                        else{
                            if(neueBuchung[8].statusGeben() == false)
                            {
                                neueBuchung[8].neueBuchung(neuerGast);
                                buchungAnzahl = buchungAnzahl +1;
                                System.out.println("Sitzplatz ECONOMY ist reserviert! Buchungsnummer: 9");
                            }
                            else{
                                if(neueBuchung[9].statusGeben() == false)
                                {
                                    neueBuchung[9].neueBuchung(neuerGast);
                                    buchungAnzahl = buchungAnzahl +1;
                                    System.out.println("Sitzplatz ECONOMY ist reserviert! Buchungsnummer: 10");
                                }
                                else{
                                    if(neueBuchung[10].statusGeben() == false)
                                    {
                                        neueBuchung[10].neueBuchung(neuerGast);
                                        buchungAnzahl = buchungAnzahl +1;
                                        System.out.println("Sitzplatz ECONOMY ist reserviert! Buchungsnummer: 11");
                                    }
                                    else{
                                        if(neueBuchung[11].statusGeben() == false)
                                        {
                                            neueBuchung[11].neueBuchung(neuerGast);
                                            buchungAnzahl = buchungAnzahl +1;
                                            System.out.println("Sitzplatz ECONOMY ist reserviert! Buchungsnummer: 12");
                                        }
                                        else
                                        {
                                            System.out.println("Error! Kein Platz in der Klasse ECONOMY mehr frei!");
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                else
                {
                    System.out.println("Error! Falsche Klassenangabe!");
                }
            }
        }
    }
    
    //Abflug
    public void abflug(String neuerPilot){
        if(neueBuchung[1].statusGeben() == false)
        {
            if(neueBuchung[4].statusGeben() == false)
            {
                if(neueBuchung[5].statusGeben() == false)
                {
                    if(neueBuchung[9].statusGeben() == false)
                    {
                        if(neueBuchung[10].statusGeben() == false)
                        {
                            if(neueBuchung[11].statusGeben() == false)
                            {
                                if(istFlugzeugKFrei() == true)
                                {
                                    flugzeugNummerK=naechstesFlugzeugKFrei();
                                    
                                    if(neueBuchung[0].statusGeben() == true)
                                    {
                                        flugzeugK[flugzeugNummerK].sitzplatzFlugzeug[0].nameFestlegen(neueBuchung[0].nameGeben());
                                        flugzeugK[flugzeugNummerK].sitzplatzFlugzeug[0].nummerFestlegen(neueBuchung[0].nummerGeben());
                                        flugzeugK[flugzeugNummerK].sitzplatzFlugzeug[0].statusFestlegen(true);
                                    }
                                    if(neueBuchung[2].statusGeben() == true)
                                    {
                                        flugzeugK[flugzeugNummerK].sitzplatzFlugzeug[1].nameFestlegen(neueBuchung[2].nameGeben());
                                        flugzeugK[flugzeugNummerK].sitzplatzFlugzeug[1].nummerFestlegen(neueBuchung[2].nummerGeben());
                                        flugzeugK[flugzeugNummerK].sitzplatzFlugzeug[1].statusFestlegen(true);
                                    }
                                    if(neueBuchung[3].statusGeben() == true)
                                    {
                                        flugzeugK[flugzeugNummerK].sitzplatzFlugzeug[2].nameFestlegen(neueBuchung[3].nameGeben());
                                        flugzeugK[flugzeugNummerK].sitzplatzFlugzeug[2].nummerFestlegen(neueBuchung[3].nummerGeben());
                                        flugzeugK[flugzeugNummerK].sitzplatzFlugzeug[2].statusFestlegen(true);
                                    }   
                                    if(neueBuchung[6].statusGeben() == true){    
                                        flugzeugK[flugzeugNummerK].sitzplatzFlugzeug[3].nameFestlegen(neueBuchung[6].nameGeben());
                                        flugzeugK[flugzeugNummerK].sitzplatzFlugzeug[3].nummerFestlegen(neueBuchung[6].nummerGeben());
                                        flugzeugK[flugzeugNummerK].sitzplatzFlugzeug[3].statusFestlegen(true);
                                    }
                                    if(neueBuchung[7].statusGeben() == true)
                                    {
                                        flugzeugK[flugzeugNummerK].sitzplatzFlugzeug[4].nameFestlegen(neueBuchung[7].nameGeben());
                                        flugzeugK[flugzeugNummerK].sitzplatzFlugzeug[4].nummerFestlegen(neueBuchung[7].nummerGeben());
                                        flugzeugK[flugzeugNummerK].sitzplatzFlugzeug[4].statusFestlegen(true);
                                    }
                                    if(neueBuchung[8].statusGeben() == true)
                                    {
                                        flugzeugK[flugzeugNummerK].sitzplatzFlugzeug[5].nameFestlegen(neueBuchung[8].nameGeben());
                                        flugzeugK[flugzeugNummerK].sitzplatzFlugzeug[5].nummerFestlegen(neueBuchung[8].nummerGeben());
                                        flugzeugK[flugzeugNummerK].sitzplatzFlugzeug[5].statusFestlegen(true);
                                    }
                                    
                                    buchungAnzahl=0;
                                    
                                    int j=0;
                                    while(j<12)
                                    {
                                        neueBuchung[j].buchungleer();
                                        j++;
                                    }
                                    
                                    flugzeugK[flugzeugNummerK].pilotFestlegen(neuerPilot); 
                                    flugzeugK[flugzeugNummerK].flugnummerFestlegen(letzteFlugnummer+1);
                                    letzteFlugnummer = letzteFlugnummer+1;
                                    flugzeugK[flugzeugNummerK].positionFestlegen("Unterwegs");
                                    System.out.println("Flugzeug ist Unterwegs!");
                                    System.out.println("Flugzeug: K"+0+(flugzeugNummerK+1));
                                    System.out.println("Flugnummer: "+letzteFlugnummer);
                                }
                                else
                                {
                                    if(istFlugzeugGFrei() == true)
                                    {
                                        flugzeugNummerG=naechstesFlugzeugGFrei();
                
                                        int i=0;
                                        while(i<12)
                                        {
                                            if(neueBuchung[i].statusGeben() == true)
                                            {
                                                flugzeugG[flugzeugNummerG].sitzplatzFlugzeug[i].nameFestlegen(neueBuchung[i].nameGeben());
                                                flugzeugG[flugzeugNummerG].sitzplatzFlugzeug[i].nummerFestlegen(neueBuchung[i].nummerGeben());
                                                flugzeugG[flugzeugNummerG].sitzplatzFlugzeug[i].statusFestlegen(true);
                                            }
                                            i++;
                                        }
                                        buchungAnzahl=0;
                
                                        int j=0;
                                        while(j<12)
                                        {
                                            neueBuchung[j].buchungleer();
                                            j++;
                                        }
                
                
                                        flugzeugG[flugzeugNummerG].pilotFestlegen(neuerPilot); 
                                        flugzeugG[flugzeugNummerG].flugnummerFestlegen(letzteFlugnummer+1);
                                        letzteFlugnummer = letzteFlugnummer+1;
                                        flugzeugG[flugzeugNummerG].positionFestlegen("Unterwegs"); 
                                        System.out.println("Flugzeug ist Unterwegs!");
                                        System.out.println("Flugzeug: G"+0+(flugzeugNummerG+1));
                                        System.out.println("Flugnummer: "+letzteFlugnummer);
                                    }
                                    else
                                    {
                                        System.out.println("Error! Kein Flugzeug frei!");
                                    }
                                }  
                            }
                        }
                    }
                }
            }
        }
        else{
            if(istFlugzeugGFrei() == true)
            {
                flugzeugNummerG=naechstesFlugzeugGFrei();
                
                int i=0;
                while(i<12)
                {
                    if(neueBuchung[i].statusGeben() == true)
                    {
                        flugzeugG[flugzeugNummerG].sitzplatzFlugzeug[i].nameFestlegen(neueBuchung[i].nameGeben());
                        flugzeugG[flugzeugNummerG].sitzplatzFlugzeug[i].nummerFestlegen(neueBuchung[i].nummerGeben());
                        flugzeugG[flugzeugNummerG].sitzplatzFlugzeug[i].statusFestlegen(true);
                    }
                    i++;
                }
                buchungAnzahl=0;
                
                int j=0;
                while(j<12)
                {
                    neueBuchung[j].buchungleer();
                    j++;
                }
                
                
                flugzeugG[flugzeugNummerG].pilotFestlegen(neuerPilot); 
                flugzeugG[flugzeugNummerG].flugnummerFestlegen(letzteFlugnummer+1);
                letzteFlugnummer = letzteFlugnummer+1;
                flugzeugG[flugzeugNummerG].positionFestlegen("Unterwegs"); 
                System.out.println("Flugzeug ist Unterwegs!");
                System.out.println("Flugzeug: G"+0+(flugzeugNummerG+1));
                System.out.println("Flugnummer: "+letzteFlugnummer);
            }
            else
            {
                System.out.println("Error! Kein Flugzeug frei!");
            }
        }
    }
    
    //Rückflug mit zurücksetzung
    public void rueckflug(String flugzeugGroesse, int flugzeugNummer)
    {
        flugzeugNummer = flugzeugNummer-1;
        if(flugzeugGroesse == "gross")
        {
            if(flugzeugNummer < anzahlFlugzeugG)
            {
                if(flugzeugG[flugzeugNummer].positionGeben() =="New York")
                {
                    flugzeugG[flugzeugNummer].positionFestlegen("Bayreuth");
                    flugzeugG[flugzeugNummer].flugnummerFestlegen(0);
                    flugzeugG[flugzeugNummer].pilotFestlegen(""); 
                    flugzeugG[flugzeugNummer].flugzeugLeer();
                    System.out.println("Flugzeug ist leer in Bayreuth gelandet!");
                    System.out.println("Flugnummer: "+flugzeugG[flugzeugNummer].flugnummerGeben());
                }
                else
                {
                    System.out.println("Error! Flugzeug nicht in New York!");
                }
            }
            else
            {
                System.out.println("Error! Falsche Flugzeugnummer!");
            }
        }
        else{
            if(flugzeugGroesse == "klein")
            {
                if(flugzeugNummer < anzahlFlugzeugK)
                {
                    if(flugzeugK[flugzeugNummer].positionGeben() =="New York")
                    {
                        flugzeugK[flugzeugNummer].positionFestlegen("Bayreuth");
                        flugzeugK[flugzeugNummer].flugnummerFestlegen(0);
                        flugzeugK[flugzeugNummer].pilotFestlegen(""); 
                        flugzeugK[flugzeugNummer].flugzeugLeer();
                        System.out.println("Flugzeug ist leer in Bayreuth gelandet!");
                        System.out.println("Flugnummer: "+flugzeugK[flugzeugNummer].flugnummerGeben());
                    }
                    else
                    {
                        System.out.println("Error! Flugzeug nicht in New York!");
                    }
                }
                else
                {
                    System.out.println("Error! Falsche Flugzeugnummer!");
                }
            }
            else
            {
                System.out.println("Error! Flugzeug nicht gefunden!");
            }
        }
    }
    
    //Landung
    public void landung(String flugzeugGroesse, int flugzeugNummer)
    {
        flugzeugNummer = flugzeugNummer-1;
        if(flugzeugGroesse == "gross")
        {
            if(flugzeugNummer < anzahlFlugzeugG)
            {
                if(flugzeugG[flugzeugNummer].positionGeben() =="Unterwegs")
                {
                    flugzeugG[flugzeugNummer].positionFestlegen("New York");
                    System.out.println("Flugzeug ist in New York gelandet!");
                    System.out.println("Flugnummer: "+flugzeugG[flugzeugNummer].flugnummerGeben());
                }
                else
                {
                    System.out.println("Error! Flugzeug nicht Unterwegs!");
                }
            }
            else
            {
                System.out.println("Error! Falsche Flugzeugnummer!");
            }
        }
        else{
            if(flugzeugGroesse == "klein")
            {
                if(flugzeugNummer < anzahlFlugzeugK)
                {
                    if(flugzeugK[flugzeugNummer].positionGeben() =="Unterwegs")
                    {
                        flugzeugK[flugzeugNummer].positionFestlegen("New York");
                        System.out.println("Flugzeug ist in New York gelandet!");
                        System.out.println("Flugnummer: "+flugzeugK[flugzeugNummer].flugnummerGeben());
                    }
                    else
                    {
                        System.out.println("Error! Flugzeug nicht Unterwegs!");
                    }
                }
                else
                {
                    System.out.println("Error! Falsche Flugzeugnummer!");
                }
            }
            else
            {
                System.out.println("Error! Flugzeug nicht gefunden!");
            }
        }
    }
    
    //Flugzeug GROß ist frei?
    public boolean istFlugzeugGFrei()
    {
        int q=0;
        while(q<anzahlFlugzeugG)
        {
            if (flugzeugG[q].flugnummerGeben() == 0) 
            {
                return true;
            }
            q++;
        }
        return false;
    }
    
    //Nächstes Flugzeug GROß frei?
    public int naechstesFlugzeugGFrei()
    {
        int w=0;
        while(w<anzahlFlugzeugG)
        {
            if (flugzeugG[w].flugnummerGeben() == 0)
            {
                return w;
            }
            w++;
        }
        return w;
    }
    
    //Flugzeug KLEIN ist frei?
    public boolean istFlugzeugKFrei()
    {
        int q=0;
        while(q<anzahlFlugzeugK)
        {
            if (flugzeugK[q].flugnummerGeben() == 0) 
            {
                return true;
            }
            q++;
        }
        return false;
    }
    
    //Nächstes Flugzeug KLEIN frei?
    public int naechstesFlugzeugKFrei()
    {
        int w=0;
        while(w<anzahlFlugzeugK)
        {
            if (flugzeugK[w].flugnummerGeben() == 0)
            {
                return w;
            }
            w++;
        }
        return w;
    }

    
    //Flugzeugliste ausgeben
    public void infoFlugzeugliste() 
    {
        int k=0;
        int g=0;
        
        System.out.println("Kleine Flugzeuge:");
        while(k<anzahlFlugzeugK)
        {
            System.out.println((k+1)+"  (Pilot): "+flugzeugK[k].pilotGeben());
            System.out.println((k+1)+"  (Flugnummer): "+flugzeugK[k].flugnummerGeben());
            System.out.println((k+1)+"  (Größe): "+flugzeugK[k].typGeben());
            System.out.println((k+1)+"  (Position): "+flugzeugK[k].positionGeben());
            System.out.println("-----"); 
            k++;
        }
        System.out.println("");
        System.out.println("");
        System.out.println("Große Flugzeuge:");
        while(g<anzahlFlugzeugG)
        {
            System.out.println((g+1)+"  (Pilot): "+flugzeugG[g].pilotGeben());
            System.out.println((g+1)+"  (Flugnummer): "+flugzeugG[g].flugnummerGeben());
            System.out.println((g+1)+"  (Größe): "+flugzeugG[g].typGeben());
            System.out.println((g+1)+"  (Position): "+flugzeugG[g].positionGeben());
            System.out.println("-----"); 
            g++;
        }

    }
    
    //Fluggästeliste ausgeben
    public void infoFluggaeste(String groesseFlugzeug, int nummerFlugzeug)
    {
        nummerFlugzeug = nummerFlugzeug-1;
        if(groesseFlugzeug == "klein")
        {
            if(nummerFlugzeug<anzahlFlugzeugK)
            {
                flugzeugK[nummerFlugzeug].flugzeugInfolisteGeben();
            }
            else
            {
                System.out.println("Error! Falsche Flugzeugnummer!");
            }
        } 
        else{
            if(groesseFlugzeug == "gross")
            {
                if(nummerFlugzeug<anzahlFlugzeugG)
                {
                    flugzeugG[nummerFlugzeug].flugzeugInfolisteGeben();
                }
                else
                {
                    System.out.println("Error! Falsche Flugzeugnummer!");
                }
            }
            else
            {
                System.out.println("Error! Falsche Klassenangabe!");
            }
        }
    }
    
    //Buchungsliste ausgeben
    public void infoBuchung()
    {
        int t=0;
        while (t<12){
            System.out.println("Buchung "+ (t+1) +" : "+neueBuchung[t].kategorieGeben()+"   "+ neueBuchung[t].statusGeben());
            System.out.println("Buchung "+ (t+1) +" : "+neueBuchung[t].nummerGeben()+"   "+ neueBuchung[t].nameGeben());
            System.out.println("-----");
            t++;
        }
    }
}

