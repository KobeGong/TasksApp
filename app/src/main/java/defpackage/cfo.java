package defpackage;

/* renamed from: cfo reason: default package */
/* compiled from: PG */
final class cfo extends defpackage.cdm {
    public final /* synthetic */ defpackage.cfm a;

    cfo(defpackage.cfm cfm) {
        this.a = cfm;
    }

    public final void a(java.util.List list, java.util.List list2) {
        a(new defpackage.cfp(this));
    }

    public final void a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        a(new defpackage.cfq(this));
    }

    private final void a(java.lang.Runnable runnable) {
        android.content.Context context = this.a.getContext();
        if (context != null) {
            new android.os.Handler(context.getMainLooper()).post(runnable);
        }
    }
}
