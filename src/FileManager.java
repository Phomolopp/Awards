
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Student
 */
public class FileManager {

    public ArrayList<Person> getData(File dataFile) throws FileNotFoundException, IOException {
        String name = "";
        Person person = null;
        ArrayList<Person> people = new ArrayList<>();
        FileReader fileReader = new FileReader(dataFile);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String heading = bufferedReader.readLine();
        String line = bufferedReader.readLine();
        while (line != null) {
            //System.out.println(line);

            String tokens[] = line.split(",");
            if (name.equals(tokens[3])) {
                 person.increaseAward(tokens[5], tokens[1]);
            } else {
                name = tokens[3];
                person = new Person(name);
                people.add(person);
                System.out.println("Name:" + tokens[3] + " Awards:" + tokens[4] + " PhotoName: " + tokens[1]);
                person.increaseAward(tokens[4], tokens[1]);
            }
            line = bufferedReader.readLine();
        }
        
        return people;
    }

}
