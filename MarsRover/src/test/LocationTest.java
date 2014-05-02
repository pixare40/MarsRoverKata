package test;

import static org.junit.Assert.*;
import source.Landscape;
import source.Location;

import org.junit.Test;

//import source.Location;

public class LocationTest {
	

	@Test
	public void declareLocation() {
		Location location = new Location(new Landscape("5 5"),2,3);
		assertTrue(location!=null);
	}

	@Test
	public void seeIfLocationAttributesAreProperlyValidated(){
		Location location = new Location(new Landscape("5 5"),2,3);
		Landscape landscape = new Landscape("5 5");
		int landWidth = landscape.getWidth();
		int landHeight = landscape.getHeight();
		int x = location.getX();
		int y = location.getY();
		assert(x<landWidth);
		assert(y<landHeight);
	}
}
