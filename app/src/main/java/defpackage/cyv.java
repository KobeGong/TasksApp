package defpackage;

import java.util.Locale;

/* renamed from: cyv  reason: default package */
/* compiled from: PG */
public final class cyv {
    public String a = null;
    public Boolean b = null;

    public final cyv a(String str) {
        a(str, 0);
        this.a = str;
        return this;
    }

    public final cyv a(boolean z) {
        this.b = Boolean.valueOf(z);
        return this;
    }

    static String a(String str, Object... objArr) {
        return String.format(Locale.ROOT, str, objArr);
    }
}
