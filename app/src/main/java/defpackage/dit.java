package defpackage;

/* renamed from: dit  reason: default package */
/* compiled from: PG */
public enum dit {
    VOID(Void.class),
    INT(Integer.class),
    LONG(Long.class),
    FLOAT(Float.class),
    DOUBLE(Double.class),
    BOOLEAN(Boolean.class),
    STRING(String.class),
    BYTE_STRING(dha.class),
    ENUM(Integer.class),
    MESSAGE(Object.class);
    
    public final Class k;

    private dit(Class cls) {
        this.k = cls;
    }

    static {
        Integer.valueOf(0);
        Long.valueOf(0);
        Float.valueOf(0.0f);
        Double.valueOf(0.0d);
        Boolean.valueOf(false);
    }
}
