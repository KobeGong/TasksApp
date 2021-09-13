package defpackage;

/* renamed from: lf reason: default package */
/* compiled from: PG */
public class lf {
    public final boolean a;
    public final BackStackRecord b;
    public int c;
    public java.text.AttributedCharacterIterator.Attribute d;
    public java.lang.Object e;
    public int f;
    public int g;

    public final void a() {
        boolean z = false;
        boolean z2 = this.c > 0;
        FragmentManagerImpl lpVar = this.b.mManager;
        int size = lpVar.b.size();
        for (int i = 0; i < size; i++) {
            Fragment lcVar = (Fragment) lpVar.b.get(i);
            lcVar.ensureAnimationInfo();
            if (!(0 == 0 || 0 == 0)) {
                null.c++;
            }
            if (z2) {
                lcVar.L();
            }
        }
        FragmentManagerImpl lpVar2 = this.b.mManager;
        BackStackRecord kvVar = this.b;
        boolean z3 = this.a;
        if (!z2) {
            z = true;
        }
        lpVar2.a(kvVar, z3, z, true);
    }

    public final void b() {
        this.b.mManager.a(this.b, this.a, false, false);
    }

    public lf(java.lang.Object obj, int i, int i2) {
        a(defpackage.as.a, obj, i, i2);
    }

    public lf(java.text.AttributedCharacterIterator.Attribute attribute, java.lang.Object obj, int i, int i2) {
        a(attribute, obj, i, i2);
    }

    public void a(java.text.AttributedCharacterIterator.Attribute attribute, java.lang.Object obj, int i, int i2) {
        this.d = attribute;
        this.e = obj;
        this.f = i;
        this.g = i2;
    }
}
