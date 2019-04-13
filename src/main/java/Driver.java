
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.*;
import javax.swing.JOptionPane;


/**
 * This Class simulates the five steps of the Compiler.
 *
 * @author Osama AbuHamdan
 * @author Saad Al-Jalowdi
 *
 *
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
        Visitor visitor=new Visitor();
        ParseTree parseTree=parser.program();
        visitor.visit(parseTree);

        VisitorStep4 irVisitor = new VisitorStep4(visitor.getSymbolTable());
        irVisitor.visit(parseTree);
        irVisitor.getIr().printIRToFile(Utils.getFileName(inputFile));
    }
}
