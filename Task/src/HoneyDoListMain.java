import java.time.LocalDateTime;
public class HoneyDoListMain {
	public static void main(String[] args) {
		HoneyDoList honeydo = new HoneyDoList();
		System.out.println(honeydo);		
		honeydo.addTask(new Task("Finish this lab", 2, 12, LocalDateTime.of(2024, 4, 13, 23, 59)));
		System.out.println(honeydo);
		honeydo.addTask(new Task("Go to Mars", 3, 1000, LocalDateTime.of(2025, 4, 7, 23, 59)));
		System.out.println(honeydo);
		honeydo.addTask(new Task("Look at sky", 4, 3, LocalDateTime.of(2099, 12, 30, 23, 59)));
		System.out.println(honeydo.toString());
		
		System.out.println(honeydo.find("Finish this lab"));
		System.out.println(honeydo.find("Go to Mars"));
		System.out.println(honeydo.totalTime());
		System.out.println(honeydo.shortestTime());
		honeydo.completeTask(0);
		System.out.println(honeydo.toString());
		System.out.println(honeydo.getTask(0));

	}

}
