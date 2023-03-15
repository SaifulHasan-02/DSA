package Array;

/*
    Static block in Java is a group of statements that gets executed only once when the class is loaded into
    the memory by Java ClassLoader, It is also known as a static initialization block. Static initialization
    block is going directly into the stack memory.
 */

public class StaticBlock {

    static {
        System.out.println("I am Static Block run without main() method");
        System.exit(0);
    }
}

/*
		we can execute a java program without a main method (works until Java 1.6 version).
		Java 7 and newer versions don’t allow this because JVM checks the presence of the main
		method before initializing the class.

*/
