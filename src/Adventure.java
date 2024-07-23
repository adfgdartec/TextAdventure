import java.util.Scanner;
import java.util.Random;
public class Adventure {
     public String playerName;
     public int currentPlayerLevel;
     public double playerHealth;

     public Adventure(String name,  int level, double health){
         playerName = name;
         currentPlayerLevel = level;
         playerHealth = health;
     }

     // method for gameplay

    public void  caveOfWonders() {

        //Create a scanner
        Scanner userInput = new Scanner(System.in);

        // Create necessary Random generator
        Random randomGenerator = new Random();

        //Declare Var(s)
        int playerChoice;
        int rockDamage;
        boolean hasSword = false;

        //Unnecessary generator
        Random percent = new Random();
        double randomPercent = percent.nextDouble();
        System.out.println("Hello " + playerName + "!");
        System.out.println("This will be an insane adventure that will test all of your neural abilities.\n" +
                "I hope that you survive because the chances that you survive is around " + randomPercent + " %.\n" +
                " This journey begins with a secluded cave, and upon you contains darkness and unpredictability.\n" +
                " Are you ready tp begin this amazing journey?\n");

        // Enter the cave
        System.out.println("1. Enter the Cave of Wonders \n" +
                "2. Run away to the safety of your warm bed");
        playerChoice = userInput.nextInt();
        Scanner input = new Scanner(System.in);
        String sure;
        System.out.println("Are you sure?");
        sure = input.nextLine();
        if (sure.equals("yes") || sure.equals("Yes")) {
            //Player decided to exit
            System.out.println(playerName + " decides to run home like a baby and stay there.");
            System.exit(0);
        }
        else if(sure.equals("no") || sure.equals("No")){
            System.out.println("Hello " + playerName + "!");
            System.out.println("This will be an insane adventure that will test all of your neural abilities.\n" +
                    "I hope that you survive because the chances that you survive is around " + randomPercent + " %.\n" +
                    " This journey begins with a secluded cave, and upon you contains darkness and unpredictability.\n" +
                    " Are you ready tp begin this amazing journey?\n");

            // Enter the cave
            System.out.println("1. Enter the Cave of Wonders \n" +
                    "2. Run away to the safety of your warm bed");
            playerChoice = userInput.nextInt();
        }

        if (playerChoice == 1) {
            // Player enters the cave
            System.out.println("\nYou walk through the entrance of the cave with your head held high.\n");
            currentPlayerLevel++;
            playerHealth = playerHealth * 1.5;
            System.out.println("Your bravery has paid off.\n" +
                    " Congrats, you are now at level " + currentPlayerLevel + ".\n" +
                    " You now have an increased health of " + playerHealth + " HP!\n");

            //Rock Slide
            System.out.println("You begin to run through the dark cave, and keep on running with immense speed, \n" +
                    "when suddenly rocks begin to fall from above and specifically hit your head.");
            rockDamage = randomGenerator.nextInt(5);
            playerHealth -= rockDamage;
            System.out.println("The rock slide hit you for " + rockDamage + "HP.");
            System.out.println("You unfortunately have " + playerHealth + " remaining!\n");

            System.out.println("You get up and begin to clean your clothes.\n " +
                    "You keep on pushing through every gap, even the extremely small ones which test your abilities.\n" +
                    " Upon you is a glistening treasure chest.\n");
            System.out.println("What would you like to do?\n" +
                    "1. Open the chest.\n" +
                    "2. Ignore the chest. It is obviously another trap.\n");
            playerChoice = userInput.nextInt();
            if (playerChoice == 1) {
                Scanner userChest = new Scanner(System.in);
                int chestChoice;
                System.out.println("Which chest would you like:\n " +
                        "1. The one that looks the biggest. \n" +
                        "2. The one that looks very shiny. \n" +
                        "3. The one your heart wants you to pick.");
                chestChoice = userChest.nextInt();
                if (chestChoice == 1) {
                    System.out.println("Uneasy after your brush with death, \n" +
                            " you slowly open the chest to reveal a magical sword!");
                    hasSword = true;
                } else if (chestChoice == 2) {
                    System.out.println("easy after your brush with death, \n" +
                            " you  open the chest to reveal a magical sword with many shiny jewels!");
                    hasSword = true;
                } else if (chestChoice == 3) {
                    System.out.println("hard after your brush with death, \n" +
                            " you almost fail  open the chest to reveal many vintage items, which make you feel good, until you realise\n " +
                            " there is nothing regarding a sword in it!");
                    hasSword = false;

                }
                else {
                    System.out.println("You go away slowly, not thinking at all about the chest");
                    hasSword = false;
                }
                //Dragons Lair
                System.out.println("\n You leave the cavern and continue your journey.\n " +
                        "As you keep on running through this deep cave, all of a sudden you hear snoring\n " +
                        "and then you keep edging forward much more slowly. As you keep tip-toeing, you find a corner,\n " +
                        "You peek forward and find that a dragon is sleeping right in front of your eyes. You think you can escape,\n " +
                        "but destiny has different plans. You tip-toe away, when you suddenly hit a rock and trip, causing the dragon\n " +
                        " to WAKE UP!");
                System.out.println("1. Fight the dragon.\n" +
                "2. Run for your life.");
                playerChoice = userInput.nextInt();
                if(playerChoice == 1){
                    System.out.println("\nYou fell really curageous to fight the draon with lots of spirit in your mind.");
                    if(hasSword == true){
                        System.out.println("\n You use the magic sword that you collected and slay the huge beast.");
                    }
                    else{
                        System.out.println("\nYou die because you have absolutely nothing to fight the dragon.");
                        System.exit(0);
                    }
                }
                else{
                    System.out.println("\nYour decision decided to help you, as the beast is tamed dand back to sleep by the time you run away.");
                }



            }
            else if(playerChoice == 2){
                System.out.println("You end up dieing!");
                hasSword = false;
            }
        }
        else if (playerChoice == 2) {
             input = new Scanner(System.in);
            System.out.println("Are you sure?");
            sure = input.nextLine();
            if (sure.equals("yes") || sure.equals("Yes")) {
                //Player decided to exit
                System.out.println(playerName + " decides to run home like a baby and stay there.");
                System.exit(0);
            }
            else if(sure.equals("no") || sure.equals("No")){
                System.out.println("Hello " + playerName + "!");
                System.out.println("This will be an insane adventure that will test all of your neural abilities.\n" +
                        "I hope that you survive because the chances that you survive is around " + randomPercent + " %.\n" +
                        " This journey begins with a secluded cave, and upon you contains darkness and unpredictability.\n" +
                        " Are you ready tp begin this amazing journey?\n");

                // Enter the cave
                System.out.println("1. Enter the Cave of Wonders \n" +
                        "2. Run away to the safety of your warm bed");
                playerChoice = userInput.nextInt();
            }
        }
    }
}
