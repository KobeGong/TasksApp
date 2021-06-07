package defpackage;

/* renamed from: qo  reason: default package */
/* compiled from: PG */
final class qo implements qp {
    public static final qo a = new qo();

    @Override // defpackage.qp
    public final int a(CharSequence charSequence, int i, int i2) {
        int i3 = i2 + 0;
        int i4 = 2;
        for (int i5 = 0; i5 < i3 && i4 == 2; i5++) {
            i4 = qm.b(Character.getDirectionality(charSequence.charAt(i5)));
        }
        return i4;
    }

    private qo() {
    }
}
