package defpackage;

/* renamed from: cps reason: default package */
/* compiled from: PG */
public final class cps implements java.lang.Runnable {
    private final /* synthetic */ int a;
    private final /* synthetic */ android.widget.ScrollView b;
    private final /* synthetic */ com.google.android.libraries.social.licenses.LicenseActivity c;

    public cps(com.google.android.libraries.social.licenses.LicenseActivity licenseActivity, int i, android.widget.ScrollView scrollView) {
        this.c = licenseActivity;
        this.a = i;
        this.b = scrollView;
    }

    public final void run() {
        android.widget.TextView textView = (android.widget.TextView) this.c.findViewById(2131755305);
        this.b.scrollTo(0, textView.getLayout().getLineTop(textView.getLayout().getLineForOffset(this.a)));
    }
}
