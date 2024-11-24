package entity;


import fr.exia.showboard.ISquare;

/**
 *   <h1>The Interface IElement.</h1>
 * @author Stephane
 *
 */
public interface IElement extends ISquare {
	/**
	 * Gets the sprite.
	 *
	 * @return the sprite
	 */
	Sprite getSprite();

	/**
	 * Gets the permeability.
	 *
	 * @return the permeability
	 */
	Permeability getPermeability();

	Boolean getHasChanged();

	void setHasChanged(Boolean hasChanged);

}