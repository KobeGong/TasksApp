package defpackage;

/* renamed from: cdr reason: default package */
/* compiled from: PG */
final class DeviceOwner extends AbsDeviceOwner {
    private final java.lang.String displayName;
    private final java.lang.String accountName;
    private final int isDasherAccount;

    DeviceOwner(java.lang.String displayName, java.lang.String accountName, int isDasherAccount) {
        this.displayName = displayName;
        if (accountName == null) {
            throw new java.lang.NullPointerException("Null accountName");
        }
        this.accountName = accountName;
        this.isDasherAccount = isDasherAccount;
    }

    public final java.lang.String getDisplayName() {
        return this.displayName;
    }

    public final java.lang.String accountName() {
        return this.accountName;
    }

    public final int isDasherAccount() {
        return this.isDasherAccount;
    }

    public final java.lang.String toString() {
        return "DeviceOwner{displayName=" + this.displayName + ", accountName=" + this.accountName + ", isDasherAccount=" + this.isDasherAccount + "}";
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbsDeviceOwner)) {
            return false;
        }
        AbsDeviceOwner cdu = (AbsDeviceOwner) obj;
        if (this.displayName != null ? this.displayName.equals(cdu.getDisplayName()) : cdu.getDisplayName() == null) {
            if (this.accountName.equals(cdu.accountName()) && this.isDasherAccount == cdu.isDasherAccount()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.displayName == null ? 0 : this.displayName.hashCode()) ^ 1000003) * 1000003) ^ this.accountName.hashCode()) * 1000003) ^ this.isDasherAccount;
    }
}
