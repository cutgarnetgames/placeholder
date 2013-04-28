package net.cutgar.mnml;

import java.awt.Color;
import java.util.Random;

import org.flixel.FlxSprite;

public class DoorTile extends FlxSprite {

	public DoorTile(float x, float y){
		super(x, y);
		makeGraphic(PlayState.SIDE, PlayState.SIDE, 0xff382A10);
		immovable = true;
		moves = false;
	}
	
	public void update(){
		int rand = new Random().nextInt(125);
		makeGraphic(PlayState.SIDE, PlayState.SIDE, new Color(56,42,16, 125+rand).getRGB());
	}
	
}
