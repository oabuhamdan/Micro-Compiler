
import org.antlr.v4.runtime.*;
import java.io.*;
import javax.swing.JOptionPane;


/**
 * This Class simulates the five steps of the Compiler.
 *
 * @author Osama AbuHamdan
 * @author Saad Al-Jalowdi
 */
public class Driver {

    public static void main(String[] args) {
        // read input MICRO code
        InputStream is;
        ANTLRInputStream input = null;
        String inputFile = null;

        try {
            inputFile = args[0];
            is = new FileInputStream(inputFile);
            input = new ANTLRInputStream(is);
        } catch (Exception e) {
            System.out.println("You must specify an input file");
            System.exit(0);
        }

        MicroLexer lexer = new MicroLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MicroParser parser = new MicroParser(tokens);
        parser.program();
        String validityMessage = parser.getNumberOfSyntaxErrors() == 0 ? "Accepted" : "Not Accepted";       //If parser have errors then its not valid parse tree
        Utils.outputMessageToFile(validityMessage, outputFileName(inputFile));//second param is the input file path , to get output file name with the same name
    }

    /**
     * Shows window to enter output file name, or just press enter to use the default name.
     *
     * @param inputFilePath input file path, to use its name with the output file.
     * @return output file name.
     */
    static String outputFileName(String inputFilePath) {
        String outputFileName;
        outputFileName = JOptionPane.showInputDialog("Enter Output File Name", Utils.getFileName(inputFilePath));
        return outputFileName;
    }
}
