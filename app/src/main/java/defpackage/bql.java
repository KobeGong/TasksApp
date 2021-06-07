package defpackage;

/* renamed from: bql  reason: default package */
/* compiled from: PG */
public final class bql {
    private final awu a;

    public final bql a(String str) {
        awu awu = this.a;
        awt.b();
        awu.a = str;
        return this;
    }

    public final brb a() {
        return new brb(this.a.a(), bqp.a);
    }

    public final brb b() {
        return new brb(this.a.a(), bqp.a);
    }

    private bql(awt awt, byte[] bArr) {
        this.a = new awu(awt, bArr);
    }

    private bql(awt awt, aww aww) {
        this.a = new awu(awt, aww);
    }

    public bql(awt awt, byte[] bArr, byte b) {
        this(awt, bArr);
    }

    public bql(awt awt, aww aww, byte b) {
        this(awt, aww);
    }
}
