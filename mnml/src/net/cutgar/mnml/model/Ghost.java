package net.cutgar.mnml.model;

import java.util.Random;

import org.flixel.FlxSprite;

public class Ghost extends FlxSprite {

	public Ghost(float x, float y){
		super(x, y);
		
		makeGraphic(4, 4, 0xaaaaaaaa);
		
	}
	
	public void update(){
		makeGraphic(4, 4, 0xaaffffff & new Random().nextInt());
	}
	
}
