package be.mubuntu;

/**
 * @author: Patrick Frison
 * @date: 4/06/2017
 * @time: 19:49
 * TO DO:
 * (Random month) Write a program that randomly generates an integer between 1
 * and 12 and displays the English month name January, February, …, December for
 * the number 1, 2, …, 12, accordingly.
 */
public class Exercise_04 {
    //    Min + (int)(Math.random() * ((Max - Min) + 1))
    public static void main(String[] args) {
        int monthNumber = 1 + (int) (Math.random()*11) ;
        String[] months = new String[]{"January", "February", "March", "April", "May", "June", "July",
                "August", "September", "October", "November", "December"};

        System.out.println("the name of the month is: " + months[monthNumber - 1]+"\n"+monthNumber);
        //could've used switch case but this is faster

    }
}

