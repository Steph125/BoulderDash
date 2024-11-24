package contract;


/**
 * @author Stephane
 *
 */
public interface IBoulderDashController {
	
	/**
	 * @throws InterruptedException
	 */
	void play();
	
	/**
	 * @return this
	 */
	IOrderPerformer getOrderPerformer();
}
