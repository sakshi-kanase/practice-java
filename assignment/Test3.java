package assignment;

public class Test3 {
    public static void main(String[] args) {
    	System.out.println("Min int: " + Integer.MIN_VALUE);
        System.out.println("Max int: " + Integer.MAX_VALUE);
        long outsideRange = (long) Integer.MAX_VALUE + 1;
        System.out.println("Outside int range: " + outsideRange);
        
    }
}

