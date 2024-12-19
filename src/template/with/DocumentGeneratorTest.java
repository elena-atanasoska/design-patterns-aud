package template.with;

abstract class DocumentGenerator {

    public void generateDocument() {
        initialize();
        format();
        save();
    }

    protected abstract void initialize();

    protected void format() {
        System.out.println("Formatting content...");
    }

    protected abstract void save();
}

class PDFDocumentGenerator extends DocumentGenerator {


    @Override
    protected void initialize() {
        System.out.println("Initializing PDF generation...");
    }

    @Override
    protected void save() {
        System.out.println("Saving PDF document...");
    }
}

class WordDocumentGenerator extends DocumentGenerator {


    @Override
    protected void initialize() {
        System.out.println("Initializing Word generation...");
    }

    @Override
    protected void save() {
        System.out.println("Saving Word document...");
    }
}


public class DocumentGeneratorTest {
    public static void main(String[] args) {
        DocumentGenerator pdfGenerator = new PDFDocumentGenerator();
        pdfGenerator.generateDocument();

        DocumentGenerator wordGenerator = new WordDocumentGenerator();
        wordGenerator.generateDocument();
    }
}