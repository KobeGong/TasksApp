package defpackage;

/* renamed from: atj reason: default package */
/* compiled from: PG */
final class atj {
    public final /* synthetic */ defpackage.atg a;

    public final void a(boolean z) {
        int i;
        android.widget.ImageView imageView = this.a.k;
        if (z) {
            i = 2130837689;
        } else {
            i = 2130837690;
        }
        imageView.setImageResource(i);
        defpackage.atg atg = this.a;
        atg.j.setAccessibilityDelegate(new defpackage.ati(atg));
    }

    atj(defpackage.atg atg) {
        this.a = atg;
    }
}
