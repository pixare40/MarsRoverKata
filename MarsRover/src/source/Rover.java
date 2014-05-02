package source;

import source.*;

public class Rover {
	RoverPosition pos = null;

	public Rover(Location location, Direction direction) {
		this.pos = new RoverPosition (location,direction);
		// TODO Auto-generated constructor stub
	}

	public Command[] createCommand(String string) {
		int stringsize = string.length();
        Command[] commands = new Command[stringsize];
        for(int i=0;i<stringsize;i++){
            char c = string.charAt(i);
            if(c=='L'){
                commands[i]= Command.LEFT;
            }
            else if(c=='R'){
                commands[i]=Command.RIGHT;
            }
            else if(c=='M'){
                commands[i]=Command.MOVE;
            }
            else{
                System.out.println("Unknown Command");
                return null;
            }
        }
        return commands;
		// TODO Auto-generated method stub
	}

	public RoverPosition getPosition() {
		// TODO Auto-generated method stub
		return pos;
	}

	public void executeCommands(Command[] command,RoverPosition position) {
		for (Command commands : command){
			if(commands==Command.LEFT){
                pos.toLeft();
		}
        else if (commands==Command.RIGHT){
            pos.toRight();
        }
        else if (commands==Command.MOVE){
        	if(pos.getDirection()==Direction.N){
                pos.getLocation().goNorth();
                
            }
            if(pos.getDirection()==Direction.S){
               pos.getLocation().goSouth();
               
            }
            if(pos.getDirection()==Direction.W){
                pos.getLocation().goWest();
              
            }
            if(pos.getDirection()==Direction.E){
               pos.getLocation().goEast();
               
            }
        	
        }
		// TODO Auto-generated method stub
		
	}

}
}
