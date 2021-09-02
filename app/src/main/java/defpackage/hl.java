package defpackage;

/* renamed from: hl reason: default package */
/* compiled from: PG */
public final class hl implements android.animation.TypeEvaluator {
    private defpackage.ou[] a;

    public final /* synthetic */ java.lang.Object evaluate(float f, java.lang.Object obj, java.lang.Object obj2) {
        defpackage.ou[] ouVarArr = (defpackage.ou[]) obj;
        defpackage.ou[] ouVarArr2 = (defpackage.ou[]) obj2;
        if (!defpackage.jd.a(ouVarArr, ouVarArr2)) {
            throw new java.lang.IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
        if (this.a == null || !defpackage.jd.a(this.a, ouVarArr)) {
            this.a = defpackage.jd.a(ouVarArr);
        }
        for (int i = 0; i < ouVarArr.length; i++) {
            defpackage.ou ouVar = this.a[i];
            defpackage.ou ouVar2 = ouVarArr[i];
            defpackage.ou ouVar3 = ouVarArr2[i];
            for (int i2 = 0; i2 < ouVar2.b.length; i2++) {
                ouVar.b[i2] = (ouVar2.b[i2] * (1.0f - f)) + (ouVar3.b[i2] * f);
            }
        }
        return this.a;
    }
}
