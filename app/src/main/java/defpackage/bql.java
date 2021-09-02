package defpackage;

/* renamed from: bql reason: default package */
/* compiled from: PG */
public final class bql {
    private final defpackage.awu a;

    public final defpackage.bql a(java.lang.String str) {
        defpackage.awu awu = this.a;
        defpackage.awt.b();
        awu.a = str;
        return this;
    }

    public final defpackage.brb a() {
        return new defpackage.brb(this.a.a(), defpackage.bqp.a);
    }

    public final defpackage.brb b() {
        return new defpackage.brb(this.a.a(), defpackage.bqp.a);
    }

    private bql(defpackage.awt awt, byte[] bArr) {
        this.a = new defpackage.awu(awt, bArr);
    }

    private bql(defpackage.awt awt, defpackage.aww aww) {
        this.a = new defpackage.awu(awt, aww);
    }

    public bql(defpackage.awt awt, byte[] bArr, byte b) {
        this(awt, bArr);
    }

    public bql(defpackage.awt awt, defpackage.aww aww, byte b) {
        this(awt, aww);
    }
}
