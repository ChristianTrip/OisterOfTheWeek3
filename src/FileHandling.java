import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileHandling {

    private String fileContent; // this attribute stores the content read from a file, and gets updated each time the read7() and readN() are called


    // When an object is made of the class the constructor calls the setFileContent() to add the content from the file to the fileContent attribute
    public FileHandling(String filePathe){
        setFileContent(filePathe);
    }


    // read7() and readN() are basacicly the same method, and it would make sence to only have the readN()
    // but both methods are here because the assignment asks for both.

    public String read7(){

        String toReturn = "";

        if (fileContent.length() < 7){ // to avoid the index out of bounds exception when using the substring(), it then just returns what's left of the content.
            toReturn = fileContent;
            fileContent = "";
        }
        else{
            toReturn = fileContent.substring(0, 7); // returns from charIndex 0 - 7 from the filecontent
            fileContent = fileContent.substring(7); // updates the filecontent to start at charIndex 7
        }

        return toReturn;
    }

    public String readN(int n){

        String toReturn = "";

        if (fileContent.length() < n){
            toReturn = fileContent;
            fileContent = "";
        }
        else{
            toReturn = fileContent.substring(0, n);
            fileContent = fileContent.substring(n);
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
