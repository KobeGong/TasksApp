package defpackage;

/* renamed from: atj reason: default package */
/* compiled from: PG */
final class atj {
    public final /* synthetic */ BaseTaskAdapter a;

    public final void a(boolean z) {
        int i;
        android.widget.ImageView imageView = this.a.expandView;
        if (z) {
            i = 2130837689;
        } else {
            i = 2130837690;
        }
        imageView.setImageResource(i);
        BaseTaskAdapter atg = this.a;
        atg.completeCountView.setAccessibilityDelegate(new defpackage.ati(atg));
    }

    atj(BaseTaskAdapter atg) {
        this.a = atg;
    }
}
