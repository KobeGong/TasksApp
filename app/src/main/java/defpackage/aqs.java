package defpackage;

/* renamed from: aqs reason: default package */
final /* synthetic */ class aqs implements android.content.DialogInterface.OnClickListener {
    private final defpackage.aql a;
    private final android.content.Intent b;

    aqs(defpackage.aql aql, android.content.Intent intent) {
        this.a = aql;
        this.b = intent;
    }

    public final void onClick(android.content.DialogInterface dialogInterface, int i) {
        this.a.startActivity(this.b);
    }
}
