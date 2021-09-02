package defpackage;

/* renamed from: jr reason: default package */
/* compiled from: PG */
public final class jr {
    public final java.util.Map a = new java.util.HashMap();
    public android.view.View b;
    public final java.util.ArrayList c = new java.util.ArrayList();

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.jr) || this.b != ((defpackage.jr) obj).b || !this.a.equals(((defpackage.jr) obj).a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.String str = (("TransitionValues@" + java.lang.Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.b + "\n") + "    values:";
        java.util.Iterator it = this.a.keySet().iterator();
        while (true) {
            java.lang.String str2 = str;
            if (!it.hasNext()) {
                return str2;
            }
            java.lang.String str3 = (java.lang.String) it.next();
            str = str2 + "    " + str3 + ": " + this.a.get(str3) + "\n";
        }
    }
}
