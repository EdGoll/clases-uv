import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class MileLen {
	private static String load(String preCodeFile) 
			  throws java.io.IOException {
		return new String(
				java.nio.file.Files.readAllBytes(
						java.nio.file.Paths.get(preCodeFile)), 
				java.nio.charset.Charset.forName("UTF-8"));
	}

	public static void main(String[] args) {
		MileParserParser parser = null;
		try {
			ANTLRInputStream input = new ANTLRInputStream (
					load("examples/eje1.mile")) ;
			MileParserLexer lexer = new MileParserLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			parser = new MileParserParser(tokens);
			ParseTree tree = parser.program();
			
			MileParserSemantic sem = new MileParserSemantic();
			sem.visit(tree);

				
		} catch (Exception e) {
			System.err.print(e);
		}
	}
}





