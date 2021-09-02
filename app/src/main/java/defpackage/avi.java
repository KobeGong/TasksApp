package defpackage;

/* renamed from: avi reason: default package */
/* compiled from: PG */
public class avi {
    public avi() {
    }

    private avi(java.lang.String[] strArr) {
        defpackage.azb.b((java.lang.Object) strArr);
        new java.util.ArrayList();
        new java.util.HashMap();
    }

    public avi(java.lang.String[] strArr, byte b) {
        this(strArr);
    }

    private avi(java.lang.String str) {
        boolean z;
        defpackage.azb.b((java.lang.Object) str, (java.lang.Object) "log tag cannot be null");
        if (str.length() <= 23) {
            z = true;
        } else {
            z = false;
        }
        java.lang.String str2 = "tag \"%s\" is longer than the %d character maximum";
        java.lang.Object[] objArr = {str, java.lang.Integer.valueOf(23)};
        if (!z) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format(str2, objArr));
        }
    }

    public avi(java.lang.String str, byte b) {
        this(str);
    }

    public java.lang.String a() {
        return "GCM";
    }

    public avi(android.content.Context context) {
        defpackage.bhh.a(context);
    }

    public avi(android.content.Context context, byte b) {
        this(context);
    }
}
