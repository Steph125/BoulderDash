package contract;

import java.io.IOException;

/**
 * @author Stephane
 *
 */
public interface IOrderPerformer {

		/**
		 * @param userOrder
		 * @throws IOException
		 */
		void orderPerform(UserOrder userOrder) throws IOException;

}
