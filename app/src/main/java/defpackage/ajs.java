package defpackage;

/* renamed from: ajs reason: default package */
public final /* synthetic */ class ajs implements java.lang.Runnable {
    private final defpackage.coy a;
    private final defpackage.dii b;
    private final java.lang.String c;
    private final defpackage.cou d;

    public ajs(defpackage.coy coy, defpackage.dii dii, java.lang.String str, defpackage.cou cou) {
        this.a = coy;
        this.b = dii;
        this.c = str;
        this.d = cou;
    }

    public final void run() {
        boolean z = false;
        defpackage.coy coy = this.a;
        defpackage.dii dii = this.b;
        java.lang.String str = this.c;
        defpackage.cou cou = this.d;
        coy.c.a(new defpackage.bqo(dii)).a(str).b().a(defpackage.ajz.a);
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = cou.toString();
        if (str != null) {
            z = true;
        }
        objArr[1] = java.lang.Boolean.valueOf(z);
    }
}
