package defpackage;

/* renamed from: aqr reason: default package */
final /* synthetic */ class aqr implements android.view.View.OnClickListener {
    private final defpackage.aql a;
    private final android.content.Intent b;

    aqr(defpackage.aql aql, android.content.Intent intent) {
        this.a = aql;
        this.b = intent;
    }

    public final void onClick(android.view.View view) {
        this.a.startActivity(this.b);
    }
}
