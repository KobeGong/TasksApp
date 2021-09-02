package defpackage;

import android.view.View;

import com.google.android.apps.tasks.R;

/* renamed from: atb reason: default package */
/* compiled from: PG */
public final class SubTaskView extends android.widget.RelativeLayout {
    public com.google.android.apps.tasks.ui.components.FancyCheckboxView a;
    public android.widget.EditText editText;
    public android.widget.Button c;
    public defpackage.dby d;
    public android.view.View.OnFocusChangeListener e;

    public SubTaskView(android.content.Context context) {
        super(context);
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(R.layout.subtask, this);
        this.a = inflate.findViewById(R.id.subtask_complete_check);
        this.c = inflate.findViewById(R.id.subtask_delete);
        this.editText = inflate.findViewById(R.id.subtask_title);
        this.c.setVisibility(View.INVISIBLE);
        this.editText.setOnFocusChangeListener(new defpackage.atc(this));
    }

    public final void a(defpackage.dby dby) {
        defpackage.dca dca;
        this.d = dby;
        if (dby.e == null) {
            dca = defpackage.dca.g;
        } else {
            dca = dby.e;
        }
        java.lang.String str = dca.b;
        if (!this.editText.getText().toString().equals(str)) {
            this.editText.setText(str);
        }
    }

    public final void a() {
        this.editText.requestFocus();
        defpackage.bdk.a(this.editText, true);
    }
}
