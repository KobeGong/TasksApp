package defpackage;

import android.support.v7.widget.RecyclerView;

/* renamed from: aer  reason: default package */
/* compiled from: PG */
public final class aer implements Runnable {
    private final /* synthetic */ RecyclerView a;

    public aer(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public final void run() {
        if (this.a.z != null) {
            this.a.z.a();
        }
        this.a.I = false;
    }
}
