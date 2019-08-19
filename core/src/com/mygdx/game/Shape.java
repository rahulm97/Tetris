package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.mygdx.game.GameScreen;

import java.net.SocketTimeoutException;

public class Shape{

    int grid[][];
    int xco,yco;
//   Block b = new Block(grid, xco, yco);

    //Block all[0] = LShape();

    Block [] All = new Block[7];




    public Shape(int [][] grid, int x, int y)
    {

        this.grid=grid;
        xco=x;
        yco=y;




    }

    void Piece()
    {

    }

    public Block [] IShape ()
    {
        Block [] IShape = new Block[4];



        Block b1 = new Block(grid,xco-2,yco);


        Block b2 = new Block(grid,xco-1,yco);
        Block b3 = new Block(grid,xco,yco);
        Block b4 = new Block(grid,xco+1,yco);

        IShape[0]=b1;
        IShape[1]=b2;
        IShape[2]=b3;
        IShape[3]=b4;

        //All[0]=IShape;


        return IShape;
    }


    public Block [] LShape ()
    {
        Block [] LShape = new Block[4];

        Block block1 = new Block(grid,xco-2,yco);
        Block block2 = new Block(grid,xco-1,yco);
        Block block3 = new Block(grid,xco,yco);
        Block block4 = new Block(grid,xco,yco-1);

        LShape[0]=block1;
        LShape[1]=block2;
        LShape[2]=block3;
        LShape[3]=block4;


        return LShape;
    }

    public Block [] OShape ()
    {
        Block [] OShape = new Block[4];

        Block block1 = new Block(grid,xco,yco);
        Block block2 = new Block(grid,xco-1,yco);
        Block block3 = new Block(grid,xco-1,yco-1);
        Block block4 = new Block(grid,xco,yco-1);

        OShape[0]=block1;
        OShape[1]=block2;
        OShape[2]=block3;
        OShape[3]=block4;


        return OShape;
    }
    public Block [] ZShape ()
    {
        Block [] ZShape = new Block[4];

        Block block1 = new Block(grid,xco-1,yco);
        Block block2 = new Block(grid,xco,yco);
        Block block3 = new Block(grid,xco,yco-1);
        Block block4 = new Block(grid,xco+1,yco-1);

        ZShape[0]=block1;
        ZShape[1]=block2;
        ZShape[2]=block3;
        ZShape[3]=block4;


        return ZShape;
    }
    public Block [] SShape ()
    {
        Block [] SShape = new Block[4];

        Block block1 = new Block(grid,xco+1,yco);
        Block block2 = new Block(grid,xco,yco);
        Block block3 = new Block(grid,xco,yco-1);
        Block block4 = new Block(grid,xco-1,yco-1);

        SShape[0]=block1;
        SShape[1]=block2;
        SShape[2]=block3;
        SShape[3]=block4;


        return SShape;
    }
    public Block [] TShape ()
    {
        Block [] TShape = new Block[4];

        Block block1 = new Block(grid,xco-1,yco);
        Block block2 = new Block(grid,xco,yco);
        Block block3 = new Block(grid,xco+1,yco);
        Block block4 = new Block(grid,xco,yco-1);

        TShape[0]=block1;
        TShape[1]=block2;
        TShape[2]=block3;
        TShape[3]=block4;


        return TShape;
    }
    public Block [] JShape ()
    {
        Block [] JShape = new Block[4];

        Block block1 = new Block(grid,xco-1,yco);
        Block block2 = new Block(grid,xco,yco);
        Block block3 = new Block(grid,xco,yco-1);
        Block block4 = new Block(grid,xco-1,yco-1);

        JShape[0]=block1;
        JShape[1]=block2;
        JShape[2]=block3;
        JShape[3]=block4;


        return JShape;
    }

    public Block [] All()
    {


        Block [] b1 = LShape();
        Block [] b2 = OShape();
        Block [] b3 = IShape();
        Block [] b4 = SShape();
        Block [] b5 = TShape();
        Block [] b6 = ZShape();
        Block [] b7 = JShape();

        return All;
    }




}