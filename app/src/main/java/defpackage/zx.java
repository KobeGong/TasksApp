package defpackage;

/* renamed from: zx reason: default package */
/* compiled from: PG */
public final class zx {
    public int a;
    public int b;
    public int c;
    public int d;
    public android.view.ViewGroup e;
    public android.view.View f;
    public android.view.View g;
    public defpackage.ze h;
    public defpackage.zb i;
    public android.content.Context j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o = false;
    public boolean p;
    public android.os.Bundle q;

    public static android.view.Menu a(android.content.Context context, defpackage.po poVar) {
        return new defpackage.zy(context, poVar);
    }

    public static android.view.MenuItem a(android.content.Context context, defpackage.pp ppVar) {
        return new defpackage.zo(context, ppVar);
    }

    public zx(int i2) {
        this.a = i2;
    }

    public final void a(defpackage.ze zeVar) {
        if (zeVar != this.h) {
            if (this.h != null) {
                this.h.b((defpackage.zt) this.i);
            }
            this.h = zeVar;
            if (zeVar != null && this.i != null) {
                zeVar.a((defpackage.zt) this.i);
            }
        }
    }
}
