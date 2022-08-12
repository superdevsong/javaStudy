package javaStudy.maven.maven_study.thread;

public class MyThread implements Runnable {
	public static int i=1;
	
	public synchronized void addIndex() {
		i++;
	}

	@Override
	public void run() {
		synchronized (MyThread.class) {
			i++;
		}
	}

}
