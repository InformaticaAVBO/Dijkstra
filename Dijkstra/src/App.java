
import java.util.Scanner;

import dijkstra.*;

public class App {
    public static void main(String[] args) throws Exception {
        Dijkstra d = new Dijkstra("data/autostrade.csv");
        Scanner leggi = new Scanner(System.in);
        System.out.print(("Scegli una città di partenza: "));
        String source = leggi.nextLine();
        leggi.close();
        d.calculateShortestPathFromSource( d.getGraph().getNode(source));
        System.out.println(d.getGraph());
    }
}
