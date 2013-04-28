package net.cutgar.mnml;

import net.cutgar.mnml.model.Tile;

public class Elevator extends Tile {
	
	float oldx;
	float oldy;
	boolean up = true;

	public Elevator(float x, float y, boolean up) {
		super(x, y);
		this.up = up;
		moves = true;
		makeGraphic((int)width, (int)height, 0xffaaaaaa);
	}
	
	@Override
	public void update(){
		super.update();
		if(velocity.y != 0){
			if(Math.abs(y - oldy) > PlayState.SIDE){
				if((overlapsAt(x-PlayState.SIDE, y, Registry.currentState.world) || overlapsAt(x+width+PlayState.SIDE, y, Registry.currentState.world))
						&& (y%PlayState.SIDE == 0)){
					velocity.y = 0;
				}
			}
		}
	}
	
	@Override
	public void clear() {
		super.clear();
		if(up){
			velocity.y = 100;
		}
		else{
			velocity.y = -100;
		}
		oldx = x;
		oldy = y;
	}
	
	@Override
	public void touch(){
		super.touch();
		if(up){
			velocity.y = -100;
		}
		else{
			velocity.y = 100;
		}
		oldx = x;
		oldy = y;
	}

}
