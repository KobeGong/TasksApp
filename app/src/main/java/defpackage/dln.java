package defpackage;

/* renamed from: dln reason: default package */
/* compiled from: PG */
public enum dln {
    DOUBLE(defpackage.dls.DOUBLE, 1),
    FLOAT(defpackage.dls.FLOAT, 5),
    INT64(defpackage.dls.LONG, 0),
    UINT64(defpackage.dls.LONG, 0),
    INT32(defpackage.dls.INT, 0),
    FIXED64(defpackage.dls.LONG, 1),
    FIXED32(defpackage.dls.INT, 5),
    BOOL(defpackage.dls.BOOLEAN, 0),
    STRING,
    GROUP,
    MESSAGE,
    BYTES,
    UINT32(defpackage.dls.INT, 0),
    ENUM(defpackage.dls.ENUM, 0),
    SFIXED32(defpackage.dls.INT, 5),
    SFIXED64(defpackage.dls.LONG, 1),
    SINT32(defpackage.dls.INT, 0),
    SINT64(defpackage.dls.LONG, 0);
    
    public final defpackage.dls e;
    public final int f;

    private dln(defpackage.dls dls, int i) {
        this.e = dls;
        this.f = i;
    }
}
