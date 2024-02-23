# Pool Game Builder

To run the application, please use:

gradle run

To generate a javadoc, please use:

gradle javadoc

# Game Notes
- In order to hit the ball, click to create the cue. 
- Then, drag your cursor away (in the angle you'd like to hit), and then release.
- The power of your hit will be based on the length of your drag (although ball velocity is capped). 

# Config Notes
When entering config details, please note the following restrictions:
- Friction must be value between 0 - 1 (not inclusive). [Would reccomend switching between 0.95, 0.9, 0.85 to see changes].
- Ball X and Y positions must be within the size of the table width and length, including the ball radius (10).
- Ball colours must be Paint string values as expected.

# Features implemented
- Pockets and More Coloured Ball
- Difficulty level
- Time and Score
- Undo and Cheat

# Design Patterns
- Observer:
    - Observer.java
    - Scorer.java
    - Subject.java
    - TimeAndScoreObserver.java
    - Timer.java

- Strategy:
    - LevelStrategy.java
    - EasyLevelStrategy.java
    - NormalLevelStrategy.java
    - HardLevelStrategy.java

- Memento:
    - BallMemento.java
    - Caretaker.java
    

- Factory (Extended from Original Files):
    - PocketReader.java
    - PocketReaderFactory.java

- Strategy (Extended from Original Files) :
    - BlackStrategy.java

# Selecting Difficulty
To select difficulty press the buttons on the top left corner of the window to load the corresponding level at anytime 

#Undo and Cheat
To undo your last move please press on the Keyboard:
    Backspace

To cheat and remove the same coloured Balls of the screen please press on the Keyboard:
    1 - Red 
    2 - Yellow
    3 - Green
    4 - Brown
    5 - Blue
    6 - Purple 
    7 - Black
    8 - Orange

# To see added implementations of the GameManager.java class please look at // ADDED comments