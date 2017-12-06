package Nackademin.com;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Player jack = new Player("Jack",5,6);
        Player mary = new Player("mary",5,6);

        jack.rollDice();
        mary.rollDice();

        int j = jack.getDieValue();
        int m = mary.getDieValue();

        if(j==m)
        {
            System.out.println("Even");
        }
        else if(j>m)
        {
            jack.increaseScore();
            System.out.println("Jack win");
        }
        else
        {
            mary.increaseScore();
            System.out.println("Mary win");
        }




        Die dice1 = new Die(6);
        dice1.roll();
        System.out.println(dice1);
    }
}
