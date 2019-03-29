

public class RedCars implements Runnable{
	private String id;          //name      
	private Bridge bridge;   //bridge being used

	//constructor
	public RedCars(String id, Bridge bridge,int id_number) {
		 this.id = id;
		 this.bridge= bridge;
	    System.out.println(id+" Arrived at Time " + Main.Time());
	    //print arrived time  
	}
	//getter
	public String getID() {
	    return id;
	}
	@Override   //initiatied when the thread.start() method is called
	public void run() {
		try {
			bridge.redEnter(this);
		} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
	        try {
	            Thread.sleep(1000); //1 second for crossing the bridge.
	        } catch (InterruptedException e) {} 	
	        bridge.redExit(this);
}
}
