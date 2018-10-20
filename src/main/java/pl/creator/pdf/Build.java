package pl.creator.pdf;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 * @author rafal.musial
 */
public class Build {

    private Logger logger = LoggerFactory.getLogger(Build.class);

    private byte[] pdfContent;

    private void generateTOFile(String pathToFile) {
        logger.info("Generate pdf file");
        try {
            // Create file
            FileWriter fstream = new FileWriter(pathToFile);
            BufferedWriter out = new BufferedWriter(fstream);
            if (pdfContent != null)
                for (Byte b : pdfContent) {
                    out.write(b);
                }
            out.close();
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

}
