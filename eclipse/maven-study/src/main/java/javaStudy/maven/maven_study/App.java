package javaStudy.maven.maven_study;

import javaStudy.maven.maven_study.thread.MyThread;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	Thread thread0 = new Thread(new MyThread(),"thread0");
    	ThreadGroup group = new ThreadGroup("myThread"); // myThread라는 스레드 그룹 생성함.

        group.setMaxPriority(7); // 해당 스레드 그룹의 최대 우선순위를 7로 설정함.
    	Thread thread1 = new Thread(group,new MyThread(),"thread1");
    	
    	
    	thread0.start();
    	thread1.start();

    	System.out.println(MyThread.i);
        
    }
    
    public void mavenMainCode() { // 이전 메인 코드 
    	Sample sample = new Sample();
    	sample.setId(1);
    	sample.setName("hello ");
        System.out.println();
    }    
}

