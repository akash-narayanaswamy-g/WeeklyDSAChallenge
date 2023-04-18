package week_3_Strings;

//1678. Goal Parser Interpretation
public class GoalParserInterpretation {

	public static void main(String[] args) {
		String command = "G()(al)";
		 System.out.println(interpret(command));
	}
	
	public static String interpret(String command) {
		command = command.replace("()", "o");
        command = command.replace("(al)", "al");
        return command;
    }

}
