// This program accepts your homework and two exam scores as input and computes your grade in the course.
import java.util.*;
public class Grades {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		// gets homework max weight from user
		System.out.print("Homework weight? ");
		int homeworkWeight = console.nextInt();
		if (homeworkWeight > 100) { // set homework weight capped at 100
			homeworkWeight = 100;
		} else if (homeworkWeight < 0) { // if negative, set to 0
			homeworkWeight = 0;
		}
		System.out.println();
		// gets exam 1 max weight from user
		System.out.print("Exam 1 weight? ");
		int exam1Weight = console.nextInt();
		// if homework weight 100 or exam 1 weight over 100, or negative, set exam 1 weight to 0
		if (homeworkWeight == 100 || exam1Weight > 100 || exam1Weight < 0) { 
			exam1Weight = 0;
		}
		// calculate exam 2 max weight based on the preceding weights entered
		int exam2Weight = 100 - homeworkWeight - exam1Weight;
		System.out.println();
		// prints out weights entered
		System.out.println("Using weights of " + homeworkWeight + " " + exam1Weight + " " + exam2Weight);
		System.out.println();
		
		
		// homework counts
		System.out.println("Homework:");
		System.out.println();
		// gets number of homework completed
		System.out.print("Number of assignments? ");
		int assignmentCount = console.nextInt(); 	 	 	
		System.out.println();
		// gets average homework grade
		System.out.print("Average homework grade? ");
		double homeworkAvg = console.nextDouble();
		if (homeworkAvg < 0) {
            homeworkAvg = 0; // set homework average to 0 if it's negative
		} else if (homeworkAvg > 10) {
			homeworkAvg = 10; // set homework average capped at 10 points
        }
		System.out.println();
		// gets number of late days used
		System.out.print("Number of late days used? ");
		int lateDays = console.nextInt();
		System.out.println();
		// gets number of labs attended
		System.out.print("Labs attended? ");
		int labs = console.nextInt();
		if (labs < 0) {
            labs = 0; // set labs attended to 0 if it's negative
		} else if (labs > 10) {
			labs = 10; // set labs attended capped at 10 
        }
		// calculates total points possible according to number of homework and labs done
		int maxPoints = (assignmentCount * 10) + (assignmentCount * 4);
		if (maxPoints < 0) {
            maxPoints = 0; // set maximum points to 0 if it's negative
        }
		System.out.println();
		// calculates total homework points
		double homeworkTotals = homeworkTotals(assignmentCount,homeworkAvg,labs,lateDays,maxPoints);
		System.out.println("Total points = " + homeworkTotals+ " / " + maxPoints );
		System.out.println();
		// get weighted homework score
		double weightedHomeworkScore = weightedHomeworkScore(homeworkTotals,maxPoints,homeworkWeight);
		System.out.print("Weighted score = " + weightedHomeworkScore);
		System.out.println();
		System.out.println();
		
		
		// exam 1
		System.out.println("Exam 1:");
		System.out.println();
		// gets exam 1 score
		System.out.print("Score? ");
		int exam1Score = console.nextInt();
		if (exam1Score < 0) {
            exam1Score = 0; // set exam 1 score to 0 if it's negative
		} else if (exam1Score > 100) {
			exam1Score = 100; // set exam 1 score capped at 100
        }
		System.out.println();
		// gets curve for exam 1
		System.out.print("Curve? ");
		int curve1 = console.nextInt();
		if (curve1 < 0) {
            curve1 = 0; // set exam 1 curve to 0 if it's negative
		}
		System.out.println();
		// calculate total points from exam 1
		int exam1Total = exam1Total(exam1Score,curve1);
		System.out.println("Total points = " + exam1Total + " / 100");
		System.out.println();
		// calculate weighted exam 1 score
		double weightedExam1Score = weightedExam1Score(exam1Weight,exam1Total);
		System.out.println("Weighted score = " + weightedExam1Score);
		System.out.println();
		
		
		// exam 2
		System.out.println("Exam 2:");
		System.out.println();
		// gets exam 2 score
		System.out.print("Score? ");
		int exam2Score = console.nextInt();
		if (exam2Score < 0) {
            exam2Score = 0; // set exam 2 score to 0 if it's negative
		} else if (exam2Score > 100) {
			exam2Score = 100; // set exam 2 score capped at 100
        }
		System.out.println();
		// gets curve for exam 2
		System.out.print("Curve? ");
		int curve2 = console.nextInt();
		if (curve2 < 0) {
            curve2 = 0; // set exam 2 curve to 0 if it's negative
		}
		System.out.println();
		// calculate total points from exam 2
		int exam2Total = exam2Total(exam2Score,curve2);
		System.out.println("Total points = " + exam2Total + " / 100");
		System.out.println();
		// calculate weighted exam 2 score
		double weightedExam2Score = weightedExam2Score(exam2Weight,exam2Total);
		System.out.println("Weighted score = " + weightedExam2Score);
		System.out.println();
		
		
		// calculate course grade
		double grade = weightedHomeworkScore + weightedExam1Score + weightedExam2Score;
		System.out.println("Course grade = " + Math.round(grade * 100.0)/100.0);
		
		// closes scanner
		console.close();
		
		
	} // calculates total homework and lab points earned
	public static double homeworkTotals(int assignmentCount, double homeworkAvg, int labs, int lateDays,int maxPoints) {
		double total = (assignmentCount * homeworkAvg) + (labs * 4);
		double pointsLeft = maxPoints - total;
		if (assignmentCount <= 0) {
			return 0;
	    }else if (lateDays > assignmentCount/2) {
			// if late days used is more than half of total homework assigned, reduce 10% on points earned
			return Math.round((total / 1.10) * 100.0) / 100.0;
			// if 0 late days is used, get 5 extra credit if points earned is at least 5 less than max points
		} else if (lateDays <= 0 && maxPoints - total >= 5) {
			return total + 5;
			// if 0 late days is used and points earned is less than 5 points left toward max points, add the remaining extra credits possible
		} else if (lateDays <= 0 && total >= pointsLeft){ 
			return total + pointsLeft;
			// just return total points earned if neither above condition is met
		} else {
			return total;
		}	
	} 
	
	//calculate weighted homework score
	public static double weightedHomeworkScore(double homeworkTotals, int maxPoints, int homeworkWeight) {
		if (homeworkTotals <= 0) { //if user enters 0 or less for number of assignments, receive full homework grade
			return homeworkWeight;
		} else {
			return Math.round(((homeworkWeight * (homeworkTotals)) / (maxPoints)) * 100.0) / 100.0;
		}
	}
	
	
	
	// calculate exam 1 score
	public static int exam1Total(int exam1Score, int curve) {
		if (curve + exam1Score > 100) {
			return 100;
		} else {
			return curve + exam1Score;
		}
	}
	// calculate weighted exam 1 score
	public static double weightedExam1Score(int exam1Weight, int exam1Score) {
		return ((double)exam1Weight * exam1Score) / 100;
	}
	
	
	
	// calculate exam 2 score
	public static int exam2Total(int exam2Score, int curve2) {
		if (curve2 + exam2Score > 100) {
			return 100;
		} else {
				return curve2 + exam2Score;
		}
	}
	// calculate weighted exam 2 score
	public static double weightedExam2Score(int exam2Weight, int exam2Score) {
		return ((double)exam2Weight * exam2Score) / 100;
	}
	
}	
