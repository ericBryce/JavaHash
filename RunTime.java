
public class RunTime {
	private long startTime = 0;
	private long endTime = 0;
	
	public void startTimer() {
		startTime = System.currentTimeMillis();
	}
	
	public void endTimer() {
		endTime = System.currentTimeMillis();
	}
	
	public long getTotalTime() {
		return endTime - startTime;
	}
}
