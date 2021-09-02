package defpackage;

/* renamed from: bnf reason: default package */
/* compiled from: PG */
public final class bnf extends defpackage.bnm {
    private final defpackage.bba a;

    public bnf(defpackage.bba bba) {
        super(0);
        this.a = bba;
    }

    public final void a() {
        this.a.b = null;
    }

    public final void a(int i, android.os.Bundle bundle) {
        if (i != 0) {
            android.util.Log.w("PeopleClient", "Non-success data changed callback received.");
            return;
        }
        defpackage.bba bba = this.a;
        defpackage.bbd bbd = new defpackage.bbd(bundle.getString("account"), bundle.getString("pagegaiaid"), bundle.getInt("scope"));
        defpackage.azb.b((java.lang.Object) bbd, (java.lang.Object) "Notifier must not be null");
        bba.a.sendMessage(bba.a.obtainMessage(1, bbd));
    }
}
