package Exercise;

import java.util.Scanner;

public class ShortAdventureWithLoop {

    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        String reply;

        System.out.println("WELCOME TO MITCHELL'S TINY ADVENTURE!");
        while (true) {
            System.out.println("You are in a creepy house! Would you like to go 'upstairs' or into the 'kitchen'?");
            reply = keyboard.next();

            //Case 1
            while (reply.equalsIgnoreCase("kitchen")) {
                System.out.println("\n\t\t\tYou are in the kitchen \nThere is a long countertop with dirty dishes everywhere.  Off to one side\n"
                        + "there is, as you'd expect, a refrigerator. You may open the \"refrigerator\"\n"
                        + "or look in a \"cabinet\" or go \"back\".");
                reply = keyboard.next();
                // while
                if (reply.equalsIgnoreCase("back")) {
                    break;
                }
                while (reply.equalsIgnoreCase("Refrigerator")) {
                    System.out.println("\n\t\t\tYou Have access to the refrigerator\nInside the refrigerator you see food and stuff.  It looks pretty nasty.\n"
                            + "Would you like to eat some of the food? (\"yes\" or \"no\") or go \"back\".");
                    reply = keyboard.next();
                    if (reply.equalsIgnoreCase("back")) {
                        reply = "kitchen";
                        break;
                    } else if (reply.equalsIgnoreCase("no")) {
                        System.out.println("\nYou die of starvation... eventually.\n" + " ");
                        return;
                    } else {
                        System.out.println("\nEnjoy your food while you can. Life is beautiful!");
                        return;
                    }
                }
                //while
                while (reply.equalsIgnoreCase("cabinet")) {
                    System.out.println("\n\t\t\tYou have access to the cabinet\nInside the cabinet you see sponge and detergent.  It looks pretty cool.\n"
                            + "Would you like to do some washing? (\"yes\" or \"no\") or go \"back\".");
                    reply = keyboard.next();
                    //Return back condition
                    if (reply.equalsIgnoreCase("back")) {
                        reply = "kitchen";
                        break;
                    } else if (reply.equalsIgnoreCase("no")) {
                        System.out.println("\nEnjoy living in dirt! Cleanliness is next to Godliness!" + " ");
                    } else {
                        System.out.println("\nWise choice! A reward awaits you next door after washing!");
                    }
                }
            }

            //Case 2
            while (reply.equalsIgnoreCase("Upstairs")) {
                System.out.println("\n\t\t\tYou are Upstairs.\nUpstairs you see a hallway.  At the end of the hallway is the master\n"
                        + "\"bedroom\".  There is also a \"bathroom\" off the hallway.Or go \"back\".  Where would you like\n"
                        + "to go?");
                reply = keyboard.next();
                if (reply.equalsIgnoreCase("back")) {
                    reply = "start";
                    break;
                }
                while (reply.equalsIgnoreCase("bedroom")) {
                    System.out.println("\n\t\t\tYou are in the bedroom.\nYou are in a plush bedroom, with expensive-looking hardwood furniture.  The\n"
                            + "bed is unmade.  In the back of the room, the closet door is ajar.  Would you\n"
                            + "like to open the door? (\"yes\" or \"no\") or go \"back\".");
                    reply = keyboard.next();
                    if (reply.equalsIgnoreCase("back")) {
                        reply = "upstairs";
                        break;
                    }
                    if (reply.equalsIgnoreCase("no")) {
                        System.out.println("\nWell, then I guess you'll never know what was in there.  Thanks for playing,\n"
                                + "I'm tired of making nested if statements.");
                        return;
                    } else {
                        System.out.println("\nKindly drop some coins into that box for the children's home at Varlene");
                        return;
                    }
                }
                while (reply.equalsIgnoreCase("bathroom")) {
                    System.out.println("\n\t\t\tYou are in the bathroom.\nInside the bathroom you see a jacuzzi and a baththub, would you like to "
                            + "use the jacuzzi? (\"yes\" or \"no\") or go \"back\".");
                    reply = keyboard.next();
                    if (reply.equalsIgnoreCase("back")) {
                        reply = "upstairs";
                        break;
                    } else if (reply.equalsIgnoreCase("no")) {
                        System.out.println("\nMy Goodness! Who on earth wouldn't like a jacuzzi?" + " ");
                        return;
                    } else {
                        System.out.println("\nDid you know jacuzzis give one more mental relaxation than any other device?"
                                + "\nPlease do enjoy your Bath.");
                        return;
                    }
                }
            }
        }

    }

}
