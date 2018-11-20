
public class Rectangle { 
	private double Height; 
	private double Width;
	private double Area; 
	
	public Rectangle() { 
		Height = 10; 
		Width = 10; 
		setArea(10,10); 
	}

	public Rectangle(double h, double w) {  
	setHeight(h); 
	setWidth(w);
	setArea(Width, Height); 
	}
	
	public void setWidth(double w) { 
		//restricts value to positive #' s
		if (w> 0) { 
			Width = w; 
		} else { 
			Width = 10; 
			System.out.println(" Can't have negative or 0 width, defaulting to 10 ");
		}
	}
	
	public void setHeight(double h) { 
		if (h>0) { 
			Height = h; 
		} else { 
			Height = 10; 
			System.out.println(" Can't have negative or 0 height, defaulting to 10 ");

		}
	}
		
	public double getWidth() { 
		return Width; 
	}
	
	public double getHeight() { 
		return Height; 
	}
	
	public void setArea (double height, double width) { 
		Area = Height * Width; 
	}
	
	public double getArea() { 
		return Area; 
	}
	
	public String toString() { 
		return " The rectangle is: " + Width + " ft X " + Height 
				+ " ft "; 
	}


}