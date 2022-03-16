import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileHandling {

    private String fileContent; // this attribute stores the content read from a file, and gets updated each time the readContent() are called


    // When an object is made of the class the constructor calls the setFileContent() to add the content from the file to the fileContent attribute
    public FileHandling(String filePathe){
        setFileContent(filePathe);
    }


    public String read7(){

        return readContent(7);
    }

    public String readN(int n){

        return readContent(n);
    }

    private String readContent(int numberOfChars){

        String toReturn;

        if (fileContent.length() < numberOfChars){ // makes sure that an index out of bounds exeption does not occur
            toReturn = fileContent;
            fileContent = ""; // filecontent should be empty after the last string has been returned.
        }
        else{
            toReturn = fileContent.substring(0, numberOfChars); // returns the string from charindex 0 - the number specified as an argument.
            fileContent = fileContent.substring(numberOfChars); // updates the filecontent to start from the number specified as an argument.
        }

        return toReturn;
    }

    private void setFileContent(String filepath){

        String fileContent = "";

        try{
            Scanner scan = new Scanner(new File(filepath));

            while (scan.hasNextLine()){
                fileContent += scan.nextLine() + "\n";
            }
        }
        catch (FileNotFoundException e){
            System.out.println("Could not find file: " + filepath);
        }

        this.fileContent = fileContent;
    }

}
