package javaStudy.maven.maven_study;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Sample sample = new Sample();
    	sample.setId(1);
    	sample.setName("hello ");
        System.out.println(new StringBuilder(sample.getName()).append(sample.getId()) );
    }
}
