import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class DuplicateEliminator{
    public static void main(String[] args) throws IOException {
        PrintWriter printWriter = new PrintWriter("EliminatorOutput.txt");
        BufferedReader bufferedReaderFirst = new BufferedReader(new FileReader("EliminatorInput.txt"));
        String line = bufferedReaderFirst.readLine();
        while(line != null){
            boolean available = false;
            BufferedReader bufferedReaderSecond = new BufferedReader(new FileReader("EliminatorOutput.txt"));
            String target = bufferedReaderSecond.readLine();

            while(target != null){
                if(line.equals(target)){
                    available = true;
                    break;
                }
                target = bufferedReaderSecond.readLine();
            }
            if(available == false){
                printWriter.println(line);
                printWriter.flush();
            }
            line = bufferedReaderFirst.readLine();
        }
    }
}