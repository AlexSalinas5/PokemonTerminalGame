package Main;

import ASCIIArt.PokemonArt;
import Pokemon.Grass.Bulbasaur;
import Pokemon.Fire.Charmander;
import Pokemon.Electricity.Pikachu;
import Pokemon.Water.Squirtle;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    // MAKE A SINGLE PLAYER VERSION AND A CARD GAME VERSION
    // MAKE IT SO WORDS AND IMAGES ARE CENTERED ON THE SCREE!!

    Runnable fiveSecondCounter =
        () -> {
          System.out.print("Wait for timer to complete.\n");
          for (int i = 1; i <= 5; i++) {
            System.out.print(i);
            try {
              Thread.sleep(2000);
            } catch (InterruptedException e) {
              throw new RuntimeException("Something went wrong. Please try again.");
            }
          }
        };

    System.out.println(
        "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

    System.out.println(PokemonArt.pokemonLogoArt);

    System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    System.out.println("WELCOME TO MY 3 PLAYER GAME!!!");
    System.out.println("The game will play similar to a old gen Pokémon fighting Game!!\n");

    Trainer player1 = null;
    Trainer player2 = null;
    Trainer player3 = null;
    Trainer currentPlayer = null;

    int playersMade = 0;

    while (playersMade < 3) {
      String playerNumber = null;

      if (playersMade == 0) {
        playerNumber = "Player 1";
      } else if (playersMade == 1) {
        playerNumber = "Player 2";
      } else if (playersMade == 2) {
        playerNumber = "Player 3";
      }

      Scanner scanner = new Scanner(System.in);

      System.out.println(
          playerNumber + " please tell me your name. This will be your name as the Main.Trainer.");
      String trainerName = scanner.nextLine();
      if (playersMade == 0) {
        player1 = new Trainer(trainerName);
        currentPlayer = player1;
      } else if (playersMade == 1) {
        player2 = new Trainer(trainerName);
        currentPlayer = player2;
      } else if (playersMade == 2) {
        player3 = new Trainer(trainerName);
        currentPlayer = player3;
      }

      System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
      System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
      System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

      System.out.println(
          "Hello " + currentPlayer.getName() + "!!!! Choose of the the following three Pokémon.");
      boolean pass = true;
      while (pass) {
        try {
          System.out.println("Type \"Squirtle\", \"Charmander\", or \"Bulbasaur\".");
          String trainerChoice = scanner.nextLine().toUpperCase();
          if (trainerChoice.equals("BULBASAUR")) {
            System.out.println(
                "\nGreat choice " + currentPlayer.getName() + "! Look at your lovely pokemon!");
            System.out.println(PokemonArt.bulbasaurArt);
            Thread timer = new Thread(fiveSecondCounter);
            timer.run();
            timer.join();
            System.out.println(
                "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            currentPlayer.setCurrentPokemon(new Bulbasaur());
          } else if (trainerChoice.equals("CHARMANDER")) {
            System.out.println(
                "\nGreat choice " + currentPlayer.getName() + "! Look at your lovely pokemon!");
            System.out.println(PokemonArt.charmanderArt);
            Thread timer = new Thread(fiveSecondCounter);
            timer.run();
            timer.join();
            System.out.println(
                "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            currentPlayer.setCurrentPokemon(new Charmander());
          } else if (trainerChoice.equals("SQUIRTLE")) {
            System.out.println(
                "\nGreat choice " + currentPlayer.getName() + "! Look at your lovely pokemon!");
            System.out.println(PokemonArt.squirtleArt);
            Thread timer = new Thread(fiveSecondCounter);
            timer.run();
            timer.join();
            System.out.println(
                "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            currentPlayer.setCurrentPokemon(new Squirtle());
          } else if (trainerChoice.equals("PIKACHU")) {
            System.out.println(
                "\nGreat choice " + currentPlayer.getName() + "! Look at your lovely pokemon!");
            System.out.println(PokemonArt.pikachuArt);
            Thread timer = new Thread(fiveSecondCounter);
            timer.run();
            timer.join();
            System.out.println(
                "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            currentPlayer.setCurrentPokemon(new Pikachu());
          } else {
            throw new IllegalArgumentException();
          }
          pass = false;
        } catch (IllegalArgumentException e) {
          System.out.println(
              "\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
          System.out.println(
              "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
          System.out.println(
              "-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
          System.out.println("You made a mistake in typing your name. Try again!");
        } catch (InterruptedException e) {
          throw new RuntimeException("Something went wrong. Please try again.");
        }
      }

      if (playersMade == 0) {
        playerNumber = "Player 2";
        System.out.println(
            "\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Please give the computer to " + playerNumber);
      } else if (playersMade == 1) {
        playerNumber = "Player 3";
        System.out.println(
            "\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Please give the computer to " + playerNumber);
      }

      playersMade++;
    }

    System.out.println(PokemonArt.pokemonLogoArt);

    System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    System.out.println("HELLO WELCOME AND GET READY!!!");
    System.out.println("When it's your turn you can:");
    System.out.println("CHOOSE WHO TO ATTACK!!!!!");
    System.out.println(
        "\nIf a player's Pokémon faints for the first time, there is a 100% chance of it reviving. Each subsequent time it faints, the revival chance decreases by 10%!");
    System.out.println(
        "If the Pokémon comes back to life, there is a 50% chance it will evolve to its first evolution and a 30% chance it will evolve to its final evolution.");
    System.out.println(
        "You will also receive a \"Status Report\" at the start of each round to inform you of anything you may have missed.");

    System.out.println(
        "\nSince "
            + currentPlayer.getName()
            + " entered their information last, they get to go first!");
    Scanner scanner = new Scanner(System.in);
    System.out.println("Type and tell me how ready you are... ;)?");
    String input = scanner.nextLine();

    System.out.println(
        "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

    System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

    System.out.println("Let the games begin!");

    int roundNumber = 1;
    boolean gameEnding = true;
    boolean player3Alive = true;
    boolean player2Alive = true;
    boolean player1Alive = true;
    String statusReportPlayer1 = "Status Report: ";
    String statusReportPlayer2 = "Status Report: ";
    String statusReportPlayer3 = "Status Report: ";

//    while (gameEnding) {
//      System.out.println("Round: " + roundNumber);
//
//      if (player3Alive) {
//        System.out.println(statusReportPlayer3);
//        System.out.println("Your Name: " + player3.getName() + " Your pokemon: " +
//                player3.getCurrentPokemon().getName() + " Your Pokemon Health: " +
//                player3.getCurrentPokemon().getHealth() + "Your pokemon Attack: " +
//                player3.getCurrentPokemon().getAttackAndDamageInfo());
//
//        System.out.println("Type the name of the player you want to attack!: \"" +
//                player1.getName() + "\" or \"" + player2.getName() + "\"");
//        input = scanner.nextLine().toUpperCase();
//
//        boolean pass = true;
//        while (pass) {
//          try {
//            if ((!input.equals(player1.getName().toUpperCase())) &&
//                    (!input.equals(player2.getName().toUpperCase()))) {
//              throw new IllegalArgumentException("Please enter the name correctly");
//            }
//            if (input.equals(player1.getName().toUpperCase())) {
//
//              player1.getCurrentPokemon().gotHit(player3.getCurrentPokemon().getAttackResult2());
//              System.out.println("Used " + player3.getCurrentPokemon().getAttackName() +
//                      "Against " + player1.getName() + "Pokemon " + player1.getCurrentPokemon().getName() +
//                      "Dealing " + player3.getCurrentPokemon().getAttackDamage() + " Damage!" + player1.getName() +
//                      "'s pokemon now has " + player1.getCurrentPokemon().getHealth() + " health ");
//              statusReportPlayer1 += "Player 3: " + player3.getName() + "attacked you dealing
//              " + player3.getCurrentPokemon().getAttackDamage() + " to your poor little pokemon";
//            } else if (input.equals(player2.getName().toUpperCase())) {
//
//              player2.getCurrentPokemon().gotHit(player3.getCurrentPokemon().getAttackDamage());
//              System.out.println("Used " + player3.getCurrentPokemon().getAttackName() +
//                      "Against " + player2.getName() + "Pokemon " + player2.getCurrentPokemon().getName() +
//                      "Dealing " + player3.getCurrentPokemon().getAttackDamage() + " Damage!" + player2.getName() +
//                      "'s pokemon now has " + player2.getCurrentPokemon().getHealth() + " health ");
//              statusReportPlayer2 += "Player 3: " + player3.getName() + "attacked you dealing
//              " + player3.getCurrentPokemon().getAttackDamage() + " to your poor little pokemon";
//            }
//            pass = false;
//          } catch (IllegalArgumentException e) {
//            System.out.println("Type the name of the player you want to attack!: \"" +
//                    player1.getName() + "\" or \"" + player2.getName() + "\"");
//          }
//        }
//
//      }
//
//    }


//        while (gameEnding) {
//          System.out.println("Round: " + roundNumber);
//
//          if (player3Alive) {
//            System.out.println(statusReportPlayer3);
//            System.out.println("Your Name: " + player3.getName() + " Your pokemon: " +
//     player3.getCurrentPokemon().getName() + " Your Pokemon Health: " +
//     player3.getCurrentPokemon().getHealth() + "Your pokemon Attack: " +
//     player3.getCurrentPokemon().getAttackName() + " " +
//     player3.getCurrentPokemon().getAttackDamage());
//            System.out.println("Type the name of the player you want to attack!: \"" +
//     player1.getName() + "\" or \"" + player2.getName() + "\"");
//            input = scanner.nextLine().toUpperCase();
//
//            boolean pass = true;
//            while (pass) {
//              try {
//                if ((!input.equals(player1.getName().toUpperCase())) &&
//     (!input.equals(player2.getName().toUpperCase()))) {
//                  throw new IllegalArgumentException("Please enter the name correctly");
//                }
//                if (input.equals(player1.getName().toUpperCase())) {
//
//     player1.getCurrentPokemon().gotHit(player3.getCurrentPokemon().getAttackDamage());
//                  System.out.println("Used " + player3.getCurrentPokemon().getAttackName() +
//     "Against " + player1.getName() + "Pokemon " + player1.getCurrentPokemon().getName() +
//     "Dealing " + player3.getCurrentPokemon().getAttackDamage() + " Damage!" + player1.getName() +
//     "'s pokemon now has " + player1.getCurrentPokemon().getHealth() + " health ");
//                  statusReportPlayer1 += "Player 3: " + player3.getName() + "attacked you dealing
//     " + player3.getCurrentPokemon().getAttackDamage() + " to your poor little pokemon";
//                } else if (input.equals(player2.getName().toUpperCase())) {
//
//     player2.getCurrentPokemon().gotHit(player3.getCurrentPokemon().getAttackDamage());
//                  System.out.println("Used " + player3.getCurrentPokemon().getAttackName() +
//     "Against " + player2.getName() + "Pokemon " + player2.getCurrentPokemon().getName() +
//     "Dealing " + player3.getCurrentPokemon().getAttackDamage() + " Damage!" + player2.getName() +
//     "'s pokemon now has " + player2.getCurrentPokemon().getHealth() + " health ");
//                  statusReportPlayer2 += "Player 3: " + player3.getName() + "attacked you dealing
//     " + player3.getCurrentPokemon().getAttackDamage() + " to your poor little pokemon";
//                }
//                pass = false;
//              } catch (IllegalArgumentException e) {
//                System.out.println("Type the name of the player you want to attack!: \"" +
//     player1.getName() + "\" or \"" + player2.getName() + "\"");
//              }
//            }
//            statusReportPlayer3 = null;
//          }
//          roundNumber++;
//
//          player2.getCurrentPokemon().DevInfo();
//
//        }
  }
}
