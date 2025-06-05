
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

public class Dijkstra {
    
    HashSet<Node> toAnalize;

    private int loadFromCsv( String csvfilename ) {
        File f = new File(csvfilename);
        try {
            Scanner scan = new Scanner(f);
            while (scan.hasNextLine()) {
                String s = scan.nextLine();
                String[] ss = s.split(",");
                toAnalize.add
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
    }

    public Dijkstra( String csvfilename ) {
        toAnalize = new HashSet<>();




    }


}
