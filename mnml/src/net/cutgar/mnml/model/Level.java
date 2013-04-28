package net.cutgar.mnml.model;

import net.cutgar.mnml.PlayState;

import org.flixel.FlxGroup;

public class Level {

	public int[][] map;
	public float playerx;
	public float playery;
	
	public float levelwidth;
	public float levelheight;
	
	public FlxGroup enemies = new FlxGroup();
	public FlxGroup text = new FlxGroup();
	
	public Level(int[][] map, float i, float j) {
		this.map = map;
		this.playerx = i;
		this.playery = j;
		
		levelwidth = map[0].length*PlayState.SIDE;
		levelheight = map.length*PlayState.SIDE;
	}

}

