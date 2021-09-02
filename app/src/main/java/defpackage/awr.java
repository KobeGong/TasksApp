package defpackage;

/* renamed from: awr reason: default package */
/* compiled from: PG */
final class awr implements defpackage.avd {
    private /* synthetic */ java.lang.String a;
    private /* synthetic */ android.os.Bundle b;

    awr(java.lang.String str, android.os.Bundle bundle) {
        this.a = str;
        this.b = bundle;
    }

    public final /* synthetic */ java.lang.Object a(android.os.IBinder iBinder) {
        android.os.Bundle bundle = (android.os.Bundle) defpackage.avc.a((java.lang.Object) defpackage.bkq.a(iBinder).a(this.a, this.b));
        java.lang.String string = bundle.getString("Error");
        if (bundle.getBoolean("booleanResult")) {
            return null;
        }
        throw new defpackage.ava(string);
    }
}
