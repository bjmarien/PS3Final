package pkgCore;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgEnum.eSuit;
import pkgEnum.eRank;
import pkgException.DeckException;

public class DeckTest {

	@Test
	public void TestEmptyDeck() throws DeckException
	{
		Deck d = new Deck();
		boolean a = false;
		try 
		{
			for (int x=0;x<52;x++)
			{
				d.Draw();	
			}
			d.Draw();
		}
		catch(DeckException e)
		{
			a = true;
			assertTrue(a);
		}
	}
	
	@Test
	public void TestDrawSuit() 
	{
		Deck d = new Deck();
		Card c = d.Draw(eSuit.CLUBS);
		assertTrue(c.geteSuit() == eSuit.CLUBS);
	}
	
	@Test
	public void TestDrawRank() 
	{
		Deck d = new Deck();
		Card c = d.Draw(eRank.KING);
		assertTrue(c.geteRank() == eRank.KING);
	}
	
	@Test
	public void TestDeckRankCount() 
	{
		Deck d = new Deck();
		for (int x = 4; x > 0; x--)
		{
			assertEquals(d.Count(eRank.EIGHT), x);
			d.Draw(eRank.EIGHT);			
		}
	}
	
	@Test
	public void TestDeckSuitCount() 
	{
		Deck d = new Deck();
		for (int x = 13; x > 0; x--)
		{
			assertEquals(d.Count(eSuit.HEARTS), x);
			d.Draw(eSuit.HEARTS);		
		}
	}

}
