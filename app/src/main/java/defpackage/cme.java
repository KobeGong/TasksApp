package defpackage;

/* renamed from: cme  reason: default package */
/* compiled from: PG */
public final class cme extends cmh {
    public static final cme a = new cme();

    private cme() {
        super(edu.class);
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.cmh
    public final /* synthetic */ String a(dmf dmf) {
        return ((edu) dmf).b.b;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.cmh
    public final /* synthetic */ dmf a(dmf dmf, dmf dmf2) {
        edu edu = (edu) dmf;
        edu edu2 = (edu) dmf2;
        if (edu == null || edu2 == null) {
            return edu;
        }
        edu edu3 = new edu();
        edu3.b = edu.b;
        edu3.a = cky.a(edu.a, edu2.a);
        if (cky.a(edu3)) {
            return null;
        }
        return edu3;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.cmh
    public final /* synthetic */ dmf a(String str, Object obj) {
        int intValue = ((Long) obj).intValue();
        edu edu = new edu();
        edu.a = Integer.valueOf(intValue);
        edu.b = cky.a(str);
        if (cky.a(edu)) {
            return null;
        }
        return edu;
    }
}
