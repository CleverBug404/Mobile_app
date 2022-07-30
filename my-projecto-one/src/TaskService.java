import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class TaskService {
	private final List<Task> taskList = new ArrayList<>();
	
	private String uniqueID() {
		return UUID.randomUUID().toString().substring(0,10);
	}
	
	private Task searchForTask(String id) throws Exception {
		int index = 0;
		while (index < taskList.size()) {
			if (id.equals(taskList.get(index).getTaskID())) {
				return taskList.get(index);
			}
			index++;
		}
		throw new Exception("This task does not exist");
	}
	
	
	//add tasks
	public void newTask() {
		Task task = new Task(uniqueID());
		taskList.add(task);
	}
	public void newTask(String name) {
		Task task = new Task(uniqueID(), name);
		taskList.add(task);
	}
	public void newTask(String name, String description) {
		Task task = new Task(uniqueID(), name, description);
		taskList.add(task);
	}
	
	
	//delete tasks
	public void deleteTask(String id ) throws Exception {
		taskList.remove(searchForTask(id));
	}
	
	
	//updates
	public void updateName(String id, String name) throws Exception {
		searchForTask(id).setTaskName(name);
	}
	public void updateDescription(String id, String description) throws Exception {
		searchForTask(id).setTaskDescription(description);
	}
	
	public List<Task> getTaskList(){
		return taskList;
	}
}
