package net.cutgar.mnml.model;

import java.awt.Color;
import java.util.Random;

import org.flixel.FlxG;
import org.flixel.FlxSprite;

public class GhostTile extends FlxSprite {

	int r = new Random().nextInt(255);
	int g = new Random().nextInt(255);
	int b = new Random().nextInt(255);
	
	float time = 0.25f;
	float timesince = 0.25f;
	int diff = 20;
	int curr = 25+new Random().nextInt(100);
	
	public GhostTile(float x, float y){
		super(x+1, y+1);
		setSolid(false);
		makeGraphic(8, 8, new Color(r, g, b, curr).getRGB());
	}
	
	public void update(){
		super.update();
		
		timesince -= FlxG.elapsed;
		if(timesince < 0){
			timesince += time;
		
			curr += diff;
			if(curr >= 160-diff || curr < Math.abs(diff))
				diff *= -1;
			makeGraphic(8, 8, new Color(r, g, b, curr).getRGB());
		}
	}
	
}
