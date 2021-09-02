package defpackage;

/* renamed from: cpg reason: default package */
/* compiled from: PG */
public final class cpg implements java.io.Serializable {
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

    public final java.lang.String toString() {
        return java.lang.String.format(java.util.Locale.US, "VisualElementTag {id: %d, isRootPage: %b}", new java.lang.Object[]{java.lang.Integer.valueOf(this.a), java.lang.Boolean.valueOf(this.b)});
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.cpg)) {
            return false;
        }
        if (this.a != ((defpackage.cpg) obj).a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.a + 527;
    }
}
