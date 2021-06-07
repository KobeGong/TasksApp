package defpackage;

/* renamed from: cuc  reason: default package */
/* compiled from: PG */
public final class cuc {
    public final String a;
    private final Class b;

    public static cuc a(String str, Class cls) {
        return new cuc(str, cls);
    }

    private cuc(String str, Class cls) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("identifier must not be empty");
        } else if (!cub.a(str.charAt(0))) {
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() != 0 ? "identifier must start with an ASCII letter: ".concat(valueOf) : new String("identifier must start with an ASCII letter: "));
        } else {
            for (int i = 1; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if (!cub.a(charAt) && ((charAt < '0' || charAt > '9') && charAt != '_')) {
                    String valueOf2 = String.valueOf(str);
                    throw new IllegalArgumentException(valueOf2.length() != 0 ? "identifier must contain only ASCII letters, digits or underscore: ".concat(valueOf2) : new String("identifier must contain only ASCII letters, digits or underscore: "));
                }
            }
            this.a = str;
            this.b = (Class) cub.a(cls, "class");
        }
    }

    public final Object a(Object obj) {
        return this.b.cast(obj);
    }

    public final String toString() {
        String name = getClass().getName();
        String str = this.a;
        String name2 = this.b.getName();
        return new StringBuilder(String.valueOf(name).length() + 3 + String.valueOf(str).length() + String.valueOf(name2).length()).append(name).append("/").append(str).append("[").append(name2).append("]").toString();
    }
}
