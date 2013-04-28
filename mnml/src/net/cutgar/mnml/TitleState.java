package net.cutgar.mnml;

import org.flixel.FlxG;
import org.flixel.FlxState;
import org.flixel.FlxText;
import org.flixel.event.IFlxCamera;

public class TitleState extends FlxState {

	@Override
	public void create() {
		
		FlxG.setBgColor(PlayState.WHITE);
		
		FlxG.playMusic("music.mp3");

		FlxText t = new FlxText(0, 0, 200, "//placeholder");
		t.setSize(8);
		t.setColor(PlayState.GREY);
		t.setFont("atari.TTF");
		add(t);
		
		t = new FlxText(0, 8, 200, "//@author=cutgarnetgames");
		t.setSize(8);
		t.setColor(PlayState.GREY);
		t.setFont("atari.TTF");
		add(t);
		
		FlxText ft = new FlxText(0, FlxG.height-16, FlxG.width-4, "if(FlxG.keys.SPACE){begin()}");
		ft.setSize(8);
		ft.setColor(PlayState.GREY);
		ft.setAlignment("right");
		ft.setFont("atari.TTF");
		add(ft);
		
	}
	
	@Override
	public void update(){
		super.update();
		
		if(FlxG.keys.SPACE){
			FlxG.fade(PlayState.WHITE, 0.1f, new IFlxCamera() {
				
				@Override
				public void callback() {
					PlayState p = new PlayState();
					Registry.currentState = p;
					FlxG.switchState(p);					
				}
			});
			
		}
		
	}

}
