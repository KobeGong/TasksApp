package defpackage;

/* renamed from: ez reason: default package */
/* compiled from: PG */
public final class ez extends defpackage.ze {
    public ez(android.content.Context context) {
        super(context);
    }

    public final android.view.SubMenu addSubMenu(int i, int i2, int i3, java.lang.CharSequence charSequence) {
        defpackage.zi ziVar = (defpackage.zi) a(i, i2, i3, charSequence);
        defpackage.fj fjVar = new defpackage.fj(this.a, this, ziVar);
        ziVar.a((defpackage.aad) fjVar);
        return fjVar;
    }
}
