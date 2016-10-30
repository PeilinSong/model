package finalProject.model;

public class Velocity extends Road {
	private double frontPosition;
	private double distanceToObstacle;
	
	public Velocity(Car d){
		frontPosition = frontPosition(d);
	}

	public boolean Obstacle(Car d){
		if ((frontPosition - d.getPosition()) < MP.maxVelocity){
			return true;
		}else{
			return false;
		}
	}
	
	public void vChange(){
		Car d = new Car();
		
		MP.maxVelocity
	}
}
