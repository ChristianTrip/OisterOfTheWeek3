public class Main {

    public static void main(String[] args) {

        // creating a filehandler for each of the text files in resources.
        FileHandling test = new FileHandling("resources/test.txt");
        FileHandling robinHood = new FileHandling("resources/robinHood.txt");


        //===================TESTING IF IT WORKS====================================

        // calling the read7() and readN() for the test.txt and prints it out to the console
        System.out.println(test.read7());
        System.out.println(test.readN(3));
        System.out.println(test.read7());
        System.out.println(test.read7());

        // calling the read7() and readN() for the robinHood.txt and prints it out to the console
        System.out.println(robinHood.read7());
        System.out.println(robinHood.readN(19));

    }
}
