package junittest;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
 
public class cgdqwsjunit {
 
	
 
	@Test
	
	public void testingSignalStrength() {
		assertEquals("Signal strength is greater", signalStrength(6.0,4.65));
	}
	@Test
	public void testingOperationalFailure() {
		assertEquals("Operational failure occured", operationalFailure(0.8,1.10));
	}
	@Test
	public void testingQueueFormation() {
		assertEquals("Queue Formed", detectQueueFormation(10,7));
	}
	@Test
	public void testingIndividulized_warning() {
		assertEquals("Appropriate number of warnings", individulized_warning(6.0,0.0));
	}
	@Test
	public void testingAccurate_system() {
		assertEquals("Good accuracy level", accurate_system(1.0,0.05));
	}
	@Test
	public void testingAccurateSpeed() {
		assertEquals("Accurate speed maintained", accurateSpeed(70.00,5.00,80.00,7.00));
	}
	@Test
	public void testingPredictQueue() {
		assertEquals("Queue Predicted", predictQueue(6.0,4.65));
	}
	@Test
	public void testingGenerate_respStrategies() {
		assertEquals("Good response time", generate_respStrategies(6.0,1.10));
	}
	
	public String signalStrength(double signalStrength,double minimumStrength) {
		if(minimumStrength <= signalStrength){
			System.out.println("Signal strength is greater than minimum value");
			return "Signal strength is greater";
		}
			else
			{
				return "Signal strength is lesser";
		}
	}
	
	public String operationalFailure(double systemResponseTime,double minimumresponseTime) {
		if(minimumresponseTime >= systemResponseTime){
			System.out.println("Operational failure occured");
			return "Operational failure occured";
		}
			else
			{
				return "Operational failure not occured";
		}
	}
	public String detectQueueFormation(float noOfVehicles,float minimunQueue) {
		if(noOfVehicles > minimunQueue){
			System.out.println("Queue formed");
			return "Queue Formed";
		}
			else
			{
				return "Queue formation failed";
		}
	}
	public String individulized_warning(double num_warnings,double minwarnings) {
		if(num_warnings > minwarnings){
			System.out.println("Appropriate number of warnings");
			return "Appropriate number of warnings";
		}
			else
			{
				return "Lesser number of warnings";
		}
	}
	public String accurate_system(double accuracyLevel,double minimumAccuracyLevel) {
		if(accuracyLevel > minimumAccuracyLevel){
			System.out.println("Good accuracy level");
			return "Good accuracy level";
		}
			else
			{
				return "Bad accuracy level";
		}
	}
	
	
	public String accurateSpeed(double suggestedSpeed,double queueDistance, double maximumSpeed,double minimunQueue ) {
		if(suggestedSpeed < maximumSpeed && queueDistance < minimunQueue){
			System.out.println("Accurate speed maintained");
			return "Accurate speed maintained";
		}
			else
			{
				return "Accurate speed  not maintained";
		}
	}
	public String predictQueue(double predQ,double thresholdQueue) {
		if(predQ >= thresholdQueue){
			System.out.println("Queue Predicted");
			return "Queue Predicted";
		}
			else
			{
				return "Queue not Predicted";
		}
	}
	
	public String generate_respStrategies(double respStrategies,double minimumresponseTime) {
		if(respStrategies >= minimumresponseTime){
			System.out.println("Good response time");
			return "Good response time";
		}
			else
			{
				return "Insufficient response time";
		}
	}
	
	
}
