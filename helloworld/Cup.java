package cm.dart.helloworld;

public class Cup {
	private String drinkType;
	private String color;
	private String capacity;
	

		public String getColor() {
	        return color;
	    }

	    public void setColor(String color) {
	        this.color = color;
	    }

	    public String getCapacity() {
	        return capacity;
	    }

	    public void setCapacity(String capacity) {
	        this.capacity= capacity;
	    }

	    public String getDrinkType() {
	        return drinkType;
	    }

	    public void setDrinkType(String drinkType) {
	        this.drinkType = drinkType;
	    }
	    
	    public void clear(){
	    
	    
	    }

		@Override
		public String toString() {
			return "Cup [drinkType=" + drinkType + ", color=" + color + ", capacity=" + capacity + "]";
		}
	  
	}


