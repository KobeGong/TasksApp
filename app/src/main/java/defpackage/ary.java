package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.design.button.MaterialButton;
import android.view.View;
import com.google.android.apps.tasks.R;

/* renamed from: ary  reason: default package */
final /* synthetic */ class ary implements View.OnClickListener {
    private final arx a;

    ary(arx arx) {
        this.a = arx;
    }

    public final void onClick(View view) {
        arx arx = this.a;
        arx.V.setVisibility(0);
        arx.V.requestFocus();
        view.setEnabled(false);
        if (Build.VERSION.SDK_INT <= 21) {
            MaterialButton materialButton = (MaterialButton) view;
            Drawable d = jd.d(materialButton.a);
            if (materialButton.a != d) {
                materialButton.a = d;
                materialButton.c();
            }
            jd.a(d, jd.b(arx.k(), (int) R.color.google_grey600));
        }
    }
}
