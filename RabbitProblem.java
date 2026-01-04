/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package RabbitProblem;

/**
 *
 * @author Prabashi
 */
/*
 * Rabbit Problem using Fibonacci Series
 * Each month rabbit pairs follow Fibonacci growth
 */
public class RabbitProblem {

    // Recursive Fibonacci method
    public static int fibonacci(int month) {
        if (month == 0 || month == 1) {
            return 1;
        }
        return fibonacci(month - 1) + fibonacci(month - 2);
    }

    public static void main(String[] args) {
        int months = 10;

        System.out.println("Rabbit Population Growth:");
        for (int i = 0; i < months; i++) {
            System.out.println("Month " + i + " : " + fibonacci(i) + " pair(s)");
        }
    }
}

