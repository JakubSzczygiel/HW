public abstract class User {
    private static int counter;
    private String name;
    private String surname;
    private String address;
    private int id;
    private int accessLevel;

    {
        id = ++counter;
    }

    public User(String name, String surname, String address, int accessLevel) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.accessLevel = accessLevel;
    }

    public void createPdf(String author, String description, float fileSize) {
        if (accessLevel == 1 && fileSize <= File.threshold)
            new Pdf(author, description, fileSize);
        else if (accessLevel == 1 && fileSize > File.threshold)
            System.out.println("File size is to big. It can't be created");
        else
            System.out.println(this.name + " is a " + this.getClass().getName() + " who doesn't have rights to create a file");
    }

    public void createWord(String author, String description, float fileSize) {
        if (accessLevel == 1 && fileSize <= File.threshold)
            new Word(author, description, fileSize);
        else if (accessLevel == 1 && fileSize > File.threshold)
            System.out.println("File size is to big. It can't be created");
        else
            System.out.println(this.name + " is a " + this.getClass().getName() + " who doesn't have rights to create a file");
    }

    public void createVideo(String author, String description, float fileSize, int height, int length, double duration) {
        if (accessLevel == 1 && fileSize <= File.threshold && height <= MediaFile.heightThreshold && length <= MediaFile.lengthThreshold)
            new Video(author, description, fileSize, height, length, duration);
        if (fileSize > File.threshold)
            System.out.println("File size is to big. It can't be created");
        if (accessLevel != 1)
            System.out.println(this.name + " is a " + this.getClass().getName() + " who doesn't have rights to create a file");
        if (height > MediaFile.heightThreshold || length > MediaFile.lengthThreshold)
            System.out.println("Media file resolution is to big");

    }

    public void createPicture(String author, String description, float fileSize, int height, int length) {
        if (accessLevel == 1 && fileSize <= File.threshold && height <= MediaFile.heightThreshold && length <= MediaFile.lengthThreshold)
            new Picture(author, description, fileSize, height, length);
        if (fileSize > File.threshold)
            System.out.println("File size is to big. It can't be created");
        if (accessLevel != 1)
            System.out.println(this.name + " is a " + this.getClass().getName() + " who doesn't have rights to create a file");
        if (height > MediaFile.heightThreshold || length > MediaFile.lengthThreshold)
            System.out.println("Media file resolution is to big");
    }

}
