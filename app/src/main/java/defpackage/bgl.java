package defpackage;

/* renamed from: bgl reason: default package */
/* compiled from: PG */
public final class bgl extends defpackage.biq {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.bgs();
    public java.io.File a;
    private android.os.ParcelFileDescriptor b;
    private final java.lang.String c;
    private final java.lang.String d;

    bgl(android.os.ParcelFileDescriptor parcelFileDescriptor, java.lang.String str, java.lang.String str2) {
        this.b = parcelFileDescriptor;
        this.c = str;
        this.d = str2;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        if (this.b == null) {
            java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(a());
            java.lang.Object[] objArr = null;
            try {
                dataOutputStream.writeInt(objArr.length);
                dataOutputStream.writeUTF(this.c);
                dataOutputStream.writeUTF(this.d);
                dataOutputStream.write(null);
                a(dataOutputStream);
            } catch (java.io.IOException e) {
                throw new java.lang.IllegalStateException("Could not write into unlinked file", e);
            } catch (Throwable th) {
                a(dataOutputStream);
                throw th;
            }
        }
        int q = defpackage.bjr.q(parcel, 20293);
        defpackage.bjr.a(parcel, 2, (android.os.Parcelable) this.b, i);
        defpackage.bjr.a(parcel, 3, this.c);
        defpackage.bjr.a(parcel, 4, this.d);
        defpackage.bjr.r(parcel, q);
    }

    private final java.io.FileOutputStream a() {
        if (this.a == null) {
            throw new java.lang.IllegalStateException("setTempDir() must be called before writing this object to a parcel.");
        }
        try {
            java.io.File createTempFile = java.io.File.createTempFile("teleporter", ".tmp", this.a);
            try {
                java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(createTempFile);
                this.b = android.os.ParcelFileDescriptor.open(createTempFile, 268435456);
                createTempFile.delete();
                return fileOutputStream;
            } catch (java.io.FileNotFoundException e) {
                throw new java.lang.IllegalStateException("Temporary file is somehow already deleted.");
            }
        } catch (java.io.IOException e2) {
            throw new java.lang.IllegalStateException("Could not create temporary file:", e2);
        }
    }

    private static void a(java.io.Closeable closeable) {
        try {
            closeable.close();
        } catch (java.io.IOException e) {
            android.util.Log.w("FileTeleporter", "Could not close stream", e);
        }
    }
}
