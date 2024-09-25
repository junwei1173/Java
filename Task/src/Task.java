import java.time.LocalDateTime;
public class Task {
	private String name;
	private int priority;
	private int estMinsToComplete;
	private LocalDateTime whenDue;
	
	public Task(String name, int priority, int estMinsToComplete, LocalDateTime whenDue) {
		this.name = name;
		this.priority = priority;
		this.estMinsToComplete = estMinsToComplete;
		this.whenDue = whenDue;
	}
	public String getName() {
		return name;
	}
	public int getPriority() {
		return priority;
	}
	public int getEstMinsToComplete() {
		return estMinsToComplete;
	}
	public void setName(String newName) {
		name = newName;
	}
	public void setPriority(int newPriority) {
		priority = newPriority;
	}
	public void setEstMinsToComplete(int newEstMinsToComplete) {
		estMinsToComplete = newEstMinsToComplete;
	}
	public String toString() {
		return "Task name: "+name+", Priority: "+priority+", Estimated minutes to complete: "+estMinsToComplete+ ", Due Date: "+whenDue;
	}
	public void setWhenDue(LocalDateTime NewwhenDue) {
        whenDue = NewwhenDue;
	}
	public LocalDateTime getWhenDue() {
        return whenDue;
	}
	public boolean overdue() {
        LocalDateTime current = LocalDateTime.now();
        return current.isAfter(whenDue);
    }
	public void increasePriority(int amount) {
		if (amount >= 0) {
			priority +=amount;
		}
	}
	public void decreasePriority(int amount) {
		if (amount > priority) {
			priority = 0;
		} else {
			priority -= amount;
		}
	}

}
