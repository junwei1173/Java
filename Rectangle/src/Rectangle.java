public class Rectangle {
	int x;
	int y;
	int length;
	int width;
	
	public Rectangle(int x,int y,int length,int width) {
		this.x = x;
		this.y = y;
		this.length = length;
		this.width = width;
	}
	public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    
    public int getLength() {
        return length;
    }
    
    public int getWidth() {
        return width;
    }
    
    // Mutator methods
    public void setX(int x) {
        this.x = x;
    }
    
    public void setY(int y) {
        this.y = y;
    }
    
    public void setLength(int length) {
        this.length = length;
    }
    
    public void setWidth(int width) {
        this.width = width;
    }
    
    // Method to calculate area
    public int getArea() {
        return length * width;
    }
}
		
		