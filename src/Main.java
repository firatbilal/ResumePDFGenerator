import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Firat Bilal Coşkun", "firatbilalcoskun@outlook.com", "+90 555 123 4567");

        JobExperience job1 = new JobExperience("TechNova", "Yazilim Mühendisi", "2022 - 2023");
        JobExperience job2 = new JobExperience("CodeCraft", "Stajyer Gelistirici", "2021 - 2022");
        JobExperience job3 = new JobExperience("DataBridge", "Veri Analisti", "2020 - 2021");

        try {
            ResumeGenerator.generate(person, Arrays.asList(job1, job2, job3), "resources/profile.jpg", "output/ozgecmis.pdf");
            System.out.println("Özgeçmiş başarıyla oluşturuldu!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}