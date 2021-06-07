package com.google.android.gms.common.data;

import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import java.io.Closeable;

@KeepName
/* compiled from: PG */
public final class DataHolder extends biq implements Closeable {
    public static final Parcelable.Creator CREATOR = new bcw();
    public final String[] a;
    public Bundle b;
    public final CursorWindow[] c;
    public int[] d;
    public int e;
    private int f;
    private final int g;
    private final Bundle h;
    private boolean i = false;
    private boolean j = true;

    public DataHolder(int i2, String[] strArr, CursorWindow[] cursorWindowArr, int i3, Bundle bundle) {
        this.f = i2;
        this.a = strArr;
        this.c = cursorWindowArr;
        this.g = i3;
        this.h = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int q = bjr.q(parcel, 20293);
        bjr.a(parcel, 1, this.a);
        bjr.a(parcel, 2, this.c, i2);
        bjr.c(parcel, 3, this.g);
        bjr.a(parcel, 4, this.h);
        bjr.c(parcel, 1000, this.f);
        bjr.r(parcel, q);
        if ((i2 & 1) != 0) {
            close();
        }
    }

    public final void a(String str, int i2) {
        if (this.b == null || !this.b.containsKey(str)) {
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() != 0 ? "No such column: ".concat(valueOf) : new String("No such column: "));
        } else if (a()) {
            throw new IllegalArgumentException("Buffer is closed.");
        } else if (i2 < 0 || i2 >= this.e) {
            throw new CursorIndexOutOfBoundsException(i2, this.e);
        }
    }

    public final boolean a() {
        boolean z;
        synchronized (this) {
            z = this.i;
        }
        return z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            if (!this.i) {
                this.i = true;
                for (int i2 = 0; i2 < this.c.length; i2++) {
                    this.c[i2].close();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // java.lang.Object
    public final void finalize() {
        try {
            if (this.j && this.c.length > 0 && !a()) {
                close();
                String obj = toString();
                Log.e("DataBuffer", new StringBuilder(String.valueOf(obj).length() + 178).append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ").append(obj).append(")").toString());
            }
        } finally {
            super.finalize();
        }
    }

    static {
        new avi(new String[0], (byte) 0);
    }
}
