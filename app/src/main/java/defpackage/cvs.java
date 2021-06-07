package defpackage;

/* renamed from: cvs  reason: default package */
/* compiled from: PG */
public final class cvs extends cvt {
    private final cvr c;

    public cvs(cuf cuf, int i, cvr cvr) {
        super(cuf, i);
        this.c = cvr;
        cuf.a(new StringBuilder("%")).append(cuf.b() ? 'T' : 't').append(cvr.b);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.cvt
    public final void a(cvu cvu, Object obj) {
        cvu.a(obj, this.c, this.b);
    }
}
