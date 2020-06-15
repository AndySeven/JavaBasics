package com.syntax.class04;

public class NestingElseIfs {

	public static void main(String[] args) {
	/*if student completed a quiz we will check for a score
	 * 	if score >90 > great job
	 * if score > 80 > well done
	 * >70 you could have done better
	 * 
	 * if student didnot complete the quiz > not good
	 * please do homework on time
	 */
		
		boolean quizeCompleted=true;
		int score =86;
		
		if(quizeCompleted) {
			System.out.println("Lets Check your score");
			if (score>90) {
				System.out.println("Great job");
			} else if(score>80) {
				System.out.println("well done");
			} else if(score>70) {
				System.out.println("You could have done better");
			} else {
				System.out.println("You faild");
			}
			
		}else {
			System.out.println("Please do your HW ontime");
		}

	}
}
