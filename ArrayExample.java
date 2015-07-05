
import org.apache.log4j.Logger;
public class ArrayExample {
	 final static Logger log = Logger.getLogger(ArrayExample.class);
			
	public static void main(String[] args){
		
		
	
					stringArray();
					
	}
				
		public static void stringArray() {
		
			
		String[] days = {"mon ", "tue ", "wed ", "thu ", "fri "};
			
		for(int counter=0; counter<days.length; counter++) {
			
			log.trace("Trace Message");
			log.debug("Debug Message");
			log.info("Info Message");
			log.warn("Warn Message");
			log.error("Error Message");
	
		}
		}
}
