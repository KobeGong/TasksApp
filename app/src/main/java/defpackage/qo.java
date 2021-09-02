package defpackage;

/* renamed from: qo reason: default package */
/* compiled from: PG */
final class qo implements defpackage.qp {
    public static final defpackage.qo a = new defpackage.qo();

    public final int a(java.lang.CharSequence charSequence, int i, int i2) {
        int i3 = i2 + 0;
        int i4 = 2;
        for (int i5 = 0; i5 < i3 && i4 == 2; i5++) {
            i4 = defpackage.qm.b(java.lang.Character.getDirectionality(charSequence.charAt(i5)));
        }
        return i4;
    }

    private qo() {
    }
}
