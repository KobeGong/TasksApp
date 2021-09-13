package defpackage;

/* renamed from: ajh reason: default package */
/* compiled from: PG */
public abstract class AbsAccountSetupResult {
    public abstract boolean isSuccess();

    public abstract boolean isNew();

    public static final AbsAccountSetupResult success(boolean z) {
        return new AccountSetupResult(true, z);
    }

    public static final AbsAccountSetupResult failure() {
        return new AccountSetupResult(false, false);
    }
}
