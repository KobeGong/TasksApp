package defpackage;

import java.util.Arrays;

/* renamed from: ecm  reason: default package */
/* compiled from: PG */
public final class ecm {
    public static final ecm a = new ecm();
    public final byte b = 0;

    private ecm() {
    }

    public final boolean equals(Object obj) {
        if (obj != this && !(obj instanceof ecm)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{(byte) 0});
    }

    public final String toString() {
        return cky.b(this).a("sampled", false).toString();
    }
}
