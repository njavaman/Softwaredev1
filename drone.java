//Author Name: Miles Newsom
//Date: 1/16/2022
//Program Name: Module1 Drone
//Purpose: Simulation using button, drone movement in x, y,z location

import java.util.Scanner;

public class drone
{
    // variables for drone coordinates
    private int x;
    private int y;
    private int z;

    private int direction;

    // constructor initializes drone at starting point
    public drone()
    {
        x = 0;
        y = 0;
        z = 0;
        direction = 0;
    }

    // getters and setters for variables
    public int getX()
    {
        return x;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public int getY()
    {
        return y;
    }

    public void setY(int y)
    {
        this.y = y;
    }

    public int getZ()
    {
        return z;
    }

    public void setZ(int z)
    {
        this.z = z;
    }

    // method to move drone up vertically
    public void moveUp(int space)
    {
        z += space;
    }

    // method to move drone down vertically
    public void moveDown(int space)
    {
        z -= space;

        // check if drone can move down
        if (z < 0)
        {
            z = 0;
        }
    }

    // method to move forward
    public void forward(int space)
    {
        if (direction == 0)
        {
            y += space;
        } else if (direction == 1)
        {
            x += space;
        } else if (direction == 2)
        {
            y -= space;
        } else
        {
            x -= space;
        }
    }

    public void backward(int space)
    {

        if (direction == 0)
        {
            y -= space;
        } else if (direction == 1)
        {
            x -= space;
        } else if (direction == 2)
        {
            y += space;
        } else
        {
            x += space;
        }
    }

    // turn drone 90% to right
    public void turnRight()
    {
        direction = (direction + 1)%4;
    }

    // turn drone 90% to left
    public void turnLeft()
    {
        direction--;

        if (direction < 0)
        {
            direction = 3;
        }
    }

    // ToString method to display drone coordinates
    @Override
    public String toString()
    {
        return "Drone is at (x= " + x + ", y= " + y + ",z= " + z + ")";
    }

    public static void main(String[] args)
    {
        drone drone = new drone();

        Scanner scanner = new Scanner(System.in);

        String input = "";

        while (!input.equalsIgnoreCase("X"))
        {

            // Display choices for drone movement
            System.out.println("Which direction would you like to move the drone?");
            System.out.println("1 - Move Up");
            System.out.println("2 - Move Down");
            System.out.println("3 - Move Forward");
            System.out.println("4 - Move Backward");
            System.out.println("5 - Turn Left");
            System.out.println("6 - Turn Right");
            System.out.println("7 - Display Position");
            System.out.println("8 - Exit Navigation");

            // Read scanner inpuy and process action through if statement
            input = scanner.next();

            if (input.equalsIgnoreCase("1"))
            {
                drone.moveUp(10);
            } else if (input.equalsIgnoreCase("2"))
            {
                drone.moveDown(10);
            } else if (input.equalsIgnoreCase("3"))
            {
                drone.forward(10);
            } else if (input.equalsIgnoreCase("4"))
            {
                drone.backward(10);
            } else if (input.equalsIgnoreCase("5"))
            {
                drone.turnLeft();
            } else if (input.equalsIgnoreCase("6"))
            {
                drone.turnRight();
            } else if (input.equalsIgnoreCase("7"))
            {
                System.out.println("\n" + drone + "\n");
            } else if (input.equalsIgnoreCase("8"))
            {
                System.out.println("Exiting Navigation");
                break;
            }
        }
    }

}
