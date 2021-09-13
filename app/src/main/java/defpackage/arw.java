package defpackage;

/* renamed from: arw reason: default package */
final /* synthetic */ class arw implements java.lang.Runnable {
    private final EditListFragment a;

    arw(EditListFragment arv) {
        this.a = arv;
    }

    public final void run() {
        defpackage.dcd dcd;
        EditListFragment arv = this.a;
        if (arv.i != null) {
            java.lang.String string = arv.i.getString("list_id");
            if (!android.text.TextUtils.isEmpty(string)) {
                arv.b = defpackage.any.get().c().c(string);
            } else {
                arv.b = defpackage.dcb.g;
            }
        } else {
            arv.b = defpackage.dcb.g;
        }
        if (arv.b == null) {
            android.widget.Toast.makeText(arv.getContext().getApplicationContext(), "Task list not found", 0).show();
            arv.getActivity().onBackPressed();
            return;
        }
        android.widget.EditText editText = arv.a;
        defpackage.dcb dcb = arv.b;
        if (dcb.c == null) {
            dcd = defpackage.dcd.c;
        } else {
            dcd = dcb.c;
        }
        editText.setText(dcd.a);
        android.text.Editable text = arv.a.getText();
        if (text != null) {
            arv.a.setSelection(text.length());
        }
    }
}
