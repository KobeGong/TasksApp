package defpackage;

import java.io.Serializable;
import java.util.Locale;

/* renamed from: cpg  reason: default package */
/* compiled from: PG */
public final class cpg implements Serializable {
    public static final long serialVersionUID = 1;
    public final int a;
    public final boolean b;

    public cpg(int i) {
        this(i, false);
    }

    public cpg(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final String toString() {
        return String.format(Locale.US, "VisualElementTag {id: %d, isRootPage: %b}", Integer.valueOf(this.a), Boolean.valueOf(this.b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cpg)) {
            return false;
        }
        return this.a == ((cpg) obj).a;
    }

    public final int hashCode() {
        return this.a + 527;
    }
}
