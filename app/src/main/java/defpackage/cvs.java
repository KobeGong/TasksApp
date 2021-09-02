package defpackage;

/* renamed from: cvs reason: default package */
/* compiled from: PG */
public final class cvs extends defpackage.cvt {
    private final defpackage.cvr c;

    public cvs(defpackage.cuf cuf, int i, defpackage.cvr cvr) {
        super(cuf, i);
        this.c = cvr;
        cuf.a(new java.lang.StringBuilder("%")).append(cuf.b() ? 'T' : 't').append(cvr.b);
    }

    /* access modifiers changed from: protected */
    public final void a(defpackage.cvu cvu, java.lang.Object obj) {
        cvu.a(obj, this.c, this.b);
    }
}
