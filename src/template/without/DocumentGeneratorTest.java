package template.without;

class PDFDocumentGenerator {
    public void generateDocument() {
        System.out.println("Initializing PDF generation...");
        System.out.println("Formatting content...");
        System.out.println("Saving PDF document...");
    }
}

class WordDocumentGenerator {
    public void generateDocument() {
        System.out.println("Initializing Word document generation...");
        System.out.println("Formatting content...");
        System.out.println("Saving Word document...");
    }
}

public class DocumentGeneratorTest {
    public static void main(String[] args) {
        PDFDocumentGenerator pdfGenerator = new PDFDocumentGenerator();
        pdfGenerator.generateDocument();

        WordDocumentGenerator wordGenerator = new WordDocumentGenerator();
        wordGenerator.generateDocument();
    }
}
