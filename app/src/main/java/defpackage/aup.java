package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: aup  reason: default package */
public final /* synthetic */ class aup implements Runnable {
    private final auj a;
    private final cyi b;

    aup(auj auj, cyi cyi) {
        this.a = auj;
        this.b = cyi;
    }

    public final void run() {
        auj auj = this.a;
        cyi cyi = this.b;
        if (auj.rootView != null) {
            auj.rootView.post(new aus(auj));
            if (!ajd.a(cyi)) {
                auj.U.animate().alpha(1.0f);
            }
        }
    }
}
