package org.larinia.test;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        App app = new App();
        app.testMethod();
    }

    public void testMethod () {

      System.out.println("Hello World Twice!");
    }
}
