import java.time.LocalDateTime;
public class TaskMain {
	public static void main(String[] args) {
		Task doHW = new Task("Finish this lab", 1, 120, LocalDateTime.of(2024, 4, 12, 23, 59));
		
		System.out.println(doHW.getName());
		System.out.println(doHW.getPriority());
		System.out.println(doHW.getEstMinsToComplete());
		System.out.println(doHW.getWhenDue());
		System.out.println();
		
		doHW.setName("Finish math HW");
		doHW.setPriority(2);
		doHW.setEstMinsToComplete(500);
		doHW.setWhenDue(LocalDateTime.of(2024, 4, 1, 23, 59));
		
		System.out.println(doHW.overdue());
		System.out.println(doHW.toString());
		
		doHW.decreasePriority(1);
		System.out.println(doHW.getPriority());
		doHW.decreasePriority(999);
		System.out.println(doHW.getPriority());
		doHW.increasePriority(3);
		System.out.println(doHW.getPriority());
		doHW.increasePriority(-2);
		System.out.println(doHW.getPriority());

	}

}
