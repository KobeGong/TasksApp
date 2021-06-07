package defpackage;

import android.app.DatePickerDialog;
import android.content.DialogInterface;
import com.google.android.apps.tasks.R;

/* renamed from: aqk  reason: default package */
final /* synthetic */ class aqk implements DialogInterface.OnShowListener {
    private final aqj a;
    private final DatePickerDialog b;

    aqk(aqj aqj, DatePickerDialog datePickerDialog) {
        this.a = aqj;
        this.b = datePickerDialog;
    }

    public final void onShow(DialogInterface dialogInterface) {
        this.b.getDatePicker().announceForAccessibility(this.a.k().getString(R.string.a11y_date_picker_open));
    }
}
