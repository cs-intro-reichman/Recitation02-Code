// Question 6, Improved
public class RopesAndLadders2 {
    public static void main(String[] args) {
        int dice = 0;
        int rolls = 0;
        int position = 0;
        while (position < 100) {
            dice = (int) (Math.random() * 6) + 1;
            rolls++;
            position += dice;
            if (position == 4) {
                position = 14;
            } 
            if (position == 9) {
                position = 31;
            } 
            if (position == 17) {
                position = 7;
            }
            if (position == 20) {
                position = 38;
            }
            if (position == 28) {
                position = 84;
            } 
            if (position == 40) {
                position = 59;
            } 
            if (position == 87) {
                position = 24;
            }
            if (position == 93) {
                position = 53;
            }
            if (position == 95) {
                position = 75;
            }
            if (position == 99) {
                position = 18;
            }
        }
        System.out.println("You won after " + rolls + " rolls!");
    }    
}
