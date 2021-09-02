package defpackage;

/* renamed from: yn reason: default package */
/* compiled from: PG */
final class yn extends defpackage.ti {
    private boolean a = false;
    private int b = 0;
    private final /* synthetic */ defpackage.ym c;

    yn(defpackage.ym ymVar) {
        this.c = ymVar;
    }

    public final void a() {
        if (!this.a) {
            this.a = true;
            if (this.c.b != null) {
                this.c.b.a();
            }
        }
    }

    public final void b() {
        int i = this.b + 1;
        this.b = i;
        if (i == this.c.a.size()) {
            if (this.c.b != null) {
                this.c.b.b();
            }
            this.b = 0;
            this.a = false;
            this.c.c = false;
        }
    }
}
