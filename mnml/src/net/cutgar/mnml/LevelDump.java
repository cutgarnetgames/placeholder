package net.cutgar.mnml;

import net.cutgar.mnml.model.Grey;
import net.cutgar.mnml.model.Level;

import org.flixel.FlxG;
import org.flixel.FlxText;

public class LevelDump {

	public static Level level(int level){
		switch(level){
		case 1: return levelOne();
		case 2: return levelTwo();
		case 3: return levelThree();
		case 4: return levelFour();
		case 5: return levelFive();
		case 6: return levelSix();
		default: return levelOne();
		}
	}
	
	public static Level levelOne(){
		
		int[][] map =  new int[][]{
			
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
				
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
				{0,1,1,1,1, 1,1,1,1,1, 1,1,1,1,1, 1,1,1,1,0},
				
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
		};
		
		Level l = new Level(map, 10, 90-4);
		
		FlxText t = new FlxText(0, 0, 200, "//placeholder");
		t.setSize(8);
		t.setColor(PlayState.GREY);
		t.setFont("atari.TTF");
		l.text.add(t);
		
		t = new FlxText(0, 8, 200, "//@author=cutgarnetgames");
		t.setSize(8);
		t.setColor(PlayState.GREY);
		t.setFont("atari.TTF");
		l.text.add(t);
		
		t = new FlxText(0, FlxG.height-16, 200, "//arrow key movement");
		t.setSize(8);
		t.setColor(PlayState.GREY);
		t.setFont("atari.TTF");
		l.text.add(t);
		
		return l;
		
	}
	
	public static Level levelTwo(){
		
		int[][] map =  new int[][]{
			
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
				
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
				{0,0,0,0,0, 1,1,1,1,1, 0,0,0,0,0, 1,1,1,1,0},
				{0,1,1,1,1, 0,0,0,0,0, 1,1,1,1,1, 0,0,0,0,0},
				
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
		};
		
		Level l = new Level(map, 10, 80);
		
		FlxText t = new FlxText(0, FlxG.height-16, 200, "if(FlxG.keys.SPACEBAR){jump()}");
		t.setSize(8);
		t.setColor(PlayState.GREY);
		t.setFont("atari.TTF");
		l.text.add(t);
		
		return l;
	}
	
	public static Level levelThree(){
		
		int[][] map =  new int[][]{
			
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
				{0,0,0,0,0, 1,1,1,1,1, 1,1,1,1,1, 0,0,0,0,0},
				
				{0,1,1,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,1,1,0},
				{0,0,0,1,1, 0,0,0,0,0, 0,0,0,0,0, 1,1,0,0,0},
				{0,0,0,0,0, 0,1,1,0,0, 0,0,1,1,0, 0,0,0,0,0},
				{0,0,0,0,0, 1,0,0,0,0, 0,0,0,0,1, 0,0,0,0,0},
				{0,1,1,1,1, 0,0,0,0,0, 0,0,0,0,0, 1,1,1,1,0},
				
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
		};
		
		Level l = new Level(map, 10, 80);
		
		FlxText t = new FlxText(0, 0, 200, "//tiles.untouched = 32");
		t.setSize(8);
		t.setColor(PlayState.GREY);
		t.setFont("atari.TTF");
		Registry.currentState.special = t;
		
		return l;
	}
	
	public static Level levelFour(){
		
		int[][] map =  new int[][]{
			
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
				{0,0,1,1,0, 0,0,0,0,0, 0,0,0,0,0, 0,1,1,0,0},
				
				{0,0,0,0,0, 2,2,2,2,2, 2,2,2,2,2, 0,0,0,0,0},
				{0,0,1,1,0, 0,0,0,0,0, 0,0,0,0,0, 0,1,1,0,0},
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
				
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
		};
		
		Level l = new Level(map, 20, 30);
		
		FlxText t = new FlxText(0, FlxG.height-16, 200, "//TODO: fix bug with disappearing tiles");
		t.setSize(8);
		t.setColor(PlayState.GREY);
		t.setFont("atari.TTF");
		
		return l;
	}
	
	public static Level levelFive(){
		
		int[][] map =  new int[][]{
			
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
				
				{0,0,1,1,0, 1,1,1,1,1, 1,1,1,1,1, 0,1,1,0,0},
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
				
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
		};
		
		Level l = new Level(map, 50, 30);
		
		FlxText t = new FlxText(0, 0, 200, "//such a hack, it'll have to do for now.");
		t.setSize(8);
		t.setColor(PlayState.GREY);
		t.setFont("atari.TTF");
		l.text.add(t);
		
		t = new FlxText(0, FlxG.height-24, 200, "//possible bug, not reproducible");
		t.setSize(8);
		t.setColor(PlayState.GREY);
		t.setFont("atari.TTF");
		l.text.add(t);
		t = new FlxText(4, FlxG.height-20, 200, "//possible bug, not reproducible");
		t.setSize(8);
		t.setColor(PlayState.GREY);
		t.setFont("atari.TTF");
		l.text.add(t);
		t = new FlxText(8, FlxG.height-16, 200, "//possible bug, not reproducible");
		t.setSize(8);
		t.setColor(PlayState.GREY);
		t.setFont("atari.TTF");
		l.text.add(t);
		
		l.enemies.add(new Grey(80, 40));
		
		return l;
	}
	
	public static Level levelSix(){
		
		int[][] map =  new int[][]{
			
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
				
				{0,0,0,0,0, 1,1,2,2,2, 2,2,2,1,1, 0,0,0,0,0},
				{0,0,0,0,0, 0,0,2,2,2, 2,2,2,0,0, 0,0,0,0,0},
				{0,0,0,0,0, 0,0,2,2,2, 2,2,2,0,0, 0,0,0,0,0},
				{0,0,0,0,0, 1,1,2,2,2, 2,2,2,1,1, 0,0,0,0,0},
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
				
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
		};
		
		Level l = new Level(map, 50, 30);
		
		FlxText t = new FlxText(0, 0, 200, "//such a hack, it'll have to do for now.");
		t.setSize(8);
		t.setColor(PlayState.GREY);
		t.setFont("atari.TTF");
		l.text.add(t);
		
		t = new FlxText(0, FlxG.height-24, 200, "//possible bug, not reproducible");
		t.setSize(8);
		t.setColor(PlayState.GREY);
		t.setFont("atari.TTF");
		l.text.add(t);
		t = new FlxText(4, FlxG.height-20, 200, "//possible bug, not reproducible");
		t.setSize(8);
		t.setColor(PlayState.GREY);
		t.setFont("atari.TTF");
		l.text.add(t);
		t = new FlxText(8, FlxG.height-16, 200, "//possible bug, not reproducible");
		t.setSize(8);
		t.setColor(PlayState.GREY);
		t.setFont("atari.TTF");
		l.text.add(t);
		
		l.enemies.add(new Grey(80, 40));
		
		return l;
	}
	
}
