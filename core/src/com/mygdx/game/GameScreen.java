package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;





public class GameScreen implements Screen{
	SpriteBatch batch;
	Texture gridImg, border, block, blue, green, red,bg;
	int grid [][] = new int[12][22];
	Block myblock = new Block(grid,7,19);
	float time = System.nanoTime();
	boolean pressedRight = false;
	boolean [][] g = new boolean[10][20];

    boolean pressedLeft = false;
    boolean pressedDown = false;
    boolean pressedU = false;
    boolean pressedUp = false;
    int c = 0;


	public GameScreen (Game g){
		batch = new SpriteBatch();
		// load textures
		gridImg = new Texture("grid.png");
		border = new Texture("border.png");
		block = new Texture("block.png");
		blue=new Texture("newblue.png");
        green=new Texture("green.png");
        red=new Texture("red.png");
        bg=new Texture("bg.png");

		for (int y=0; y<22;y++){
			for (int x =0;x<12;x++){
				if(x==0||x==11||y==0||y==21){
					grid[x][y]=1;
				}
				else
					grid[x][y]=0;
			}
			
		}

        myblock.Show();



	}


	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(float delta) {

		if(Gdx.input.isKeyPressed(Input.Keys.RIGHT)&&pressedRight==false)
		{
                myblock.MoveRight();
				pressedRight = true;
		}
		if(!Gdx.input.isKeyPressed(Input.Keys.RIGHT)){
			pressedRight = false;
		}
		if(Gdx.input.isKeyPressed(Input.Keys.DOWN)&&pressedDown==false){
            myblock.Movedown();
				pressedDown = true;
		}
		if(!Gdx.input.isKeyPressed(Input.Keys.DOWN)){
			pressedDown = false;
		}
		if(Gdx.input.isKeyPressed(Input.Keys.LEFT)&&pressedLeft==false){
		    myblock.moveLeft();
				pressedLeft = true;
		}
		if(!Gdx.input.isKeyPressed(Input.Keys.LEFT)){
			pressedLeft = false;
		}
        if(Gdx.input.isKeyPressed(Input.Keys.UP)&&pressedUp==false){

            myblock.rotate();
            pressedUp = true;
        }
        if(!Gdx.input.isKeyPressed(Input.Keys.UP)){
            pressedUp = false;
        }

        int max = grid[1][1];
		for (int x = 1; x<11;x++)
        {
            for (int y = 1; y< 21; y++)
            {
                if (grid[x][y]>max)
                {
                    max=grid[x][y];
                }
            }
        }
        if (Gdx.input.isKeyPressed(Input.Keys.U)&&pressedU==false)//additional feature to undo previous move
        {
            c++;
            for (int x = 1; x<11;x++)
            {
                for (int y = 1; y< 21; y++)
                {
                    if (grid[x][y]==max)
                    {
                        grid[x][y]=0;
                    }
                }
            }
            if (c==2)
            {
                pressedU=true;
                c=0;
            }



        }
        if(!Gdx.input.isKeyPressed(Input.Keys.U)){
            pressedU = false;
        }
		//rate at which the tetronimo falls
		if((System.nanoTime()-time)/(1000)>500000){
			time = System.nanoTime();

            myblock.Movedown();

		}

		Gdx.gl.glClearColor(-30, -10, 49, -90);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
        batch.draw(bg,900, 394);
		for (int y=0; y<22;y++){
			for (int x =0;x<12;x++){

				if (grid[x][y]==1)
					batch.draw(gridImg, x*20+200, y*20);
				else if (grid[x][y]==0)
					batch.draw(border, x*20+200, y*20);
				else
				    if (grid[x][y]<myblock.d)
                        batch.draw(red, (x*20)+200, y*20);

                    else
                    {
                        batch.draw(green, (x*20)+200, y*20);
                    }
			}
			
		}
		batch.end();
		
	}



	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

}
