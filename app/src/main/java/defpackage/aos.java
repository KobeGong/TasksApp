package defpackage;

/* renamed from: aos reason: default package */
/* compiled from: PG */
public final class aos extends defpackage.aoq {
    private final defpackage.ajo b;

    public aos(android.content.Intent intent) {
        android.net.Uri data = intent.getData();
        java.util.List pathSegments = data.getPathSegments();
        if (pathSegments.size() < 4) {
            java.lang.String valueOf = java.lang.String.valueOf(data);
            throw new java.lang.IllegalArgumentException(new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 30).append("This is not a LinkToTask Uri: ").append(valueOf).toString());
        } else {
            this.b = new LinkToTask((java.lang.String) pathSegments.get(1), (java.lang.String) pathSegments.get(2), (java.lang.String) pathSegments.get(3));
        }
    }

    public final java.lang.String a(android.content.Context context) {
        return this.b.getAccount();
    }

    public final AbsActivityConfig a(android.content.Context context, java.lang.String str) {
        if (str.equals(this.b.getAccount())) {
            return AbsActivityConfig.a(this.b.getTaskListId(), EditTaskFragment.newInstance(this.b.getTaskListId(), this.b.getTaskId(), false, -1));
        }
        return defpackage.aoe.a;
    }
}
