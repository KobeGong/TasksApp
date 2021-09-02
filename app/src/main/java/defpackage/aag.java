package defpackage;

/* renamed from: aag reason: default package */
/* compiled from: PG */
public final class aag implements defpackage.th {
    private boolean a = false;
    private int b;
    private final /* synthetic */ defpackage.aaf c;

    protected aag(defpackage.aaf aaf) {
        this.c = aaf;
    }

    public final defpackage.aag a(defpackage.te teVar, int i) {
        this.c.e = teVar;
        this.b = i;
        return this;
    }

    public final void a() {
        defpackage.aag.super.setVisibility(0);
        this.a = false;
    }

    public final void b() {
        if (!this.a) {
            this.c.e = null;
            defpackage.aag.super.setVisibility(this.b);
        }
    }

    public final void c() {
        this.a = true;
    }
}
