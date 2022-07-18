public class TestYourOutput {

    public static void main(String[] args) {
        ShotThread shot = new ShotThread();
        MissThread miss = new MissThread();
        shot.start();
        
        miss.start();
            
    }

}

class ShotThread extends Thread {

//Write your code here
	synchronized public void run()
    {
    	for(int i=1;i<=6;i++){
    		 System.out.println("Shot");
	        try {
	            // Displaying the thread that is running
                Thread.sleep(1000);
    
	        }
	        catch (Exception e) {
	            // Throwing an exception
	            System.out.println("Exception is caught in ShotThread");
	        }
	    }
    }
}

class MissThread extends Thread {

    //Write your code here
    synchronized public void run()
    {
    	for(int i=1;i<=3;i++){
    		
    		System.out.println("Miss");
    		try {
            // Displaying the thread that is running
                Thread.sleep(2000);
    			
	            
	        }
	        catch (Exception e) {
	            // Throwing an exception

	            System.out.println("Exception is caught in MissThread");
	        }
    	}
        
    }

}
