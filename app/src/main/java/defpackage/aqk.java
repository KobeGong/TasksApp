package defpackage;

/* renamed from: aqk reason: default package */
final /* synthetic */ class aqk implements android.content.DialogInterface.OnShowListener {
    private final defpackage.aqj a;
    private final android.app.DatePickerDialog b;

    aqk(defpackage.aqj aqj, android.app.DatePickerDialog datePickerDialog) {
        this.a = aqj;
        this.b = datePickerDialog;
    }

    public final void onShow(android.content.DialogInterface dialogInterface) {
        this.b.getDatePicker().announceForAccessibility(this.a.getResource().getString(2131951625));
    }
}
