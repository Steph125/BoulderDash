package contract;

import entity.IMap;
import entity.mobile.IMobile;


/**
 * The Interface IModel.
 *
 * @author Stephane
 */
public interface IModel {

	IMap getMap();

    IMobile getMyPlayer();

}