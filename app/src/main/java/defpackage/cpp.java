package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: cpp  reason: default package */
/* compiled from: PG */
public final class cpp implements Runnable {
    private final /* synthetic */ cpn a;

    cpp(cpn cpn) {
        this.a = cpn;
    }

    public final void run() {
        cpo.a.add(this.a);
        if (cpo.b != -1) {
            this.a.a(cpo.b);
        }
    }
}
