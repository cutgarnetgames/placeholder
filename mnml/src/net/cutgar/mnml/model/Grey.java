package net.cutgar.mnml.model;

import java.awt.Color;
import java.util.Random;

import net.cutgar.mnml.PlayState;
import net.cutgar.mnml.Registry;

import org.flixel.FlxSprite;

public class Grey extends FlxSprite {
	
	public boolean wasmovingleft = false;
	public boolean bloomed = false;
	
	public Grey(float x, float y){
		super(x, y);
		
		makeGraphic(8, 8, PlayState.GREY);
		velocity.x = 50;
		wasmovingleft = false;
		acceleration.y = 100;
	}
	
	public Grey(float x, float y, boolean dir){
		super(x, y);
		
		makeGraphic(8, 8, PlayState.GREY);
		
		wasmovingleft = false;
		acceleration.y = 100;
		
		if(dir)
			velocity.x = 50;
		else
			velocity.x = -50;
	}
	
	@Override
	public void update(){
		super.update();
		int rand = new Random().nextInt(255);
		makeGraphic(8, 8, new Color(rand, rand, rand, 255).getRGB());
		
		if(!bloomed && isTouching(FLOOR)){
			if(velocity.x < 0 && (!overlapsAt(x-width, y+1, Registry.currentState.world))){
//				System.out.println("Hole left");
				velocity.x = 50;
				wasmovingleft = false;
			}
			else if(velocity.x == 0 && wasmovingleft && (overlapsAt(x-1, y, Registry.currentState.world))){
//				System.out.println("Wall left");
				velocity.x = 50;
				wasmovingleft = false;
			}
			else if(velocity.x > 0 && !overlapsAt(x+width+width, y+1, Registry.currentState.world)){
//				System.out.println("Hole right");
				velocity.x = -50;
				wasmovingleft = true;
			}
			else if(velocity.x == 0 && !wasmovingleft && overlapsAt(x+1, y, Registry.currentState.world)){
//				System.out.println("Wall right");
				velocity.x = -50;
				wasmovingleft = true;
			}
		}
	}

	public void bloom(){
		makeGraphic(8, 8, 0xffffffff);
		bloomed = true;
		velocity.x = 0;
	}
	
}
