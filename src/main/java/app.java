import net.sourceforge.tess4j.*;
import java.io.File;

public class app {

    public static void main(String[] args) {
        File imageFile = new File("belated-receipt.jpeg");
        ITesseract instance = new Tesseract();  // JNA Interface Mapping
        // ITesseract instance = new Tesseract1(); // JNA Direct Mapping

        try {
            String result = instance.doOCR(imageFile);
            System.out.println(result);
        } catch (TesseractException e) {
            System.err.println(e.getMessage());
        }
    }
}