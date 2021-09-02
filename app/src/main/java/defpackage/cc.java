package defpackage;

/* renamed from: cc reason: default package */
/* compiled from: PG */
public final class cc {
    public java.util.ArrayList a = new java.util.ArrayList();

    public final void a(defpackage.cd cdVar) {
        this.a.clear();
        for (int i = 1; i < cdVar.c; i++) {
            defpackage.cf cfVar = cdVar.e.c[i];
            for (int i2 = 0; i2 < 6; i2++) {
                cfVar.e[i2] = 0.0f;
            }
            cfVar.e[cfVar.c] = 1.0f;
            if (cfVar.f == defpackage.bg.h) {
                this.a.add(cfVar);
            }
        }
        int size = this.a.size();
        for (int i3 = 0; i3 < size; i3++) {
            defpackage.cf cfVar2 = (defpackage.cf) this.a.get(i3);
            if (cfVar2.b != -1) {
                defpackage.bz bzVar = cdVar.b[cfVar2.b].c;
                int i4 = bzVar.a;
                for (int i5 = 0; i5 < i4; i5++) {
                    defpackage.cf a2 = bzVar.a(i5);
                    if (a2 != null) {
                        float b = bzVar.b(i5);
                        for (int i6 = 0; i6 < 6; i6++) {
                            float[] fArr = a2.e;
                            fArr[i6] = fArr[i6] + (cfVar2.e[i6] * b);
                        }
                        if (!this.a.contains(a2)) {
                            this.a.add(a2);
                        }
                    }
                }
                for (int i7 = 0; i7 < 6; i7++) {
                    cfVar2.e[i7] = 0.0f;
                }
            }
        }
    }

    public final java.lang.String toString() {
        int size = this.a.size();
        java.lang.String str = "Goal: ";
        for (int i = 0; i < size; i++) {
            defpackage.cf cfVar = (defpackage.cf) this.a.get(i);
            java.lang.StringBuilder append = new java.lang.StringBuilder().append(str);
            java.lang.String str2 = cfVar + "[";
            for (int i2 = 0; i2 < cfVar.e.length; i2++) {
                java.lang.String str3 = str2 + cfVar.e[i2];
                if (i2 < cfVar.e.length - 1) {
                    str2 = str3 + ", ";
                } else {
                    str2 = str3 + "] ";
                }
            }
            str = append.append(str2).toString();
        }
        return str;
    }
}
