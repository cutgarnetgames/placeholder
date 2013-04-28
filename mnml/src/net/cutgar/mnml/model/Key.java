package net.cutgar.mnml.model;

import java.awt.Color;
import java.util.Random;

import net.cutgar.mnml.Registry;

import org.flixel.FlxG;
import org.flixel.FlxObject;
import org.flixel.FlxSprite;
import org.flixel.event.IFlxCollision;

public class Key extends FlxSprite {
	
	public Key(float x, float y){
		super(x, y);
		makeGraphic(4,4,0xffff0000);
	}
	
	public void update(){
		super.update();
		int rand = new Random().nextInt(125);
		makeGraphic(4, 4, new Color(255, 0, 0, 125+rand).getRGB());
		
		FlxG.collide(this, Registry.currentState.player, new IFlxCollision() {
			@Override
			public void callback(FlxObject Object1, FlxObject Object2) {
				Object1.kill();
				Registry.currentState.doors.kill();
				FlxG.play("dnote_3.mp3");
			}
		});
		
	}

}
