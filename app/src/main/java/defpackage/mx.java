package defpackage;

/* renamed from: mx reason: default package */
/* compiled from: PG */
final class mx implements java.lang.Runnable {
    private final /* synthetic */ java.util.ArrayList a;
    private final /* synthetic */ java.util.Map b;

    mx(java.util.ArrayList arrayList, java.util.Map map) {
        this.a = arrayList;
        this.b = map;
    }

    public final void run() {
        java.lang.String str;
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            android.view.View view = (android.view.View) this.a.get(i);
            java.lang.String t = defpackage.sn.a.t(view);
            if (t != null) {
                java.util.Iterator it = this.b.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        str = null;
                        break;
                    }
                    java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                    if (t.equals(entry.getValue())) {
                        str = (java.lang.String) entry.getKey();
                        break;
                    }
                }
                defpackage.sn.a(view, str);
            }
        }
    }
}
