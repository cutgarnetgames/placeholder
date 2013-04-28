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
		case 7: return levelSeven();
		case 8: return levelEight();
		case 9: return levelNine();
		case 10: return levelTen();
		case 11: return levelEleven();
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
		l.text.add(t);
		
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
		
		Level l = new Level(map, 30, 30);
		
		FlxText t = new FlxText(0, 0, 200, "//such a hack, it'll have to do for now.");
		t.setSize(8);
		t.setColor(PlayState.GREY);
		t.setFont("atari.TTF");
		l.text.add(t);
		
		t = new FlxText(0, FlxG.height-24, 200, "//possible bug, not reproducible");
		t.setSize(8);
		t.setColor(PlayState.GREY);
		t.setFont("atari.TTF");
		Registry.currentState.special = (t);
		
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
				
				{0,0,0,1,1, 1,1,2,2,2, 2,2,2,1,1, 1,1,0,0,0},
				{0,0,0,0,0, 0,0,2,2,2, 2,2,2,0,0, 0,0,0,0,0},
				{0,0,0,0,0, 0,0,2,2,2, 2,2,2,0,0, 0,0,0,0,0},
				{0,0,0,1,1, 1,1,2,2,2, 2,2,2,1,1, 1,1,0,0,0},
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
				
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
		};
		
		Level l = new Level(map, 50, 30);
		
		FlxText t = new FlxText(0, 0, 200, "//almost certain this is a memory leak\n//no time to fix");
		t.setSize(8);
		t.setColor(PlayState.GREY);
		t.setFont("atari.TTF");
		l.text.add(t);
		
		l.enemies.add(new Grey(80, 40));
		
		return l;
	}
	
	public static Level levelSeven(){
		
		int[][] map =  new int[][]{
			
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
				{0,0,0,1,1, 3,0,0,0,0, 0,0,0,0,0, 1,1,0,0,0},
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 6,0,0,0,0},
				
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
				{0,6,0,0,0, 0,0,1,1,1, 1,1,1,0,4, 0,0,0,0,0},
				
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
		};
		
		Level l = new Level(map, 30, 10);
		
		FlxText t = new FlxText(0, FlxG.height/3, 200, "//0.3a added dynamics\n//can't get them to move though\n//added to 0.3b tasklist");
		t.setSize(8);
		t.setColor(PlayState.GREY);
		t.setFont("atari.TTF");
		l.text.add(t);
		
//		t = new FlxText(0, FlxG.height-24, 200, "if(FlxG.keys.TAB){saveState()}");
//		t.setSize(8);
//		t.setColor(PlayState.GREY);
//		t.setFont("atari.TTF");
//		Registry.currentState.special = t;
		
		l.enemies.add(new Grey(80, 80));
		
		return l;
	}
	
	public static Level levelNine(){
		
		int[][] map =  new int[][]{
			
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
				{0,0,0,0,7, 0,0,0,0,0, 0,0,0,0,0, 0,6,0,0,0},
				{0,0,0,0,7, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,6,0},
				{0,0,1,1,1, 1,1,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
				
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
				{6,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,6,0},
				{0,0,0,0,0, 0,0,0,0,0, 0,8,0,0,0, 0,0,0,0,0},
				{0,0,0,0,0, 0,0,1,1,1, 1,1,1,0,0, 0,0,0,0,0},
				
				{0,6,0,0,0, 0,0,0,0,0, 0,0,0,0,6, 0,0,0,0,0},
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,6,0, 6,0,0,0,0},
		};
		
		Level l = new Level(map, 50, 20);
		
		FlxText t = new FlxText(0, FlxG.height/2, 200, "//mike, pls commit to version control\n//so we can undo if there are problems");
		t.setSize(8);
		t.setColor(PlayState.GREY);
		t.setFont("atari.TTF");
		l.text.add(t);
		
		t = new FlxText(70, 0, FlxG.width-70, "if(FlxG.keys.R){restartLevel()}");
		t.setSize(8);
		t.setColor(PlayState.GREY);
		t.setFont("atari.TTF");
		l.text.add(t);
		
		t = new FlxText(0, FlxG.height-16, 200, "if(FlxG.keys.TAB){saveState()}");
		t.setSize(8);
		t.setColor(PlayState.GREY);
		t.setFont("atari.TTF");
		Registry.currentState.special = t;
		
		return l;
	}
	
	public static Level levelEight(){
		
		int[][] map =  new int[][]{
			
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
				{0,6,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
				{0,0,0,0,0, 0,0,0,0,0, 7,0,0,0,0, 0,0,0,0,0},
				{0,0,0,0,0, 0,0,0,0,0, 7,0,0,0,0, 0,0,0,0,0},
				{0,0,0,0,8, 0,0,0,0,0, 7,0,0,0,0, 0,6,0,0,0},
				
				{0,0,0,0,1, 1,1,1,1,1, 1,1,1,1,1, 1,0,0,0,0},
				{0,0,0,0,0, 0,0,0,0,0, 7,0,0,0,0, 0,0,0,0,0},
				{0,0,0,0,0, 0,0,0,0,0, 7,0,0,0,0, 0,0,0,0,0},
				{0,0,0,0,0, 0,0,0,0,0, 7,0,0,0,0, 0,0,0,0,0},
				{0,0,0,6,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,6,0},
				
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
		};
		
		Level l = new Level(map, 80, 50);
		
		FlxText t = new FlxText(0, 0, 200, "//this code won't even run any more");
		t.setSize(8);
		t.setColor(PlayState.GREY);
		t.setFont("atari.TTF");
		l.text.add(t);
		
		t = new FlxText(0, FlxG.height-10, FlxG.width-70, "//TODO: IMMEDIATE FIX");
		t.setSize(8);
		t.setColor(PlayState.GREY);
		t.setFont("atari.TTF");
		Registry.currentState.special = t;
		
		return l;
	}
	
	public static Level levelTen(){
		
		int[][] map =  new int[][]{
			
				{0,0,0,0,0, 0,7,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
				{6,0,0,0,0, 0,7,0,0,0, 0,0,0,0,0, 0,0,0,6,0},
				{6,0,0,0,0, 0,7,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
				{6,0,1,1,0, 1,1,0,0,0, 0,0,0,0,0, 1,1,0,0,0},
				{0,0,0,5,0, 5,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
				
				{0,0,0,5,0, 5,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
				{0,6,0,5,0, 5,5,4,4,4, 4,4,4,4,4, 0,5,0,0,0},
				{0,0,0,5,0, 0,0,0,0,0, 0,0,0,0,0, 8,5,0,6,0},
				{0,0,0,5,5, 5,5,5,5,5, 5,5,5,5,5, 5,5,0,0,0},
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,6,0},
				
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
		};
		
		Level l = new Level(map, 20, 20);
		
		FlxText t = new FlxText(0, FlxG.height-28, 200, "//these dynamics aren't working\n//just delete them");
		t.setSize(8);
		t.setColor(PlayState.GREY);
		t.setFont("atari.TTF");
		l.text.add(t);
		
		t = new FlxText(70, 0, FlxG.width-70, "if(FlxG.keys.R){restartLevel()}");
		t.setSize(8);
		t.setColor(PlayState.GREY);
		t.setFont("atari.TTF");
		
		return l;
	}
	
	public static Level levelEleven(){
		
		int[][] map =  new int[][]{
			
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
				{0,6,6,6,6, 6,6,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
				{0,0,0,0,0, 6,6,6,6,6, 6,6,6,6,6, 0,0,0,0,0},
				{0,1,1,2,2, 2,2,2,2,2, 2,2,2,2,2, 2,2,2,2,0},
				
				{0,0,0,0,0, 0,0,6,6,6, 6,6,6,0,0, 0,0,0,0,0},
				{0,0,0,0,0, 0,0,0,0,0, 0,6,6,6,6, 6,6,0,0,0},
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 6,6,0,0,0},
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
				{0,1,1,1,1, 1,1,1,1,1, 1,1,1,1,1, 0,0,0,0,0},
				
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,1,1,1,0},
				{0,0,0,0,0, 0,0,0,0,0, 1,1,1,1,1, 0,0,0,0,0},
		};
		
		Level l = new Level(map, 10, 10);
		
		FlxText t = new FlxText(0, FlxG.height-10, 200, "IllegalStateException");
		t.setSize(8);
		t.setColor(0xffff0000);
		t.setFont("atari.TTF");
		l.text.add(t);
		
		t = new FlxText(0, 0, 200, "_");
		t.setSize(8);
		t.setColor(PlayState.GREY);
		t.setFont("atari.TTF");
		Registry.currentState.special = t;
		
		l.terminal.add("Runtime.getRuntime();");
		l.terminal.add("runtime.getFreeMemory();");
		l.terminal.add("System.requestGarbageCollection();");
		
		return l;
	}
	
	/*
	 * Dumped ideas for levels or tracks through the game.
	 * 
	 * public static Level levelEight(){
		
		int[][] map =  new int[][]{
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
				{0,0,0,1,1, 0,0,0,0,0, 0,0,0,0,3, 1,1,0,0,0},
				
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
				
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
		};
		
		Level l = new Level(map, 30, 40);
		
		FlxText t = new FlxText(0, 0, 200, "//commenting this out for now, do not delete\n//will just upload without if can't find a fix");
		t.setSize(8);
		t.setColor(PlayState.GREY);
		t.setFont("atari.TTF");
		l.text.add(t);
		
		t = new FlxText(0, FlxG.height-24, 200, "//{0,0,0,1,1, 1,0,0,0,0, 0,0,0,0,3, 1,1,0,0,0},");
		t.setSize(8);
		t.setColor(PlayState.GREY);
		t.setFont("atari.TTF");
		Registry.currentState.special = t;
		
		return l;
	}
	
	public static Level levelNine(){
		
		int[][] map =  new int[][]{
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
				{0,0,0,0,0, 0,0,0,0,0, 0,0,5,0,0, 0,0,0,0,0},
				{0,0,0,0,1, 1,0,0,5,0, 2,0,0,0,1, 1,0,0,0,0},
				
				{0,0,0,0,0, 1,0,2,0,0, 0,0,2,0,1, 0,0,0,0,0},
				{0,0,0,0,0, 1,0,0,0,0, 0,5,0,2,1, 0,0,0,0,0},
				{0,0,0,0,0, 1,5,0,2,0, 2,0,0,0,1, 0,0,0,0,0},
				{0,0,0,0,0, 1,0,0,0,0, 0,2,0,0,1, 0,0,0,0,0},
				{0,0,0,0,0, 1,1,1,1,1, 1,1,1,1,1, 0,0,0,0,0},
				
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
		};
		
		Level l = new Level(map, 90, 00);
		
		FlxText t = new FlxText(0, 0, 200, "_");
		t.setSize(8);
		t.setColor(0xff00CC00);
		t.setFont("atari.TTF");
		Registry.currentState.special = t;
		
		l.terminal.add("Runtime.getRuntime();");
		l.terminal.add("runtime.getFreeMemory();");
		l.terminal.add("System.requestGarbageCollection();");
		
		l.bgcolor = 0xff222222;
		
		return l;
	}
	
	public static Level levelQuestionMark(){
		
		int[][] map =  new int[][]{
			
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
				{0,0,0,0,0, 0,2,2,2,2, 2,2,2,2,0, 0,0,0,0,0},
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
				
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
				{0,0,0,1,1, 4,1,1,1,1, 1,1,1,1,4, 1,1,0,0,0},
				
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
				{0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0, 0,0,0,0,0},
		};
		
		Level l = new Level(map, 30, 80);
		
		FlxText t = new FlxText(0, 0, 200, "//mike, pls commit to version control\n//so we can undo if there are problems");
		t.setSize(8);
		t.setColor(PlayState.GREY);
		t.setFont("atari.TTF");
		l.text.add(t);
		
		t = new FlxText(0, FlxG.height-24, 200, "if(FlxG.keys.TAB){saveState()}");
		t.setSize(8);
		t.setColor(PlayState.GREY);
		t.setFont("atari.TTF");
		Registry.currentState.special = t;
		
		l.enemies.add(new Grey(80, 80));
		
		return l;
	}*/
	
}
