package defpackage;

/* renamed from: cam reason: default package */
/* compiled from: PG */
public final class cam extends defpackage.cau {
    private static final java.nio.charset.Charset e = java.nio.charset.Charset.forName("UTF-8");
    public defpackage.bza a;
    public defpackage.buu b;
    public defpackage.cae c;

    cam() {
    }

    public final java.lang.String a() {
        return "RPC_DELETE_USER_SUBSCRIPTION";
    }

    /* access modifiers changed from: 0000 */
    public final defpackage.ccr b(android.os.Bundle bundle) {
        java.lang.String string = bundle.getString("com.google.android.libraries.notifications.ACCOUNT_NAME");
        java.util.List<defpackage.bus> a2 = this.b.a(string, 4);
        java.util.TreeSet treeSet = new java.util.TreeSet();
        for (defpackage.bus c2 : a2) {
            treeSet.add(new java.lang.String(c2.c(), e));
        }
        defpackage.ccr b2 = this.a.b(string, new java.util.ArrayList(treeSet));
        if (!b2.d() || !b2.c()) {
            this.b.a(string, (java.util.List) a2);
        }
        return b2;
    }
}
