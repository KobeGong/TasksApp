package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.Toast;

/* renamed from: arw  reason: default package */
final /* synthetic */ class arw implements Runnable {
    private final arv a;

    arw(arv arv) {
        this.a = arv;
    }

    public final void run() {
        dcd dcd;
        arv arv = this.a;
        if (arv.i != null) {
            String string = arv.i.getString("list_id");
            if (!TextUtils.isEmpty(string)) {
                arv.b = any.a().c().c(string);
            } else {
                arv.b = dcb.g;
            }
        } else {
            arv.b = dcb.g;
        }
        if (arv.b == null) {
            Toast.makeText(arv.i().getApplicationContext(), "Task list not found", 0).show();
            arv.j().onBackPressed();
            return;
        }
        EditText editText = arv.a;
        dcb dcb = arv.b;
        if (dcb.c == null) {
            dcd = dcd.c;
        } else {
            dcd = dcb.c;
        }
        editText.setText(dcd.a);
        Editable text = arv.a.getText();
        if (text != null) {
            arv.a.setSelection(text.length());
        }
    }
}
