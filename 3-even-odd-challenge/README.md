manage threads, using two approaches: by subclassing the Thread class,

and by implementing the Runnable interface. Your task is to create two threads. You should

make one thread subclass the java.lang.Thread class.

The other should be created using a Runnable, which you can pass to the Threadconstructor.

This can be any class that implements Runnable, or a lambda expression.

Each thread should have a run method.

The first thread's code should print 5 even numbers,

and the secondthread should print 5 odd numbers.

You should execute them asynchronously, calling the start method on each, in two consecutive statements,

in your main code. Have your main method, after these threads run a few seconds,

interrupt one or both of these threads. Your application shouldn't crash, meaning your

threads should handle an interrupted exception.

Go away and give that a go, and when you're ready, come back and we'll walkthrough my solution together.