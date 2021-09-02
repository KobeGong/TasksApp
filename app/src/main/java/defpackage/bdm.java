package defpackage;

/* renamed from: bdm reason: default package */
/* compiled from: PG */
public final class bdm extends defpackage.biq {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.bek();
    public java.lang.String a;
    public android.os.IBinder b;
    public com.google.android.gms.common.api.Scope[] c;
    public android.os.Bundle d;
    public android.accounts.Account e;
    public defpackage.axs[] f;
    private int g;
    private int h;
    private int i;

    public bdm(int i2) {
        this.g = 3;
        this.i = defpackage.axv.b;
        this.h = i2;
    }

    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v1, types: [android.accounts.Account] */
    /* JADX WARNING: type inference failed for: r0v4, types: [bes] */
    /* JADX WARNING: type inference failed for: r0v5, types: [bdp] */
    /* JADX WARNING: type inference failed for: r0v6, types: [bdp] */
    /* JADX WARNING: type inference failed for: r0v7, types: [android.accounts.Account] */
    /* JADX WARNING: type inference failed for: r0v8 */
    /* JADX WARNING: type inference failed for: r0v9 */
    /* JADX WARNING: type inference failed for: r0v10 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v0
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], android.accounts.Account, bes, bdp]
      uses: [android.accounts.Account, bdp]
      mth insns count: 30
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.util.ArrayList.forEach(ArrayList.java:1257)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.util.ArrayList.forEach(ArrayList.java:1257)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.util.ArrayList.forEach(ArrayList.java:1257)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    bdm(int r3, int r4, int r5, java.lang.String r6, android.os.IBinder r7, com.google.android.gms.common.api.Scope[] r8, android.os.Bundle r9, android.accounts.Account r10, defpackage.axs[] r11) {
        /*
            r2 = this;
            r0 = 0
            r2.<init>()
            r2.g = r3
            r2.h = r4
            r2.i = r5
            java.lang.String r1 = "com.google.android.gms"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x002a
            java.lang.String r1 = "com.google.android.gms"
            r2.a = r1
        L_0x0016:
            r1 = 2
            if (r3 >= r1) goto L_0x0040
            if (r7 == 0) goto L_0x0021
            if (r7 != 0) goto L_0x002d
        L_0x001d:
            android.accounts.Account r0 = defpackage.bdu.a(r0)
        L_0x0021:
            r2.e = r0
        L_0x0023:
            r2.c = r8
            r2.d = r9
            r2.f = r11
            return
        L_0x002a:
            r2.a = r6
            goto L_0x0016
        L_0x002d:
            java.lang.String r0 = "com.google.android.gms.common.internal.IAccountAccessor"
            android.os.IInterface r0 = r7.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.bdp
            if (r1 == 0) goto L_0x003a
            bdp r0 = (defpackage.bdp) r0
            goto L_0x001d
        L_0x003a:
            bes r0 = new bes
            r0.<init>(r7)
            goto L_0x001d
        L_0x0040:
            r2.b = r7
            r2.e = r10
            goto L_0x0023
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bdm.<init>(int, int, int, java.lang.String, android.os.IBinder, com.google.android.gms.common.api.Scope[], android.os.Bundle, android.accounts.Account, axs[]):void");
    }

    public final void writeToParcel(android.os.Parcel parcel, int i2) {
        int q = defpackage.bjr.q(parcel, 20293);
        defpackage.bjr.c(parcel, 1, this.g);
        defpackage.bjr.c(parcel, 2, this.h);
        defpackage.bjr.c(parcel, 3, this.i);
        defpackage.bjr.a(parcel, 4, this.a);
        defpackage.bjr.a(parcel, 5, this.b);
        defpackage.bjr.a(parcel, 6, (android.os.Parcelable[]) this.c, i2);
        defpackage.bjr.a(parcel, 7, this.d);
        defpackage.bjr.a(parcel, 8, (android.os.Parcelable) this.e, i2);
        defpackage.bjr.a(parcel, 10, (android.os.Parcelable[]) this.f, i2);
        defpackage.bjr.r(parcel, q);
    }
}
