package net.cutgar.mnml.model;

import java.util.Random;

import net.cutgar.mnml.PlayState;

import org.flixel.FlxG;
import org.flixel.FlxSprite;
import org.flixel.FlxTimer;
import org.flixel.event.IFlxTimer;

public class Tile extends FlxSprite {
	
	public boolean touched = false;
	public boolean fades = false;
	public FlxTimer fadeTimer;
	public float fadeTime = 1.5f;
	public Tile self;
	
	public Tile(float x, float y){
		super(x, y);
		
		makeGraphic(PlayState.SIDE, PlayState.SIDE, PlayState.GREY);
		
		immovable = true;
		moves = false;
	}
	
	public Tile(float x, float y, boolean fades) {
		super(x, y);
		
		makeGraphic(PlayState.SIDE, PlayState.SIDE, PlayState.BLACK);
		
		immovable = true;
		moves = false;
		
		this.fades = true;
		self = this;
	}

	public boolean isTouched(){
		return touched;
	}
	
	@Override
	public void update(){
		super.update();
		if(fades && touched){
			fadeTimer.update();
		}
	}
	
	public void clear() {
		if(!fades){
			touched = !touched;
			makeGraphic(PlayState.SIDE, PlayState.SIDE, PlayState.GREY);
			FlxG.play("eton_"+(new Random().nextInt(3)+1)+".mp3");
		}
	}
	
	public void touch(){
		if(fades && !touched){
			fadeTimer = new FlxTimer();
			fadeTimer.start(fadeTime/10, 10, new IFlxTimer() {
				
				@Override
				public void callback(FlxTimer timer) {
					self.setAlpha(0.1f * timer.getLoopsLeft());
					if(timer.getLoopsLeft() == 0){
						//TODO: possible bug here
//						self.kill();
						setSolid(false);
					}
				}
			});
		}
		
		if(fades){
			FlxG.play("dnote_"+(new Random().nextInt(3)+1)+".mp3");
		}
		else{
			FlxG.play("note_"+(new Random().nextInt(3)+1)+".mp3");
		}
		
		touched = true;
	}
	
	public void setRandomColour(){
		
		makeGraphic(PlayState.SIDE, PlayState.SIDE, 0xff000000 | new Random().nextInt());
	}

}
