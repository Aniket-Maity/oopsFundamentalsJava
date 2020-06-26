package oopsBasics;

class box{
	int width;
	int height;
	int depth;
	box(){
		System.out.println(">>new Box object is created");
	}
	void storeDetails(int width,int height,int depth){
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	public int getVolume(){
		int volume = 1;
		volume = width*height*depth;
		return volume;
	}
}

public class volumeOfBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		box b1 = new box();
		b1.storeDetails(Integer.parseInt(args[0]),Integer.parseInt(args[1]),Integer.parseInt(args[2]));
		System.out.print(b1.getVolume());
		
		
	}

}
