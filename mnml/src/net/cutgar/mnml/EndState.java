package net.cutgar.mnml;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import net.cutgar.mnml.model.GhostTile;
import net.cutgar.mnml.model.Player;

import org.flixel.FlxG;
import org.flixel.FlxPoint;
import org.flixel.FlxState;
import org.flixel.FlxText;

public class EndState extends FlxState {

	List<GhostTile> tiles = new LinkedList<GhostTile>();
	Random r = new Random();
	private Player player;
	
	float ticked = 0.1f;
	float tick = 0.1f;
	FlxText special;
	String message = "if(FlxG.keys.SPACE){kill();}";
	
	@Override
	public void create() {
		player = new Player(FlxG.width/2,0);
		add(player);
		FlxG.camera.follow(player);
		
		player.maxVelocity.y = 75;
		
		for(int i=0; i<25; i++){
			GhostTile gt = new GhostTile(r.nextInt(FlxG.width), r.nextInt(FlxG.height));
			tiles.add(gt);
			add(gt);
		}
		
		special = new FlxText(0, 0, FlxG.width);
		special.setText("");
		special.setColor(0xffaaaaaa);
		special.setFont("atari.TTF");
		special.scrollFactor = new FlxPoint(0,0);
		add(special);
	}
	
	public void update(){
		super.update();
		for(GhostTile gt : tiles){
			if(gt.y < player.y - FlxG.height/2){
				gt.y += FlxG.height;
				gt.x = (player.x - FlxG.width/2)+r.nextInt(FlxG.width);
			}
		}
		
		ticked -= FlxG.elapsed;
		if(ticked < 0 && message.length() > 0){
			ticked += tick;
		
			String text = special.getText();
			boolean blink = text.endsWith("_"); 
			if(blink){
				text = text.substring(0, text.length()-1);
			}
			
			text = text+message.substring(0, 1);
			message = message.substring(1);
			if(!blink)
				text += "_";
			special.setText(text);
		}
		
		if(FlxG.keys.SPACE)
			System.exit(0);
	}

}
