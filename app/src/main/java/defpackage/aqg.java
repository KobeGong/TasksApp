package defpackage;

/* renamed from: aqg reason: default package */
final /* synthetic */ class aqg implements java.lang.Runnable {
    private final WelcomeFragment a;
    private final android.view.View b;

    aqg(WelcomeFragment aqa, android.view.View view) {
        this.a = aqa;
        this.b = view;
    }

    public final void run() {
        WelcomeFragment aqa = this.a;
        aqa.b.removeView(this.b);
    }
}
