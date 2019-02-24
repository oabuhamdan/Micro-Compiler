
// import antlr

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.Token;

import java.io.*;
import java.util.List;

public class Driver {

    public static void main(String[] args) throws Exception {
        // read input MICRO code
        InputStream is = null;
        try {
            String inputFile;
            inputFile = args[0];
            is = new FileInputStream(inputFile);
        } catch (Exception e) {
            System.out.println("You must specify an input file");
            System.exit(0);
        }

        ANTLRInputStream input = new ANTLRInputStream(is);
        MicroLexer lexer=new MicroLexer(input);

        outputTokens(lexer);

    }

    static void outputTokens(MicroLexer lexer) throws FileNotFoundException {
        String[]tokenTypes=lexer.getRuleNames();
        List <Token>tokens= (List<Token>) lexer.getAllTokens();
        File outputDir=new File("output");
        if(!outputDir.exists()){
            outputDir.mkdir();
        }
        File outFile=new File(outputDir+"/result.out");
        PrintWriter out=new PrintWriter(new BufferedOutputStream(new FileOutputStream(outFile)));
        for ( Token token: tokens ) {
            out.print("Token Type : "+tokenTypes[token.getType()-1]+" || ");
            out.println("Token Value : "+token.getText());
            out.flush();
        }
    }

}
