package defpackage;

/* renamed from: dln  reason: default package */
/* compiled from: PG */
public enum dln {
    DOUBLE(dls.DOUBLE, 1),
    FLOAT(dls.FLOAT, 5),
    INT64(dls.LONG, 0),
    UINT64(dls.LONG, 0),
    INT32(dls.INT, 0),
    FIXED64(dls.LONG, 1),
    FIXED32(dls.INT, 5),
    BOOL(dls.BOOLEAN, 0),
    STRING {
    },
    GROUP {
    },
    MESSAGE {
    },
    BYTES {
    },
    UINT32(dls.INT, 0),
    ENUM(dls.ENUM, 0),
    SFIXED32(dls.INT, 5),
    SFIXED64(dls.LONG, 1),
    SINT32(dls.INT, 0),
    SINT64(dls.LONG, 0);
    
    public final dls e;
    public final int f;

    private dln(dls dls, int i) {
        this.e = dls;
        this.f = i;
    }

    /* synthetic */ dln(dls dls, int i, byte b) {
        this(dls, i);
    }
}
