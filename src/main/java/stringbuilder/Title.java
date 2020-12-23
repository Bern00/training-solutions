package stringbuilder;

public enum Title {
    MR("Mr."),
    MS("Ms."),
    MRS("Ms"),
    DR("Dr."),
    PROF("Prof.");

    private String titleName;

    Title(String titleName) {
        this.titleName = titleName;
    }

    public String getTitleName() {
        return titleName;
    }
}
