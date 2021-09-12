package defpackage;

/* renamed from: aof reason: default package */
/* compiled from: IActivityConfig */
public abstract class AbsActivityConfig {
    /* access modifiers changed from: 0000 */
    public abstract java.lang.String getSelectedListId();

    /* access modifiers changed from: 0000 */
    public abstract Fragment getFragment();

    static AbsActivityConfig a(java.lang.String str, Fragment lcVar) {
        return new ActivityConfig(str, lcVar);
    }
}
