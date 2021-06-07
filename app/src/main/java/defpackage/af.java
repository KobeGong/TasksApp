package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: af  reason: default package */
/* compiled from: PG */
public abstract class af {
    public final ag a;
    public boolean b;
    public int c = -1;
    private final /* synthetic */ ac d;

    af(ac acVar, ag agVar) {
        this.d = acVar;
        this.a = agVar;
    }

    /* access modifiers changed from: package-private */
    public abstract boolean a();

    /* access modifiers changed from: package-private */
    public boolean a(y yVar) {
        return false;
    }

    /* access modifiers changed from: package-private */
    public void b() {
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z) {
        int i = 1;
        if (z != this.b) {
            this.b = z;
            boolean z2 = this.d.c == 0;
            ac acVar = this.d;
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
