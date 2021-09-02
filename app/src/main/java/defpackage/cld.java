package defpackage;

/* renamed from: cld reason: default package */
/* compiled from: PG */
public final class cld {
    public static void a(java.lang.Throwable th) {
        defpackage.cdm.b("PrimesExecutors", "Background task failed", th, new java.lang.Object[0]);
    }

    public static void a(boolean z) {
        if (!z) {
            throw new java.lang.IllegalArgumentException();
        }
    }

    public static void a(boolean z, java.lang.Object obj) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(java.lang.String.valueOf(obj));
        }
    }

    public static void a(boolean z, java.lang.String str, char c) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(a(str, java.lang.Character.valueOf(c)));
        }
    }

    public static void a(boolean z, java.lang.String str, long j) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(a(str, java.lang.Long.valueOf(j)));
        }
    }

    public static void a(boolean z, java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(a(str, obj, obj2));
        }
    }

    public static void b(boolean z) {
        if (!z) {
            throw new java.lang.IllegalStateException();
        }
    }

    public static void b(boolean z, java.lang.Object obj) {
        if (!z) {
            throw new java.lang.IllegalStateException(java.lang.String.valueOf(obj));
        }
    }

    public static void a(boolean z, java.lang.String str, java.lang.Object obj) {
        if (!z) {
            throw new java.lang.IllegalStateException(a(str, obj));
        }
    }

    public static java.lang.Object a(java.lang.Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new java.lang.NullPointerException();
    }

    public static java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new java.lang.NullPointerException(java.lang.String.valueOf(obj2));
    }

    public static java.lang.Object a(java.lang.Object obj, java.lang.String str, java.lang.Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new java.lang.NullPointerException(a(str, obj2));
    }

    public static java.lang.Object a(java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new java.lang.NullPointerException(a(str, java.lang.Integer.valueOf(i), obj2));
    }

    public static int a(int i, int i2) {
        java.lang.String a;
        java.lang.String str = "index";
        if (i >= 0 && i < i2) {
            return i;
        }
        if (i < 0) {
            a = a("%s (%s) must not be negative", str, java.lang.Integer.valueOf(i));
        } else if (i2 < 0) {
            throw new java.lang.IllegalArgumentException("negative size: " + i2);
        } else {
            a = a("%s (%s) must be less than size (%s)", str, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2));
        }
        throw new java.lang.IndexOutOfBoundsException(a);
    }

    public static int b(int i, int i2) {
        java.lang.String str = "index";
        if (i >= 0 && i <= i2) {
            return i;
        }
        throw new java.lang.IndexOutOfBoundsException(a(i, i2, str));
    }

    private static java.lang.String a(int i, int i2, java.lang.String str) {
        if (i < 0) {
            return a("%s (%s) must not be negative", str, java.lang.Integer.valueOf(i));
        } else if (i2 < 0) {
            throw new java.lang.IllegalArgumentException("negative size: " + i2);
        } else {
            return a("%s (%s) must not be greater than size (%s)", str, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2));
        }
    }

    public static void a(int i, int i2, int i3) {
        java.lang.String str;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                str = a(i, i3, "start index");
            } else if (i2 < 0 || i2 > i3) {
                str = a(i2, i3, "end index");
            } else {
                str = a("end index (%s) must not be less than start index (%s)", java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i));
            }
            throw new java.lang.IndexOutOfBoundsException(str);
        }
    }

    public static java.lang.String a(java.lang.String str, java.lang.Object... objArr) {
        int i = 0;
        java.lang.String valueOf = java.lang.String.valueOf(str);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(valueOf.length() + (objArr.length * 16));
        int i2 = 0;
        while (i < objArr.length) {
            int indexOf = valueOf.indexOf("%s", i2);
            if (indexOf == -1) {
                break;
            }
            sb.append(valueOf, i2, indexOf);
            int i3 = i + 1;
            sb.append(objArr[i]);
            int i4 = i3;
            i2 = indexOf + 2;
            i = i4;
        }
        sb.append(valueOf, i2, valueOf.length());
        if (i < objArr.length) {
            sb.append(" [");
            int i5 = i + 1;
            sb.append(objArr[i]);
            while (true) {
                int i6 = i5;
                if (i6 >= objArr.length) {
                    break;
                }
                sb.append(", ");
                i5 = i6 + 1;
                sb.append(objArr[i6]);
            }
            sb.append(']');
        }
        return sb.toString();
    }
}
