package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: yn  reason: default package */
/* compiled from: PG */
public final class yn extends ti {
    private boolean a = false;
    private int b = 0;
    private final /* synthetic */ ym c;

    yn(ym ymVar) {
        this.c = ymVar;
    }

    @Override // defpackage.th, defpackage.ti
    public final void a() {
        if (!this.a) {
            this.a = true;
            if (this.c.b != null) {
                this.c.b.a();
            }
        }
    }

    @Override // defpackage.th, defpackage.ti
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
