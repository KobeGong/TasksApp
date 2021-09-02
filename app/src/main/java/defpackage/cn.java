package defpackage;

/* renamed from: cn reason: default package */
/* compiled from: PG */
public class cn extends defpackage.ch {
    public java.util.ArrayList af = new java.util.ArrayList();

    public void a() {
        this.af.clear();
        super.a();
    }

    public final void a(defpackage.ch chVar) {
        this.af.remove(chVar);
        chVar.o = null;
    }

    public final void a(int i, int i2) {
        super.a(i, i2);
        int size = this.af.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((defpackage.ch) this.af.get(i3)).a(this.t + this.x, this.u + this.y);
        }
    }

    public final void m() {
        super.m();
        if (this.af != null) {
            int size = this.af.size();
            for (int i = 0; i < size; i++) {
                defpackage.ch chVar = (defpackage.ch) this.af.get(i);
                chVar.a(g(), h());
                if (!(chVar instanceof defpackage.ci)) {
                    chVar.m();
                }
            }
        }
    }

    public void o() {
        m();
        if (this.af != null) {
            int size = this.af.size();
            for (int i = 0; i < size; i++) {
                defpackage.ch chVar = (defpackage.ch) this.af.get(i);
                if (chVar instanceof defpackage.cn) {
                    ((defpackage.cn) chVar).o();
                }
            }
        }
    }

    public final void a(defpackage.cb cbVar) {
        super.a(cbVar);
        int size = this.af.size();
        for (int i = 0; i < size; i++) {
            ((defpackage.ch) this.af.get(i)).a(cbVar);
        }
    }
}
