package net.cutgar.mnml;

import java.util.Random;

import net.cutgar.mnml.model.Ghost;
import net.cutgar.mnml.model.GhostTile;
import net.cutgar.mnml.model.Grey;
import net.cutgar.mnml.model.Key;
import net.cutgar.mnml.model.Level;
import net.cutgar.mnml.model.Player;
import net.cutgar.mnml.model.Tile;

import org.flixel.FlxBasic;
import org.flixel.FlxG;
import org.flixel.FlxGroup;
import org.flixel.FlxObject;
import org.flixel.FlxPoint;
import org.flixel.FlxState;
import org.flixel.FlxText;
import org.flixel.FlxTimer;
import org.flixel.event.IFlxCamera;
import org.flixel.event.IFlxCollision;
import org.flixel.event.IFlxTimer;

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
	
	public FlxTimer textTimer = new FlxTimer();
	public String currentText = "";
	public float tick = 0.1f;
	public float ticked = 0.1f;
	
	public static Player player;
	public static Ghost ghost;
	public static FlxPoint stored;
	public static Level level;
	public FlxGroup doors = new FlxGroup();
	
	public int currentLevel = 0;
	public Level levelObj;
	
	@Override
	public void create()
	{
		FlxG.setBgColor(WHITE);

		player = new Player(0, 0);
		ghost = new Ghost(-4,-4);
		loadNextLevel();
		
		add(player);
		add(ghost);
		
//		if(currentLevel == 11){
//			textTimer = new FlxTimer();
//			textTimer.start(1.5f, 10, new IFlxTimer(){
//
//				@Override
//				public void callback(FlxTimer timer) {
////					System.out.println("call back");
//					if(currentText.length() == 0 && levelObj.terminal.size() > 0){
//						if(levelObj.terminal.size() == 1)
//							timer.stop();
//						levelObj.terminal.remove(0);
//						currentText = levelObj.terminal.get(0);
//					}
//					
//					if(levelObj.terminal.size() == 0)
//						return;
//					
//					String text = special.getText();
//					boolean blink = text.endsWith("_"); 
//					if(blink){
//						text = text.substring(0, text.length()-1);
//					}
//					text = text+currentText.substring(0, 1);
//					currentText = currentText.substring(1);
//					if(!blink)
//						text += "_";
//					special.setText(text);
//				}
//				
//			});
//		}
	}
//	
	public void update(){
		super.update();
		
		//Text-typing code for an abandoned endgame
		if(currentLevel == 11){
			ticked -= FlxG.elapsed;
			if(ticked < 0 && (levelObj.terminal.size() > 0 || currentText.length() > 0)){
				ticked += tick;
			
				String text = special.getText();
				boolean blink = text.endsWith("_"); 
				if(blink){
					text = text.substring(0, text.length()-1);
				}
				
				if(currentText.length() == 0){
					currentText = levelObj.terminal.remove(0);
					if(text.length() > 0)
						text += "\n";
				}
				
				text = text+currentText.substring(0, 1);
				currentText = currentText.substring(1);
				if(!blink)
					text += "_";
				special.setText(text);
			}
		}
		
		//Save/Restore mechanics
		if(currentLevel > 8 && FlxG.keys.justReleased("TAB")){
			if(stored == null){
				stored = new FlxPoint(player.x, player.y);
				ghost.x = stored.x; ghost.y = stored.y;
				FlxG.play("save.mp3");
				if(currentLevel == 9){
					special.setText("if(FlxG.keys.TAB){restoreState()}");
				}
			}
			else if(stored.x > 0){
				player.velocity.x = 0; player.velocity.y = 0;
				player.x = ghost.x;
				player.y = ghost.y-5;
				ghost.x = -4; ghost.y = -4;
				FlxG.play("load.mp3");
//				stored = new FlxPoint(-1, -1);
				stored = null;
				if(currentLevel == 9){
					special.setText("if(FlxG.keys.TAB){saveState()}");
				}
			}
		}
//		else if(currentLevel > 7 && stored != null && FlxG.keys.justReleased("TAB")){
//			stored = null;
//		}
		
		FlxG.collide(player, doors);
		FlxG.collide(world, ghost);
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
					if(currentLevel == 11){
						add(new GhostTile(new Random().nextInt(20)*SIDE, new Random().nextInt(20)*SIDE));
						FlxG.play("note_"+(new Random().nextInt(3)+1)+".mp3");
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
						if(currentLevel == 5){
							Random r = new Random();
							FlxText t = new FlxText(r.nextInt(FlxG.width), r.nextInt(FlxG.height), (int)special.width);
							t.setText(special.getText());
							t.setFont(special.getFont());
							t.setSize(special.getSize());
							t.setColor(special.getColor());
							add(t);
						}
					}
				}
	
			});
		}
		
		if(FlxG.keys.R || player.x > level.levelwidth+BUFF || player.y > level.levelheight+BUFF || player.x < 0-BUFF){
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
		if(currentLevel == 12){
			FlxG.switchState(new EndState());
		}
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
		doors.kill();
		world = new FlxGroup();
		doors = new FlxGroup();
		int[][] map = level.map;
		for(int i=0; i<map.length; i++){
			for(int j=0; j<map[0].length; j++){
				if(map[i][j] == 1){
					world.add(new Tile(j*SIDE, i*SIDE));
				}
				else if(map[i][j] == 2){
					world.add(new Tile(j*SIDE, i*SIDE, true));
				}
				else if(map[i][j] == 3){
					world.add(new Elevator(j*SIDE, i*SIDE, false));
				}
				else if(map[i][j] == 4){
					world.add(new Elevator(j*SIDE, i*SIDE, true));
				}
				else if(map[i][j] == 5){
					Tile t = new Tile(j*SIDE, i*SIDE);
					t.touchQuietly();
					t.setRandomColour();
					world.add(t);
				}
				else if(map[i][j] == 6){
					add(new GhostTile(j*SIDE, i*SIDE));
				}
				else if(map[i][j] == 7){
					doors.add(new DoorTile(j*SIDE, i*SIDE));
				}
				else if(map[i][j] == 8){
					add(new Key(j*SIDE + SIDE/2, i*SIDE + SIDE/2));
				}
			}
		}
		add(doors);
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
		
		if(level.bgcolor != -1)
			 FlxG.setBgColor(level.bgcolor);
		
		levelObj = level;
		
	}
}