package com.google.android.gms.common.data;

@com.google.android.gms.common.annotation.KeepName
/* compiled from: PG */
public final class DataHolder extends defpackage.biq implements java.io.Closeable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.bcw();
    public final java.lang.String[] a;
    public android.os.Bundle b;
    public final android.database.CursorWindow[] c;
    public int[] d;
    public int e;
    private int f;
    private final int g;
    private final android.os.Bundle h;
    private boolean i = false;
    private boolean j = true;

    public DataHolder(int i2, java.lang.String[] strArr, android.database.CursorWindow[] cursorWindowArr, int i3, android.os.Bundle bundle) {
        this.f = i2;
        this.a = strArr;
        this.c = cursorWindowArr;
        this.g = i3;
        this.h = bundle;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i2) {
        int q = defpackage.bjr.q(parcel, 20293);
        defpackage.bjr.a(parcel, 1, this.a);
        defpackage.bjr.a(parcel, 2, (android.os.Parcelable[]) this.c, i2);
        defpackage.bjr.c(parcel, 3, this.g);
        defpackage.bjr.a(parcel, 4, this.h);
        defpackage.bjr.c(parcel, 1000, this.f);
        defpackage.bjr.r(parcel, q);
        if ((i2 & 1) != 0) {
            close();
        }
    }

    public final void a(java.lang.String str, int i2) {
        if (this.b == null || !this.b.containsKey(str)) {
            java.lang.String str2 = "No such column: ";
            java.lang.String valueOf = java.lang.String.valueOf(str);
            throw new java.lang.IllegalArgumentException(valueOf.length() != 0 ? str2.concat(valueOf) : new java.lang.String(str2));
        } else if (a()) {
            throw new java.lang.IllegalArgumentException("Buffer is closed.");
        } else if (i2 < 0 || i2 >= this.e) {
            throw new android.database.CursorIndexOutOfBoundsException(i2, this.e);
        }
    }

    public final boolean a() {
        boolean z;
        synchronized (this) {
            z = this.i;
        }
        return z;
    }

    public final void close() {
        synchronized (this) {
            if (!this.i) {
                this.i = true;
                for (android.database.CursorWindow close : this.c) {
                    close.close();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        try {
            if (this.j && this.c.length > 0 && !a()) {
                close();
                java.lang.String obj = toString();
                android.util.Log.e("DataBuffer", new java.lang.StringBuilder(java.lang.String.valueOf(obj).length() + 178).append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ").append(obj).append(")").toString());
            }
        } finally {
            super.finalize();
        }
    }

    static {
        new defpackage.avi(new java.lang.String[0], 0);
    }
}
