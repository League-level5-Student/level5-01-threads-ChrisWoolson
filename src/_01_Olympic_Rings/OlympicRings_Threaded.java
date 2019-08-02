package _01_Olympic_Rings;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.

	
	
	public static void main(String[] args) {
	
		
		Robot r1 = new Robot(300,200);
		r1.setSpeed(100);
		r1.penDown();
		r1.setPenColor(Color.blue);
	Robot r2 = new Robot(400,300);
	r2.setSpeed(100);
	r2.penDown();
	r2.setPenColor(Color.yellow);
	Robot r3 = new Robot(500,200);
	r3.setSpeed(100);
	r3.penDown();
	r3.setPenColor(Color.black);
	
	Robot r4 = new Robot(600,300);
	r4.setSpeed(100);
	r4.penDown();
	r4.setPenColor(Color.green);
	
	Robot r5 = new Robot(700,200);
	r5.setSpeed(100);
	r5.penDown();
	r5.setPenColor(Color.red);
		
	
	
	Thread r1s = new Thread(()->{
	
		for (int i = 0; i < 360; i++) {
		r1.move(2);
	r1.turn(1);
	}
	
});
	
	
	Thread r2s = new Thread(()->{
		
		for (int i = 0; i < 360; i++) {
		r2.move(2);
	r2.turn(1);
	}
	
});
	
	
	
	Thread r3s = new Thread(()->{
		
		for (int i = 0; i < 360; i++) {
		r3.move(2);
	r3.turn(1);
	}
	
});
	
	
	
	Thread r4s = new Thread(()->{
		
		for (int i = 0; i < 360; i++) {
		r4.move(2);
	r4.turn(1);
	}
	
});
	
	
	
	Thread r5s = new Thread(()->{
		
		for (int i = 0; i < 360; i++) {
		r5.move(2);
	r5.turn(1);
	}
	
});
	r1s.start();
	r2s.start();
	r3s.start();
	r4s.start();
	r5s.start();
	
}}
