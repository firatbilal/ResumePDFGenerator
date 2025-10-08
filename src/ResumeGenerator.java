import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;

import java.io.FileOutputStream;
import java.util.List;

public class ResumeGenerator {
    public static void generate(Person person, List<JobExperience> jobs, String photoPath, String outputPath) throws Exception {
        Document document = new Document();
        PdfWriter.getInstance(document, new FileOutputStream(outputPath));
        document.open();

        // Fotoğraf ekle
        Image photo = Image.getInstance(photoPath);
        photo.scaleToFit(100, 100);
        photo.setAlignment(Image.ALIGN_RIGHT);
        document.add(photo);

        // Kişisel bilgiler
        document.add(new Paragraph("Ad Soyad: " + person.getName()));
        document.add(new Paragraph("E-posta: " + person.getEmail()));
        document.add(new Paragraph("Telefon: " + person.getPhone()));
        document.add(new Paragraph("\n"));

        // İş deneyimleri
        document.add(new Paragraph("İş Deneyimleri:", FontFactory.getFont(FontFactory.HELVETICA_BOLD, 14)));
        for (JobExperience job : jobs) {
            document.add(new Paragraph("- " + job.getPosition() + " @ " + job.getCompany() + " (" + job.getDuration() + ")"));
        }

        document.close();
    }
}