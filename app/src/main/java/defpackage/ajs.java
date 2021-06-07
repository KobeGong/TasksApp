package defpackage;

/* renamed from: ajs  reason: default package */
public final /* synthetic */ class ajs implements Runnable {
    private final coy a;
    private final dii b;
    private final String c;
    private final cou d;

    public ajs(coy coy, dii dii, String str, cou cou) {
        this.a = coy;
        this.b = dii;
        this.c = str;
        this.d = cou;
    }

    public final void run() {
        boolean z = false;
        coy coy = this.a;
        dii dii = this.b;
        String str = this.c;
        cou cou = this.d;
        coy.c.a(new bqo(dii)).a(str).b().a(ajz.a);
        Object[] objArr = new Object[2];
        objArr[0] = cou.toString();
        if (str != null) {
            z = true;
        }
        objArr[1] = Boolean.valueOf(z);
    }
}
