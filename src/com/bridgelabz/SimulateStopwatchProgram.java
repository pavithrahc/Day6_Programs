/**
 * 
 */
package com.bridgelabz;
import java.util.concurrent.TimeUnit;
/**
 * @author PAVITHRA C
 *
 */
public class SimulateStopwatchProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws InterruptedException {
	// TODO Auto-generated method stub
		long startTime = System.nanoTime();

		TimeUnit.SECONDS.sleep(3);

		long endTime = System.nanoTime();

		long timeElapsed = endTime - startTime;

		System.out.println("Execution time in nanoseconds: " + timeElapsed);
		System.out.println("Execution time in milliseconds: " + timeElapsed / 1000000);

	}

}
