package defpackage;

/* renamed from: ayl reason: default package */
/* compiled from: PG */
public class ayl extends java.lang.Exception {
    public static final long serialVersionUID = 0;

    public ayl(com.google.android.gms.common.api.Status status) {
        java.lang.String str;
        int i = status.f;
        if (status.g != null) {
            str = status.g;
        } else {
            str = "";
        }
        super(new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 13).append(i).append(": ").append(str).toString());
    }

    public ayl() {
    }

    private ayl(java.lang.String str) {
        super(str);
    }

    private ayl(java.lang.String str, java.lang.Throwable th) {
        super(str, th);
    }

    public ayl(java.lang.Throwable th) {
        super(th);
    }

    public ayl(java.lang.String str, byte b) {
        this(str);
    }

    public ayl(java.lang.String str, java.lang.Exception exc) {
        this(str, (java.lang.Throwable) exc);
    }

    public ayl(java.lang.String str, java.lang.Exception exc, byte b) {
        this(str, exc);
    }
}
