package typeconversion.whichtype;

public enum Type {

    BYTE(Byte.MIN_VALUE, Byte.MAX_VALUE),
    SHORT(Short.MIN_VALUE, Short.MAX_VALUE),
    INT(Integer.MIN_VALUE, Integer.MAX_VALUE),
    LONG(Long.MIN_VALUE, Long.MAX_VALUE);

    private final long minVALUE;
    private final long maxVALUE;

    Type(long minVALUE, long maxVALUE) {
        this.minVALUE = minVALUE;
        this.maxVALUE = maxVALUE;
    }

    public long getMinVALUE() {
        return minVALUE;
    }

    public long getMaxVALUE() {
        return maxVALUE;
    }
}
