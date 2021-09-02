package defpackage;

/* renamed from: cvv reason: default package */
/* compiled from: PG */
public final class cvv extends defpackage.cvt {
    private static final java.util.Map c;
    private final defpackage.cue d;

    public static defpackage.cvv a(int i, defpackage.cue cue, defpackage.cuf cuf) {
        if (i >= 10 || !cuf.a()) {
            return new defpackage.cvv(i, cue, cuf);
        }
        return ((defpackage.cvv[]) c.get(cue))[i];
    }

    private cvv(int i, defpackage.cue cue, defpackage.cuf cuf) {
        super(cuf, i);
        this.d = (defpackage.cue) defpackage.cub.a((java.lang.Object) cue, "format char");
        if (cuf.a()) {
            java.lang.String str = cue.f;
            return;
        }
        char c2 = cue.c;
        if (cuf.b()) {
            c2 = (char) (c2 & 65503);
        }
        cuf.a(new java.lang.StringBuilder("%")).append(c2);
    }

    /* access modifiers changed from: protected */
    public final void a(defpackage.cvu cvu, java.lang.Object obj) {
        cvu.a(obj, this.d, this.b);
    }

    static {
        defpackage.cue[] values;
        java.util.EnumMap enumMap = new java.util.EnumMap(defpackage.cue.class);
        for (defpackage.cue cue : defpackage.cue.values()) {
            defpackage.cvv[] cvvArr = new defpackage.cvv[10];
            for (int i = 0; i < 10; i++) {
                cvvArr[i] = new defpackage.cvv(i, cue, defpackage.cuf.a);
            }
            enumMap.put(cue, cvvArr);
        }
        c = java.util.Collections.unmodifiableMap(enumMap);
    }
}
