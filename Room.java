import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Room {
	private BufferedImage image;

	private boolean obstruction;
	@SuppressWarnings("unused")
	private boolean damage;
	private boolean hasUnit;

	public Room(String fileName, boolean obstruction, boolean damage,
			boolean hasUnit) {
		try {
			image = ImageIO.read(new File(fileName));
		} catch (IOException ex) {
			// handle exception...
		}

		this.obstruction = obstruction;
		this.damage = damage;
		this.hasUnit = hasUnit;
	}

	public Image getImage() {
		return image;
	}

	/*
	 * returns if a unit is allowed to move in map room
	 */
	public boolean getCanMove() {
		return obstruction || hasUnit;
	}

}
