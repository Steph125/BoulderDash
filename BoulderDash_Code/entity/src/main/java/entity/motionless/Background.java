package entity.motionless;

import entity.Permeability;
import entity.Sprite;

/**
 * @author Stephane
 *
 */
public class Background extends MotionlessElement{
	
	/** The Constant SPRITE. */
    private static final Sprite SPRITE = new Sprite('.', "Background.png");

    /**
     * Instantiates a new background.
     */
    Background() {
        super(SPRITE, Permeability.WALKABLE);
    }

}