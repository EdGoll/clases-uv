import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class MileParserSemantic extends MileParserBaseVisitor<Object>{

	protected Map<String, String> _vars = new HashMap<String, String>();

	public MileParserSemantic() {}

	@Override
    public Object visitStart_block(MileParserParser.Start_blockContext ctx) { 
	    	if(ctx.BEGIN_RW().getText().equals("inicio"))    {
	    		System.out.println("#include <stdio.h>");
			System.out.println("");
			System.out.println("int main(void) {");
		}
	    return null;
	}
	
	@Override
	public Object visitEnd_block(MileParserParser.End_blockContext ctx) {
	    	if(ctx.END_RW().getText().equals("fin"))    {
	    		System.out.println("\treturn 0;");
			System.out.println("}");
		}
	    return null;
	}
	
	@Override
	public Object visitDeclaration(MileParserParser.DeclarationContext ctx) {
		String var_type = ctx.variable_type().getText();
        String id = ctx.ID().getText();

        if (!_vars.containsKey(id)) {
        		var_type = getVarType(var_type);
        		_vars.put(id, var_type);
        		System.out.println(String.format("\t%s %s;", var_type, id));
        } else {
        		throw new IllegalArgumentException("Variable '" + id + "' ya existe!!");
        }
        
		return null;
	}

	@Override
	public Object visitRead(MileParserParser.ReadContext ctx) {
		String id = ctx.ID().getText();
		if (_vars.containsKey(id)) {
			System.out.println(String.format("\tscanf(\"%s\", &%s);", getVarTypeMode(_vars.get(id)), id));
		} else {
    			throw new IllegalArgumentException("Variable '" + id + "' doesn't defined");
		}
		return null; 
	}
	
	@Override
	public Object visitPrint(MileParserParser.PrintContext ctx) {
		if (ctx.ID().size() > 0) {
			String id, format = "", args = "";
			for (int i = 0; i < ctx.ID().size(); i++) {
				id = ctx.ID(i).getText();
				if (_vars.containsKey(id)) {
					format += getVarTypeMode(_vars.get(id)) + " ";
					args += id + ", ";
				} else {
	    				throw new IllegalArgumentException("Variable '" + id + "' doesn't defined");
				}
			}
			System.out.println(String.format("\tprintf(\"%s\", %s);", format.substring(0, format.length() - 1), args.substring(0, args.length() - 2)));
		} else {
			String text = ctx.STRING().getText();
			if(text != null) {
				System.out.println(String.format("\tprintf(%s);", text));
			}
		}
		return null;  
	}
	
	@Override
	public Object visitIf_block(MileParserParser.If_blockContext ctx) {
		// Completar
		return null; 
	}
	
	private String getVarType(String var_type) {
		if(var_type.equals("entero") || var_type.equals("logico"))
			return "int";
		else if(var_type.equals("real"))
			return "float";
		else
			return "char";
	}
	
	private String getVarTypeMode(String var_type) {
		if(var_type.equals("int"))
			return "%d";
		else if(var_type.equals("real"))
			return "%f";
		else
			return "%s";
	}
	
	private String replace(String stat) {
		stat.replace("=", "==");
		stat.replace("<>", "!=");
		stat.replace("AND", "&&");
		stat.replace("OR", "&&");
		return stat;
	}
}
