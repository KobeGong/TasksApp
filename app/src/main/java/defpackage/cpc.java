package defpackage;

import java.io.Serializable;
import java.util.Locale;

/* renamed from: cpc  reason: default package */
/* compiled from: PG */
public final class cpc implements Serializable {
    public static final long serialVersionUID = 1;
    public final cpg a;

    public cpc(cpg cpg) {
        if (cpg == null) {
            throw new NullPointerException();
        }
        this.a = cpg;
    }

    public final boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.a.equals(((cpc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() + 527;
    }

    public final String toString() {
        return String.format(Locale.US, "VisualElement {tag: %s}", this.a);
    }
}
