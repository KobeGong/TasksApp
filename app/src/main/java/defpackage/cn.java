package defpackage;

import java.util.ArrayList;

/* renamed from: cn  reason: default package */
/* compiled from: PG */
public class cn extends ch {
    public ArrayList af = new ArrayList();

    @Override // defpackage.ch
    public void a() {
        this.af.clear();
        super.a();
    }

    public final void a(ch chVar) {
        this.af.remove(chVar);
        chVar.o = null;
    }

    @Override // defpackage.ch
    public final void a(int i, int i2) {
        super.a(i, i2);
        int size = this.af.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((ch) this.af.get(i3)).a(this.t + this.x, this.u + this.y);
        }
    }

    @Override // defpackage.ch
    public final void m() {
        super.m();
        if (this.af != null) {
            int size = this.af.size();
            for (int i = 0; i < size; i++) {
                ch chVar = (ch) this.af.get(i);
                chVar.a(g(), h());
                if (!(chVar instanceof ci)) {
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
                ch chVar = (ch) this.af.get(i);
                if (chVar instanceof cn) {
                    ((cn) chVar).o();
                }
            }
        }
    }

    @Override // defpackage.ch
    public final void a(cb cbVar) {
        super.a(cbVar);
        int size = this.af.size();
        for (int i = 0; i < size; i++) {
            ((ch) this.af.get(i)).a(cbVar);
        }
    }
}
