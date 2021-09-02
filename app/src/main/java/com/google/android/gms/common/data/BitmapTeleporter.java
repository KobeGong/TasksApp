package com.google.android.gms.common.data;

/* compiled from: PG */
public class BitmapTeleporter extends defpackage.biq implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.bct();
    public java.io.File a;
    private int b;
    private android.os.ParcelFileDescriptor c;
    private int d;
    private android.graphics.Bitmap e;

    public BitmapTeleporter(int i, android.os.ParcelFileDescriptor parcelFileDescriptor, int i2) {
        this.b = i;
        this.c = parcelFileDescriptor;
        this.d = i2;
        this.e = null;
    }

    public BitmapTeleporter(android.graphics.Bitmap bitmap) {
        this.b = 1;
        this.c = null;
        this.d = 0;
        this.e = bitmap;
    }

    public void writeToParcel(android.os.Parcel parcel, int i) {
        if (this.c == null) {
            android.graphics.Bitmap bitmap = this.e;
            java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(bitmap.getRowBytes() * bitmap.getHeight());
            bitmap.copyPixelsToBuffer(allocate);
            byte[] array = allocate.array();
            java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(new java.io.BufferedOutputStream(a()));
            try {
                dataOutputStream.writeInt(array.length);
                dataOutputStream.writeInt(bitmap.getWidth());
                dataOutputStream.writeInt(bitmap.getHeight());
                dataOutputStream.writeUTF(bitmap.getConfig().toString());
                dataOutputStream.write(array);
                a(dataOutputStream);
            } catch (java.io.IOException e2) {
                throw new java.lang.IllegalStateException("Could not write into unlinked file", e2);
            } catch (Throwable th) {
                a(dataOutputStream);
                throw th;
            }
        }
        int i2 = i | 1;
        int q = defpackage.bjr.q(parcel, 20293);
        defpackage.bjr.c(parcel, 1, this.b);
        defpackage.bjr.a(parcel, 2, (android.os.Parcelable) this.c, i2);
        defpackage.bjr.c(parcel, 3, this.d);
        defpackage.bjr.r(parcel, q);
        this.c = null;
    }

    private final java.io.FileOutputStream a() {
        if (this.a == null) {
            throw new java.lang.IllegalStateException("setTempDir() must be called before writing this object to a parcel");
        }
        try {
            java.io.File createTempFile = java.io.File.createTempFile("teleporter", ".tmp", this.a);
            try {
                java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(createTempFile);
                this.c = android.os.ParcelFileDescriptor.open(createTempFile, 268435456);
                createTempFile.delete();
                return fileOutputStream;
            } catch (java.io.FileNotFoundException e2) {
                throw new java.lang.IllegalStateException("Temporary file is somehow already deleted");
            }
        } catch (java.io.IOException e3) {
            throw new java.lang.IllegalStateException("Could not create temporary file", e3);
        }
    }

    private static void a(java.io.Closeable closeable) {
        try {
            closeable.close();
        } catch (java.io.IOException e2) {
            android.util.Log.w("BitmapTeleporter", "Could not close stream", e2);
        }
    }
}
