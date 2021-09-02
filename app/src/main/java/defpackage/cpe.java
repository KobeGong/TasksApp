package defpackage;

/* renamed from: cpe reason: default package */
/* compiled from: PG */
public final class cpe implements java.io.Serializable {
    public static final java.lang.String a = defpackage.cpe.class.getName();
    public static final long serialVersionUID = 1;
    public final java.util.List b = new java.util.ArrayList();

    public static android.content.Intent a(android.content.Context context) {
        android.content.Context context2 = context;
        while (true) {
            if (!(context2 instanceof android.app.Activity) && !(context2 instanceof android.content.ContextWrapper)) {
                return null;
            }
            if (context2 instanceof android.app.Activity) {
                return ((android.app.Activity) context2).getIntent();
            }
            context2 = ((android.content.ContextWrapper) context2).getBaseContext();
        }
    }

    public final void a(android.view.View view) {
        defpackage.cpc a2;
        if (view instanceof defpackage.cpf) {
            a2 = ((defpackage.cpf) view).a();
        } else {
            a2 = defpackage.cky.a(view);
        }
        if (a2 != null) {
            this.b.add(a2);
        }
    }

    public final java.lang.String toString() {
        java.util.List list = this.b;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= list.size()) {
                return sb.append(" (leaf->root)").toString();
            }
            if (i2 > 0) {
                sb.append("->");
            }
            sb.append(((defpackage.cpc) list.get(i2)).a.a);
            i = i2 + 1;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.cpe)) {
            return false;
        }
        return defpackage.cky.a((java.lang.Object) ((defpackage.cpe) obj).b, (java.lang.Object) this.b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
