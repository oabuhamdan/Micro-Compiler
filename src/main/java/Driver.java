
// import antlr

import org.antlr.v4.runtime.*;

import java.io.*;
import java.util.List;

public class Driver {

    public static void main(String[] args) {
        // read input MICRO code
        InputStream is;

        try {

            String inputFile;

            for (int counter = 1; counter <= 21; counter++) {
                inputFile = "input/step2/input/test" + counter + ".micro";

                is = new FileInputStream(inputFile);

                ANTLRInputStream input = new ANTLRInputStream(is);
                MicroLexer lexer = new MicroLexer(input);
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                MicroParser parser = new MicroParser(tokens);
                System.out.println("test number : " + counter);
                parser.program();
                System.out.println(parser.getNumberOfSyntaxErrors());


            }
        } catch (Exception e) {
            System.out.println("You must specify an input file");
            System.exit(0);
        }
    }

    static void outputTokens(MicroLexer lexer) throws FileNotFoundException {
        List<Token> tokens = (List<Token>) lexer.getAllTokens();

        File outputDir = new File("output");
        if (!outputDir.exists()) {
            outputDir.mkdir();
        }

        File outFile = new File(outputDir + "/result.out");
        PrintWriter out = new PrintWriter(new BufferedOutputStream(new FileOutputStream(outFile)));
        for (Token token : tokens) {
            String tokenType = lexer.getVocabulary().getSymbolicName(token.getType());
            String tokenValue = token.getText();
            out.println(tokenType + " :: " + tokenValue);
            out.flush();
        }
    }

}
