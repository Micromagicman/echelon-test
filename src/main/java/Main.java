import interpreter.EchelonInterpreter;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import parser.EchelonLexer;
import parser.EchelonParser;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        try {
            if (args.length == 0) {
                throw new IllegalArgumentException(
                        "Необходимо передать путь до файла"
                );
            }

            String filename = args[0];
            String fileContent = Main.readFile(filename);

            EchelonLexer lexer = new EchelonLexer(CharStreams.fromString(fileContent));
            CommonTokenStream cts = new CommonTokenStream(lexer);
            EchelonParser parser = new EchelonParser(cts);

            EchelonParser.ProgramContext programContext = parser.program();
            EchelonInterpreter interpreter = new EchelonInterpreter();

            interpreter.visitProgram(programContext);
        } catch (IllegalArgumentException | IllegalStateException | IOException e) {
            System.out.println(e.getMessage());
        }

    }

    private static String readFile(String filename) throws IOException {
        File file = new File(filename);

        if (!file.exists() || file.isDirectory()) {
            throw new IllegalStateException(
                    "'" + filename + "' не существует или является директорией"
            );
        }

        FileInputStream fileInputStream = new FileInputStream(filename);
        byte[] fileContent = new byte[(int) file.length()];
        fileInputStream.read(fileContent);
        fileInputStream.close();

        return new String(fileContent);
    }
}
