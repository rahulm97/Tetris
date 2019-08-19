Instructions and information about my game

Once the program is opened, all you have do is compile and run the project and immediately dive into a game of Tetris!

The game uses a 2D array to implement the playing surface in order to track the movement and state of every tetromino.

My game uses the standard left, right and down keys on the keyboard to move each terminino accordingly. Ive also added in an extra feature which allows you to undo/take back your previous move by pressing the “U” key on the keyboard. 

I set the first tetromino to 2, and there after all the tetrominos that follow are equal to 1 greater than the tetromino preceding them. Ive done this in order to keep track of the most recent tetromino that has been secured in position(by searching for the highest value in the array) so that i could remove the most recent tetromino upon the users command. 

The standard features such as clearing lines and stating that the game has ended once the columns are full etc have also been included. 

I’ve chosen to use a dark blue background with a white playing grid and black borders as these colors are very eye catching and appeals to the users. 

Ive set my tetrominos to change colors from green while still in motion, to red when it has been secured in position. 

The order at which my game produces tetrominos is completely random as I’ve used the Math.random() function to generate a random number from 0-6 and each number represents a different tetromino.
