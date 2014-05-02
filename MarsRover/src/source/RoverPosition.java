package source;

import source.Direction;

public class RoverPosition implements Position{
	Location location = null;
	Direction direction = null;

	public RoverPosition(Location location, Direction direction) {
		this.location = location;
		this.direction = direction;
		// TODO Auto-generated constructor stub
	}


	@Override
	public Location getLocation() {
		// TODO Auto-generated method stub
		return location;
	}

	@Override
	public Direction getDirection() {
		// TODO Auto-generated method stub
		return direction;
	}


	public void toRight() {
		// TODO Auto-generated method stub
		direction = direction.turnRight();
	}
	
	public void toLeft(){
		direction = direction.turnLeft();
	}
	
	@Override
	public String toString(){
		return ""+ getLocation().getX() + " " + getLocation().getY()+" "+getDirection().name();
		
	}

}
