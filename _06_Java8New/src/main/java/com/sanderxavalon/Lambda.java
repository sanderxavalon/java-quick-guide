package com.sanderxavalon;

/**
 * Hello world!
 *
 */
public class Lambda
{
    public static void main( String[] args ) {

        Runnable runnbale = new Runnable() {
            public void run() {
                System.out.println("run me!");
            }
        };

        Runnable runnbaleLambda = () -> System.out.println("run me!");

        runnbale.run();
        runnbaleLambda.run();

    }
}
