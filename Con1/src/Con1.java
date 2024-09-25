import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Con1 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the input file: ");
        String inputFileName = scanner.nextLine();
        
        // Check if the input file ends with ".txt"
        if (!inputFileName.endsWith(".txt")) {
            System.out.println("Invalid input file format. Please enter a file ending with '.txt'");
            return;
        }
        
        // Output file will have the same name but with ".html" extension
        String outputFileName = inputFileName.replace(".txt", ".html");

        // Process the input file
        convertToHTML(inputFileName, outputFileName);
        
        System.out.println("HTML output has been written to " + outputFileName);
        
    }

    public static void convertToHTML(String inputFileName, String outputFileName) throws FileNotFoundException {
        Scanner fileScanner = new Scanner(new File(inputFileName));
        PrintWriter writer = new PrintWriter(outputFileName);

        // Write HTML header
        writer.println("<html>");
        writer.println("<body>");

        // Process each line of the input file
        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine().trim();
            
            if (line.startsWith("#") && line.endsWith("#")) {
                // Heading
                writer.println("<h1>" + line.substring(1, line.length() - 1).trim() + "</h1>");
            } else if (line.startsWith("-")) {
                // List item
                writer.println("<ul>");
                while (line.startsWith("-")) {
                    writer.println("<li>" + line.substring(1).trim() + "</li>");
                    if (fileScanner.hasNextLine()) {
                        line = fileScanner.nextLine().trim();
                    } else {
                        break;
                    }
                }
                writer.println("</ul>");
            } else if (line.startsWith("[[") && line.endsWith("]]")) {
                // Hyperlink
                int openBracketIndex = line.indexOf("[[");
                int closeBracketIndex = line.indexOf("]]");
                String url = line.substring(openBracketIndex + 2, closeBracketIndex).split("\\]\\[")[0];
                String displayText = line.substring(openBracketIndex + 2, closeBracketIndex).split("\\]\\[")[1];
                writer.println("<a href=\"" + url + "\">" + displayText + "</a>");
            } else if (line.isEmpty()) {
                // Empty line
                writer.println("<p>");
            } else {
                // Normal line
                writer.println(line + "<br />");
            }
        }

        // Write HTML footer
        writer.println("</body>");
        writer.println("</html>");

        writer.close();
        fileScanner.close();
        
    }
}
