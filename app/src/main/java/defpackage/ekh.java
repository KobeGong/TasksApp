package defpackage;

/* renamed from: ekh reason: default package */
/* compiled from: PG */
public final class ekh implements java.lang.Runnable {
    private final /* synthetic */ defpackage.ekv a;
    private final /* synthetic */ defpackage.ejb b;

    public ekh(defpackage.ekv ekv, defpackage.ejb ejb) {
        this.a = ekv;
        this.b = ejb;
    }

    public final void run() {
        this.a.a(this.b);
    }
}
