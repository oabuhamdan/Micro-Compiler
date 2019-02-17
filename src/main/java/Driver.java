
// import antlr

import org.antlr.v4.runtime.ANTLRInputStream;

import java.io.FileInputStream;
import java.io.InputStream;

public class Driver {

	public static void main(String[] args) throws Exception{
		// read input MICRO code
		InputStream is=null;
		try{
			String inputFile;
			inputFile = args[0];
			is = new FileInputStream(inputFile);
		}
		catch ( Exception e){
			System.out.println("You must specify an input file");	//HI
						System.out.println("You must specify an input file");	//HI

			System.exit(0);
		}

		ANTLRInputStream input = new ANTLRInputStream(is);
		MicroLexer lexer = new MicroLexer(input);

		// add code here to print each token’s type and value

	}

}
