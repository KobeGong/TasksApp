package defpackage;

/* renamed from: aiz reason: default package */
/* compiled from: PG */
public final class aiz {
    public final android.content.Context a;

    public aiz(android.content.Context context) {
        this.a = context.getApplicationContext();
    }

    public static java.lang.String a(android.content.Context context, android.accounts.Account account, java.lang.String str) {
        java.lang.String str2;
        if (!str.startsWith("oauth2:")) {
            java.lang.String valueOf = java.lang.String.valueOf("oauth2:");
            java.lang.String valueOf2 = java.lang.String.valueOf(str);
            str2 = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new java.lang.String(valueOf);
        } else {
            str2 = str;
        }
        return defpackage.avb.a(context.getApplicationContext(), account, str2);
    }
}
