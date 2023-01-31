
/**
 * Beschreiben Sie hier die Klasse Smartphone.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Smartphone
{
    private Rechteck Handyhülle1;
    private Rechteck Handyhülle2;
    private Rechteck BildschirmUmrandung;
    private Rechteck Homebutton;
    private Rechteck BildschirmUmrandung2;
    private Oval Kreis1;
    private Oval Kreis2;
    private Oval Kreis3;
    private Oval Kreis4;
    private Oval Kreis5;
    private Rechteck Kreis6;
    private Dreieck Kreis7;
    private Oval Kreis8;
    private String [] wahrscheinlichlkeit;
    private String [] Telefonnummer;
    private String passwort;
    /**
     * Konstruktor für Objekte der Klasse Gebirge
     */
    public Smartphone()
    {
        Handyhülle1 = new Rechteck();
        Handyhülle1.farbeAendern("schwarz");
        Handyhülle1.groesseAendern(550, 300);
        Handyhülle1.horizontalBewegen(100);
        Handyhülle1.vertikalBewegen(50);
        Handyhülle1.sichtbarMachen();
        
        Handyhülle2 = new Rechteck();
        Handyhülle2.farbeAendern("weiss");
        Handyhülle2.groesseAendern(548, 298);
        Handyhülle2.vertikalBewegen(51);
        Handyhülle2.horizontalBewegen(101);
        Handyhülle2.sichtbarMachen();
        
        BildschirmUmrandung = new Rechteck();
        BildschirmUmrandung.farbeAendern("schwarz");
        BildschirmUmrandung.groesseAendern(520, 292);
        BildschirmUmrandung.vertikalBewegen(53);
        BildschirmUmrandung.horizontalBewegen(104);
        BildschirmUmrandung.sichtbarMachen();
        
        Homebutton = new Rechteck();
        Homebutton.farbeAendern("schwarz");
        Homebutton.groesseAendern(15, 30);
        Homebutton.vertikalBewegen(580);
        Homebutton.horizontalBewegen(235);
        Homebutton.sichtbarMachen();
        
        BildschirmUmrandung2 = new Rechteck();
        BildschirmUmrandung2.farbeAendern("schwarz");
        BildschirmUmrandung2.vertikalBewegen(52);
        BildschirmUmrandung2.horizontalBewegen(103);
        BildschirmUmrandung2.sichtbarMachen();
        BildschirmUmrandung2.groesseAendern(522,294);
        
        Kreis1 = new Oval();
        Kreis1.farbeAendern("hellblau");
        Kreis1.groesseAendern(60,60);
        Kreis1.vertikalBewegen(500);
        Kreis1.horizontalBewegen(105);
        
        Kreis2 = new Oval();
        Kreis2.farbeAendern("hellblau");
        Kreis2.groesseAendern(50,50);
        Kreis2.vertikalBewegen(500);
        Kreis2.horizontalBewegen(165);
        
        Kreis3 = new Oval();
        Kreis3.farbeAendern("hellblau");
        Kreis3.groesseAendern(65,65);
        Kreis3.vertikalBewegen(500);
        Kreis3.horizontalBewegen(225);
        
        Kreis4 = new Oval();
        Kreis4.farbeAendern("hellblau");
        Kreis4.groesseAendern(55,55);
        Kreis4.vertikalBewegen(500);
        Kreis4.horizontalBewegen(295);
        
        Telefonnummer = new String[6];
        Telefonnummer[0]= "0123456";
        Telefonnummer[1]="0123457";
        Telefonnummer[2]="0123458";
        Telefonnummer[3]="0123459";
        Telefonnummer[4]="0123454";
        Telefonnummer[5]="0123453";
        
        Kreis5 = new Oval();
        Kreis5.farbeAendern("grün");
        Kreis5.groesseAendern(60,60);
        Kreis5.vertikalBewegen(500);
        Kreis5.horizontalBewegen(300);
        
        Kreis6 = new Rechteck();
        Kreis6.farbeAendern("rot");
        Kreis6.groesseAendern(50,50);
        Kreis6.vertikalBewegen(500);
        Kreis6.horizontalBewegen(350);
        
        Kreis7 = new Dreieck();
        Kreis7.farbeAendern("lila");
        Kreis7.groesseAendern(65,65);
        Kreis7.vertikalBewegen(500);
        Kreis7.horizontalBewegen(225);
        
        Kreis8 = new Oval();
        Kreis8.farbeAendern("gelb");
        Kreis8.groesseAendern(55,55);
        Kreis8.vertikalBewegen(500);
        Kreis8.horizontalBewegen(340);
    }
    
    /**
     * Gibt die Farbe zurück.
     */
    public String gibFarbe(String Farbe)
    {
       return Farbe;
    }
    
    public void BildschirmAnAus()
    {
        if(BildschirmUmrandung.gibFarbe() == "schwarz")
        {
            BildschirmUmrandung.farbeAendern("weiss");
        }
        else
        {
            BildschirmUmrandung.farbeAendern("schwarz");
        }
    }
    
    public void Bildschirmschoner()
    {
        BildschirmUmrandung.farbeAendern("blau");
        Kreis1.sichtbarMachen();
        Kreis2.sichtbarMachen();
        Kreis3.sichtbarMachen();
        Kreis4.sichtbarMachen();
        for (int i=0; i<88; i++)
        {
            Kreis1.vertikalBewegen(-5);
            Kreis2.vertikalBewegen(-5);
            Kreis3.vertikalBewegen(-5);
            Kreis4.vertikalBewegen(-5);
        }
    }
    
    public int SmartphoneDurchsuchen(String Nummer)
    {  
        for(int i=0; i<5; i++)
        {
            if(Telefonnummer[i].contains( Nummer))
            {
                return i;
            }
        }
        System.out.println("Nummer nicht enthalten");
        return -1;
    }
    
    public void Bildschirmschoner2()
    {
        BildschirmUmrandung.farbeAendern("weiss");
        Kreis5.sichtbarMachen();
        Kreis6.sichtbarMachen();
        Kreis7.sichtbarMachen();
        Kreis8.sichtbarMachen();
        for (int i=0; i<20; i++)
        {
            Kreis5.vertikalBewegen(-10);
            Kreis5.horizontalBewegen(-4);
            Kreis6.vertikalBewegen(-15);
            Kreis6.horizontalBewegen(-10);
            Kreis7.vertikalBewegen(-5);
            Kreis7.horizontalBewegen(-5);
            Kreis8.vertikalBewegen(-20);
            Kreis8.horizontalBewegen(-10);
        }
    }
    
    public void passwort(String npasswort)
    {
        passwort = "091006";
        if (passwort == npasswort)
        {
          System.out.println("entsperrt");
        }
        else 
        {
            System.out.println("Passwort nicht richtig");
        }
    }
}