package source;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String commandstring1 ="LMLMLMLMM";
		String commandstring2 ="MMRMMRMRRM";
		Landscape landscape = new Landscape("5 5");
        Rover rover1 = new Rover(new Location(landscape,1,2),Direction.N);
        Rover rover2 = new Rover(new Location(new Landscape("5 5"),3,3),Direction.E);
        Command[] com = rover1.createCommand(commandstring1);
        Command[] com2 = rover2.createCommand(commandstring2);
        RoverPosition pos = rover1.getPosition();
        RoverPosition pos2 = rover2.getPosition();
        System.out.println(landscape.toString());
        System.out.println(pos);
        System.out.println(commandstring1);
        System.out.println(pos2);
        System.out.println(commandstring2);
        rover1.executeCommands(com, pos);
        rover2.executeCommands(com2, pos2);
        System.out.println("New Position...");
        System.out.println(rover1.getPosition());
        System.out.println(rover2.getPosition());

	}

}
