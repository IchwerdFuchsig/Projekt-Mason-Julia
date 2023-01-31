import java.awt.geom.Ellipse2D;

/**
 * Ein Oval, das manipuliert werden kann und sich selbst auf einer Leinwand
 * zeichnet.
 * 
 * @author Jenny Kühlmann und Tessa Friedrich
 * @version 2010.01.18
 */

public class Oval 
{
    private int hoehe;
    private int breite;
    private int xPosition;
    private int yPosition;
    public String farbe;
    private boolean istSichtbar;

    /**
     * Erzeuge ein neues Oval an einer Standardposition mit einer
     * Standardfarbe.
     */
    public Oval() 
    {
        hoehe = 30;
        breite = 15;
        xPosition = 0;
        yPosition = 0;
        farbe = "blau";
        istSichtbar = false;
    }

    /**
     * Mache dieses Oval sichtbar. Wenn es bereits sichtbar ist, tue nichts.
     */
    public void sichtbarMachen() 
    {
        istSichtbar = true;
        zeichnen();
    }

    /**
     * Mache dieses Oval unsichtbar. Wenn es bereits unsichtbar ist, tue
     * nichts.
     */
    public void unsichtbarMachen() 
    {
        loeschen();
        istSichtbar = false;
    }

    /**
     * Bewege dieses Oval einige Bildschirmpunkte nach rechts.
     */
    public void nachRechtsBewegen() 
    {
        horizontalBewegen(20);
    }

    /**
     * Bewege dieses Oval einige Bildschirmpunkte nach links.
     */
    public void nachLinksBewegen() 
    {
        horizontalBewegen(-20);
    }

    /**
     * Bewege dieses Oval einige Bildschirmpunkte nach oben.
     */
    public void nachObenBewegen() 
    {
        vertikalBewegen(-20);
    }

    /**
     * Bewege dieses Oval einige Bildschirmpunkte nach unten.
     */
    public void nachUntenBewegen() 
    {
        vertikalBewegen(20);
    }

    /**
     * Bewege dieses Oval horizontal um 'entfernung' Bildschirmpunkte.
     */
    public void horizontalBewegen(int entfernung) 
    {
        loeschen();
        xPosition += entfernung;
        zeichnen();
    }

    /**
     * Bewege dieses Oval vertikal um 'entfernung' Bildschirmpunkte.
     */
    public void vertikalBewegen(int entfernung) 
    {
        loeschen();
        yPosition += entfernung;
        zeichnen();
    }

    /**
     * Bewege dieses Oval langsam horizontal um 'entfernung' Bildschirmpunkte.
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
     * Bewege dieses Oval langsam vertikal um 'entfernung' Bildschirmpunkte.
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
     * Ändere die Größe dieses Kreises in 'neueHoehe' und 'neueBreite" (Angabe
     * in Bildschirmpunkten). 'neueHoehe' und 'neueBreite' müssen größer gleich
     * Null sein.
     */
    public void groesseAendern(int neueHoehe, int neueBreite) 
    {
        loeschen();
        hoehe =  neueHoehe;
        breite = neueBreite;
        zeichnen();
    }

    /**
     * Ändere die Farbe dieses Ovals in 'neueFarbe'. Gültige Angaben sind
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
     * Zeichne dieses Oval mit seinen aktuellen Werten auf den Bildschirm.
     */
    private void zeichnen() 
    {
        if (istSichtbar) {
            Leinwand leinwand = Leinwand.gibLeinwand();
            leinwand.zeichne(this, farbe, new Ellipse2D.Double(xPosition,
                    yPosition, breite, hoehe));
            leinwand.warte(10);
        }
    }

    /**
     * Lösche dieses Oval vom Bildschirm.
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
