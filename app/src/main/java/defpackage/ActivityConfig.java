package defpackage;

/* renamed from: aog reason: default package */
/* compiled from: PG */
final class ActivityConfig extends AbsActivityConfig {
    private final java.lang.String selectedListId;
    private final Fragment fragment;

    ActivityConfig(java.lang.String str, Fragment lcVar) {
        this.selectedListId = str;
        this.fragment = lcVar;
    }

    /* access modifiers changed from: 0000 */
    public final java.lang.String getSelectedListId() {
        return this.selectedListId;
    }

    /* access modifiers changed from: 0000 */
    public final Fragment getFragment() {
        return this.fragment;
    }

    public final java.lang.String toString() {
        java.lang.String valueOf = java.lang.String.valueOf(this.fragment);
        return "ActivityConfig{selectedListId=" + this.selectedListId + ", fragment=" + valueOf + "}";
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbsActivityConfig)) {
            return false;
        }
        AbsActivityConfig aof = (AbsActivityConfig) obj;
        if (this.selectedListId != null ? this.selectedListId.equals(aof.getSelectedListId()) : aof.getSelectedListId() == null) {
            if (this.fragment == null) {
                if (aof.getFragment() == null) {
                    return true;
                }
            } else if (this.fragment.equals(aof.getFragment())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((this.selectedListId == null ? 0 : this.selectedListId.hashCode()) ^ 1000003) * 1000003;
        if (this.fragment != null) {
            i = this.fragment.hashCode();
        }
        return hashCode ^ i;
    }
}
