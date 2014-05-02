package source;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Landscape {
	int width;
	int height;

	public Landscape(String string) {
		
		if(correctDeclaration(string)){
		String[] parts = string.split(" ");
		this.width = Integer.parseInt(parts[0]);
		this.height = Integer.parseInt(parts[1]);
		}
		else{
			System.out.println("Wrong Declaration of the Landscape");
			return;
		}
		// TODO Auto-generated constructor stub
	}
	
	public boolean correctDeclaration(String s){
		Pattern pattern = Pattern.compile("\\d\\s\\d");
		Matcher match = pattern.matcher(s);
		boolean found = match.find();
		return found;
	}

	public int getWidth() {
		// TODO Auto-generated method stub
		return width;
	}

	public int getHeight() {
		
		// TODO Auto-generated method stub
		return height;
	}
	
	@Override
	public String toString(){
		return ""+width+" "+height;
	}

}
