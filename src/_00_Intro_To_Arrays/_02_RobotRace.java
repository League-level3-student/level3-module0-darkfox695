package _00_Intro_To_Arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _02_RobotRace {
    // 1. make a main method
    public static void main(String args[]) {
        // 2. create an array of 5 robots.
    Robot[] robots = new Robot[5];
        // 3. use a for loop to initialize the robots.
        for(int i = 0; i < robots.length; i++) {
            robots[i] = new Robot();
        }
        // 4. make each robot start at the bottom of the screen, side by side, facing up
        for(int i = 0; i < robots.length; i++) {
            robots[i].setY(600);
            robots[i].setX(100 + 150*i);
            robots[i].setSpeed(1000);
        }
        // 5. use another for loop to iterate through the array and make each robot move
        // a random amount less than 50.
        int j = 0;
            while(robots[j].getY() > 0) {
                for(int i = 0; i < robots.length; i++) {
                    robots[i].move((int)(Math.random() * 50) );
                    //if(robots[i].get)
                }
                j++;
                if(j==5) {
                    j = 0;
                }
            }
            JOptionPane.showMessageDialog(null, "Robot #" + (j+1) + " is the winner!");
        // 6. use a while loop to repeat step 5 until a robot has reached the top of the
        // screen.
    
        // 7. declare that robot the winner and throw it a party!
    
        // 8. try different races with different amounts of robots.
    
        // 9. make the robots race around a circular track.
    }
}
