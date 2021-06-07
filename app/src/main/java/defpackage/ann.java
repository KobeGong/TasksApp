package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: ann  reason: default package */
public final /* synthetic */ class ann implements Runnable {
    private final anc a;
    private final String b;

    ann(anc anc, String str) {
        this.a = anc;
        this.b = str;
    }

    public final void run() {
        anc anc = this.a;
        String str = this.b;
        if (anc.a.a.a(str) != null) {
            anc.a(str, anc.a, new cyu());
        }
    }
}
