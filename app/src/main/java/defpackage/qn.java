package defpackage;

/* renamed from: qn  reason: default package */
/* compiled from: PG */
final class qn implements qp {
    public static final qn a = new qn(true);
    private final boolean b;

    @Override // defpackage.qp
    public final int a(CharSequence charSequence, int i, int i2) {
        int i3 = i2 + 0;
        boolean z = false;
        for (int i4 = 0; i4 < i3; i4++) {
            switch (qm.a(Character.getDirectionality(charSequence.charAt(i4)))) {
                case 0:
                    if (!this.b) {
                        z = true;
                        break;
                    } else {
                        return 0;
                    }
                case 1:
                    if (this.b) {
                        z = true;
                        break;
                    } else {
                        return 1;
                    }
            }
        }
        if (z) {
            return !this.b ? 0 : 1;
        }
        return 2;
    }

    private qn(boolean z) {
        this.b = z;
    }

    static {
        new qn(false);
    }
}
