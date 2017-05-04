package spanner;

import org.junit.*;
import static org.junit.Assert.*;
import java.awt.*;

//git@github.com:tgm-mspanner/AutoTestA19.git       = SSH des GITHUB Repositorys

public class AutoTest	 {
	
	Auto a = new Auto("Bentley", Color.RED, 100);

	/**
	 * Testen der Methoden mit richtigem Input
	 * Die Tests sollten ohne Errors oder Failures abgeschlossen werden.
	 */
	
	@Test
	public void test1()		{
		assertEquals("Bentley", a.getType());
	}
	
	@Test
	public void test2()		{
		assertEquals(Color.RED, a.getFarbe());
	}
	
	@Test
	public void test3()		{
		assertEquals(100, a.getLeistung());
	}
	
	@Test
	public void test4()		{
		a.setType("VW");
		assertEquals("VW",a.getType());
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void test5()		{
		a.setType("   ");
	}
	
	@Test
	public void test6()		{
		a.setFarbe(Color.BLUE);
		assertEquals(Color.BLUE,a.getFarbe());
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void test7()		{
		a.setFarbe(null);
	}
	
	/**
	 * Diese Methode enth‰lt in Auto.java einen Fehler das 
	 * this.leistung wurde mit leistung beim "=" vertauscht.
	 */
	@Test
	public void test8()		{
		a.setLeistung(250);
		assertEquals(250,a.getLeistung());
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void test9()		{
		a.setLeistung(0);
	}
	
	/**
	 * Diese Methode heiﬂt in Auto.java "toString". Sie enth‰lt im letzten 
	 * if-Statement einen Fehler. Es wird die Farbe Schwarz gesetzt jedoch wird
	 * der String "rot" ausgegeben.
	 */
	
	@Test
	public void test10()	{
		a.setFarbe(Color.BLACK);
		//assertEquals(Color.BLACK,a.getFarbe());
		assertTrue(a.toString().contains("schwarz"));
	}
	
}
