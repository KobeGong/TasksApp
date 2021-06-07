package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: ht  reason: default package */
/* compiled from: PG */
public class ht {
    public ou[] n = null;
    public String o;
    public int p;

    public ht() {
    }

    public ht(ht htVar) {
        this.o = htVar.o;
        this.p = htVar.p;
        this.n = jd.a(htVar.n);
    }

    public String getPathName() {
        return this.o;
    }

    public boolean a() {
        return false;
    }

    public ou[] getPathData() {
        return this.n;
    }

    public void setPathData(ou[] ouVarArr) {
        if (!jd.a(this.n, ouVarArr)) {
            this.n = jd.a(ouVarArr);
            return;
        }
        ou[] ouVarArr2 = this.n;
        for (int i = 0; i < ouVarArr.length; i++) {
            ouVarArr2[i].a = ouVarArr[i].a;
            for (int i2 = 0; i2 < ouVarArr[i].b.length; i2++) {
                ouVarArr2[i].b[i2] = ouVarArr[i].b[i2];
            }
        }
    }
}
