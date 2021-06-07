package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: xq  reason: default package */
/* compiled from: PG */
public final class xq extends ti {
    private final /* synthetic */ xp a;

    xq(xp xpVar) {
        this.a = xpVar;
    }

    @Override // defpackage.th, defpackage.ti
    public final void b() {
        if (this.a.j && this.a.f != null) {
            this.a.f.setTranslationY(0.0f);
            this.a.c.setTranslationY(0.0f);
        }
        this.a.c.setVisibility(8);
        this.a.c.a(false);
        this.a.m = null;
        xp xpVar = this.a;
        if (xpVar.i != null) {
            xpVar.i.a(xpVar.h);
            xpVar.h = null;
            xpVar.i = null;
        }
        if (this.a.b != null) {
            sn.a.g(this.a.b);
        }
    }
}
