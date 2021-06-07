package defpackage;

import android.animation.TypeEvaluator;

/* renamed from: hl  reason: default package */
/* compiled from: PG */
public final class hl implements TypeEvaluator {
    private ou[] a;

    @Override // android.animation.TypeEvaluator
    public final /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
        ou[] ouVarArr = (ou[]) obj;
        ou[] ouVarArr2 = (ou[]) obj2;
        if (!jd.a(ouVarArr, ouVarArr2)) {
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
        if (this.a == null || !jd.a(this.a, ouVarArr)) {
            this.a = jd.a(ouVarArr);
        }
        for (int i = 0; i < ouVarArr.length; i++) {
            ou ouVar = this.a[i];
            ou ouVar2 = ouVarArr[i];
            ou ouVar3 = ouVarArr2[i];
            for (int i2 = 0; i2 < ouVar2.b.length; i2++) {
                ouVar.b[i2] = (ouVar2.b[i2] * (1.0f - f)) + (ouVar3.b[i2] * f);
            }
        }
        return this.a;
    }
}
