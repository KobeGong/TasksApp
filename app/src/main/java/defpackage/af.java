package defpackage;

/* renamed from: af reason: default package */
/* compiled from: PG */
abstract class af {
    public final defpackage.ag a;
    public boolean b;
    public int c = -1;
    private final /* synthetic */ defpackage.ac d;

    af(defpackage.ac acVar, defpackage.ag agVar) {
        this.d = acVar;
        this.a = agVar;
    }

    /* access modifiers changed from: 0000 */
    public abstract boolean a();

    /* access modifiers changed from: 0000 */
    public boolean a(LifecycleOwner yVar) {
        return false;
    }

    /* access modifiers changed from: 0000 */
    public void b() {
    }

    /* access modifiers changed from: 0000 */
    public final void a(boolean z) {
        int i = 1;
        if (z != this.b) {
            this.b = z;
            boolean z2 = this.d.c == 0;
            defpackage.ac acVar = this.d;
            int i2 = acVar.c;
            if (!this.b) {
                i = -1;
            }
            acVar.c = i + i2;
            if (z2 && this.b) {
                this.d.a();
            }
            if (this.d.c == 0 && !this.b) {
                this.d.b();
            }
            if (this.b) {
                this.d.a(this);
            }
        }
    }
}
