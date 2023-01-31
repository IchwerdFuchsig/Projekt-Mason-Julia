import java.awt.Rectangle;

/**
 * Ein Rechteck, das manipuliert werden kann und sich selbst auf einer Leinwand
 * zeichnet.
 * 
 * @author Jenny Kühlmann und Tessa Friedrich
 * @version 2010.01.14
 */

public class Rechteck
{
    private int hoehe;
    private int breite;
    private int xPosition;
    private int yPosition;
    private String farbe;
    private boolean istSichtbar;

    /**
     * Erzeuge ein neues Rechteck mit einer Standardfarbe an einer
     * Standardposition.
     */
    public Rechteck() 
    {
        hoehe = 30;
        breite = 15;
        xPosition = 0;
        yPosition = 0;
        farbe = "rot";
        istSichtbar = false;
    }

    /**
     * Mache dieses Rechteck sichtbar. Wenn es bereits sichtbar ist, tue nichts.
     */
    public void sichtbarMachen() 
    {
        istSichtbar = true;
        zeichnen();
    }

    /**
     * Mache dieses Rechteck unsichtbar. Wenn es bereits unsichtbar ist, tue
     * nichts.
     */
    public void unsichtbarMachen() 
    {
        loeschen();
        istSichtbar = false;
    }

    /**
     * Bewege dieses Rechteck einige Bildschirmpunkte nach rechts.
     */
    public void nachRechtsBewegen() 
    {
        horizontalBewegen(20);
    }

    /**
     * Bewege dieses Quadrat einige Bildschirmpunkte nach links.
     */
    public void nachLinksBewegen() 
    {
        horizontalBewegen(-20);
    }

    /**
     * Bewege dieses Rechteck einige Bildschirmpunkte nach oben.
     */
    public void nachObenBewegen() 
    {
        vertikalBewegen(-20);
    }

    /**
     * Bewege dieses Rechteck einige Bildschirmpunkte nach unten.
     */
    public void nachUntenBewegen() 
    {
        vertikalBewegen(20);
    }

    /**
     * Bewege dieses Rechteck horizontal um 'entfernung' Bildschirmpunkte.
     */
    public void horizontalBewegen(int distance) 
    {
        loeschen();
        xPosition += distance;
        zeichnen();
    }

    /**
     * Bewege dieses Rechteck vertikal um 'entfernung' Bildschirmpunkte.
     */
    public void vertikalBewegen(int entfernung) 
    {
        loeschen();
        yPosition += entfernung;
        zeichnen();
    }

    /**
     * Bewege dieses Rechteck langsam horizontal um 'entfernung'
     * Bildschirmpunkte.
     */
    public void langsamHorizontalBewegen(int entfernung) 
    {
        int delta;

        if (entfernung < 0) {
            delta = -1;
            entfernung = -entfernung;
        } else {
            delta = 1;
        }

        for (int i = 0; i < entfernung; i++) {
            xPosition += delta;
            zeichnen();
        }
    }

    /**
     * Bewege dieses Rechteck langsam vertikal um 'entfernung' Bildschirmpunkte.
     */
    public void langsamVertikalBewegen(int entfernung) 
    {
        int delta;

        if (entfernung < 0) {
            delta = -1;
            entfernung = -entfernung;
        } else {
            delta = 1;
        }

        for (int i = 0; i < entfernung; i++) {
            yPosition += delta;
            zeichnen();
        }
    }

    /**
     * Ändere die Größe dieses Rechtecks in 'neueGroesse'. 'neueGroesse' muss
     * groesser gleich Null sein.
     */
    public void groesseAendern(int neueHoehe, int neueBreite) 
    {
        loeschen();
        hoehe = neueHoehe;
        breite = neueBreite;
        zeichnen();
    }

    /**
     * Ändere die Farbe dieses Rechtecks in 'neueFarbe'. Gültige Angaben sind
     * "rot", "schwarz, "blau", "hellblau", "dunkelgrau", "grau", "hellgrau",
     * "gelb", "orange", "pink", "gruen", "lila" und "weiss".
     */
    public void farbeAendern(String neueFarbe) 
    {
        farbe = neueFarbe;
        zeichnen();
    }
    
    /**
     * Gibt die x-Position der Figur zurück.
     */
    public int gibxPosition()
    {
        return xPosition;
    }
    
    /**
     * Gibt die yPosition der Figur zurück.
     */
    public int gibyPosition()
    {
       return yPosition;
    }
    
    /**
     * Gibt die Farbe zurück.
     */
    public String gibFarbe()
    {
       return farbe;
    }
    
    /**
     * Zeichne dieses Rechteck mit seinen aktuellen Werten auf den Bildschirm.
     */
    private void zeichnen() 
    {
        if (istSichtbar) {
            Leinwand leinwand = Leinwand.gibLeinwand();
            leinwand.zeichne(this, farbe, new Rectangle(xPosition, yPosition,
                    breite, hoehe));
            leinwand.warte(10);
        }
    }

    /**
     * Lösche dieses Rechteck vom Bildschirm.
     */
    private void loeschen() 
    {
        if (istSichtbar) {
            Leinwand leinwand = Leinwand.gibLeinwand();
            leinwand.entferne(this);
        }
    }
    
    public void warte(int millisekunden) {
        try {
            Thread.sleep(millisekunden);
        } catch (Exception e) {
            // Exception ignorieren
        }
    }
}
