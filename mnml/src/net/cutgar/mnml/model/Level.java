package net.cutgar.mnml.model;

import java.util.LinkedList;
import java.util.List;

import net.cutgar.mnml.PlayState;

import org.flixel.FlxGroup;

public class Level {

	public int[][] map;
	public float playerx;
	public float playery;
	
	public float levelwidth;
	public float levelheight;
	
	public int bgcolor = -1;
	public List<String> terminal = new LinkedList<String>();
	
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

