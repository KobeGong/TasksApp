package defpackage;

/* renamed from: cpc reason: default package */
/* compiled from: PG */
public final class cpc implements java.io.Serializable {
    public static final long serialVersionUID = 1;
    public final defpackage.cpg a;

    public cpc(defpackage.cpg cpg) {
        if (cpg == null) {
            throw new java.lang.NullPointerException();
        }
        this.a = cpg;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.a.equals(((defpackage.cpc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() + 527;
    }

    public final java.lang.String toString() {
        return java.lang.String.format(java.util.Locale.US, "VisualElement {tag: %s}", new java.lang.Object[]{this.a});
    }
}
