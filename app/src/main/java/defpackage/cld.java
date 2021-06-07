package defpackage;

/* renamed from: cld  reason: default package */
/* compiled from: PG */
public final class cld {
    public static void a(Throwable th) {
        cdm.b("PrimesExecutors", "Background task failed", th, new Object[0]);
    }

    public static void a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void a(boolean z, String str, char c) {
        if (!z) {
            throw new IllegalArgumentException(a(str, Character.valueOf(c)));
        }
    }

    public static void a(boolean z, String str, long j) {
        if (!z) {
            throw new IllegalArgumentException(a(str, Long.valueOf(j)));
        }
    }

    public static void a(boolean z, String str, Object obj, Object obj2) {
        if (!z) {
            throw new IllegalArgumentException(a(str, obj, obj2));
        }
    }

    public static void b(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void a(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalStateException(a(str, obj));
        }
    }

    public static Object a(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException();
    }

    public static Object a(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }

    public static Object a(Object obj, String str, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(a(str, obj2));
    }

    public static Object a(Object obj, String str, int i, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(a(str, Integer.valueOf(i), obj2));
    }

    public static int a(int i, int i2) {
        String a;
        if (i >= 0 && i < i2) {
            return i;
        }
        if (i < 0) {
            a = a("%s (%s) must not be negative", "index", Integer.valueOf(i));
        } else if (i2 < 0) {
            throw new IllegalArgumentException(new StringBuilder(26).append("negative size: ").append(i2).toString());
        } else {
            a = a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IndexOutOfBoundsException(a);
    }

    public static int b(int i, int i2) {
        if (i >= 0 && i <= i2) {
            return i;
        }
        throw new IndexOutOfBoundsException(a(i, i2, "index"));
    }

    private static String a(int i, int i2, String str) {
        if (i < 0) {
            return a("%s (%s) must not be negative", str, Integer.valueOf(i));
        } else if (i2 < 0) {
            throw new IllegalArgumentException(new StringBuilder(26).append("negative size: ").append(i2).toString());
        } else {
            return a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    public static void a(int i, int i2, int i3) {
        String str;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                str = a(i, i3, "start index");
            } else if (i2 < 0 || i2 > i3) {
                str = a(i2, i3, "end index");
            } else {
                str = a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(str);
        }
    }

    public static String a(String str, Object... objArr) {
        int indexOf;
        int i = 0;
        String valueOf = String.valueOf(str);
        StringBuilder sb = new StringBuilder(valueOf.length() + (objArr.length * 16));
        int i2 = 0;
        while (i < objArr.length && (indexOf = valueOf.indexOf("%s", i2)) != -1) {
            sb.append((CharSequence) valueOf, i2, indexOf);
            sb.append(objArr[i]);
            i2 = indexOf + 2;
            i++;
        }
        sb.append((CharSequence) valueOf, i2, valueOf.length());
        if (i < objArr.length) {
            sb.append(" [");
            int i3 = i + 1;
            sb.append(objArr[i]);
            while (i3 < objArr.length) {
                sb.append(", ");
                i3++;
                sb.append(objArr[i3]);
            }
            sb.append(']');
        }
        return sb.toString();
    }
}
