public abstract class User {
    private static int counter;
    private String name;
    private String surname;
    private String address;
    private int id;
    private int accessLevel;
    private Verification verificator=new Verification();

    {
        id = ++counter;
    }

    public int getAccessLevel() {
        return accessLevel;
    }
    public String getName() {
        return name;
    }

    public User(String name, String surname, String address, int accessLevel) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.accessLevel = accessLevel;
    }

    public void createPdf(String author, String description, float fileSize) {
        if(verificator.isAccessLevelFine(this,1) && verificator.isSizeIsFine(fileSize))
        {
            new Pdf(author,description,fileSize);
        }
    }

    public void createWord(String author, String description, float fileSize) {
        if(verificator.isAccessLevelFine(this,1) && verificator.isSizeIsFine(fileSize))
        {
            new Word(author,description,fileSize);
        }
    }

    public void createVideo(String author, String description, float fileSize, int height, int length, double duration) {
        if(verificator.isAccessLevelFine(this,1) && verificator.isSizeIsFine(fileSize) && verificator.isResolutionFine(height,length))
        {
            new Video(author,description,fileSize,height,length,duration);
        }

    }

    public void createPicture(String author, String description, float fileSize, int height, int length) {
        if(verificator.isAccessLevelFine(this,1) && verificator.isSizeIsFine(fileSize) && verificator.isResolutionFine(height,length))
        {
            new Picture(author,description,fileSize,height,length);
        }
    }

}
