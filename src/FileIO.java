import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileIO {
    public static void main(String[] args) {

        // Access to Path Interface - define an object that represents a path.

        //Paths class - contains static method to obtain a filepath

        // .get(String filename)
        //.get(String dir, String filename)
        //.get(String parentDir, String childDir, String file)

        //Create folder

        String directory = "data"; // this will set where the folder goes.
        String fileName = "gods.txt"; //what file are we looking for.

        Path dataDirectory = Paths.get(directory); //file path for the directory
        Path dataFile = Paths.get(directory, fileName); //the file that we will work on, file path for file

        System.out.println(dataDirectory);
        System.out.println(dataFile);

        try {
            //Files class - contains static methods to read, write, create, and delete files.
            // .exists(Path filepath obj) -
            // .notExists
            if(Files.notExists(dataDirectory)) { //if the dir doesnt exist then
                Files.createDirectory(dataDirectory);  // create a new directory in dataDir.
            }

            //
            if(!Files.exists(dataFile)){ // check if dataFile then
                // .createFile(Path filepath)
                Files.createFile(dataFile);
            }
            //
            if(Files.exists(dataFile)){
                Files.write(dataFile, Arrays.asList("Zeus", "Hercules", "Athena"));
                Files.write(dataFile, Arrays.asList("Hades"), StandardOpenOption.APPEND);
            }

        } catch(IOException iox){ //there was an error with Files.create, so we created this.
            iox.printStackTrace();
        }

        //READ FILE
        try {
            //Read file
            //Create a list of strings that represents the file data
            List<String> gods = Files.readAllLines(dataFile);
            for(String god : gods) {
                System.out.println(god);
            }

            System.out.println(gods); // [Zeus, Hercules, Athena, Hades]
            List<String> bucket = new ArrayList<>();
            for(String god : gods) {
                if(god.equals("Hades")) {
                    bucket.add("Heda");
                    continue;
                }
                //copy all god string to new list
                bucket.add(god);

            }
            //rewrite the file with the correct god list.
            Files.write(dataFile, bucket);

//Remove Hades
//            gods.remove("Hades");
//            Files.write(dataFile, gods);

        } catch (IOException iox) {
            iox.printStackTrace();
        }


    }
}
