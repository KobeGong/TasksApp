package defpackage;

/* renamed from: aer reason: default package */
/* compiled from: PG */
public final class aer implements java.lang.Runnable {
    private final /* synthetic */ android.support.v7.widget.RecyclerView a;

    public aer(android.support.v7.widget.RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public final void run() {
        if (this.a.z != null) {
            this.a.z.a();
        }
        this.a.I = false;
    }
}
