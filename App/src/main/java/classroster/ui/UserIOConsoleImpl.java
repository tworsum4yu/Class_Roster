package classroster.ui;

import java.util.Scanner;

public class UserIOConsoleImpl implements UserIO{

    private final Scanner input = new Scanner(System.in);

    @Override
    public void print(String msg) {
        System.out.println(msg);
    }

    @Override
    public double readDouble(String prompt) {

        this.print(prompt);

        double userInput = 0;

        try {
            userInput = input.nextDouble();
        } catch (Exception e) {
            userInput = -1;
        }

        // Eat the "enter" key press
        input.nextLine();

        return userInput;
    }

    @Override
    public double readDouble(String prompt, double min, double max) {

        this.print(prompt);

        double userInput = 0;

        try {
            userInput = input.nextDouble();
            if(userInput < min && userInput > max){
                throw new Exception();
            }
        } catch (Exception e) {
            userInput = -1;
        }

        // Eat the "enter" key press
        input.nextLine();

        return userInput;
    }

    @Override
    public float readFloat(String prompt) {

        this.print(prompt);

        float userInput = 0;

        try {
            userInput = input.nextFloat();
        } catch (Exception e) {
            userInput = -1;
        }

        // Eat the "enter" key press
        input.nextLine();

        return userInput;
    }

    @Override
    public float readFloat(String prompt, float min, float max) {

        this.print(prompt);

        float userInput = 0;

        try {
            userInput = input.nextFloat();
            if(userInput < min && userInput > max){
                throw new Exception();
            }
        } catch (Exception e) {
            userInput = -1;
        }

        // Eat the "enter" key press
        input.nextLine();

        return userInput;

    }

    @Override
    public int readInt(String prompt) {

        this.print(prompt);

        int userInput = 0;

        try {
            userInput = input.nextInt();
        } catch (Exception e) {
            userInput = -1;
        }

        // Eat the "enter" key press
        input.nextLine();

        return userInput;
    }

    @Override
    public int readInt(String prompt, int min, int max) {

        this.print(prompt);

        int userInput = 0;

        try {
            userInput = input.nextInt();
            if(userInput < min && userInput > max){
                throw new Exception();
            }
        } catch (Exception e) {
            userInput = -1;
        }

        // Eat the "enter" key press
        input.nextLine();

        return userInput;
    }

    @Override
    public long readLong(String prompt) {

        this.print(prompt);

        long userInput = 0;

        try {
            userInput = input.nextLong();
        } catch (Exception e) {
            userInput = -1;
        }

        // Eat the "enter" key press
        input.nextLine();

        return userInput;
    }

    @Override
    public long readLong(String prompt, long min, long max) {

        this.print(prompt);

        long userInput = 0;

        try {
            userInput = input.nextLong();
            if(userInput < min && userInput > max){
                throw new Exception();
            }
        } catch (Exception e) {
            userInput = -1;
        }

        // Eat the "enter" key press
        input.nextLine();

        return userInput;
    }

    @Override
    public String readString(String prompt) {
        this.print(prompt);
        return input.nextLine();
    }
}
