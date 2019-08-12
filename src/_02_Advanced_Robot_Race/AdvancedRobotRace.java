package _02_Advanced_Robot_Race;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class AdvancedRobotRace {
	// Re-do the robot race recipe from level 3 module 0. 
	// This time, use threads to make all of the robots go at the same time.
	
	
	boolean raceComplete = false;
	
	static _01_RobotRace rr = new _01_RobotRace();
	
	public static void main(String[] args) {
		Robot[] robots = new Robot[5];
		for (int i = 0; i < robots.length; i++) {
			robots[i] = new Robot();
		}
		
		
		// 4. make each robot start at the bottom of the screen, side by side, facing up
		for (int i = 0; i < robots.length; i++) {
			robots[i].setX(i * 100 + 50);
			robots[i].setY(520);
		}
		
		
		
		
		Thread r1 = new Thread(() -> rr.runner(robots[0]));
		Thread r2 = new Thread(() -> rr.runner(robots[1]));
		Thread r3 = new Thread(() -> rr.runner(robots[2]));
		Thread r4 = new Thread(() -> rr.runner(robots[3]));
		Thread r5 = new Thread(() -> rr.runner(robots[4]));
		
		r1.start();
		r2.start();
		r3.start();
		r4.start();
		r5.start();
		
		
	}
	
	
	

		
		
		
		
		

	
	
}
