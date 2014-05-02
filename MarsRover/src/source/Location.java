package source;

public class Location {
	
	int xcoordinate;
	int ycoordinate;
	Landscape landscape;
	
	public Location(Landscape landscape,int i, int j) {
		this.landscape = landscape;
		int width = landscape.getWidth();
		int height = landscape.getHeight();
		this.xcoordinate=i;
		this.ycoordinate=j;
		if (xcoordinate>width||ycoordinate>height){
			System.out.println("The Location Coordinates Are Greater than the Bounding Box");
			return;
		}
		// TODO Auto-generated constructor stub
	}

	public int getX() {
		// TODO Auto-generated method stub
		return xcoordinate;
	}

	public int getY() {
		// TODO Auto-generated method stub
		return ycoordinate;
	}
	
	public Landscape getLandscape(){
		return landscape;
	}
	
	public void goNorth(){
		ycoordinate++;
	}
	
	public void goSouth(){
		ycoordinate--;
	}
	
	public void goWest(){
		xcoordinate--;
	}
	
	public void goEast(){
		xcoordinate++;
	}
	
	public String toString(){
		return ""+xcoordinate+" "+ycoordinate;
	}
	
	}	


