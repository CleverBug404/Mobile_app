
public class Task {
	
	private String taskID, taskName, taskDescription;
	
	//default values
	String defaultValue = "DEFAULT";
	
	Task(){
		taskID = defaultValue;
		taskName = defaultValue;
		taskDescription = defaultValue;
	}
	
	public final String getTaskID() {
		return taskID;
	}
	public final String getTaskName() {
		return taskName;
	}
	public final String getTaskDescription() {
		return taskDescription;
	}
	

}
