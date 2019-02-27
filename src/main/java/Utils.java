
import java.io.*;

/**
 * Class that have Utils to use from anywhere
 * @author Osama AbuHamdan
 * @author Saad Al-Jalowdi
 */
public class Utils {

    /**
     * Ouptuts user message to a file.
     * @param message user's message
     * @param fileName output file name
     */
    public static void outputMessageToFile(String message, String fileName) {

        File outputDir = new File("output");
        if (!outputDir.exists()) {
            outputDir.mkdir();
        }

        File outFile = new File(outputDir + File.separator + fileName + ".out");
        try (PrintWriter out = new PrintWriter(new BufferedOutputStream(new FileOutputStream(outFile)))) {
            out.println(message);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Get file name out from its path.
     *
     * @param path input file path.
     * @return output file name.
     */
    public static String getFileName(String path) {
        int lastSeparatorIndex = path.lastIndexOf('/');
        int lastPointIndex = path.lastIndexOf('.');
        String fileName = path.substring(lastSeparatorIndex + 1, lastPointIndex);
        return fileName;
    }


}
