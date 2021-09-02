package defpackage;

/* renamed from: kz reason: default package */
/* compiled from: PG */
abstract class kz extends defpackage.nv {
    kz() {
    }

    /* access modifiers changed from: 0000 */
    public abstract android.view.View a(android.view.View view, java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet);

    public android.view.View onCreateView(android.view.View view, java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        android.view.View a = a(view, str, context, attributeSet);
        if (a == null) {
            return super.onCreateView(view, str, context, attributeSet);
        }
        return a;
    }

    public android.view.View onCreateView(java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        android.view.View a = a(null, str, context, attributeSet);
        if (a == null) {
            return super.onCreateView(str, context, attributeSet);
        }
        return a;
    }

    public void startIntentSenderForResult(android.content.IntentSender intentSender, int i, android.content.Intent intent, int i2, int i3, int i4) {
        if (i != -1) {
            a(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    static void a(int i) {
        if ((-65536 & i) != 0) {
            throw new java.lang.IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }
}
