package defpackage;

import android.accounts.Account;
import android.content.Context;

/* renamed from: aiz  reason: default package */
/* compiled from: PG */
public final class aiz {
    public final Context a;

    public aiz(Context context) {
        this.a = context.getApplicationContext();
    }

    public static String a(Context context, Account account, String str) {
        String str2;
        if (!str.startsWith("oauth2:")) {
            String valueOf = String.valueOf("oauth2:");
            String valueOf2 = String.valueOf(str);
            str2 = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        } else {
            str2 = str;
        }
        return avb.a(context.getApplicationContext(), account, str2);
    }
}
