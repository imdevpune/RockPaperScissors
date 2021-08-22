Rock-Paper-Scissors
An implementation of the Rock-Paper-Scissors game in Java. You can play this game with Computer or with another USer.


Maven
You can build this project using Maven.

Please make sure you have Maven installed on your machine with outbound internet connection.

You can run:

      mvn package
in order to run the tests and generate the JAR.

This will create a target/ directory in which maven places the compiled Java code.

If you want to run the JAR with default options, please run:

     java -jar target/RockPaperScissorGame-0.0.1-SNAPSHOT.jar


How to play :
This is command line Game. Once you execute JAR file, it will execute RockPaperScissorGame.Java file.
Step1: First it will ask you if you would you like to play with Computer or Other Player ? 
You need to enter either 'Computer' or 'Player'

Step2: Based on input given in Step1, it will proceed with game and then it will ask you to enter any one of the values - Rock, Paper, Scissors.

Step3: Based on choices you provided in Step2, it will show you the Winner.

Step4: If you would like to continue with game, then you need to press 'Y'. You can terminate the game by pressing any other character.


------------------>>>>>>>>>>> Example 1:
C:\eclipse-workspace\RockPaperScissorGame\target>java -jar RockPaperScissorGame-0.0.1-SNAPSHOT.jar
Would you like to play with Computer or Other Player ? Please enter any one of the values 'Computer' or  'Player'
Computer
Hi Player1 , Please enter any one of the values - Rock, Paper, Scissors
Paper
Player1 selected value=Paper

Computer selected=Rock

  *** The Winner is - Player1  ***

Would you like to play again ? Please enter Y/N
Y


Hi Player1 , Please enter any one of the values - Rock, Paper, Scissors
Paper
Player1 selected value=Paper

Computer selected=Rock

  *** The Winner is - Player1  ***
  
  
  
 ------------------>>>>>>>>>>> Example 2:

  C:\eclipse-workspace\RockPaperScissorGame\target>java -jar RockPaperScissorGame-0.0.1-SNAPSHOT.jar
Would you like to play with Computer or Other Player ? Please enter any one of the values 'Computer' or  'Player'
Player
Hi Player1 , Please enter any one of the values - Rock, Paper, Scissors
Rock
Player1 selected value=Rock

Hi Player2 , Please enter any one of the values - Rock, Paper, Scissors
Paper
Player2 selected value=Paper

  *** The Winner is - Player2  ***

Would you like to play again ? Please enter Y/N
Y
Hi Player1 , Please enter any one of the values - Rock, Paper, Scissors
Scissors
Player1 selected value=Scissors

Hi Player2 , Please enter any one of the values - Rock, Paper, Scissors
Paper
Player2 selected value=Paper

  *** The Winner is - Player1  ***

Would you like to play again ? Please enter Y/N
N

C:\\eclipse-workspace\RockPaperScissorGame\target>