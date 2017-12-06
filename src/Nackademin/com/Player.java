package Nackademin.com;

import java.util.ArrayList;

public class Player
{
    private String name;
    private int point;
    private ArrayList<Die> diceArrayList;
    private int sides;
    private int diceAmount;

    public Player(String name,int diceAmount,int sides)
    {
        this.name=name;
        this.diceAmount=diceAmount;
        this.sides = sides;
        diceArrayList = new ArrayList <Die>();
    }

    public String getName() {
        return name;
    }

    public int getPoint() {
        return point;
    }

    //Create the dice for the game
    public void addDie(int sides)
    {

        Die diceForPlay = new Die(sides);
        diceArrayList.add(diceForPlay);

    }

    //Create how many dices are needed in the game
    public void rollDice()
    {

        for(int i=0;i<=this.diceAmount;i++)
        {
            addDie(sides);
        }

        for(Die d: diceArrayList)
        {
            d.roll();
        }

    }

    //Add up all the Scores of each roll
    public int getDieValue()
    {
        int totalScore =0;

        for(Die d: diceArrayList)
        {
            totalScore += d.getCurrentValue();
        }
        return totalScore;
    }

    //When player win get 1 point
    public void increaseScore()
    {
      this.point++;
    }




}
