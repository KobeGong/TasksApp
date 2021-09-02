package defpackage;

/* renamed from: dit reason: default package */
/* compiled from: PG */
public enum dit {
    VOID(java.lang.Void.class),
    INT(java.lang.Integer.class),
    LONG(java.lang.Long.class),
    FLOAT(java.lang.Float.class),
    DOUBLE(java.lang.Double.class),
    BOOLEAN(java.lang.Boolean.class),
    STRING(java.lang.String.class),
    BYTE_STRING(defpackage.dha.class),
    ENUM(java.lang.Integer.class),
    MESSAGE(java.lang.Object.class);
    
    public final java.lang.Class k;

    private dit(java.lang.Class cls) {
        this.k = cls;
    }
}
