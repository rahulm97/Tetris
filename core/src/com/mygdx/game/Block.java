package com.mygdx.game;


import javax.swing.*;
import java.lang.*;

public class Block {
	
	int grid[][];
	int x,y;

	int d = 1;


    int random;
    boolean checkSecure=false;




    Block(int [][] g, int xvar, int yvar){
		grid =g;
		x=xvar;
		y=yvar;

	}

	public int getRandom()
    {

        random = (int)(Math.random()*7);

        return random;
    }

	void Show(){

        d++;




        if (random==0)//LShape;
        {
            if (grid[x][y] == 0){


                grid[x - 2][y] = d;
                grid[x - 1][y] = d;
                grid[x][y] = d;
                grid[x][y - 1] = d;
            }
            else if (grid[x][y]==d+1){

            JOptionPane.showMessageDialog(null, "GAME OVER!");
            }

        }
        if (random==1)//OShape;
        {
            if (grid[x][y] == 0) {
                grid[x - 1][y - 1] = d;
                grid[x - 1][y] = d;
                grid[x][y] = d;
                grid[x][y - 1] = d;
            }
            else if (grid[x][y]==d+1){
                JOptionPane.showMessageDialog(null, "GAME OVER!");

            }
        }
        if (random==2)//IShape;
        {
            if (grid[x][y] == 0) {
                grid[x - 3][y] = d;
                grid[x - 2][y] = d;
                grid[x - 1][y] = d;
                grid[x][y] = d;
            }
            else if (grid[x][y]==d+1){
                JOptionPane.showMessageDialog(null, "GAME OVER!");

            }
        }

        if (random==3)//SShape;
        {
            if (grid[x][y] == 0) {
                grid[x][y] = d;
                grid[x - 1][y] = d;
                grid[x - 1][y - 1] = d;
                grid[x - 2][y - 1] = d;
            }
            else if (grid[x][y]==d+1)
            {
                JOptionPane.showMessageDialog(null, "GAME OVER!");

            }
        }
        if (random==4)//TShape;
        {
            if (grid[x][y] == 0) {
                grid[x - 1][y] = d;
                grid[x][y] = d;
                grid[x + 1][y] = d;
                grid[x][y - 1] = d;
            }
            else{
                JOptionPane.showMessageDialog(null, "GAME OVER!");

            }
        }
        if (random==5)//ZShape;
        {
            if (grid[x][y] == 0) {
                grid[x - 1][y] = d;
                grid[x][y] = d;
                grid[x][y - 1] = d;
                grid[x + 1][y - 1] = d;
            }
            else if (grid[x][y]==d+1)
            {
                JOptionPane.showMessageDialog(null, "GAME OVER!");

            }
        }
        if (random==6)//JShape;
        {
            if (grid[x][y] == 0) {
                grid[x - 2][y] = d;
                grid[x - 1][y] = d;
                grid[x][y] = d;
                grid[x - 2][y - 1] = d;
            }
            else if (grid[x][y]==d+1)
            {
                JOptionPane.showMessageDialog(null, "GAME OVER!");

            }
        }


	}


	void Delete(){//removes the block from the grid array
		grid[x][y]=0;
	}

	
	void Movedown(){


        if (random==0)
        {
            if(grid[x][y-2]==0&&grid[x-1][y-1]==0&&grid[x-2][y-1]==0){


                grid[x-2][y]=0;
                grid[x-1][y]=0;
                grid[x][y]=0;
                grid[x][y-1]=0;
                y--;
                this.Show();
                checkSecure=false;

            }
            else {
                checkSecure=true;
                if(grid[x][y-2]==1)
                {

                    if (grid[1][1]>=2&&grid[2][1]>=2&&grid[3][1]>=2&&grid[4][1]>=2&&grid[5][1]>=2&&grid[6][1]>=2&&grid[7][1]>=2&&grid[8][1]>=2&&grid[9][1]>=2&&grid[10][1]>=2)
                    {
                        for (int i = 1; i < 11; i++) {
                            for (int m = 2; m < 21; m++) {
                                grid[i][m - 1] = grid[i][m];
                            }
                        }
                    }
                    getRandom();
                    x=7;
                    y=19;
                    this.Show();
                }else
                    getRandom();
                    x=7;
                    y=19;
                    this.Show();
            }

        }
        if (random==1)
        {
            if(grid[x][y-2]==0&&grid[x-1][y-2]==0){


                grid[x-1][y-1]=0;
                grid[x-1][y]=0;
                grid[x][y]=0;
                grid[x][y-1]=0;
                y--;
                this.Show();
                checkSecure=false;

            }
            else {
                checkSecure=true;
                if(grid[x][y-2]==1)
                {

                    if (grid[1][1]>=2&&grid[2][1]>=2&&grid[3][1]>=2&&grid[4][1]>=2&&grid[5][1]>=2&&grid[6][1]>=2&&grid[7][1]>=2&&grid[8][1]>=2&&grid[9][1]>=2&&grid[10][1]>=2)
                    {
                        for (int i = 1; i < 11; i++) {
                            for (int m = 2; m < 21; m++) {
                                grid[i][m - 1] = grid[i][m];
                            }
                        }
                    }
                    getRandom();
                    x=7;
                    y=19;
                    this.Show();
                }else
                    getRandom();
                    x=7;
                    y=19;
                    this.Show();
            }

        }
        if (random==2)
        {
            if(grid[x-3][y-1]==0&&grid[x-2][y-1]==0&&grid[x-1][y-1]==0&&grid[x][y-1]==0){


                grid[x-3][y]=0;
                grid[x-2][y]=0;
                grid[x-1][y]=0;
                grid[x][y]=0;
                y--;
                this.Show();
                checkSecure=false;

            }
            else {
                checkSecure=true;
                if(grid[x][y-1]==1)
                {

                    if (grid[1][1]>=2&&grid[2][1]>=2&&grid[3][1]>=2&&grid[4][1]>=2&&grid[5][1]>=2&&grid[6][1]>=2&&grid[7][1]>=2&&grid[8][1]>=2&&grid[9][1]>=2&&grid[10][1]>=2)
                    {
                        for (int i = 1; i < 11; i++) {
                            for (int m = 2; m < 21; m++) {
                                grid[i][m - 1] = grid[i][m];
                            }
                        }
                    }
                    getRandom();
                    x=7;
                    y=19;
                    this.Show();
                }else
                    getRandom();
                    x=7;
                    y=19;
                    this.Show();
            }

        }
        if (random==3)
        {
            if(grid[x-2][y-2]==0&&grid[x-1][y-2]==0&&grid[x][y-1]==0){


                grid[x][y]=0;
                grid[x-1][y]=0;
                grid[x-1][y-1]=0;
                grid[x-2][y-1]=0;
                y--;
                this.Show();
                checkSecure=false;

            }
            else {
                checkSecure=true;
                if(grid[x-1][y-1]==1)
                {

                    if (grid[1][1]>=2&&grid[2][1]>=2&&grid[3][1]>=2&&grid[4][1]>=2&&grid[5][1]>=2&&grid[6][1]>=2&&grid[7][1]>=2&&grid[8][1]>=2&&grid[9][1]>=2&&grid[10][1]>=2)
                    {
                        for (int i = 1; i < 11; i++) {
                            for (int m = 2; m < 21; m++) {
                                grid[i][m - 1] = grid[i][m];
                            }
                        }
                    }
                    getRandom();
                    x=7;
                    y=19;
                    this.Show();
                }else
                    getRandom();
                    x=7;
                    y=19;
                    this.Show();
            }

        }
        if (random==4)
        {
            if(grid[x][y-2]==0&&grid[x-1][y-1]==0&&grid[x+1][y-1]==0){


                grid[x-1][y]=0;
                grid[x][y]=0;
                grid[x+1][y]=0;
                grid[x][y-1]=0;
                y--;
                this.Show();
                checkSecure=false;

            }
            else {
                checkSecure=true;
                if(grid[x][y-2]==1)
                {

                    if (grid[1][1]>=2&&grid[2][1]>=2&&grid[3][1]>=2&&grid[4][1]>=2&&grid[5][1]>=2&&grid[6][1]>=2&&grid[7][1]>=2&&grid[8][1]>=2&&grid[9][1]>=2&&grid[10][1]>=2)
                    {
                        for (int i = 1; i < 11; i++) {
                            for (int m = 2; m < 21; m++) {
                                grid[i][m - 1] = grid[i][m];
                            }
                        }
                    }
                    getRandom();
                    x=7;
                    y=19;
                    this.Show();
                }else
                    getRandom();
                    x=7;
                    y=19;
                    this.Show();
            }

        }
        if (random==5)
        {
            if(grid[x-1][y-1]==0&&grid[x][y-2]==0&&grid[x+1][y-2]==0){


                grid[x-1][y]=0;
                grid[x][y]=0;
                grid[x][y-1]=0;
                grid[x+1][y-1]=0;
                y--;
                this.Show();
                checkSecure=false;

            }
            else {
                checkSecure=true;
                if(grid[x][y-2]==1)
                {

                    if (grid[1][1]>=2&&grid[2][1]>=2&&grid[3][1]>=2&&grid[4][1]>=2&&grid[5][1]>=2&&grid[6][1]>=2&&grid[7][1]>=2&&grid[8][1]>=2&&grid[9][1]>=2&&grid[10][1]>=2)
                    {
                        for (int i = 1; i < 11; i++) {
                            for (int m = 2; m < 21; m++) {
                                grid[i][m - 1] = grid[i][m];
                            }
                        }
                    }
                    getRandom();
                    x=7;
                    y=19;
                    this.Show();
                }else
                    getRandom();
                    x=7;
                    y=19;
                    this.Show();
            }

        }
        if (random==6)
        {
            if(grid[x-2][y-2]==0&&grid[x-1][y-1]==0&&grid[x][y-1]==0){


                grid[x-2][y]=0;
                grid[x-1][y]=0;
                grid[x][y]=0;
                grid[x-2][y-1]=0;
                y--;
                this.Show();
                checkSecure=false;

            }
            else {
                checkSecure=true;
                if(grid[x-2][y-2]==1)
                {

                    if (grid[1][1]>=2&&grid[2][1]>=2&&grid[3][1]>=2&&grid[4][1]>=2&&grid[5][1]>=2&&grid[6][1]>=2&&grid[7][1]>=2&&grid[8][1]>=2&&grid[9][1]>=2&&grid[10][1]>=2)
                    {
                        for (int i = 1; i < 11; i++) {
                            for (int m = 2; m < 21; m++) {
                                grid[i][m - 1] = grid[i][m];
                            }
                        }
                    }
                    getRandom();
                    x=7;
                    y=19;
                    this.Show();
                }else
                    getRandom();
                    x=7;
                    y=19;
                    this.Show();
            }

        }


	}




	
	void MoveRight(){
		if (random==0)
        {
            if(grid[x+1][y]==0&&grid[x+1][y-1]==0){

                grid[x-2][y]=0;
                grid[x-1][y]=0;
                grid[x][y]=0;
                grid[x][y-1]=0;
                x++;
                this.Show();
            }
        }
        if (random==1)
        {
            if(grid[x+1][y]==0&&grid[x+1][y-1]==0){

                grid[x-1][y-1]=0;
                grid[x-1][y]=0;
                grid[x][y]=0;
                grid[x][y-1]=0;
                x++;
                this.Show();
            }
        }
        if (random==2)
        {
            if(grid[x+1][y]==0){

                grid[x-3][y]=0;
                grid[x-2][y]=0;
                grid[x-1][y]=0;
                grid[x][y]=0;
                x++;
                this.Show();
            }
        }
        if (random==3)
        {
            if(grid[x+1][y]==0&&grid[x][y-1]==0){

                grid[x][y]=0;
                grid[x-1][y]=0;
                grid[x-1][y-1]=0;
                grid[x-2][y-1]=0;
                x++;
                this.Show();
            }
        }
        if (random==4)
        {
            if(grid[x+2][y]==0&&grid[x+1][y-1]==0){

                grid[x-1][y]=0;
                grid[x][y]=0;
                grid[x+1][y]=0;
                grid[x][y-1]=0;
                x++;
                this.Show();
            }
        }
        if (random==5)
        {
            if(grid[x+2][y-1]==0&&grid[x+1][y]==0){

                grid[x-1][y]=0;
                grid[x][y]=0;
                grid[x][y-1]=0;
                grid[x+1][y-1]=0;
                x++;
                this.Show();
            }
        }
        if (random==6)
        {
            if(grid[x+1][y]==0&&grid[x-1][y-1]==0){

                grid[x-2][y]=0;
                grid[x-1][y]=0;
                grid[x][y]=0;
                grid[x-2][y-1]=0;
                x++;
                this.Show();
            }
        }

	}
	void moveLeft() {


	    if (random==0)
        {
            if (grid[x - 3][y] == 0&&grid[x - 1][y-1] == 0) {

                grid[x-2][y]=0;
                grid[x-1][y]=0;
                grid[x][y]=0;
                grid[x][y-1]=0;
                x--;
                this.Show();
            }
        }
        if (random==1)
        {
            if (grid[x - 2][y] == 0&&grid[x - 2][y-1] == 0) {

                grid[x-1][y-1]=0;
                grid[x-1][y]=0;
                grid[x][y]=0;
                grid[x][y-1]=0;
                x--;
                this.Show();
            }
        }
        if (random==2)
        {
            if (grid[x - 4][y] == 0) {

                grid[x-3][y]=0;
                grid[x-2][y]=0;
                grid[x-1][y]=0;
                grid[x][y]=0;
                x--;
                this.Show();
            }
        }
        if (random==3)
        {
            if (grid[x - 3][y-1] == 0&&grid[x - 2][y] == 0) {

                grid[x][y]=0;
                grid[x-1][y]=0;
                grid[x-1][y-1]=0;
                grid[x-2][y-1]=0;
                x--;
                this.Show();
            }
        }
        if (random==4)
        {
            if (grid[x - 2][y] == 0&&grid[x - 1][y-1] == 0) {

                grid[x-1][y]=0;
                grid[x][y]=0;
                grid[x+1][y]=0;
                grid[x][y-1]=0;
                x--;
                this.Show();
            }
        }
        if (random==5)
        {
            if (grid[x - 2][y] == 0&&grid[x - 1][y-1] == 0) {

                grid[x-1][y]=0;
                grid[x][y]=0;
                grid[x][y-1]=0;
                grid[x+1][y-1]=0;
                x--;
                this.Show();
            }
        }
        if (random==6)
        {
            if (grid[x - 3][y] == 0&&grid[x - 3][y-1] == 0) {

                grid[x-2][y]=0;
                grid[x-1][y]=0;
                grid[x][y]=0;
                grid[x-2][y-1]=0;
                x--;
                this.Show();
            }
        }
	}

	void rotate()
    {

    }




}
