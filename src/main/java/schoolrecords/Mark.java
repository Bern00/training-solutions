package schoolrecords;

public class Mark {

    private MarkType markType;
    private Subject subject;
    private Tutor tutor;

    public Mark(MarkType markType, Subject subject, Tutor tutor) {
        if(subject == null || tutor == null) {
            throw new NullPointerException("Both subject and tutor must be provided!");
        }
        this.markType = markType;
        this.subject = subject;
        this.tutor = tutor;
    }

    public Mark(String markType, Subject subject, Tutor tutor) {
        this.markType = getMarkTypeFromString(markType);
        this.subject = subject;
        this.tutor = tutor;
    }

    public MarkType getMarkType() {
        return markType;
    }

    public Subject getSubject() {
        return subject;
    }

    public Tutor getTutor() {
        return tutor;
    }

    private MarkType getMarkTypeFromString(String s) {
        Integer integer = new Integer(0);
        boolean isInt = false;
        isInt = tryParsInt(s, integer);
        for(MarkType markType: MarkType.values()) {
            if(markType.getDescription().equalsIgnoreCase(s) || (isInt && integer == markType.getValue())) {
                return markType;
            }
        }
        return null;
    }

    private boolean tryParsInt(String n, Integer i) {
        try {
            i = Integer.parseInt(n);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    @Override
    public String toString() {
        return markType.getDescription() + "(" + markType.getValue() + ")";
    }
}
