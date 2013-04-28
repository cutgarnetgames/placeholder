package net.cutgar.mnml;

import net.cutgar.mnml.model.Grey;
import net.cutgar.mnml.model.Level;
import net.cutgar.mnml.model.Player;
import net.cutgar.mnml.model.Tile;

import org.flixel.FlxBasic;
import org.flixel.FlxG;
import org.flixel.FlxGroup;
import org.flixel.FlxObject;
import org.flixel.FlxState;
import org.flixel.FlxText;
import org.flixel.event.IFlxCamera;
import org.flixel.event.IFlxCollision;

public class PlayState extends FlxState
{
	
	public static final int WHITE = 0xffffffff;
	public static final int BLACK = 0xff000000;
	public static final int GREY = 0xff777777;
	
	public static final int SIDE = 10;
	public static int BUFF = SIDE*3;
	
	public FlxGroup world = new FlxGroup();
	public FlxGroup text = new FlxGroup();
	public FlxGroup enemies = new FlxGroup();
	public FlxText special;
	
	public static Player player;
	public static Level level;
	
	public int currentLevel = 5;
	
	@Override
	public void create()
	{
		FlxG.setBgColor(WHITE);

		player = new Player(0, 0);
		loadNextLevel();
		
		add(player);
	}
	
	public void update(){
		super.update();
		
		FlxG.collide(world, player, new IFlxCollision() {
			
			@Override
			public void callback(FlxObject _tile, FlxObject _player) {
				Tile tile = (Tile) _tile;
				
				if(!tile.isTouched()){
					tile.touch();
					tile.setRandomColour();
					
					if(currentLevel == 3){
						special.setText("//tiles.untouched = "+countUntouched());
					}
					
					checkAllTilesTouched();
				}
			}

		});
		
		if(countUntouched() == 0){
			FlxG.collide(world, enemies);
		}
		else{
			FlxG.collide(world, enemies, new IFlxCollision() {
				
				@Override
				public void callback(FlxObject _tile, FlxObject _enemy) {
					Tile tile = (Tile) _tile;
					
					if(tile.isTouched()){
						tile.clear();
					}
				}
	
			});
		}
		
		if(player.x > level.levelwidth+BUFF || player.y > level.levelheight+BUFF || player.x < 0-BUFF){
			loadLevel();
		}
	}
	
	public int countUntouched() {
		int untouched = 0;
		for(FlxBasic b : world.members){
			Tile tile = (Tile) b;
			if(!tile.isTouched()){
				untouched++;
			}
		}
		return untouched;
	}
	
	public void checkAllTilesTouched(){
		for(FlxBasic b : world.members){
			Tile tile = (Tile) b;
			if(!tile.isTouched())
				return;
		}
		
		for(FlxBasic b : enemies.members){
			((Grey) b).bloom();
		}
		
		player.cycleColours = true;
		FlxG.fade(WHITE, 1.5f, new IFlxCamera() {
			
			@Override
			public void callback() {
				FlxG.fade(0x00000000);
				PlayState p = new PlayState();
				p.currentLevel = currentLevel;
				Registry.currentState = p;
				FlxG.switchState(p);
			}
		});
		
	}
	
	public void loadNextLevel(){
		currentLevel++;
		loadLevel();
	}
	
	public void loadLevel(){
		
		if(level != null){
			
		}
		
		if(special != null){
			remove(special);
		}
		
		level = LevelDump.level(currentLevel);
		
		if(special != null){
			add(special);
		}
		
		world.kill();
		world = new FlxGroup();
		int[][] map = level.map;
		for(int i=0; i<map.length; i++){
			for(int j=0; j<map[0].length; j++){
				if(map[i][j] == 1){
					world.add(new Tile(j*SIDE, i*SIDE));
				}
				else if(map[i][j] == 2){
					world.add(new Tile(j*SIDE, i*SIDE, true));
				}
			}
		}
		add(world);
		
		player.x = level.playerx;
		player.y = level.playery;
		player.cycleColours = false;
		
		text.kill();
		text = new FlxGroup();
		for(FlxBasic b : level.text.members){
			text.add(b);
		}
		add(text);
		
		enemies.kill();
		enemies = new FlxGroup();
		for(FlxBasic b : level.enemies.members){
			enemies.add(b);
		}
		add(enemies);
		
	}
}