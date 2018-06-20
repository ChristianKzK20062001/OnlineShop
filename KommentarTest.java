

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Die Test-Klasse KommentarTest.
 *
 * @author  (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class KommentarTest
{
    private Produkt produkt1;
    private Produkt produkt2;

    /**
     * Konstruktor fuer die Test-Klasse KommentarTest
     */
    public KommentarTest()
    {
    }

    /**
     *  Setzt das Testgerüst fuer den Test.
     *
     * Wird vor jeder Testfall-Methode aufgerufen.
     */
    @Before
    public void setUp()
    {
        produkt1 = new Produkt("Fahrrad", 500);
        produkt2 = new Produkt("Schlaeger", 90);
    }

    /**
     * Gibt das Testgerüst wieder frei.
     *
     * Wird nach jeder Testfall-Methode aufgerufen.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testZweiKommentare()
    {
        Produkt produkt1 = new Produkt("Produkt", 200);
        assertEquals(true, produkt1.kommentarHinzufuegen("Autor1", "Produkt1", 3));
        assertEquals(true, produkt1.kommentarHinzufuegen("Helena Fischa", "Text2", 4));
        assertEquals(2, produkt1.gibAnzahlKommentare());
    }

    @Test
    public void Test0Punkte()
    {
        assertEquals(1, produkt2.kommentarHinzufuegen("Karl", "Finde ich gut", 4));
        assertEquals(2, produkt2.kommentarHinzufuegen("Karl", "Finde nicht gut", 0));
        produkt2.kommentarLoeschen(1);
        produkt2.kommentarLoeschen(0);
        assertEquals(false, produkt2.kommentarHinzufuegen("Karl", "nicht gut", 0));
    }
}


