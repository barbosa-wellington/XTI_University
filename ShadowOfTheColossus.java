/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaO;

/**
 *
 * @author wellington
 */
import java.util.Scanner;

public class ShadowOfTheColossus {
    public static void main(String[] args) {
        Colossus colossus = new Colossus("Valus", 1000);
        Player player = new Player("Wander", 100);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Shadow of the Colossus");
        System.out.println("You are Wander. Your goal is to defeat the first Colossus: Valus.");
        System.out.println("Valus's Health: " + colossus.getHealth());
        System.out.println("Your Health: " + player.getHealth());

        while (colossus.getHealth() > 0 && player.getHealth() > 0) {
            System.out.println("\nChoose an action:");
            System.out.println("1. Attack Colossus");
            System.out.println("2. Climb Colossus");
            System.out.println("3. Rest");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    player.attack(colossus);
                    break;
                case 2:
                    player.climb(colossus);
                    break;
                case 3:
                    player.rest();
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }

            if (colossus.getHealth() > 0) {
                colossus.attack(player);
            }

            System.out.println("Valus's Health: " + colossus.getHealth());
            System.out.println("Your Health: " + player.getHealth());
        }

        if (player.getHealth() > 0) {
            System.out.println("Congratulations! You have defeated the Colossus.");
        } else {
            System.out.println("You have been defeated by the Colossus.");
        }

        scanner.close();
    }
}

class Colossus {
    private String name;
    private int health;

    public Colossus(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) {
            health = 0;
        }
    }

    public void attack(Player player) {
        System.out.println("The Colossus attacks!");
        player.takeDamage(20);
    }
}

class Player {
    private String name;
    private int health;

    public Player(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void attack(Colossus colossus) {
        System.out.println("You attack the Colossus!");
        colossus.takeDamage(50);
    }

    public void climb(Colossus colossus) {
        System.out.println("You climb the Colossus to find its weak spot!");
        colossus.takeDamage(100);
    }

    public void rest() {
        System.out.println("You rest to regain health.");
        health += 30;
        if (health > 100) {
            health = 100;
        }
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) {
            health = 0;
        }
    }
}
