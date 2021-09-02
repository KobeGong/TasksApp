package defpackage;

/* renamed from: aqj reason: default package */
/* compiled from: PG */
public final class aqj extends defpackage.lb implements android.app.DatePickerDialog.OnDateSetListener {
    public static defpackage.aqj a(defpackage.dmk dmk) {
        defpackage.aqj aqj = new defpackage.aqj();
        if (dmk != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("initial year", dmk.a);
            bundle.putInt("initial month", dmk.b);
            bundle.putInt("initial day", dmk.c);
            aqj.e(bundle);
        }
        return aqj;
    }

    public final android.app.Dialog c() {
        java.util.Calendar instance = java.util.Calendar.getInstance();
        int i = instance.get(1);
        int i2 = instance.get(2);
        int i3 = instance.get(5);
        android.os.Bundle bundle = this.i;
        if (bundle != null) {
            i = bundle.getInt("initial year", i);
            i2 = bundle.getInt("initial month", i2 + 1) - 1;
            i3 = bundle.getInt("initial day", i3);
        }
        android.app.DatePickerDialog datePickerDialog = new android.app.DatePickerDialog(getActivity(), this, i, i2, i3);
        datePickerDialog.setOnShowListener(new defpackage.aqk(this, datePickerDialog));
        return datePickerDialog;
    }

    public final void onDateSet(android.widget.DatePicker datePicker, int i, int i2, int i3) {
        FragmentActivity j = getActivity();
        if (j instanceof android.app.DatePickerDialog.OnDateSetListener) {
            ((android.app.DatePickerDialog.OnDateSetListener) j).onDateSet(datePicker, i, i2, i3);
        }
    }
}
