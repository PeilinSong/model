package finalProject.model;

public class SP {
	private double _timeStep;
	private double _runTime;
	private int[] _gridSize;
	private boolean _trafficPattern;
	private double _carGenerationDelay;
	private double _roadSegmentLength;
	private double _intersectionLength;
	private double _carLength;
	private double _carMaxVelocity;
	private double _carStopDistance;
	private double _carBrakeDistance;
	private double _trafficLightGreenTime;
	private double _trafficLightYellowTime;
	
	
	public void setTimeStep(double timeStep){
		_timeStep = timeStep;		
	}	
	
	public double getTimeStep(){
		return _timeStep;		
	}
	

	
	public void setRunTime(double runTime){
		_runTime = runTime;
	}
	
	public double getRunTime(){
		return _runTime;
	}
	
	
	
	public void setGridSize(int[] gridSize){
		_gridSize = gridSize;
	}
	
	public int[] getGridSize(){
		return _gridSize;
	}
	
	
	
	public void setTrafficPattern(boolean trafficPattern){
		_trafficPattern = trafficPattern;
	}
	
	public boolean getTrafficPattern(){
		return _trafficPattern;
	}
	
	
	
	public void setCarGenerationDelay(double carGenerationDelay){
		_carGenerationDelay = carGenerationDelay;		
	}
	
	public double getCarGenerationDelay(){
		return _carGenerationDelay;
	}
	
	
	
	public void setRoadSegmentLength(int roadSegment){
		_roadSegmentLength = roadSegment;
	}
	
	public double getRoadSegmentLength(){
		return _roadSegmentLength;
	}
	
	
	
}

	
	
	


