package defpackage;

import android.app.Dialog;

/* renamed from: xh  reason: default package */
/* compiled from: PG */
public class xh extends lb {
    @Override // defpackage.lb
    public Dialog c() {
        return new xg(i(), this.a);
    }

    @Override // defpackage.lb
    public final void a(Dialog dialog, int i) {
        if (dialog instanceof xg) {
            xg xgVar = (xg) dialog;
            switch (i) {
                case 1:
                case 2:
                    break;
                default:
                    return;
                case 3:
                    dialog.getWindow().addFlags(24);
                    break;
            }
            xgVar.a();
            return;
        }
        super.a(dialog, i);
    }
}
