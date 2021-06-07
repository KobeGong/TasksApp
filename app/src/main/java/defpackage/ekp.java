package defpackage;

/* renamed from: ekp  reason: default package */
/* compiled from: PG */
public final class ekp extends eiy {
    private final int a;
    private final eko b;

    public ekp(String str, int i, int i2) {
        super(str);
        this.b = new eko(str, 10, i);
        this.a = i2;
    }

    public final String getMessage() {
        StringBuilder sb = new StringBuilder(this.b.getMessage());
        sb.append(", QuicDetailedErrorCode=").append(this.a);
        return sb.toString();
    }

    @Override // defpackage.eis
    public final int a() {
        return this.b.a();
    }

    @Override // defpackage.eiy
    public final int b() {
        return this.a;
    }
}
