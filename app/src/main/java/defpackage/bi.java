package defpackage;

import java.io.Serializable;

/* access modifiers changed from: package-private */
/* renamed from: bi  reason: default package */
/* compiled from: PG */
public final class bi implements Serializable {
    public static final long serialVersionUID = 1;
    public final String a;
    public final az b;
    public final bd c;
    public final bd d;

    public bi(String str, az azVar, bd bdVar, bd bdVar2) {
        this.a = str;
        this.b = azVar;
        this.c = bdVar;
        this.d = bdVar2;
    }

    public final String toString() {
        String concat;
        String concat2;
        String str = this.a;
        String obj = this.b.toString();
        if (this.c == null) {
            concat = "";
        } else {
            String valueOf = String.valueOf(this.c.toString());
            concat = valueOf.length() != 0 ? " ".concat(valueOf) : new String(" ");
        }
        if (this.d == null) {
            concat2 = "";
        } else {
            String valueOf2 = String.valueOf(this.d.toString());
            concat2 = valueOf2.length() != 0 ? " ".concat(valueOf2) : new String(" ");
        }
        return new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(obj).length() + String.valueOf(concat).length() + String.valueOf(concat2).length()).append(str).append(": ").append(obj).append(concat).append(concat2).toString();
    }

    @Deprecated
    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }
}
