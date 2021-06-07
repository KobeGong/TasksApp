package defpackage;

/* renamed from: eko  reason: default package */
/* compiled from: PG */
public class eko extends eis {
    public final int a;
    private final int b;

    public eko(String str, int i, int i2) {
        super(str);
        this.b = i;
        this.a = i2;
    }

    @Override // defpackage.eis
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
            case 7:
            default:
                return false;
        }
    }

    public String getMessage() {
        StringBuilder sb = new StringBuilder(super.getMessage());
        sb.append(", ErrorCode=").append(this.b);
        if (this.a != 0) {
            sb.append(", InternalErrorCode=").append(this.a);
        }
        sb.append(", Retryable=").append(b());
        return sb.toString();
    }
}
