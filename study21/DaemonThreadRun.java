package study21;

import java.util.Random;

class CoThread extends Thread {
	@Override
	public void run() {
		System.out.println(getName());
		if (isDaemon()) {
			for (int i = 0; i < 21; i++) {
				System.out.println("2번마    ▽ "+i+"m");
				try {
					Thread.sleep((long) (((Double)Math.random()*99)+((Double)Math.random()*99)));
				} catch (InterruptedException e) {}
			}
		} else {
			for (int i = 0; i < 21; i++) {
				System.out.println("1번마    ▼ "+i+"m");
				try {
					Thread.sleep((long) (((Double)Math.random()*99)+((Double)Math.random()*99)));
				} catch (InterruptedException e) {}
			}
		}
	}
}

public class DaemonThreadRun {
	public static void main(String[] args) {
		Thread normal = new CoThread();
		normal.setName("READY...");
		normal.setDaemon(false);
		normal.start();

		Thread daemon = new CoThread();
		daemon.setName("START!");
		daemon.setDaemon(true);
		daemon.start();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {}
		System.out.println("결승선");
	}
}