package defpackage;

/* renamed from: cme reason: default package */
/* compiled from: PG */
public final class cme extends defpackage.cmh {
    public static final defpackage.cme a = new defpackage.cme();

    private cme() {
        super(defpackage.edu.class);
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ java.lang.String a(defpackage.dmf dmf) {
        return ((defpackage.edu) dmf).b.b;
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ defpackage.dmf a(defpackage.dmf dmf, defpackage.dmf dmf2) {
        defpackage.edu edu = (defpackage.edu) dmf;
        defpackage.edu edu2 = (defpackage.edu) dmf2;
        if (edu == null || edu2 == null) {
            return edu;
        }
        defpackage.edu edu3 = new defpackage.edu();
        edu3.b = edu.b;
        edu3.a = defpackage.cky.a(edu.a, edu2.a);
        if (defpackage.cky.a(edu3)) {
            return null;
        }
        return edu3;
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ defpackage.dmf a(java.lang.String str, java.lang.Object obj) {
        int intValue = ((java.lang.Long) obj).intValue();
        defpackage.edu edu = new defpackage.edu();
        edu.a = java.lang.Integer.valueOf(intValue);
        edu.b = defpackage.cky.a(str);
        if (defpackage.cky.a(edu)) {
            return null;
        }
        return edu;
    }
}
