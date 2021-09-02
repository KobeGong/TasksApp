package defpackage;

/* renamed from: cfb reason: default package */
/* compiled from: PG */
public final class cfb {
    private final android.widget.ImageView a;
    private final android.widget.TextView b;
    private final android.widget.TextView c;
    private final defpackage.cdf d;
    private final defpackage.cei e;

    cfb(android.view.View view, defpackage.cdf cdf, defpackage.cei cei) {
        this.a = (android.widget.ImageView) view.findViewById(2131755223);
        this.b = (android.widget.TextView) view.findViewById(2131755224);
        this.c = (android.widget.TextView) view.findViewById(2131755225);
        this.d = (defpackage.cdf) defpackage.cky.a((java.lang.Object) cdf);
        this.e = (defpackage.cei) defpackage.cky.a((java.lang.Object) cei);
    }

    /* access modifiers changed from: 0000 */
    public final void a(java.lang.Object obj) {
        boolean z;
        int i = 0;
        this.e.a(this.a, obj, this.a.getWidth());
        java.lang.String b2 = ((defpackage.cdu) obj).b();
        java.lang.String a2 = b2 == null ? null : a((java.lang.CharSequence) b2);
        java.lang.String a3 = ((defpackage.cdu) obj).a();
        java.lang.String a4 = a3 == null ? a2 : a((java.lang.CharSequence) a3);
        this.b.setText(a4);
        if (a2 == null || a2.equals(a4)) {
            z = false;
        } else {
            z = true;
        }
        android.widget.TextView textView = this.c;
        if (!z) {
            i = 8;
        }
        textView.setVisibility(i);
        if (z) {
            this.c.setText(a2);
        }
    }

    private static java.lang.String a(java.lang.CharSequence charSequence) {
        return charSequence.toString().replace('-', 8209);
    }
}
