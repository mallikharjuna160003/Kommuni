//output:  shot shot miss shot shot miss shot shot miss 
public class Main {
    
    static class ShotThread implements Runnable {
        
        
       synchronized public static void Shotmethod(){
            
            
            System.out.println("Shot");
            try {
               
                Thread.sleep(1000);
    
            }
            catch (Exception e) {
                
                System.out.println("Exception is caught in ShotThread");
            }
        }
           
        @Override
    	public void run()
        {
        	Shotmethod();
            
    	}
   }
   
   static class MissThread implements Runnable {

        static synchronized public void MissMethod()
        {
        	
    		System.out.println("Miss");
    		try {
               Thread.sleep(1000);
            }
            catch (Exception e) {
               System.out.println("Exception is caught in MissThread");
            }
        }
        
       @Override
       public void run(){
           MissMethod();
       }

   }

    public static void main(String[] args) {
        ShotThread shot = new ShotThread();
        MissThread miss = new MissThread();
        Thread t1 = new Thread(shot);
        t1.start();
        try
        {
            t1.join();
        }
        catch(Exception ex)
        {
            System.out.println("Exception has " +
                                "been caught" + ex);
        }
        Thread t2 = new Thread(shot);
        t2.start();
        try
        {
            
            t2.join();
        }
        catch(Exception ex)
        {
            System.out.println("Exception has " +
                                "been caught" + ex);
        }
        Thread s1 = new Thread(miss);
        s1.start();
        try
        {
            
            s1.join();
        }
        catch(Exception ex)
        {
            System.out.println("Exception has " +
                                "been caught" + ex);
        }
        Thread t3 = new Thread(shot);
        t3.start();
        try
        {
            t3.join();
        }
        catch(Exception ex)
        {
            System.out.println("Exception has " +
                                "been caught" + ex);
        }
        Thread t4 = new Thread(shot);
        t4.start();
        try
        {
            
            t4.join();
        }
        catch(Exception ex)
        {
            System.out.println("Exception has " +
                                "been caught" + ex);
        }
        Thread s2 = new Thread(miss);
        s2.start();
        try
        {
           
            s2.join();
        }
        catch(Exception ex)
        {
            System.out.println("Exception has " +
                                "been caught" + ex);
        }
        Thread t5 = new Thread(shot);
        t5.start();
        try
        {
            
            t5.join();
        }
        catch(Exception ex)
        {
            System.out.println("Exception has " +
                                "been caught" + ex);
        }
        Thread t6 = new Thread(shot);
        t6.start();
        try
        {
            
            t6.join();
        }
        catch(Exception ex)
        {
            System.out.println("Exception has " +
                                "been caught" + ex);
        }
        Thread s3 = new Thread(miss);
        s3.start();
        try
        {
           
            s3.join();
        }
        catch(Exception ex)
        {
            System.out.println("Exception has " +
                                "been caught" + ex);
        }
       
    }

}




