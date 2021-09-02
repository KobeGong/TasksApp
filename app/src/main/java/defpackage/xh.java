package defpackage;

/* renamed from: xh reason: default package */
/* compiled from: PG */
public class xh extends defpackage.lb {
    public android.app.Dialog c() {
        return new defpackage.xg(getContext(), this.a);
    }

    public final void a(android.app.Dialog dialog, int i) {
        if (dialog instanceof defpackage.xg) {
            defpackage.xg xgVar = (defpackage.xg) dialog;
            switch (i) {
                case 1:
                case 2:
                    break;
                case 3:
                    dialog.getWindow().addFlags(24);
                    break;
                default:
                    return;
            }
            xgVar.a();
            return;
        }
        super.a(dialog, i);
    }
}
