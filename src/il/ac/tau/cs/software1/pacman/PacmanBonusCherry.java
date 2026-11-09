package il.ac.tau.cs.software1.pacman;

import il.ac.tau.cs.software1.components.*;

public class PackmanBonusCherry extends PacmanBonus {

	public PackmanBonusCherry(PacmanGridComponent initialPosition) {
		super(initialPosition);
		this.imageComponent = new ImageComponent("bonus-cherry");
		this.bonusScore = 30;
	}
}