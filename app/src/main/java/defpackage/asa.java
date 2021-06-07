package defpackage;

import android.text.TextUtils;
import android.view.View;

/* renamed from: asa  reason: default package */
final /* synthetic */ class asa implements View.OnClickListener {
    private final arx a;

    asa(arx arx) {
        this.a = arx;
    }

    public final void onClick(View view) {
        dih dih;
        arx arx = this.a;
        if (!arx.n) {
            lg j = arx.j();
            if (j instanceof ash) {
                dii dii = (dii) dca.g.a(bg.ao);
                dii.f(arx.U.getText().toString().trim());
                String trim = arx.V.getText().toString().trim();
                if (!TextUtils.isEmpty(trim)) {
                    dii.g(trim);
                }
                if (arx.ab != null) {
                    dii.a(arx.ab);
                }
                if (dii.b) {
                    dih = dii.a;
                } else {
                    dih dih2 = dii.a;
                    djz.a.a(dih2).c(dih2);
                    dii.b = true;
                    dih = dii.a;
                }
                dih dih3 = dih;
                if (!dih.a(dih3, Boolean.TRUE.booleanValue())) {
                    throw new dkw();
                }
                dca dca = (dca) dih3;
                if (!ajd.a(dca)) {
                    ((ash) j).a(dca);
                }
            }
            arx.a(false);
        }
    }
}
