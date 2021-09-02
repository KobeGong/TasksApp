package defpackage;

/* renamed from: aup reason: default package */
final /* synthetic */ class aup implements java.lang.Runnable {
    private final TasksFragment a;
    private final defpackage.cyi b;

    aup(TasksFragment auj, defpackage.cyi cyi) {
        this.a = auj;
        this.b = cyi;
    }

    public final void run() {
        TasksFragment auj = this.a;
        defpackage.cyi cyi = this.b;
        if (auj.a != null) {
            auj.a.post(new defpackage.aus(auj));
            if (!defpackage.ajd.a((java.util.concurrent.Future) cyi)) {
                auj.U.animate().alpha(1.0f);
            }
        }
    }
}
