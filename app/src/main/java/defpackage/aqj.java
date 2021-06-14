package defpackage;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.widget.DatePicker;
import java.util.Calendar;

/* renamed from: aqj  reason: default package */
/* compiled from: PG */
public final class aqj extends lb implements DatePickerDialog.OnDateSetListener {
    public static aqj a(dmk dmk) {
        aqj aqj = new aqj();
        if (dmk != null) {
            Bundle bundle = new Bundle();
            bundle.putInt("initial year", dmk.a);
            bundle.putInt("initial month", dmk.b);
            bundle.putInt("initial day", dmk.c);
            aqj.e(bundle);
        }
        return aqj;
    }

    @Override // defpackage.lb
    public final Dialog c() {
        Calendar instance = Calendar.getInstance();
        int i = instance.get(1);
        int i2 = instance.get(2);
        int i3 = instance.get(5);
        Bundle bundle = this.i;
        if (bundle != null) {
            i = bundle.getInt("initial year", i);
            i2 = bundle.getInt("initial month", i2 + 1) - 1;
            i3 = bundle.getInt("initial day", i3);
        }
        DatePickerDialog datePickerDialog = new DatePickerDialog(getActivity(), this, i, i2, i3);
        datePickerDialog.setOnShowListener(new aqk(this, datePickerDialog));
        return datePickerDialog;
    }

    public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        FragmentActivity j = getActivity();
        if (j instanceof DatePickerDialog.OnDateSetListener) {
            ((DatePickerDialog.OnDateSetListener) j).onDateSet(datePicker, i, i2, i3);
        }
    }
}
