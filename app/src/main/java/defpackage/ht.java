package defpackage;

/* renamed from: ht reason: default package */
/* compiled from: PG */
class ht {
    public defpackage.ou[] n = null;
    public java.lang.String o;
    public int p;

    public ht() {
    }

    public ht(defpackage.ht htVar) {
        this.o = htVar.o;
        this.p = htVar.p;
        this.n = defpackage.jd.a(htVar.n);
    }

    public java.lang.String getPathName() {
        return this.o;
    }

    public boolean a() {
        return false;
    }

    public defpackage.ou[] getPathData() {
        return this.n;
    }

    public void setPathData(defpackage.ou[] ouVarArr) {
        if (!defpackage.jd.a(this.n, ouVarArr)) {
            this.n = defpackage.jd.a(ouVarArr);
            return;
        }
        defpackage.ou[] ouVarArr2 = this.n;
        for (int i = 0; i < ouVarArr.length; i++) {
            ouVarArr2[i].a = ouVarArr[i].a;
            for (int i2 = 0; i2 < ouVarArr[i].b.length; i2++) {
                ouVarArr2[i].b[i2] = ouVarArr[i].b[i2];
            }
        }
    }
}
