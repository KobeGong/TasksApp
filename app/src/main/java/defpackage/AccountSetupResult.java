package defpackage;

/* renamed from: aji reason: default package */
/* compiled from: PG */
final class AccountSetupResult extends AbsAccountSetupResult {
    private final boolean success;
    private final boolean new_;

    AccountSetupResult(boolean z, boolean z2) {
        this.success = z;
        this.new_ = z2;
    }

    public final boolean isSuccess() {
        return this.success;
    }

    public final boolean isNew() {
        return this.new_;
    }

    public final java.lang.String toString() {
        return "AccountSetupResult{success=" + success + ", new=" + this.new_ + "}";
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbsAccountSetupResult)) {
            return false;
        }
        AbsAccountSetupResult ajh = (AbsAccountSetupResult) obj;
        if (this.success == ajh.isSuccess() && this.new_ == ajh.isNew()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = 1231;
        if (this.success) {
            i = 1231;
        } else {
            i = 1237;
        }
        int i3 = (i ^ 1000003) * 1000003;
        if (!this.new_) {
            i2 = 1237;
        }
        return i3 ^ i2;
    }
}
