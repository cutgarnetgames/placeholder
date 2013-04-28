package net.cutgar.mnml.model;

import java.util.Random;

import org.flixel.FlxG;
import org.flixel.FlxSprite;

public class Player extends FlxSprite {
	
	public boolean cycleColours = false;
	
	public Player(float x, float y){
		super(x, y);
		
		makeGraphic(4, 4, 0xff000000);
		
		acceleration.y = 200;
	}
	
	public void update(){
		if(FlxG.keys.RIGHT){
			velocity.x = 100;
		}
		else if(FlxG.keys.LEFT){
			velocity.x = -100;
		}
		else{
			velocity.x = 0;
		}
		
		if(FlxG.keys.SPACE && isTouching(FLOOR)){
			velocity.y = -80;
		}
		
		if(cycleColours){
			makeGraphic(4, 4, 0xff000000 | new Random().nextInt());
		}
	}

}
