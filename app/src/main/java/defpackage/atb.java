package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import com.google.android.apps.tasks.R;
import com.google.android.apps.tasks.ui.components.FancyCheckboxView;

/* renamed from: atb  reason: default package */
/* compiled from: PG */
public final class atb extends RelativeLayout {
    public FancyCheckboxView a;
    public EditText b;
    public Button c;
    public dby d;
    public View.OnFocusChangeListener e;

    public atb(Context context) {
        super(context);
        View inflate = LayoutInflater.from(context).inflate(R.layout.subtask, this);
        this.a = (FancyCheckboxView) inflate.findViewById(R.id.subtask_complete_check);
        this.c = (Button) inflate.findViewById(R.id.subtask_delete);
        this.b = (EditText) inflate.findViewById(R.id.subtask_title);
        this.c.setVisibility(4);
        this.b.setOnFocusChangeListener(new atc(this));
    }

    public final void a(dby dby) {
        dca dca;
        this.d = dby;
        if (dby.e == null) {
            dca = dca.g;
        } else {
            dca = dby.e;
        }
        String str = dca.b;
        if (!this.b.getText().toString().equals(str)) {
            this.b.setText(str);
        }
    }

    public final void a() {
        this.b.requestFocus();
        bdk.a((View) this.b, true);
    }
}
