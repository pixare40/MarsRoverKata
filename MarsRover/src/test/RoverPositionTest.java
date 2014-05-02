package test;

import static org.junit.Assert.*;

import org.junit.Test;

import source.Landscape;
import source.Location;
import source.RoverPosition;
import source.Direction;

public class RoverPositionTest {

	@Test
	public void placeRoverAtAPosition() {
		Location location = new Location(new Landscape("5 5"),2,3);
		Direction direction = Direction.N;
		RoverPosition rover1 = new RoverPosition(location,direction);
		assert(rover1!=null);
	}
	
	@Test
	public void roverTurningGivesCorrectDirection(){
		Location location = new Location(new Landscape("5 5"),2,3);
		Direction direction = Direction.N;
		RoverPosition rover1 = new RoverPosition(location,direction);
		Direction d = rover1.getDirection();
		rover1.toRight();
		Direction d1 = rover1.getDirection();
		System.out.println("Original Direction "+d.name());
		assert(d1==Direction.E);
	}

}
