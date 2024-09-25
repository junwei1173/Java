public class HoneyDoList {
	private Task[] tasks;
    private int numTasks;
    private int INITIAL_CAPACITY;
    
    public HoneyDoList() {
    	INITIAL_CAPACITY =10;
    	this.tasks = new Task[INITIAL_CAPACITY];
    	this.numTasks = 0;
    }
    public String toString() {
    	String result = "";
    	
    	for (int i =0; i<numTasks; i++) {
    		if (tasks[i] != null) {
    			result += tasks[i].toString()+"\n";   		}
    	}
    	return result;
    }
    public int find(String name) {
    	for (int i = 0; i<numTasks; i++) {
    		if (tasks[i] != null && tasks[i].getName().equalsIgnoreCase(name)) {
    			return i;
    		}
    	}
    	return -1;
    }
    public void addTask(Task task) {
    	if (numTasks == tasks.length) {
    		Task[] newTasks = new Task[tasks.length*2];
    		for (int i = 0; i < numTasks; i++) {
    			newTasks[i] = tasks[i];
    		}
    		tasks = newTasks;
    	}
    	
    	tasks[numTasks] = task;
    	numTasks++;
    	
    }
    public int totalTime() {
        int totalTime = 0;
        for (int i = 0; i < numTasks; i++) {
            totalTime += tasks[i].getEstMinsToComplete();
        }
        return totalTime;
    }
    public int shortestTime() {
    	if (tasks == null) {
    		return -1;
    	}
    	int shortest = tasks[0].getEstMinsToComplete();
    	int index = 0;
    	for (int i = 0; i<numTasks; i++) {
    		if (tasks[i].getEstMinsToComplete() < shortest) {
    			shortest = tasks[i].getEstMinsToComplete();
    			index = i;
    		}
    	}
    	return index;
    }
    public Task completeTask(int index) {
        if (index < 0 || index >= numTasks) {
            return null;
        }

        Task completedTask = tasks[index];

        for (int i = index; i < numTasks - 1; i++) {
            tasks[i] = tasks[i + 1];
        }

        tasks[numTasks - 1] = null;
        numTasks--;
        return completedTask;
    }
    public Task getTask(int index) {
        if (index < 0 || index >= numTasks) {
            return null;
        }
        return tasks[index];
    }



}
