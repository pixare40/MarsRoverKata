package test;

import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.Test;

import source.Landscape;

public class LandscapeTest {

	@Test
	public void landscapeCanBeDefined() throws Exception{
		Landscape landscape = new Landscape("5 5");
		assertTrue(landscape!=null);
	}
	
	@Test
	public void invalidCharactersInLandscapeStringCanBeRemoved() throws Exception{
		Landscape landscape = new Landscape("5,5");
		assertTrue(landscape==null);
	}

}
