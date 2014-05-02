package test;

import static org.junit.Assert.*;

import org.junit.Test;

import source.Command;
import source.Location;
import source.Rover;
import source.RoverPosition;
import source.Direction;
import source.Landscape;

public class RoverTest {
	Location location = new Location(new Landscape("5 5"),1,2);
	Direction direction = Direction.N;
	RoverPosition rover1pos = new RoverPosition(location,direction);

	@Test
	public void createARoverAndInitializeItsPosition() {
		
		Rover rover1 = new Rover(location,direction);
		assert(rover1!=null);
		//fail("Not yet implemented");
	}
	
	@Test
	public void givenAStringTheRoverCreatesACommandToExecute(){

		Rover rover1 = new Rover(location,direction);
		Command[] command = rover1.createCommand("LMR");
		for(int i = 0;i<command.length;i++){
			System.out.println(command[i].name());
		}
	}
	
	@Test
	public void testIfTheCommandStringTakeUnrecognizedCommands(){
		
		Rover rover1 = new Rover(location,direction);
		Command[] command = rover1.createCommand("LMRty");
		assert(command==null);
	}
	
	@Test
	public void testIfTheRoverExecutesCommandsSuccesfully(){
		Rover rover1 = new Rover(location,direction);
		Command[] command = rover1.createCommand("LMLMLMLMM");
		RoverPosition pos = rover1.getPosition();
		rover1.executeCommands(command,pos);
		System.out.println(rover1.getPosition().getLocation().getX());
		assert(rover1.getPosition().getLocation().getX()==3);
		assert(rover1.getPosition().getLocation().getY()==3);
		assert(pos.getDirection()==Direction.E);
	}

}
