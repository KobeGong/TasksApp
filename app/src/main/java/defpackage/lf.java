package defpackage;

import java.text.AttributedCharacterIterator;

/* renamed from: lf  reason: default package */
/* compiled from: PG */
public class lf {
    public final boolean a;
    public final kv b;
    public int c;
    public AttributedCharacterIterator.Attribute d;
    public Object e;
    public int f;
    public int g;

    public final void a() {
        boolean z = false;
        boolean z2 = this.c > 0;
        lp lpVar = this.b.a;
        int size = lpVar.b.size();
        for (int i = 0; i < size; i++) {
            lc lcVar = (lc) lpVar.b.get(i);
            lf lfVar = null;
            lcVar.C();
            if (!(0 == 0 || 0 == 0)) {
                lfVar.c++;
            }
            if (z2) {
                lcVar.L();
            }
        }
        lp lpVar2 = this.b.a;
        kv kvVar = this.b;
        boolean z3 = this.a;
        if (!z2) {
            z = true;
        }
        lp.a(lpVar2, kvVar, z3, z, true);
    }

    public final void b() {
        lp.a(this.b.a, this.b, this.a, false, false);
    }

    public lf(Object obj, int i, int i2) {
        a(as.a, obj, i, i2);
    }

    public lf(AttributedCharacterIterator.Attribute attribute, Object obj, int i, int i2) {
        a(attribute, obj, i, i2);
    }

    public void a(AttributedCharacterIterator.Attribute attribute, Object obj, int i, int i2) {
        this.d = attribute;
        this.e = obj;
        this.f = i;
        this.g = i2;
    }
}
