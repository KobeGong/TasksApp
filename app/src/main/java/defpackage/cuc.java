package defpackage;

/* renamed from: cuc reason: default package */
/* compiled from: PG */
public final class cuc {
    public final java.lang.String a;
    private final java.lang.Class b;

    public static defpackage.cuc a(java.lang.String str, java.lang.Class cls) {
        return new defpackage.cuc(str, cls);
    }

    private cuc(java.lang.String str, java.lang.Class cls) {
        if (str.isEmpty()) {
            throw new java.lang.IllegalArgumentException("identifier must not be empty");
        } else if (!defpackage.cub.a(str.charAt(0))) {
            java.lang.String str2 = "identifier must start with an ASCII letter: ";
            java.lang.String valueOf = java.lang.String.valueOf(str);
            throw new java.lang.IllegalArgumentException(valueOf.length() != 0 ? str2.concat(valueOf) : new java.lang.String(str2));
        } else {
            int i = 1;
            while (i < str.length()) {
                char charAt = str.charAt(i);
                if (defpackage.cub.a(charAt) || ((charAt >= '0' && charAt <= '9') || charAt == '_')) {
                    i++;
                } else {
                    java.lang.String str3 = "identifier must contain only ASCII letters, digits or underscore: ";
                    java.lang.String valueOf2 = java.lang.String.valueOf(str);
                    throw new java.lang.IllegalArgumentException(valueOf2.length() != 0 ? str3.concat(valueOf2) : new java.lang.String(str3));
                }
            }
            this.a = str;
            this.b = (java.lang.Class) defpackage.cub.a((java.lang.Object) cls, "class");
        }
    }

    public final java.lang.Object a(java.lang.Object obj) {
        return this.b.cast(obj);
    }

    public final java.lang.String toString() {
        java.lang.String name = getClass().getName();
        java.lang.String str = this.a;
        java.lang.String name2 = this.b.getName();
        return new java.lang.StringBuilder(java.lang.String.valueOf(name).length() + 3 + java.lang.String.valueOf(str).length() + java.lang.String.valueOf(name2).length()).append(name).append("/").append(str).append("[").append(name2).append("]").toString();
    }
}
