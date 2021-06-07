package defpackage;

/* renamed from: cqt  reason: default package */
/* compiled from: PG */
public final class cqt implements cqn {
    private static final int[] a = {-8875876, -7508381, -1294214, -5552196, -8497214, -10720320, -16611119, -16738393, -16742021, -9920712, -1086464, -765666, -12232092, -10665929, -4056997, -8708190, -11457112, -16689253, -16757440, -13407970, -4246004};

    @Override // defpackage.cqn
    public final int a(String str) {
        if (str == null) {
            return a[0];
        }
        return a[Math.abs(str.hashCode()) % a.length];
    }

    @Override // defpackage.cqn
    public final int a() {
        return -1;
    }
}
