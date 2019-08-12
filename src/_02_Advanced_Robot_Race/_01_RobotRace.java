package _02_Advanced_Robot_Race;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	

	// 1. make a main method
	AdvancedRobotRace abr = new AdvancedRobotRace();

public void runner(Robot r) {
		
		while (abr.raceComplete == false) {
			/*
			 * for (int i = 0; i < robots.length; i++) { Random rand = new Random(); int
			 * random = rand.nextInt(49); robots[i].setSpeed(6); robots[i].move(random);
			 */
			
				if (r.getY() < 20) {
					abr.raceComplete = true;

					System.out.println("The robot  has won!");
					break;
				}
			
		Random rand = new Random();
		int m = rand.nextInt(50);
		r.move(m);
		
		}

		
		
		
		
		

	}

}
