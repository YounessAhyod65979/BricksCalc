public class Main {

    public static void main(String[] args) {

        
        int amountOfBricks = 99;


        int containerCapacity = 10;


        int containers = amountOfBricks/containerCapacity;

        System.out.println("We have: " + containers + " full containers");


        int remainder = amountOfBricks % containerCapacity;

        containers++;

        containerCapacity = remainder;

        System.out.println("Total number of containers: " + containers);

        System.out.println("Number of blocks in an incomplete container: " + containerCapacity);

    }
}