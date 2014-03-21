package personnages;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


public class Elf extends Personnage {

	protected int vitesseMouvement;
	protected Image image;
	
	public Elf(String nom, int vie, int force, int vitesseMouvement) {
		super(nom, force, vie);
		this.vitesseMouvement = vitesseMouvement;
	}

	@Override
	public String toBase() {
		return "Elf\t" + nom + "\t" + vie + "\t" + force + "\t vitesse de mouvement " + vitesseMouvement;
	}
	public int GetVItesseMouvement() {
		return vitesseMouvement;
	}
	
	@Override
	public void setImage() {
		try {
			image = ImageIO.read(new File("images/p-elf.png"));
		} catch (IOException e) {
			System.out.println("L'image Elf n'existe pas");
		}
	}


}
