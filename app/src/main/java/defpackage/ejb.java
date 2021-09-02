package defpackage;

/* renamed from: ejb reason: default package */
/* compiled from: PG */
public final class ejb {
    public final java.lang.String a;
    public final defpackage.ejd b;
    public final int c;
    public final defpackage.ejg d;
    public final defpackage.bkv e;
    private final java.util.Collection f;

    public ejb() {
    }

    public final java.util.Collection a() {
        if (this.f == null) {
            return java.util.Collections.emptyList();
        }
        return this.f;
    }

    public ejb(java.lang.String str, java.util.Collection collection, defpackage.ejd ejd, int i, defpackage.ejg ejg, defpackage.bkv bkv) {
        this();
        this.a = str;
        this.f = collection;
        this.b = ejd;
        this.c = i;
        this.d = ejg;
        this.e = bkv;
    }
}
