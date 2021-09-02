package defpackage;

/* renamed from: cpt reason: default package */
/* compiled from: PG */
final class cpt extends defpackage.nz {
    private java.util.List j;
    private java.util.List k;

    cpt(android.content.Context context) {
        super(context.getApplicationContext());
    }

    cpt(android.content.Context context, java.util.List list) {
        this(context);
        this.k = list;
    }

    /* access modifiers changed from: private */
    public final void a(java.util.List list) {
        this.j = list;
        super.a(list);
    }

    /* access modifiers changed from: protected */
    public final void e() {
        if (this.j != null) {
            a(this.j);
        } else {
            a();
        }
    }

    /* access modifiers changed from: protected */
    public final void f() {
        b();
    }

    public final /* synthetic */ java.lang.Object d() {
        java.util.ArrayList arrayList;
        java.util.TreeSet treeSet = new java.util.TreeSet();
        treeSet.addAll(defpackage.cky.a(defpackage.cky.a(this.e.getApplicationContext(), "third_party_license_metadata", 0, -1), ""));
        if (this.k != null) {
            for (java.lang.String str : this.k) {
                java.lang.String a = defpackage.cky.a("res/raw/third_party_license_metadata", str, 0, -1);
                if (a != null) {
                    arrayList = defpackage.cky.a(a, str);
                } else {
                    arrayList = new java.util.ArrayList();
                }
                treeSet.addAll(arrayList);
            }
        }
        return java.util.Collections.unmodifiableList(new java.util.ArrayList(treeSet));
    }

    static {
        defpackage.cpt.class.getCanonicalName();
    }
}
