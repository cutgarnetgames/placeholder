package net.cutgar.mnml.model;

import java.awt.Color;
import java.util.Random;

import net.cutgar.mnml.PlayState;
import net.cutgar.mnml.Registry;

import org.flixel.FlxSprite;

public class Grey extends FlxSprite {
	
	public boolean bloomed = false;
	
	public Grey(float x, float y){
		super(x, y);
		
		makeGraphic(8, 8, PlayState.GREY);
		velocity.x = 50;
		acceleration.y = 100;
	}
	
	@Override
	public void update(){
		int rand = new Random().nextInt(255);
		makeGraphic(8, 8, new Color(rand, rand, rand, 255).getRGB());
		
		if(!bloomed){
			if(velocity.x < 0 && (!overlapsAt(x-width, y+1, Registry.currentState.world)
									|| overlapsAt(x-width, y-1, Registry.currentState.world))){
				velocity.x = 50;
			}
			else if(velocity.x > 0 && !overlapsAt(x+width+width, y+1, Registry.currentState.world)
									|| overlapsAt(x+width+width, y-1, Registry.currentState.world)){
				velocity.x = -50;
			}
		}
	}

	public void bloom(){
		makeGraphic(8, 8, 0xffffffff);
		bloomed = true;
		velocity.x = 0;
	}
	
}
