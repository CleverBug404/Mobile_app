
public class Task {
	
	private String taskID, taskName, taskDescription;
	
	//default values
	String defaultValue = "DEFAULT";
	
	Task(){
		taskID = defaultValue;
		taskName = defaultValue;
		taskDescription = defaultValue;
	}
	
	//getters 
	public final String getTaskID() {
		return taskID;
	}
	public final String getTaskName() {
		return taskName;
	}
	public final String getTaskDescription() {
		return taskDescription;
	}
	
	
	//check
	private void checkTaskID(String id) {
		if (id.length() > 10 || id == null) {
			throw new IllegalArgumentException("The task ID cannot be longer han 10 characters, or be null");
		} else {
			this.taskID = id;
		}
	}
	//setters
	protected void setTaskName(String name) {
		if (name.length() > 20 || name == null) {	
			throw new IllegalArgumentException("Task name cannot be longer than 20 characters, or be null");
		}else {
			this.taskName = name;
		}
	}
	protected void setTaskDescription(String description) {
		if (description.length() > 50 || description == null) {
			throw new IllegalArgumentException("The task description cannot be longer rhan 50 characters, or be null");
		} else {
			this.taskDescription = description;
		}
	}
	
	//defining task object
	

}
