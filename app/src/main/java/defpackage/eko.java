package defpackage;

/* renamed from: eko reason: default package */
/* compiled from: PG */
public class eko extends defpackage.eis {
    public final int a;
    private final int b;

    public eko(java.lang.String str, int i, int i2) {
        super(str);
        this.b = i;
        this.a = i2;
    }

    public final int a() {
        return this.b;
    }

    public boolean b() {
        switch (this.b) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 8:
                return true;
            default:
                return false;
        }
    }

    public java.lang.String getMessage() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(super.getMessage());
        sb.append(", ErrorCode=").append(this.b);
        if (this.a != 0) {
            sb.append(", InternalErrorCode=").append(this.a);
        }
        sb.append(", Retryable=").append(b());
        return sb.toString();
    }
}
