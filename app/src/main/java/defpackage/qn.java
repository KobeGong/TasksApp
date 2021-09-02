package defpackage;

/* renamed from: qn reason: default package */
/* compiled from: PG */
final class qn implements defpackage.qp {
    public static final defpackage.qn a = new defpackage.qn(true);
    private final boolean b;

    public final int a(java.lang.CharSequence charSequence, int i, int i2) {
        int i3 = i2 + 0;
        boolean z = false;
        for (int i4 = 0; i4 < i3; i4++) {
            switch (defpackage.qm.a(java.lang.Character.getDirectionality(charSequence.charAt(i4)))) {
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
        if (!z) {
            return 2;
        }
        if (!this.b) {
            return 0;
        }
        return 1;
    }

    private qn(boolean z) {
        this.b = z;
    }

    static {
        new defpackage.qn(false);
    }
}
