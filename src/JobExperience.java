public class JobExperience {
    private String company;
    private String position;
    private String duration;

    public JobExperience(String company, String position, String duration) {
        this.company = company;
        this.position = position;
        this.duration = duration;
    }

    public String getCompany() { return company; }
    public String getPosition() { return position; }
    public String getDuration() { return duration; }
}