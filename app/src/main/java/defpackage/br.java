package defpackage;

/* renamed from: br reason: default package */
/* compiled from: PG */
public class br extends java.lang.RuntimeException {
    public static final long serialVersionUID = -3067399656455755650L;

    public br() {
    }

    public br(java.lang.Throwable th) {
        super(th);
    }

    public br(java.lang.String str, java.lang.Exception exc) {
        super(str, exc);
    }

    public br(java.lang.String str, android.os.Parcel parcel) {
        int dataPosition = parcel.dataPosition();
        super(new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 41).append(str).append(" Parcel: pos=").append(dataPosition).append(" size=").append(parcel.dataSize()).toString());
    }

    public br(java.lang.String str, java.lang.ClassCastException classCastException) {
        super(str, classCastException);
    }
}
