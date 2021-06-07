package defpackage;

/* renamed from: ekh  reason: default package */
/* compiled from: PG */
public final class ekh implements Runnable {
    private final /* synthetic */ ekv a;
    private final /* synthetic */ ejb b;

    public ekh(ekv ekv, ejb ejb) {
        this.a = ekv;
        this.b = ejb;
    }

    public final void run() {
        this.a.a(this.b);
    }
}
